/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Counselor.getValue())){
            organization = new CounselorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BankManager.getValue())){
            organization = new BankManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FinanceAdmin.getValue())){
            organization = new FinanceAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.HospitalAdmin.getValue())){
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.InsuranceManager.getValue())){
            organization = new InsuranceManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BirthMotherOrg.getValue())){
            organization = new BirthMotherOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ParentsOrg.getValue())){
            organization = new ParentsOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    public boolean containsType(Organization.Type type){
        for (Organization org : organizationList){
            if(org.getName().equals(type.getValue())){
                return true;
            }
        }
        return false;
    }
}
