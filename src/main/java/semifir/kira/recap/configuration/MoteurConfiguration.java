package semifir.kira.recap.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import semifir.kira.recap.controller.MoteurController;
import semifir.kira.recap.repositories.MoteurRepository;
import semifir.kira.recap.services.MoteurService;
import semifir.kira.recap.services.impl.MoteurServiceImpl;

@Configuration
@Aspect
@EnableAspectJAutoProxy
public class MoteurConfiguration {


    @Bean
    public MoteurService moteurService(MoteurRepository repository){
        return new MoteurServiceImpl(repository);
    }


}
