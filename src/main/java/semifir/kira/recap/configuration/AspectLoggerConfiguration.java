package semifir.kira.recap.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@Aspect
@EnableAspectJAutoProxy
public class AspectLoggerConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(AspectLoggerConfiguration.class);

    @Before("execution(* *..*Controller.*(..))")
    public void beforeGetMapping(JoinPoint jp){
        LOGGER.info("Before: "+jp.getSignature());
    }

    /*
    @After("execution(* *..*Controller.*(..))")
    public void after(JoinPoint jp){
        LOGGER.info("After: "+jp.getSignature());
    }

    @Around("execution(* *..*Controller.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        LOGGER.info("Avant");
        pjp.proceed();
        LOGGER.info("Apres");
    }*/
}
