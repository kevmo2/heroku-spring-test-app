package industries.kvmo.services.processors;

import industries.kvmo.model.TeamEntity;
import industries.kvmo.services.dataaccess.TeamsRepository;
import industries.kvmo.services.helpers.ContextHelper;
import industries.kvmo.services.helpers.ProcessorContext;
import industries.kvmo.services.helpers.ProcessorInterface;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class GetTeamProcessor implements ProcessorInterface{

    @Autowired
    private TeamsRepository repository;

    @Override
    public boolean process(ProcessorContext context) {

        String teamName = ContextHelper.getTeamName(context);
        TeamEntity team = repository.findByTeamName(StringUtils.capitalize(teamName));
        if (team == null) {
            return false;
        }

        ContextHelper.setTeamEntity(context, team);

        return true;
    }
}
