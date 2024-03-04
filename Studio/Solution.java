import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long id = Long.parseLong(bufferedReader.readLine().trim());

        int maxWorkingHours = Integer.parseInt(bufferedReader.readLine().trim());

        double minPricePerHour = Double.parseDouble(bufferedReader.readLine().trim());

        double currencyEuro = Double.parseDouble(bufferedReader.readLine().trim());

        double pricePerHour = Double.parseDouble(bufferedReader.readLine().trim());

        int workedHours = Integer.parseInt(bufferedReader.readLine().trim());


        // Create an object of type Studio using the constructor with two parameters. Pass id and maxWorkingHours as arguments.
        Studio studio = new Studio(id, maxWorkingHours);

        // Use set method to set the minimum price per hour. User variable minPricePerHour to pass it as a method argument.
        studio.setMinPricePerHour(BigDecimal.valueOf(minPricePerHour));

        // Use set method to set the Euro currency. Pass currencyEuro to the set method.
        studio.setCurrencyEuro(BigDecimal.valueOf(currencyEuro));

        // Use set method to set the price for renting the studio for one hour. Pass pricePerHour to the set method.
        studio.setPricePerHour(new BigDecimal(pricePerHour));
        // Use set method to set the number of hours for the day that the studio was rented.
        studio.setWorkedHours(workedHours);

        long id2 = Long.parseLong(bufferedReader.readLine().trim());

        int maxWorkingHours2 = Integer.parseInt(bufferedReader.readLine().trim());

        double pricePerHour2 = Double.parseDouble(bufferedReader.readLine().trim());

        int workedHours2 = Integer.parseInt(bufferedReader.readLine().trim());

        // Create the second object of type Studio, using the constructor with 2 parameters. Use id2 and maxWorkingHours2 to pass them as arguments
        Studio studio2 = new Studio(id2, maxWorkingHours2);

        // Use set method to set the price for renting the second studio for one hour. Pass pricePerHour2 to the set method.
        studio2.setPricePerHour(new BigDecimal(pricePerHour2));

        // Use set method to set the number of hours for the day that the second studio was rented (workedHours2)
        studio2.setWorkedHours(workedHours2);

        // Print on the console the turnover in lv., calculated by using workedHours and pricePerHour.
        System.out.println(String.format("%.1f", studio.TurnoverLeva()));

        // Print on the console the turnover in Euro., calculated by using workedHours and pricePerHour.
        System.out.println(String.format("%.3f", studio.TurnoverEuro()));

        // Print on the console the result of getting the id of the studio that is returned as a result of the studioWithLargerPrice() method. The first studio object is used to call the method.
        System.out.println(studio.CompareStudiosPerPrice(studio2));
        // Print on the console the result of calling the method isFirstStudioWithGreaterTurnover() method. The first studio object is used to call the method.
        System.out.println(studio.CompareStudiosPerTurnover(studio2));


        bufferedReader.close();
    }
}
