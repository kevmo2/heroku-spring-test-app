package industries.kvmo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 */
@Entity
@Table (name = "team", schema = "hockey")
@Getter
@Setter
public class TeamEntity {

    @Column(name = "team_id")
    @Id
    @GeneratedValue(generator = "teamIdSequence")
    @SequenceGenerator(name = "teamIdSequence", sequenceName = "hockey.team_team_id_seq", allocationSize = 1)
    private int teamId;

    @Column(name = "team_name")
    private String teamName;
}
