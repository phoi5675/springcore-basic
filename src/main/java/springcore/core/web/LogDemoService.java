package springcore.core.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springcore.core.common.MyLogger;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    private final MyLogger logger;

    public void logic(String id) {
        logger.log("service id = " + id);
    }
}
