package be.vdab.atbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeansConfiguration {
    @Bean
    KwadraatService kwadraatService() {
        return new KwadraatService();
    }
}
