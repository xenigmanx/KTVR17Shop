/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class PurchaseCreator {
    public Purchase returnNewPurchase(List<Product>products,List<Customer>customers){
        System.out.println("-----------Покупка------------");
        Scanner scanner = new Scanner(System.in);
         System.out.println("Список всех продуктов: ");
         int countProducts=products.size();
        for (int i = 0; i < countProducts; i++) {

            System.out.println(i+1+". "+products.get(i).getName()
                    +" "+products.get(i).getCount()
                    +":штук "+products.get(i).getPrice()+":evro ");
        }
        System.out.println("Список всех клиентов: ");
         int countCustomers=customers.size();
        for (int i = 0; i < countCustomers; i++) {

            System.out.println(i+1+". "+customers.get(i).getName()
                    +" "+customers.get(i).getSurname()
                    +" заплатил evro "+customers.get(i).getMoney());
        }
        System.out.println("Выбор продукта ");
        int numberProduct = scanner.nextInt();
        Product product = products.get(numberProduct - 1);
        System.out.println("Выберите имя клиента: ");
        int numberCustomer = scanner.nextInt();
        Customer customer = customers.get(numberCustomer - 1);
        System.out.println("Количество tovara шт: ");
        int quantity = scanner.nextInt();
        Calendar c = new GregorianCalendar();
        Purchase purchase = new Purchase(null, product, customer, c.getTime(), quantity);
        
        purchase.getProduct().setCount(purchase.getProduct().getCount()-quantity);
        if (purchase.getProduct().getCount() < 0) {
            System.out.println("Не хватает товара");
            return null;
        }
       
        purchase.getCustomer().setMoney(purchase.getCustomer().getMoney()-purchase.getProduct().getPrice()*quantity);
        if (purchase.getCustomer().getMoney() < 0) {
            System.out.println("Не хватает денег");
            return null;
        }
        return purchase;
    }
}



