/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FinanceAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class FinanceAdminOrganization  extends Organization{

    public FinanceAdminOrganization() {
        super(Type.FinanceAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FinanceAdminRole());
        return roles;
    }
     
}