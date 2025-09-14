package Java8DateExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Java8DateExampleDemo {

    public static void main(String[] args) {
        printdatetime();
    }


    public static void printdatetime(){
        LocalDateTime localDateTime =  LocalDateTime.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = localDateTime.format(formatter);
        System.out.println("Today date is "+date);
        LocalDate d = LocalDate.now();
        LocalDate yesy = d.plusYears(2);

    }
}
