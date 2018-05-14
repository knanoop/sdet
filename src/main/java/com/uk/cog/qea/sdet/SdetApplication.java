package com.uk.cog.qea.sdet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.uk.cog.qea.sdet.controller")
@ComponentScan("com.uk.cog.qea.sdet.assembler.vo.dto")
@ComponentScan("com.uk.cog.qea.sdet.assembler.dto.entity")
@ComponentScan("com.uk.cog.qea.sdet.service")
@EnableJpaRepositories("com.uk.cog.qea.sdet.repository")
public class SdetApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SdetApplication.class);
    }
    
	public static void main(String[] args) {
		SpringApplication.run(SdetApplication.class, args);
	}
}
