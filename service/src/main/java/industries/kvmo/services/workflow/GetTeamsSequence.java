package industries.kvmo.services.workflow;

import industries.kvmo.services.helpers.AbstractSequence;
import industries.kvmo.services.processors.GetTeamsProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class GetTeamsSequence extends AbstractSequence {

    @Autowired
    private GetTeamsProcessor getTeamsProcessor;

    @Override
    public void createWorkflow() {
        getProcessorList().add(getTeamsProcessor);
    }
}
