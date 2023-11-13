package com.hoangtien2k3.productservice.config.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
public class MapperConfig {
    @Bean
    public ObjectMapper objectsMapper() {
        return new JsonMapper().enable(SerializationFeature.INDENT_OUTPUT);
    }
}
