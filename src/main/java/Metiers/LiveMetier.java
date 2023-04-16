/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metiers;

import DAO.LivreDao;
import Models.Livre;
import java.util.List;

/**
 *
 * @author hp
 */
public class LiveMetier implements MetierInteface<Livre> {
   LivreDao DAO=new LivreDao() ;

    @Override
    public List<Livre> getall() {
    return DAO.getall();
    }

    @Override
     public void save(Livre l) {
     DAO.save(l);
    }

    @Override
    public void delete(int id) {
    DAO.delete(id);
    }

  

    @Override
    public Livre get(int id) {
   return DAO.get(id);
    }

    @Override
    public void update(Livre l) {
        DAO.update(l);
    }
    
    
}
