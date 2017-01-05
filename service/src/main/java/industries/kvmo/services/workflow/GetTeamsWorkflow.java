package industries.kvmo.services.workflow;

import industries.kvmo.services.helpers.AbstractWorkflow;
import industries.kvmo.services.processors.GetTeamsProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class GetTeamsWorkflow extends AbstractWorkflow{

    @Autowired
    private GetTeamsProcessor getTeamsProcessor;

    @Override
    public void createWorkflow() {
        getProcessorList().add(getTeamsProcessor);
    }
}
