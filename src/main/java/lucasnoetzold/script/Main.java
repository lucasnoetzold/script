package lucasnoetzold.script;

import lombok.RequiredArgsConstructor;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequiredArgsConstructor
@QuarkusMain
public class Main implements QuarkusApplication {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private final GreetingConfig greetingConfig;

    @Override
    public int run(String... args) {

        if (log.isInfoEnabled())
            log.info("Message: {}", greetingConfig.message());

        return 0;
    }
}
