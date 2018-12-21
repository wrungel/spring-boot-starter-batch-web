package de.codecentric.batch.simplejsr.item;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.scope.context.JobContext;

import javax.batch.api.BatchProperty;
import javax.inject.Inject;

public class FooBatchlet implements javax.batch.api.Batchlet {

    private static final Logger LOG = LoggerFactory.getLogger(FooBatchlet.class);

    @Inject
    @BatchProperty(name = "datakey")
    private String datakey;

    @Inject
    @BatchProperty(name = "datakey2")
    private String datakey2;

    @Inject
    JobContext jobContext;

    @Override
    public String process() throws JsonProcessingException {
        LOG.info("datakey: " + datakey);
        LOG.info("datakey2: " + datakey2);
        LOG.info("jobName: {}",
                jobContext.getJobName()
        );

        return "OK";
    }

    @Override
    public void stop() {

    }

}
