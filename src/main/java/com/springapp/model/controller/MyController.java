//package com.springapp.model.controller;
//
///**
// * Created by murat on 25/08/15.
// */
//import java.util.concurrent.atomic.AtomicLong;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping( value = "cate" )
//public class MyController {
//
//
//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
//
//    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
//    @ResponseBody
//    public Categories findOne( @PathVariable( "id" ) Long id ){
//        return new Categories();
//    }
//
//    @RequestMapping( method = RequestMethod.GET )
//    @ResponseBody
//    public Categories findOnes(){
//        return new Categories();
//    }
//}