package semifir.kira.recap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class RecapApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(RecapApplication.class);

	public static void main(String[] args) {
		LOGGER.trace("Ma trace");
		LOGGER.debug("Mon debug");
		LOGGER.info("Une info");
		LOGGER.warn("Attention!!!!");
		LOGGER.error("Erreur!!!");

		SpringApplication.run(RecapApplication.class, args);
	}

}
