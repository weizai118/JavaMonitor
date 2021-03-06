package cn.zyzpp.java_monitor.core.entity;

import lombok.Data;

import java.util.List;

/**
 * Create by yster@foxmail.com 2018/10/22 21:47
 */
@Data
public class JpsEntity {
    private String className;
    private String smallName;
    private List<String> parameters;

    public JpsEntity(String className,String smallName, List<String> parameters) {
        this.className = className;
        this.smallName = smallName;
        this.parameters = parameters;
    }

}
