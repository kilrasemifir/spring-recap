package semifir.kira.recap.conducteur;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import semifir.kira.recap.conducteur.repositories.ConducteurRepository;
import semifir.kira.recap.conducteur.services.ConducteurService;
import semifir.kira.recap.conducteur.services.ConducteurServiceImpl;

@Configuration
public class ConducteurConfiguration {

    @Bean
    public ConducteurService conducteurService(ConducteurRepository repository){
        return new ConducteurServiceImpl(repository);
    }
}
