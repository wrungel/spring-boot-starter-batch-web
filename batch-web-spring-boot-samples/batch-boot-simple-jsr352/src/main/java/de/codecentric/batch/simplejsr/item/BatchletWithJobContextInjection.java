package de.codecentric.batch.simplejsr.item;

import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.context.JobContext;
import javax.inject.Inject;

public class BatchletWithJobContextInjection extends AbstractBatchlet {

    @Inject
    private JobContext jobContext;

    @Override
    public String process() {
        return "OK";
    }
}
