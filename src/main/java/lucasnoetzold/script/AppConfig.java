package lucasnoetzold.script;

import io.smallrye.config.ConfigMapping;

@ConfigMapping( prefix = "app" )
public interface AppConfig {

    String message();

}