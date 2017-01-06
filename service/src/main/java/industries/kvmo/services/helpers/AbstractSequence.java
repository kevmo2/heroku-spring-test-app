package industries.kvmo.services.helpers;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class for a SERIAL workflow industries
 */
public abstract class AbstractSequence {

    private List<Command> processorList;

    public boolean process(CommandSequenceState context) {
        for (Command processor : processorList ) {
            if (!processor.execute(context)) {
                return false;
            }
        }
        return true;
    }

    public abstract void createWorkflow();

    public AbstractSequence() {
        processorList = new ArrayList<>();
    }

    public List<Command> getProcessorList() {
        return processorList;
    }

    @PostConstruct
    private final void initialize() {
        createWorkflow();
    }
}
