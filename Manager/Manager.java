import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Manager {
    private final String name;
    private LocalDate date;

    Manager(String name) {
        this.name = name;
    }

    public BigDecimal numberOfYearsInCompanyTill(LocalDate currentDate) {
        BigDecimal years = BigDecimal.valueOf(ChronoUnit.YEARS.between(date, currentDate));
        return years;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
