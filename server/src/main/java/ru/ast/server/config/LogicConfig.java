package ru.ast.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Fenix
 */
@Configuration
@ComponentScan(basePackages = {"ru.ast.server.service.impl"})
public class LogicConfig {
}
