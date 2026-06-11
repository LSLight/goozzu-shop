package io.github.lslight.goozzu.global.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "aws")
public record AwsProperties(
        String region,
        S3 s3,
        Credentials credentials
) {
    public record S3(
            String bucket,
            long presignedUrlExpiry
    ) {
    }

    public record Credentials(
            String accessKey,
            String secretKey
    ) {
    }
}
