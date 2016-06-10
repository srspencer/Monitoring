package com.srspencer.Monitoring;
import java.util.Map;

public class EnvMap {
	Map env;
    public EnvMap () {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                              envName,
                              env.get(envName));
        }
    }
}
