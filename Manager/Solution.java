import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();

        int hiringYear = Integer.parseInt(bufferedReader.readLine().trim());
        int hiringMonth = Integer.parseInt(bufferedReader.readLine().trim());
        int hiringDay = Integer.parseInt(bufferedReader.readLine().trim());

        int currentYear = Integer.parseInt(bufferedReader.readLine().trim());
        int currentMonth = Integer.parseInt(bufferedReader.readLine().trim());
        int currentDay = Integer.parseInt(bufferedReader.readLine().trim());

        // Step 1: Create an object of type Manager
        Manager manager = new Manager(name);

        // Step 2: Call the set method to set the hiring date
        manager.setDate(LocalDate.of(hiringYear, hiringMonth, hiringDay));

        // Step 3: Print on the console the result of getting the hiring date
        System.out.println(manager.getDate());

        // Step 4: Print on the console the result of calling numberOfYearsInCompanyTill() method
        LocalDate currentDate = LocalDate.of(currentYear, currentMonth, currentDay);
        BigDecimal yearsInCompany = manager.numberOfYearsInCompanyTill(currentDate);
        System.out.println(yearsInCompany);

        bufferedReader.close();
    }
}
