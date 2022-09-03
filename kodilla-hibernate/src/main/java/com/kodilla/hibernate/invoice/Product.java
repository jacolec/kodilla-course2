package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCT")
public class Product {

    private int id;
    private String name;
    private Item item;

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
            public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product() {

    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
