package industries.kvmo.services.helpers;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class for a SERIAL workflow industries
 */
public abstract class AbstractWorkflow {

    private List<ProcessorInterface> processorList;

    public boolean process(ProcessorContext context) {
        for (ProcessorInterface processor : processorList ) {
            if (!processor.process(context)) {
                return false;
            }
        }
        return true;
    }

    public abstract void createWorkflow();

    public AbstractWorkflow() {
        processorList = new ArrayList<>();
    }

    public List<ProcessorInterface> getProcessorList() {
        return processorList;
    }

    @PostConstruct
    private final void initialize() {
        createWorkflow();
    }
}
