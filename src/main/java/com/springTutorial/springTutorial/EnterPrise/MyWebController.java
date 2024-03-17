package com.springTutorial.springTutorial.EnterPrise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyWebController {


//    private BusinessLayer businessLayer;
//
//
//    public MyWebController(BusinessLayer businessLayer) {
//        this.businessLayer = businessLayer;
//    }


    @Autowired
    public void setBusinessLayer(BusinessLayer businessLayer) {
        this.businessLayer = businessLayer;
    }

    public long returnValueFromWebController(){
        return businessLayer.returnSum();
    }
}


@Component
class BusinessLayer{

    @Autowired
    private DataLayer dataLayer;
    int returnSum(){
        return dataLayer.returnData().stream().reduce(Integer::sum).get();
    }
}

@Component
class DataLayer{

    List<Integer> returnData() {
        return Arrays.asList(10, 20, 30, 40);
    }
}
