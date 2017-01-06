package industries.kvmo.services.workflow;

import industries.kvmo.services.helpers.AbstractSequence;
import industries.kvmo.services.processors.GetTeamProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class GetTeamSequence extends AbstractSequence {

    @Autowired
    private GetTeamProcessor getTeamProcessor;

    @Override
    public void createWorkflow() {
        getProcessorList().add(getTeamProcessor);
    }
}
