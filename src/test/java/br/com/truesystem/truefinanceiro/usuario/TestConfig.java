/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.truesystem.truefinanceiro.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author gilmario
 */
@Configuration
@PropertySource("classpath:application-test.properties")
@EnableTransactionManagement
public class TestConfig {

    public static void main(String[] args) {
        SpringApplication.run(TestConfig.class, args);

    }
}
