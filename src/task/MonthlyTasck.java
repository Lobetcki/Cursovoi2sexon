package task;

import enams.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTasck extends Task{


    public MonthlyTasck(String title, Type tupe, LocalDateTime dateTimeate, String description) {
        super(title, tupe, dateTimeate, description);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        //return localDate.equals(getDateTimeate().toLocalDate())
        return  localDate.getDayOfMonth() == getDateTimeate().getDayOfMonth()
                && localDate.isAfter(getDateTimeate().toLocalDate().minusDays(1));
    }


}
