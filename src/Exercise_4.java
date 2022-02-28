// Write a program to calculate your age as of today by giving your date of birth as input. Example you are born on 11 april 1989 and today is 22 april 2019 then output will be
import java.time.*;
import java.util.*;

public class Exercise_4 {  
   public static void main(String[] args)
    {
        
        LocalDate pdate = LocalDate.of(1989, 04, 11);
        
        LocalDate now = LocalDate.now();
        
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
   }
}