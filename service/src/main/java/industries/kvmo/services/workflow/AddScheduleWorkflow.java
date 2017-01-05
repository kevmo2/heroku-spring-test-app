package industries.kvmo.services.workflow;

import industries.kvmo.services.helpers.AbstractWorkflow;
import industries.kvmo.services.processors.UnpackScheduleRequestProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class AddScheduleWorkflow extends AbstractWorkflow {

    @Autowired
    private UnpackScheduleRequestProcessor unpackScheduleRequestProcessor;

    @Override
    public void createWorkflow() {
        getProcessorList().add(unpackScheduleRequestProcessor);
    }
}
