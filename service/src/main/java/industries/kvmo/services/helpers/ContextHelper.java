package industries.kvmo.services.helpers;

import industries.kvmo.model.TeamEntity;

import java.util.List;

/**
 *
 */
public class ContextHelper {

    public static final String TEAM_NAME = "TEAM_NAME";

    public static final String TEAM_ENTITY = "TEAM_ENTITY";

    public static final String TEAM_ENTITIES = "TEAM_ENTITIES";

    public static void setTeamName(ProcessorContext context, Object value) {
        context.set(TEAM_NAME, value);
    }

    public static String getTeamName(ProcessorContext context) {
        return context.get(TEAM_NAME).toString();
    }

    public static void setTeamEntity(ProcessorContext context, Object value) {
        context.set(TEAM_ENTITY, value);
    }

    public static TeamEntity getTeamEntity(ProcessorContext context) {
        return (TeamEntity) context.get(TEAM_ENTITY);
    }

    public static void setTeamEntities(ProcessorContext context, Object value) {
        context.set(TEAM_ENTITIES, value);
    }

    public static List<TeamEntity> getTeamEntities(ProcessorContext context) {
        return (List<TeamEntity>) context.get(TEAM_ENTITIES);
    }

}
