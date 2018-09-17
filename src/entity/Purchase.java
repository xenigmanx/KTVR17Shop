/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pupil
 */
@Entity 
public class Purchase {
     @Id 
     @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
     @OneToOne(cascade = CascadeType.MERGE,orphanRemoval = true) 
    private Product product;
     @OneToOne(cascade = CascadeType.MERGE,orphanRemoval = true) 
    private Customer customer;
     @Temporal(TemporalType.TIMESTAMP) 
    private Date date;
     @Temporal(TemporalType.TIMESTAMP) 
    private Integer quantity;

public Purchase() {
    }
    public Purchase(Long id, Product product, Customer customer, Date date, Integer quantity) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.date = date;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.product);
        hash = 53 * hash + Objects.hashCode(this.customer);
        hash = 53 * hash + Objects.hashCode(this.date);
        hash = 53 * hash + Objects.hashCode(this.quantity);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Purchase other = (Purchase) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return Objects.equals(this.quantity, other.quantity);
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", product=" + product.getName() + ", customer=" + customer.getName()+" "+customer.getSurname() + ", date=" + date + ", quantity=" + quantity + '}';
    }



}
