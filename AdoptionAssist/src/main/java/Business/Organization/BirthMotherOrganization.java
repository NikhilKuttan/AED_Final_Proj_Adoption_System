/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CounselorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class BirthMotherOrganization  extends Organization{

    public BirthMotherOrganization() {
        super(Organization.Type.BirthMotherOrg.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        return roles;
    }
     
}