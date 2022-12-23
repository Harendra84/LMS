package com.laundary.laundarymanagementsystem.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClothsPriceDetails {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer topWearPrice;

    private Integer bottomWearPrice;

    private Integer woolenWearPrice;

    private Integer othersPrice;

    public ClothsPriceDetails() {
    }

    public ClothsPriceDetails(Integer id, Integer topWearPrice, Integer bottomWearPrice, Integer woolenWearPrice, Integer othersPrice) {
        this.id = id;
        this.topWearPrice = topWearPrice;
        this.bottomWearPrice = bottomWearPrice;
        this.woolenWearPrice = woolenWearPrice;
        this.othersPrice = othersPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopWearPrice() {
        return topWearPrice;
    }

    public void setTopWearPrice(Integer topWearPrice) {
        this.topWearPrice = topWearPrice;
    }

    public Integer getBottomWearPrice() {
        return bottomWearPrice;
    }

    public void setBottomWearPrice(Integer bottomWearPrice) {
        this.bottomWearPrice = bottomWearPrice;
    }

    public Integer getWoolenWearPrice() {
        return woolenWearPrice;
    }

    public void setWoolenWearPrice(Integer woolenWearPrice) {
        this.woolenWearPrice = woolenWearPrice;
    }

    public Integer getOthersPrice() {
        return othersPrice;
    }

    public void setOthersPrice(Integer othersPrice) {
        this.othersPrice = othersPrice;
    }

    @Override
    public String toString() {
        return "ClothsPriceDetails{" +
                "id=" + id +
                ", topWearPrice=" + topWearPrice +
                ", bottomWearPrice=" + bottomWearPrice +
                ", woolenWearPrice=" + woolenWearPrice +
                ", othersPrice=" + othersPrice +
                '}';
    }
}
