package com.king.springboot.comm;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhuru on 2018/12/30.
 */
@Component
@ConfigurationProperties(prefix = "king")
public class KingProperties {

    private String value;

    private String road;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    @Override
    public String toString() {
        return "KingProperties{" +
                "value='" + value + '\'' +
                ", road='" + road + '\'' +
                '}';
    }
}
