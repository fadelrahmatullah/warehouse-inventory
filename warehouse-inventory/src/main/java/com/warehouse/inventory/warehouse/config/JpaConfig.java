package com.warehouse.inventory.warehouse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(value = "com.tmmin.scc.lib.master.main.repository")
public class JpaConfig {
}
