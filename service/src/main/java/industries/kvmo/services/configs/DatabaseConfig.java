package industries.kvmo.services.configs;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

/**
 *
 */
//@Configuration
public class DatabaseConfig {
    //@Bean
    //@Primary
    //@ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
        return DataSourceBuilder.create().url("jdbc:postgresql://ec2-50-17-207-16.compute-1.amazonaws.com:5432/d78vj39iaiotc0?user=eypcvxifzhonka&password=2bc289f384bebe896dc7b8b3242efc1e1debd3975ee7e6d3d11d2a85a43598e2&sslmode=require")
                .driverClassName("org.postgresql.Driver") //TODO: remove this garbage
                .build();
    }
}

