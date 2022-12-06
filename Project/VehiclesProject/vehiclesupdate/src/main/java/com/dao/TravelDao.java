package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Travel;
import com.util.HibernateUtil;

public class TravelDao {

	  /**
     * Save Instructor
     * @param instructor
     */
    public void saveTravel(Travel instructor) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(instructor);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Update Instructor
     * @param instructor
     */
    public void updateTravel(Travel instructor) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(instructor);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Delete Instructor
     * @param id
     */
    public void deleteTravel(int id) {

 

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

 

            // Delete a instructor object
            Travel instructor = session.get(Travel.class, id);
            if (instructor != null) {
                session.delete(instructor);
                System.out.println("instructor is deleted");
            }

 

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Get Instructor By ID
     * @param id
     * @return
     */
    public Travel getTravel(int id) {

 

        Transaction transaction = null;
        Travel instructor = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            instructor = session.get(Travel.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return instructor;
    }
    
    /**
     * Get all Instructors
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Travel> getAllTravel() {

 

        Transaction transaction = null;
        List<Travel> listOfTravel = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            
            listOfTravel = session.createQuery("fromTravel").getResultList();
            
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfTravel;
    }
}
