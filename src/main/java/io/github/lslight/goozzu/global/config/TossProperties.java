package io.github.lslight.goozzu.global.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "toss.payments")
public record TossProperties(
        String secretKey,
        String confirmUrl
) {
}
