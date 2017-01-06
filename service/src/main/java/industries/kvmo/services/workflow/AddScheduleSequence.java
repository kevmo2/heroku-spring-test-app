package industries.kvmo.services.workflow;

import industries.kvmo.services.helpers.AbstractSequence;
import industries.kvmo.services.processors.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class AddScheduleSequence extends AbstractSequence {

    @Autowired
    private Command unpackScheduleRequestProcessor;

    @Override
    public void createWorkflow() {
        getProcessorList().add(null);
    }
}
