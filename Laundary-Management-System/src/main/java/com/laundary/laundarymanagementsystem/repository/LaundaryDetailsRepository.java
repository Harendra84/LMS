package com.laundary.laundarymanagementsystem.repository;

import com.laundary.laundarymanagementsystem.entities.LaundaryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaundaryDetailsRepository extends JpaRepository<LaundaryDetails, Integer> {
	
    @Query(value = "SELECT * FROM laundary_details ld where ld.cloth_status=:cloth_status", nativeQuery = true)
    public List<LaundaryDetails> getLaundaryDetailsByClothStatus(@Param("cloth_status") int cloth_status);
    
    @Query(value = "SELECT * FROM laundary_details ld where ld.user_id = :user_id AND ld.cloth_status=:cloth_status", nativeQuery = true)
    public List<LaundaryDetails> getLaundaryDetailsByUserAndClothStatus(@Param("user_id") int user_id, @Param("cloth_status") int cloth_status);
}
