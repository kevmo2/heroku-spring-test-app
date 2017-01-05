package industries.kvmo.services.processors;

import industries.kvmo.services.helpers.ProcessorContext;
import industries.kvmo.services.helpers.ProcessorInterface;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class UnpackScheduleRequestProcessor implements ProcessorInterface {
    @Override
    public boolean process(ProcessorContext context) {
        return false;
    }
}
