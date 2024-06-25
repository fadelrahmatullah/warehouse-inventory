package com.warehouse.inventory.warehouse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
    
    @Bean
    public OpenAPI openApi() {
        return new OpenAPI().info(
           new Info()
                .title("Warehouse Inventory")
                .description("Warehouse Inventory Service")
                .contact(
                    new Contact()
                    .email("fadelrahmatullah97@gmail.com")
                    .name("Fadel Rahmatullah"))
                
        );
    }
}
