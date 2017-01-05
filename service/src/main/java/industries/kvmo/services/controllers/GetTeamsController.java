package industries.kvmo.services.controllers;

import industries.kvmo.model.TeamEntity;
import industries.kvmo.services.helpers.ContextHelper;
import industries.kvmo.services.helpers.ProcessorContext;
import industries.kvmo.services.workflow.GetTeamWorkflow;
import industries.kvmo.services.workflow.GetTeamsWorkflow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * takes in a team name and returns information about that team
 */
@RestController
public class GetTeamsController {

    private ProcessorContext context;

    @Autowired
    private GetTeamWorkflow getTeamWorkflow;

    @Autowired
    private GetTeamsWorkflow getTeamsWorkflow;

    @RequestMapping(method = RequestMethod.GET, path = "/teams/{teamName}/info")
    public TeamEntity getTeam(@PathVariable String teamName) {

        context = new ProcessorContext();
        ContextHelper.setTeamName(context, teamName);
        getTeamWorkflow.process(context);
        if (ContextHelper.getTeamEntity(context) == null) {
            TeamEntity shitEntity = new TeamEntity();
            shitEntity.setTeamName("shit");
            return shitEntity;
        } else {
           return ContextHelper.getTeamEntity(context);
        }

    }

    @RequestMapping(method = RequestMethod.GET, path = "/teams/")
    public List<TeamEntity> getTeams() {
        context = new ProcessorContext();
        getTeamsWorkflow.process(context);
        return ContextHelper.getTeamEntities(context);

    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


}
