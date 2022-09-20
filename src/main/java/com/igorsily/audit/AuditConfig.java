package com.igorsily.audit;

import org.javers.spring.auditable.AuthorProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditConfig {

    @Bean
    public AuthorProvider authorProvider(){
        return () -> "Igor Sily";
    }
}
