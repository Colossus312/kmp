package com.kmap.kmp.web;

import com.kmap.kmp.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/map")
public class MapRestController {


    @Autowired
    MapService mapService;

    @RequestMapping(value="/api/test", method= RequestMethod.GET)
    public String helloWorld() throws Exception {
        return mapService.selecter();
    }
}