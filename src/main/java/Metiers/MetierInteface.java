/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metiers;

import java.util.List;

/**
 *
 * @author hp
 */
public interface MetierInteface<M> {
    List<M> getall();
    void save(M object);
    void delete(int id);
     void update(M object);
    M get(int id);
}
