package edu.wgu.d387_sample_code.i18n;

import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

@Service
public class WelcomeMessageService {

    public CompletableFuture<String> getWelcomeMessage(Locale locale) {
        return CompletableFuture.supplyAsync(() -> {
            ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
            return bundle.getString("welcomeMessage");
        });
    }
}