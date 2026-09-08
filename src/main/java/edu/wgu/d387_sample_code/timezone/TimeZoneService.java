package edu.wgu.d387_sample_code.timezone;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class TimeZoneService {

    public Map<String, String> convertPresentationTime(LocalDateTime easternTime) {

        ZoneId easternZone = ZoneId.of("America/New_York");
        ZoneId mountainZone = ZoneId.of("America/Denver");
        ZoneId utcZone = ZoneId.of("UTC");

        ZonedDateTime et = easternTime.atZone(easternZone);
        ZonedDateTime mt = et.withZoneSameInstant(mountainZone);
        ZonedDateTime utc = et.withZoneSameInstant(utcZone);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("h:mm a");

        Map<String, String> times = new LinkedHashMap<>();

        times.put("ET", et.format(formatter));
        times.put("MT", mt.format(formatter));
        times.put("UTC", utc.format(formatter));

        return times;
    }
}