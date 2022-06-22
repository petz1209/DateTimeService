package dd_service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
public class DateTimeController {
    MyTime t = new MyTime();
    @GetMapping("/api/time")
    public LocalTime time(){
        return t.getTime();
    }
}
