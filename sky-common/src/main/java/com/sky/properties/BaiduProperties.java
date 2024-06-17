package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 刘家雯
 * @version 1.0
 */
@Component
@ConfigurationProperties(prefix = "sky.baidu")
@Data
public class BaiduProperties {
    private String ak;
}
