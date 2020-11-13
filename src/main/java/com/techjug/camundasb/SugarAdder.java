package com.techjug.camundasb;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;
import java.util.logging.Logger;

public class SugarAdder implements JavaDelegate {

//    private final String[] sugarQuantity = {"5", "10", "15", "20", "25", "30"};
//    private final Logger logger = Lo
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Sugar Available");
    }
}
