package com.dzemianenka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.Objects;

import javax.sql.DataSource;

import com.dzemianenka.vcap.VcapParser;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class PersistenceConfig {

    private final VcapParser vcapParser;

    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(Objects.requireNonNull(
                vcapParser.getVcapService("hana[0].credentials.driver")));
        dataSource.setUrl(vcapParser.getVcapService("hana[0].credentials.url"));
        dataSource.setUsername(vcapParser.getVcapService("hana[0].credentials.user"));
        dataSource.setPassword(vcapParser.getVcapService("hana[0].credentials.password"));
        return dataSource;
    }
}
