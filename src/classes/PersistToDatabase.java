/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Interface.Retentive;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class PersistToDatabase implements Retentive{
private final EntityManager em;
private final EntityTransaction tx;

    public PersistToDatabase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KTVR17ShopPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
    }

    @Override
    public void saveProduct(Product product) {
        tx.begin();
        em.persist(product);
        tx.commit();
    }

    @Override
    public void saveCuctomer(Customer customer) {
        tx.begin();
        em.persist(customer);
        tx.commit();
        
    }

    @Override
    public void savePurchase(Purchase Purchase, boolean update) {
        tx.begin();
        if(update){
            em.merge(Purchase);
        }else{
            em.persist(Purchase);
        }
        tx.commit();
    }

    @Override
    public List<Product> loadProduct() {
        try{
            return em.createQuery("select p from product p ").getResultList();
        }catch(Exception e){
            return new ArrayList<Product>();
        }
    }

    @Override
    public List<Customer> loadCustomer() {
        try{
            return em.createQuery("select c from product c ").getResultList();
        }catch(Exception e){
            return new ArrayList<Customer>();
        }
    }

    @Override
    public List<Purchase> loadPurchase() {
        try{
            return em.createQuery("select h from product h ").getResultList();
        }catch(Exception e){
            return new ArrayList<Purchase>();
        }    
    }

    @Override
    public void freeResources() {
        if (em !=null)em.close();
    }

}
