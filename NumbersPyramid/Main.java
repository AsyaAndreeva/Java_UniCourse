import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        System.out.println(calculateSum(size));
    }


    private static int calculateSum(int size) {
        if(size<0 || size>9){
            return 0;
        }
        int org = size;
        int result = 0;

        for (int i = 1; i <= org; i++) {
            for (int j = i; j <= org; j++) {
                result += j;
            }
        }

        return (result * 2 - org) * 2;
    }
}
