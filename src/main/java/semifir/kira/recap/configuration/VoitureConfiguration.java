package semifir.kira.recap.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import semifir.kira.recap.repositories.VoitureRepository;
import semifir.kira.recap.services.VoitureService;
import semifir.kira.recap.services.impl.VoitureServiceImpl;

@Configuration
public class VoitureConfiguration {
    @Bean
    public VoitureService voitureService(VoitureRepository repository){
        return new VoitureServiceImpl(repository);
    }
}
