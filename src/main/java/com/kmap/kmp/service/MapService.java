package com.kmap.kmp.service;

import com.kmap.kmp.dao.MapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapService {
    @Autowired
    MapMapper mapMapper;


    public String selecter(){
        return mapMapper.selecter();
    }

}
