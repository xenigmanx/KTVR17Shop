/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerCreator {

    public Customer returnNewCustomer(){
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Добавляем клиента -----");
        System.out.println("Имя: ");
        customer.setName(scanner.nextLine());
        System.out.println("Фамилия: ");
        customer.setSurname(scanner.nextLine());
        System.out.println("Деньги: ");
        customer.setMoney(scanner.nextInt());
        System.out.println("Для добавления введите символ \"y\".\nДля отмены наберите -1");
        String yes;
        yes = scanner.next();
        if("-1".equals(yes)){
            System.out.println("-----не добавлен----");
            return null;
        }
        System.out.println("----- добавлен----");
        return customer;
        
    }
 
}
