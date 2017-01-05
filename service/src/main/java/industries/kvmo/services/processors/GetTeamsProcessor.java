package industries.kvmo.services.processors;

import industries.kvmo.model.TeamEntity;
import industries.kvmo.services.dataaccess.TeamsRepository;
import industries.kvmo.services.helpers.ContextHelper;
import industries.kvmo.services.helpers.ProcessorContext;
import industries.kvmo.services.helpers.ProcessorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 */
@Component
public class GetTeamsProcessor implements ProcessorInterface {

    @Autowired
    private TeamsRepository repository;

    @Override
    public boolean process(ProcessorContext context) {

        List<TeamEntity> teams = repository.findAll();
        if(teams == null || teams.size() == 0) {
            return false;
        }
        ContextHelper.setTeamEntities(context, teams);

        return true;
    }
}
