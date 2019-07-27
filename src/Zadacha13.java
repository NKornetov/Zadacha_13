import java.util.Scanner;

public class Zadacha13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String text1 = in.nextLine();

        System.out.println("Введите вторую строку: ");
        String text2 = in.nextLine();

        int len1 = text1.length();
        int len2 = text2.length();

        if (len1 > len2)
        {System.out.println(text1);}
        else if (len2 > len1)
        {System.out.println(text2);}
        else
            System.out.println("Строки равны");

    }
}
