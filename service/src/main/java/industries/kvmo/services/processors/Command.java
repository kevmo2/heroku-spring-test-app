package industries.kvmo.services.processors;

import industries.kvmo.services.helpers.CommandSequenceState;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class Command implements Command {
    @Override
    public boolean process(CommandSequenceState context) {
        return false;
    }
}
