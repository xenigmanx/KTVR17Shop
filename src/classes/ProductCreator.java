/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductCreator {
    public Product returnNewProduct(){
        Scanner scanner=new Scanner(System.in);
        List <Product> products=new ArrayList<>();
        Product product=new Product();
        System.out.println("---Добавить продукт---");
        System.out.println("---Название продукта---");
        product.setName(scanner.nextLine());
        System.out.println("---Цена одного продукта---");
        product.setPrice(scanner.nextInt());
        System.out.println("---Количество продукта в штуках---");
        product.setCount(scanner.nextInt());
        return  product;
                
    }
}
