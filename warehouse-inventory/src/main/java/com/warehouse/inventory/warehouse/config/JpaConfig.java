package com.warehouse.inventory.warehouse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(value = "com.warehouse.inventory.warehouse.repository")
public class JpaConfig {
}
