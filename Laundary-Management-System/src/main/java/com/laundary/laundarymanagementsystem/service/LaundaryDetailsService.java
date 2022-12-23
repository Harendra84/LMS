package com.laundary.laundarymanagementsystem.service;

import com.laundary.laundarymanagementsystem.entities.ClothStatus;
import com.laundary.laundarymanagementsystem.entities.LaundaryDetails;
import com.laundary.laundarymanagementsystem.repository.LaundaryDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaundaryDetailsService {


    private LaundaryDetailsRepository laundaryDetailsRepository;

    public LaundaryDetailsService(LaundaryDetailsRepository laundaryDetailsRepository) {
        this.laundaryDetailsRepository = laundaryDetailsRepository;
    }

    public List<LaundaryDetails> getLaundaryDetails() {
        return laundaryDetailsRepository.findAll();
    }


    public LaundaryDetails getLaundaryDetailsById(Integer id) {
        // TODO Auto-generated method stub
        return laundaryDetailsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("there's no such server"));
    }


    public LaundaryDetails add(LaundaryDetails laundaryDetails) {
        // TODO Auto-generated method stub
        return laundaryDetailsRepository.save(laundaryDetails);
    }


    public void delete(Integer id) {
        // TODO Auto-generated method stub
        laundaryDetailsRepository.deleteById(id);
    }


//    public List<LaundaryDetails> getLaundaryDetailsByUserId(Integer userId) {
//        // TODO Auto-generated method stub
//        return laundaryDetailsRepository.findLaundaryDetailsByUserId(userId);
//    }

    public List<LaundaryDetails> getLaundaryDetailsByUserClothStatus(int userId, int clothStatus)
    {
        return laundaryDetailsRepository.getLaundaryDetailsByUserAndClothStatus(userId,clothStatus);
    }

    public List<LaundaryDetails> getLaundaryDetailsByClothStatus(Integer clothStatus)
    {
        return laundaryDetailsRepository.getLaundaryDetailsByClothStatus(clothStatus);
    }


    public LaundaryDetails changeStatusToFinish(int requestId) {
        LaundaryDetails laundaryDetails = getLaundaryDetailsById(requestId);

                laundaryDetails.setClothStatus(ClothStatus.FINISH);
                return laundaryDetailsRepository.save(laundaryDetails);
    }

}
