package com.laundary.laundarymanagementsystem.controller;

import com.laundary.laundarymanagementsystem.entities.ClothsPriceDetails;
import com.laundary.laundarymanagementsystem.service.ClothsPriceDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clothdetails")
public class ClothsPriceDetailsController {

    private ClothsPriceDetailsService clothsPriceDetailsService;

    public ClothsPriceDetailsController(ClothsPriceDetailsService clothsPriceDetailsService) {
        this.clothsPriceDetailsService = clothsPriceDetailsService;
    }

    @GetMapping("/")
    public List<ClothsPriceDetails> getAllClothsPriceDetails()
    {
        return clothsPriceDetailsService.getClothsPriceDetails();
    }

    @GetMapping("/{id}")
    public ClothsPriceDetails getClothsPriceDetails(@PathVariable(value = "id") Integer id)
    {
        return clothsPriceDetailsService.getClothsPriceDetailsById(id);
    }

    @PostMapping("/addUser")
    public ClothsPriceDetails addClothsPriceDetails(@RequestBody ClothsPriceDetails clothsPriceDetails) {
        return clothsPriceDetailsService.add(clothsPriceDetails);
    }

    @DeleteMapping("/{id}")
    public String deleteClothsPriceDetails(@PathVariable (value = "id") Integer id)
    {
        clothsPriceDetailsService.delete(id);
        return "SUCCESS";
    }
}
