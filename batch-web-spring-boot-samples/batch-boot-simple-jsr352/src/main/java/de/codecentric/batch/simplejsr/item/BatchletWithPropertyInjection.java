package de.codecentric.batch.simplejsr.item;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.batch.api.AbstractBatchlet;
import javax.batch.api.BatchProperty;
import javax.inject.Inject;

public class BatchletWithPropertyInjection extends AbstractBatchlet {
    private static final Logger LOG = LoggerFactory.getLogger(BatchletWithPropertyInjection.class);

    @Inject
    @BatchProperty(name = "datakey")
    private String datakey;

    @Inject
    @BatchProperty(name = "datakey2")
    private String datakey2;

    @Override
    public String process() throws JsonProcessingException {
        LOG.info("datakey: " + datakey);
        LOG.info("datakey2: " + datakey2);

        return "OK";
    }
}
