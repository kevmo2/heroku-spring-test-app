package industries.kvmo.services.processors;

import industries.kvmo.model.TeamEntity;
import industries.kvmo.services.dataaccess.TeamsRepository;
import industries.kvmo.services.helpers.StateHelper;
import industries.kvmo.services.helpers.CommandSequenceState;
import industries.kvmo.services.helpers.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 */
@Component
public class GetTeamsProcessor implements Command {

    @Autowired
    private TeamsRepository repository;

    @Override
    public boolean execute(CommandSequenceState context) {

        List<TeamEntity> teams = repository.findAll();
        if(teams == null || teams.size() == 0) {
            return false;
        }
        StateHelper.setTeamEntities(context, teams);

        return true;
    }
}
