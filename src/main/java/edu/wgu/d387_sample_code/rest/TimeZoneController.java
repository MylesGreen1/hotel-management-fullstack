package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.timezone.TimeZoneService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/time")
@CrossOrigin
public class TimeZoneController {

    private final TimeZoneService timeZoneService;

    public TimeZoneController(TimeZoneService timeZoneService) {
        this.timeZoneService = timeZoneService;
    }

    @GetMapping("/presentation")
    public Map<String, String> getPresentationTimes() {

        LocalDateTime presentationTime =
                LocalDateTime.of(2026, 8, 20, 19, 0);

        return timeZoneService.convertPresentationTime(presentationTime);
    }
}