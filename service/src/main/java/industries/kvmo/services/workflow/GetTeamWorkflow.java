package industries.kvmo.services.workflow;

import industries.kvmo.services.helpers.AbstractWorkflow;
import industries.kvmo.services.processors.GetTeamProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class GetTeamWorkflow extends AbstractWorkflow {

    @Autowired
    private GetTeamProcessor getTeamProcessor;

    @Override
    public void createWorkflow() {
        getProcessorList().add(getTeamProcessor);
    }
}
