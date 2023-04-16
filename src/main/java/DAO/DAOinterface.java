/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author hp
 */
public interface DAOinterface<I> {
        List<I> getall();
    void save(I object);
    void update(I object);
    void delete(int id);
    I get(int id);
 
}
