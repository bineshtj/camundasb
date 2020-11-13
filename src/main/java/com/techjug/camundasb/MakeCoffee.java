package com.techjug.camundasb;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

public class MakeCoffee implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        Random r = new Random();
//        delegateExecution.setVariable("name", "btj");
        delegateExecution.setVariable("sugarAvailable", r.nextBoolean());
    }
}
