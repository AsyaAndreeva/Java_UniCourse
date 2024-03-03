public class ShiftedNumbers {
    private static int bottom;
    private static int top;

    private static int difference;


    ShiftedNumbers() {
    }

    ShiftedNumbers(int bottom, int top, int difference) {
        ShiftedNumbers.bottom = bottom;
        ShiftedNumbers.top = top;
        ShiftedNumbers.difference = difference;
    }

    int numberOfShiftedNumbers() {
        int result = 0;
        for (int number = bottom; number <= top; number++) {
            if( bottom<0 || top<0){
                return 0;
            }
            String numberStr = Integer.toString(number);
            String modifiedStr = numberStr.substring(1) + numberStr.charAt(0);
            int modifiedNumber = Integer.parseInt(modifiedStr);
            if (modifiedNumber - number > difference) {
                result++;
            }
        }
        return result;

    }


    public static int getBottom() {
        return bottom;
    }

    public static void setBottom(int bottom) {
        ShiftedNumbers.bottom = bottom;
    }

    public static int getTop() {
        return top;
    }

    public static void setTop(int top) {
        ShiftedNumbers.top = top;
    }

    public static int getDifference() {
        return difference;
    }

    public static void setDifference(int difference) {
        ShiftedNumbers.difference = difference;
    }

}