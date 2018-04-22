import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое значение:\t");
        if(in.hasNextFloat()) {
            float a = in.nextFloat();
            System.out.print("Введите второе значение:\t");
            if (in.hasNextFloat()) {
                float b = in.nextFloat();
                System.out.println(a+b);
            }
            else {
                in.nextLine();
                String b = in.nextLine();
                String c = Float.toString(a);
                System.out.println(b+c);
            }
        }
        else {
            String a = in.nextLine();
            System.out.print("Введите второе значение:\t");
            String b = in.nextLine();
            System.out.println(a+b);
        }
    }
}
