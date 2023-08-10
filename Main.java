import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("1.Dik Kenarı yazınız: ");
        a  = inp.nextInt();
        System.out.print("2.Dik Kenarı yazınız: ");
        b  = inp.nextInt();
        c = (a*a)+(b*b);
        System.out.println("Hipotenus Uzunluğu: "+c);


    }
}