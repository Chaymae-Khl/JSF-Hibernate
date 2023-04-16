/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hp
 */

@Entity
public class Livre {
  @Id
  int code_livre;
  String titre;
  int nb_exemplaire;
  String nom_aute;

   
    public Livre() {
    }

    @Override
    public String toString() {
        return "Livre{" + "code_livre=" + code_livre + ", titre=" + titre + ", nb_exemplaire=" + nb_exemplaire + ", nom_aute=" + nom_aute + '}';
    }

    public Livre(String titre, int nb_exemplaire, String nom_aute) {
        this.titre = titre;
        this.nb_exemplaire = nb_exemplaire;
        this.nom_aute = nom_aute;
    }

    public Livre(int code_livre, String titre, int nb_exemplaire, String nom_aute) {
        this.code_livre = code_livre;
        this.titre = titre;
        this.nb_exemplaire = nb_exemplaire;
        this.nom_aute = nom_aute;
    }

    public void setCode_livre(int code_livre) {
        this.code_livre = code_livre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNb_exemplaire(int nb_exemplaire) {
        this.nb_exemplaire = nb_exemplaire;
    }

    public void setNom_aute(String nom_aute) {
        this.nom_aute = nom_aute;
    }

    public int getCode_livre() {
        return code_livre;
    }

    public String getTitre() {
        return titre;
    }

    public int getNb_exemplaire() {
        return nb_exemplaire;
    }

    public String getNom_aute() {
        return nom_aute;
    }
    
}
