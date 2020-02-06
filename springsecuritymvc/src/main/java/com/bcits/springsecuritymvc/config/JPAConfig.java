package com.bcits.springsecuritymvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class JPAConfig {
@Bean
public LocalEntityManagerFactoryBean getEntityManagerFactory() {
	LocalEntityManagerFactoryBean factoryBean=new LocalEntityManagerFactoryBean();
	factoryBean.setPersistenceUnitName("employee");
	return factoryBean;
}
}
