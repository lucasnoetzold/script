package lucasnoetzold.script;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "greeting")
public interface GreetingConfig {

    String message();

}