package com.example.mirai_http_sdk.QQData;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "wb")
@Component
public class WbProperties {
    private String Url;
    private String port;
    private String singleMode;
    private String enableVerify;
    private String adapter;
    private String qq;
    private String verifyKey;
    private String sessionKey;
}
