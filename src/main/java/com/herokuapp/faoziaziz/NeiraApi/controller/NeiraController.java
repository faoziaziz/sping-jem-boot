package com.herokuapp.faoziaziz.NeiraApi.controller;

import com.herokuapp.faoziaziz.NeiraApi.model.NeiraParsed;
import com.herokuapp.faoziaziz.NeiraApi.repository.NeiraParsedRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/* Metal men */



@Controller
@RequestMapping(path="/neira")

public class NeiraController{

    @Autowired
    private NeiraParsedRepository neiraParsedRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<NeiraParsed> getAllParsed(){
        return neiraParsedRepository.findAll();
    }


    


}