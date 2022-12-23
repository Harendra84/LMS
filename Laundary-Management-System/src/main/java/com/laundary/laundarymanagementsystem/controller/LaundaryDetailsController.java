package com.laundary.laundarymanagementsystem.controller;

import com.laundary.laundarymanagementsystem.entities.LaundaryDetails;
import com.laundary.laundarymanagementsystem.service.LaundaryDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laundarydetails")
public class LaundaryDetailsController {

    private LaundaryDetailsService laundaryDetailsService;

    public LaundaryDetailsController(LaundaryDetailsService laundaryDetailsService) {
        this.laundaryDetailsService = laundaryDetailsService;
    }

    @GetMapping("/")
    public List<LaundaryDetails> getAllLaundaryDetails()
    {
        return laundaryDetailsService.getLaundaryDetails();
    }

    @GetMapping("/{requestId}")
    public LaundaryDetails getLaundaryDetails(@PathVariable(value = "requestId") Integer requestId)
    {
        return laundaryDetailsService.getLaundaryDetailsById(requestId);
    }

    @PostMapping("/addRequest")
    public LaundaryDetails addLaundaryDetails(@RequestBody LaundaryDetails laundaryDetails) {
        return laundaryDetailsService.add(laundaryDetails);
    }

    @DeleteMapping("/{requestId}")
    public String deleteLaundaryDetails(@PathVariable (value = "requestId") Integer requestId)
    {
        laundaryDetailsService.delete(requestId);
        return "SUCCESS";
    }

//    @GetMapping("/getByUserId/{userId}")
//    public List<User> getLaundaryDetailsByUserId(@PathVariable (value = "userId") Integer userId)
//    {
//        return laundaryDetailsService.getLaundaryDetailsByUserId(userId);
//    }


    @GetMapping("/getUserClothDetails/{userId}/{clothstatus}")
    public List<LaundaryDetails> getAllUserClothsDetails(@PathVariable (value = "userId") int userId,
                                                         @PathVariable (value = "clothstatus") int clothStatus) {
        System.out.println(userId);
        System.out.println(clothStatus);
        return laundaryDetailsService.getLaundaryDetailsByUserClothStatus(userId, clothStatus);
    }

    @GetMapping("/getClothDetailsByClothStatus/{clothstatus}")
    public List<LaundaryDetails> getAllClothsDetailsByClothStatus(@PathVariable (value = "clothstatus") int clothStatus)
    {
        return laundaryDetailsService.getLaundaryDetailsByClothStatus(clothStatus);
    }

    @GetMapping("/finish/{requestId}")
    public LaundaryDetails changeStatusTofinish(
            @PathVariable (value = "requestId") int requestId)
    {
        System.out.println(requestId);
        return laundaryDetailsService.changeStatusToFinish(requestId);
    }

}
