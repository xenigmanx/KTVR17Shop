/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import classes.CustomerCreator;
import classes.ProductCreator;
import classes.PurchaseCreator;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {

   private List <Product> products= new ArrayList <>();
   private List <Customer>customers= new ArrayList <>();
     private List <Purchase>purchases= new ArrayList <>();
     
       public void run(){
        String repeat = "r";
        Scanner scanner = new Scanner(System.in);
        int task;
        System.out.println ("- Выберите действие -");
        System.out.println ("0- Выход из программы -");
        System.out.println ("1 - Добавить продукт -");
        System.out.println ("2 - Добавить нового клиента-");
        System.out.println ("3 - Возврат продукта -");
        System.out.println ("4 - История работы магазина-");
        task =scanner.nextInt();
        switch (task){
                case 0:
                   repeat ="r";
                    break;
                case 1:
                    ProductCreator productCreator= new ProductCreator();
                    this.products.add(productCreator.returnNewProduct());
                    break;
                case 2:
                    CustomerCreator customerCreator = new CustomerCreator();
                    this.customers.add(customerCreator.returnNewCustomer());
                    break;
                case 3:
                    PurchaseCreator  purchaseCreator = new PurchaseCreator();
                    this.purchases.add(purchaseCreator.returnNewPurchase(products, customers));
                    break;  
                default:
                    System.out.println("Выберите одно из действий!");
        }
  
    }
}


