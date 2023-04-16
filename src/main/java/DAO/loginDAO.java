/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Administrateur;
import helpclass.NewHibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hp
 */
public class loginDAO {
    public Administrateur login(String login, String password) {
         Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    Transaction tx = session.beginTransaction();
    Criteria cr = session.createCriteria(Administrateur.class);

    cr.add(Restrictions.like("login", login));
    cr.add(Restrictions.like("password",password));
    Administrateur a = (Administrateur) cr.uniqueResult();
    tx.commit(); // commit the transaction
    if (a== null) {
        throw new RuntimeException("Invalid username or password"); // handle the case where the user isn't found
    }
    return a;
}
}
