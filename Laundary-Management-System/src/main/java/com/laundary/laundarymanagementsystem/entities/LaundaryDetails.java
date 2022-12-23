package com.laundary.laundarymanagementsystem.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LaundaryDetails {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer requestId;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy hh:mm:ss")
    private Date pickUpDate;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy hh:mm:ss")
    private Date dropDate;
    
    private Integer topWear;
    
    private Integer bottomWear;
    
    private Integer woolenWear;
    
    private Integer others;
    
    private String description;
    
    private String serviceType;

    @Enumerated(EnumType.ORDINAL)
    private ClothStatus clothStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    public LaundaryDetails() {
    }

    public LaundaryDetails(Integer requestId, Date pickUpDate, Date dropDate, Integer topWear, Integer bottomWear, Integer woolenWear, Integer others, String description, String serviceType, User user) {
        this.requestId = requestId;
        this.pickUpDate = pickUpDate;
        this.dropDate = dropDate;
        this.topWear = topWear;
        this.bottomWear = bottomWear;
        this.woolenWear = woolenWear;
        this.others = others;
        this.description = description;
        this.serviceType = serviceType;
        this.user = user;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Date getDropDate() {
        return dropDate;
    }

    public void setDropDate(Date dropDate) {
        this.dropDate = dropDate;
    }

    public Integer getTopWear() {
        return topWear;
    }

    public void setTopWear(Integer topWear) {
        this.topWear = topWear;
    }

    public Integer getBottomWear() {
        return bottomWear;
    }

    public void setBottomWear(Integer bottomWear) {
        this.bottomWear = bottomWear;
    }

    public Integer getWoolenWear() {
        return woolenWear;
    }

    public void setWoolenWear(Integer woolenWear) {
        this.woolenWear = woolenWear;
    }

    public Integer getOthers() {
        return others;
    }

    public void setOthers(Integer others) {
        this.others = others;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ClothStatus getClothStatus() {
        return clothStatus;
    }

    public void setClothStatus(ClothStatus clothStatus) {
        this.clothStatus = clothStatus;
    }

    @Override
    public String toString() {
        return "LaundaryDetails{" +
                "requestId=" + requestId +
                ", pickUpDate=" + pickUpDate +
                ", dropDate=" + dropDate +
                ", topWear=" + topWear +
                ", bottomWear=" + bottomWear +
                ", woolenWear=" + woolenWear +
                ", others=" + others +
                ", description='" + description + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", user=" + user +
                '}';
    }
}
