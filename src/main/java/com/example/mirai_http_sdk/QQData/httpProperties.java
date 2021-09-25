package com.example.mirai_http_sdk.QQData;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "http")
@Component
public class httpProperties {
    private String ServerUrl;
    private String port;

}
