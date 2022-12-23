package com.laundary.laundarymanagementsystem.repository;

import com.laundary.laundarymanagementsystem.entities.ClothsPriceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothsPriceDetailsRepository extends JpaRepository<ClothsPriceDetails, Integer> {

}
