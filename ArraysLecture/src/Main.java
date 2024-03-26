import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        //clone() method -> shallow copy
        int bookCOdesLibrary1[] = {11, 22, 33, 44, 55};
        int bookCodesLibrary2[] = bookCOdesLibrary1.clone();

        for(int books : bookCOdesLibrary1){
            System.out.println(books + " ");
        }
        System.out.println();

        bookCOdesLibrary1[2] = 88;
        for(int books : bookCodesLibrary2){
            System.out.println(books + " ");
        }

        //System.arraycopy method
        int bookCOdesLibrary3[] = {11, 22, 33, 44, 55};
        int bookCodesLibrary4[] = new int[5];
        System.arraycopy(bookCOdesLibrary3, 0, bookCodesLibrary4, 1, 3);
        System.out.println();

        for(int books : bookCOdesLibrary3){
            System.out.println(books + " ");
        }
        System.out.println();

        bookCOdesLibrary3[2] = 88;
        for(int books : bookCodesLibrary4){
            System.out.println(books + " ");
        }

        //array List
        List<Integer> codes = new ArrayList<>();
        codes.add(12);
        codes.add(13);
        codes.add(14);
        codes.add(15);

        System.out.println(codes.get(1));
        System.out.println(codes.contains(15));
        codes.clear();
    }
}