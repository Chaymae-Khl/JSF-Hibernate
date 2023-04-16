/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Metiers.LiveMetier;
import Metiers.MetierInteface;
import Metiers.loginMetier;
import Models.Administrateur;
import Models.Livre;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author hp
 */
//chaymaaae you have to import from  import men javax.faces.bean.ManagedBean;
@ManagedBean
@RequestScoped
public class ControllerLivre {
   public Livre a=new Livre();
   public Administrateur admin=new Administrateur();

    public Administrateur getAdmin() {
        return admin;
    }

    public loginMetier getLoginM() {
        return loginM;
    }

    public void setAdmin(Administrateur admin) {
        this.admin = admin;
    }

    public void setLoginM(loginMetier loginM) {
        this.loginM = loginM;
    }
   
   
   
   
   
    List<Livre> liste=new ArrayList<>();
   MetierInteface metier=new LiveMetier();

    public Livre getA() {
        return a;
    }

    public List<Livre> getListe() {
       return  metier.getall();
    }

    public MetierInteface getMetier() {
        return metier;
    }

    public void setA(Livre a) {
        this.a = a;
    }

     public ControllerLivre(Livre a,List<Livre> l) {
        this.a=a;
        this.liste=l;
    }
     
    public void setListe(List<Livre> liste) {
        this.liste = liste;
    }

    public void setMetier(MetierInteface metier) {
        this.metier = metier;
    }

    public ControllerLivre() {
    }
    
    
     public String saveLivre(){
       metier.save(a);
       return "index";
   }  
      public String updateLivre(){
       metier.update(a);
       return "index";
   } 
   public List<Livre> findAll(){
   return metier.getall();
   } 
      public String delete(int id){
       metier.delete(id);
       return "index";
   } 

     public String getliv(int id){
      this.a= (Livre) metier.get(id);
      System.out.println(a);
      return "editForm";
   } 
     
     
loginMetier loginM =new loginMetier();

     public String login(String login,String password){
     loginM.login(login, password);
     return "index";
     }
   
}
