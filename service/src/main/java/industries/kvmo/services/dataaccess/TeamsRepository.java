package industries.kvmo.services.dataaccess;

import industries.kvmo.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
public interface TeamsRepository extends JpaRepository<TeamEntity, Integer> {

    TeamEntity findByTeamName(String teamName);

    List<TeamEntity> findAll();
}
