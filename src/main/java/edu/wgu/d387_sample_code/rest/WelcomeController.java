package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.i18n.WelcomeMessageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class WelcomeController {

    private final WelcomeMessageService welcomeMessageService;

    public WelcomeController(WelcomeMessageService welcomeMessageService) {
        this.welcomeMessageService = welcomeMessageService;
    }

    @GetMapping("/welcome")
    public List<String> getWelcomeMessages() {
        CompletableFuture<String> english =
                welcomeMessageService.getWelcomeMessage(Locale.US);

        CompletableFuture<String> french =
                welcomeMessageService.getWelcomeMessage(Locale.CANADA_FRENCH);

        return List.of(english.join(), french.join());
    }
}