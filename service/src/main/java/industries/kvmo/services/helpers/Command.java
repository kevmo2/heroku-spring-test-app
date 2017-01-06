package industries.kvmo.services.helpers;

/**
 * Interface for processors
 */
public interface Command {

    boolean execute(CommandSequenceState context);

}
