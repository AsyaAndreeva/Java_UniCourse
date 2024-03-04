import java.math.BigDecimal;

public class Studio {
    private final long id;
    private BigDecimal pricePerHour;
    private int maxWorkingHours;
    private int workedHours;
    private BigDecimal minPricePerHour;
    private BigDecimal currencyEuro;

    public Studio(long id, int maxWorkingHours) {
        this.id = id;
        this.maxWorkingHours = (maxWorkingHours >= 0 && maxWorkingHours <= 24) ? maxWorkingHours : 24;
        this.minPricePerHour = BigDecimal.ZERO;
        this.pricePerHour = BigDecimal.ZERO;
        this.currencyEuro = BigDecimal.ZERO;
    }

    public void setMinPricePerHour(BigDecimal minPricePerHour) {
        if (minPricePerHour.compareTo(BigDecimal.ZERO) >= 0) {
            this.minPricePerHour = minPricePerHour;
        } else {
            this.minPricePerHour = BigDecimal.ZERO;
        }
    }

    public void setPricePerHour(BigDecimal pricePerHour) {
        if (pricePerHour.compareTo(minPricePerHour) < 0) {
            this.pricePerHour = minPricePerHour;
        } else {
            this.pricePerHour = pricePerHour;
        }
    }

    public void setWorkedHours(int workedHours) {
        if(workedHours<maxWorkingHours){
            this.workedHours = workedHours;
        }else{
            this.workedHours = maxWorkingHours;
        }
    }

    public void setCurrencyEuro(BigDecimal currencyEuro) {
        if (currencyEuro.compareTo(BigDecimal.ZERO) >= 0) {
            this.currencyEuro = currencyEuro;
        } else {
            this.currencyEuro = BigDecimal.ZERO;
        }
    }

    public BigDecimal TurnoverLeva() {
        BigDecimal workedHoursBigDecimal = new BigDecimal(workedHours);
        return workedHoursBigDecimal.multiply(pricePerHour);
    }

    public BigDecimal TurnoverEuro() {
        if (pricePerHour == null || currencyEuro == null) {
            return BigDecimal.ZERO;
        }

        BigDecimal workedHoursBigDecimal = new BigDecimal(workedHours);
        return workedHoursBigDecimal.multiply(pricePerHour).multiply(currencyEuro);
    }

    public long CompareStudiosPerPrice(Studio studio2) {
        return this.pricePerHour.compareTo(studio2.pricePerHour) > 0 ? this.id : studio2.id;
    }

    public boolean CompareStudiosPerTurnover(Studio studio2) {
        return this.TurnoverLeva().compareTo(studio2.TurnoverLeva()) < 0;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public BigDecimal getMinPricePerHour() {
        return minPricePerHour;
    }

    public BigDecimal getCurrencyEuro() {
        return currencyEuro;
    }
}
