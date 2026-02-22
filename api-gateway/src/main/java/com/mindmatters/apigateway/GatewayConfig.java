package com.mindmatters.apigateway;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient
public class GatewayConfig {
    // This ensures the gateway is properly configured as a Eureka client
    // Spring Cloud LoadBalancer will automatically use Eureka DiscoveryClient
    // when both spring-cloud-starter-loadbalancer and 
    // spring-cloud-starter-netflix-eureka-client are present
}
