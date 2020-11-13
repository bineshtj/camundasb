package com.techjug.camundasb;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class LoggerDelegate implements JavaDelegate {

    private final Logger logger = Logger.getLogger(LoggerDelegate.class.getName());
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
            logger.info("\n\n Logger:" +
                    "\nprocessDefinitionId" + delegateExecution.getProcessDefinitionId() +
                    "\nprocessInstanceId"+ delegateExecution.getProcessInstanceId() +
                    "\nid" + delegateExecution.getId() +
                    "\n\n"
            );
    }
}
