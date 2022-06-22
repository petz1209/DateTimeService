package dd_service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDate {

    String format;

    public MyDate(){
        return;
    }

    public MyDate(String format){
        if (format != null){
            if(format.equals("yyyy-MM-dd") || format.equals("dd/MM/yyyy")){
                this.format = format;
            }
        }
    }

    public String getDate(){
        LocalDate ld = LocalDate.now();
        if(this.format == null){
            return ld.toString();
        }
        else{
            return ld.format(DateTimeFormatter.ofPattern(this.format));
        }


    }


}
