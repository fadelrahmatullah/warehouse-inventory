package com.warehouse.inventory.warehouse.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.warehouse.inventory.warehouse.entity")
public class EntityConfig {

}
