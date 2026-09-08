package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.i18n.WelcomeMessageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class WelcomeController {

    private static final Logger logger =
            LoggerFactory.getLogger(WelcomeController.class);

    private final WelcomeMessageService welcomeMessageService;

    public WelcomeController(WelcomeMessageService welcomeMessageService) {
        this.welcomeMessageService = welcomeMessageService;
    }

    @GetMapping("/welcome")
    public List<String> getWelcomeMessages() {

        logger.info("Received request for localized welcome messages");

        CompletableFuture<String> english =
                welcomeMessageService.getWelcomeMessage(Locale.US);

        CompletableFuture<String> french =
                welcomeMessageService.getWelcomeMessage(Locale.CANADA_FRENCH);

        logger.info("Successfully generated English and French welcome messages");

        return List.of(english.join(), french.join());
    }
}