package com.omnicirus.models;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Cart{
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    Product product;

    private int reqdQuantity;

    public int getReqdQuantity() {
        return reqdQuantity;
    }

    public void setReqdQuantity(int reqdQuantity) {
        this.reqdQuantity = reqdQuantity;
    }

    public Cart(){}
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public Cart(long id, Product product, int quantity){
        this.id = id;
        this.product = product;
        this.reqdQuantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", product=" + product +
                ", reqdQuantity=" + reqdQuantity +
                '}';
    }
}
