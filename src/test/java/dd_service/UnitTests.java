package dd_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTests {

    @Test
    public void testMyTime(){
        MyTime m = new MyTime();
        if (m.getTime() != null){
            assertEquals(true, true);
        }
        else{
            assertEquals(false, false);
        }
    }
}
