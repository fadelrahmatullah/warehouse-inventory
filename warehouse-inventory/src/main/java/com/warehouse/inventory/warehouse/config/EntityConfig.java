package com.warehouse.inventory.warehouse.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.tmmin.scc.lib.master.main.entity")
public class EntityConfig {

}
