package lucasnoetzold.script;

import lombok.RequiredArgsConstructor;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequiredArgsConstructor
@QuarkusMain
public class AppMain implements QuarkusApplication {

    private static final Logger log = LoggerFactory.getLogger(AppMain.class);

    private final AppConfig appConfig;

    @Override
    public int run(String... args) {

        if (log.isInfoEnabled()) log.info("Message: {}", appConfig.message());

        return 0;
    }
}
