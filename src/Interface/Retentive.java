/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author pupil
 */
import entity.Product; 
import entity.Purchase; 
import entity.Customer; 
import java.util.List;
public interface Retentive {
public void saveProduct(Product product); 
public void saveCuctomer(Customer customer); 
public void savePurchase(Purchase Purchase,boolean update); 
public List<Product> loadProduct(); 
public List<Customer> loadCustomer(); 
public List<Purchase> loadPurchase(); 
public void freeResources();    
}
