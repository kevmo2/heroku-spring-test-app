package industries.kvmo.services.processors;

import industries.kvmo.model.TeamEntity;
import industries.kvmo.services.dataaccess.TeamsRepository;
import industries.kvmo.services.helpers.StateHelper;
import industries.kvmo.services.helpers.CommandSequenceState;
import industries.kvmo.services.helpers.Command;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class GetTeamProcessor implements Command {

    @Autowired
    private TeamsRepository repository;

    @Override
    public boolean execute(CommandSequenceState context) {

        String teamName = StateHelper.getTeamName(context);
        TeamEntity team = repository.findByTeamName(StringUtils.capitalize(teamName));
        if (team == null) {
            return false;
        }

        StateHelper.setTeamEntity(context, team);

        return true;
    }
}
