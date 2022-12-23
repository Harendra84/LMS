package com.laundary.laundarymanagementsystem.service;

import com.laundary.laundarymanagementsystem.entities.ClothsPriceDetails;
import com.laundary.laundarymanagementsystem.repository.ClothsPriceDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothsPriceDetailsService {

    private ClothsPriceDetailsRepository clothsPriceDetailsRepository;

    public ClothsPriceDetailsService(ClothsPriceDetailsRepository clothsPriceDetailsRepository) {
        this.clothsPriceDetailsRepository = clothsPriceDetailsRepository;
    }

    public List<ClothsPriceDetails> getClothsPriceDetails() {
        return clothsPriceDetailsRepository.findAll();
    }


    public ClothsPriceDetails getClothsPriceDetailsById(Integer id) {
        // TODO Auto-generated method stub
        return clothsPriceDetailsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("there's no such clothdetails"));
    }


    public ClothsPriceDetails add(ClothsPriceDetails clothsPriceDetails) {
        // TODO Auto-generated method stub
        return clothsPriceDetailsRepository.save(clothsPriceDetails);
    }


    public void delete(Integer id) {
        // TODO Auto-generated method stub
        clothsPriceDetailsRepository.deleteById(id);
    }


}
