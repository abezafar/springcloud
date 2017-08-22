package com.abezafar.wineservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/wines")
public class WineService {

    @RequestMapping(method = RequestMethod.GET)
    public List<Wine> getAll() {
        List<Wine> wines = new ArrayList<Wine>();
        
        Wine wine1 = new Wine();
        wine1.setName("Malbec");
        wine1.setPrice(22);
        wines.add(wine1);
        
        Wine wine2 = new Wine();
        wine2.setName("Pinot");
        wine2.setPrice(34);
        wines.add(wine2);
        
        return wines;
    }

}
