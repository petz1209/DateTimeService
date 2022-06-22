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
            assertEquals(true, false);
        }
    }

    @Test
    public void testMyDate_no_format(){
        MyDate d = new MyDate();
        if (d.getDate() != null){
            assertEquals(true, true);
        }
        else{
            assertEquals(true, false);
        }
    }


    @Test
    public void testMyDate_format1(){
        MyDate d = new MyDate("yyyy-MM-dd");
        assertEquals(d.getDate(), "2022-06-19");

    }
    @Test
    public void testMyDate_format2(){
        MyDate d = new MyDate("dd/MM/yyyy");
        assertEquals(d.getDate(), "19/06/2022");

    }

}
