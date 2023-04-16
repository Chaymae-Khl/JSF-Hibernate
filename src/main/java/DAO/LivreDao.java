/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Livre;
import helpclass.NewHibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hp
 */
public class LivreDao implements DAOinterface<Livre>{

    @Override
    public List<Livre> getall() {
       Session session = NewHibernateUtil.getSessionFactory().openSession();
    List<Livre> list = null;
    try {
        list = session.createQuery("from Livre").list();
    } catch (HibernateException e) {
        e.printStackTrace();
    } finally {
        session.close();
    }
    return list;
    }

    @Override
    public void save(Livre livre) {
        Transaction transaction = null;
    try {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(livre);
        transaction.commit();
    } catch (HibernateException e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
    }

    @Override
    public void delete(int id) {
       Transaction transaction = null;
    try {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Livre livre = (Livre) session.get(Livre.class, id);
        if (livre != null) {
            session.delete(livre);
            transaction.commit();
        }
    } catch (HibernateException e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
    }
    @Override
    public void update(Livre livre) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx = null;
    try {
        tx = session.beginTransaction();
        session.update(livre);
        tx.commit();
    } catch (HibernateException e) {
        if (tx != null) {
            tx.rollback();
        }
        e.printStackTrace();
    } finally {
        session.close();
    }
    }

    @Override
    public Livre get(int id) {
         Session session = NewHibernateUtil.getSessionFactory().openSession();
    Livre livre = null;
    try {
        livre = (Livre) session.get(Livre.class, id);
    } catch (HibernateException e) {
        e.printStackTrace();
    } finally {
        session.close();
    }
    return livre;
    }

   
    
    
    
    
}
