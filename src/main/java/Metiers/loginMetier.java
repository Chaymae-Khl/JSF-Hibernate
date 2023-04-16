/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metiers;

import DAO.loginDAO;
import Models.Administrateur;

/**
 *
 * @author hp
 */
public class loginMetier {
    
    loginDAO dao=new loginDAO();
    
    
     public Administrateur login(String login, String password) {
     return dao.login(login, password);
     
     }
     
}
