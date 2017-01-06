package industries.kvmo.services.controllers;

import industries.kvmo.model.TeamEntity;
import industries.kvmo.services.helpers.StateHelper;
import industries.kvmo.services.helpers.CommandSequenceState;
import industries.kvmo.services.workflow.GetTeamSequence;
import industries.kvmo.services.workflow.GetTeamsSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * takes in a team name and returns information about that team
 */
@RestController
public class GetTeamsController {

    private CommandSequenceState context;

    @Autowired
    private GetTeamSequence getTeamWorkflow;

    @Autowired
    private GetTeamsSequence getTeamsWorkflow;

    @RequestMapping(method = RequestMethod.GET, path = "/teams/{teamName}")
    public TeamEntity getTeam(@PathVariable String teamName) {

        context = new CommandSequenceState();
        StateHelper.setTeamName(context, teamName);
        getTeamWorkflow.process(context);
        return StateHelper.getTeamEntity(context);

    }

    @RequestMapping(method = RequestMethod.GET, path = "/teams")
    public List<TeamEntity> getTeams() {
        context = new CommandSequenceState();
        getTeamsWorkflow.process(context);
        return StateHelper.getTeamEntities(context);

    }

}
