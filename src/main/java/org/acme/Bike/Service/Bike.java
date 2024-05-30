package org.acme.Bike.Service;

import java.sql.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "bikes")
public class Bike extends PanacheEntity {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getWarranty_status() {
        return warranty_status;
    }

    public void setWarranty_status(String warranty_status) {
        this.warranty_status = warranty_status;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "date_created")

    private Date date_created;

    @Column(name = "price")
    private Integer price;

    @Column(name = "image")
    private byte[] image;
    
    @Column(name = "warranty_status")
    private String warranty_status;
}
