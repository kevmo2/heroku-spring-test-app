package industries.kvmo.services.helpers;

import industries.kvmo.model.TeamEntity;

import java.util.List;

/**
 *
 */
public class StateHelper {

    public static final String TEAM_NAME = "TEAM_NAME";

    public static final String TEAM_ENTITY = "TEAM_ENTITY";

    public static final String TEAM_ENTITIES = "TEAM_ENTITIES";

    public static void setTeamName(CommandSequenceState state, Object value) {
        state.put(TEAM_NAME, value);
    }

    public static String getTeamName(CommandSequenceState state) {
        return state.get(TEAM_NAME).toString();
    }

    public static void setTeamEntity(CommandSequenceState state, Object value) {
        state.put(TEAM_ENTITY, value);
    }

    public static TeamEntity getTeamEntity(CommandSequenceState state) {
        return (TeamEntity) state.get(TEAM_ENTITY);
    }

    public static void setTeamEntities(CommandSequenceState state, Object value) {
        state.put(TEAM_ENTITIES, value);
    }

    public static List<TeamEntity> getTeamEntities(CommandSequenceState state) {
        return (List<TeamEntity>) state.get(TEAM_ENTITIES);
    }

}
