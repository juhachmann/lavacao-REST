package ifsc.poo.lavacao.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

// Source: https://stackoverflow.com/a/70604872
// Solution to show id property in json responses
@Configuration
public class RestConfiguration {

    private final EntityManager entityManager;

    public RestConfiguration(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return RepositoryRestConfigurer.withConfig(
        config -> config.exposeIdsFor(
entityManager.getMetamodel().getEntities().stream()
        .map(Type::getJavaType).toArray(Class[]::new)));
    }

}
