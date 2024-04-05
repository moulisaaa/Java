import java.util.Scanner;
public class conversion{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the distance in Kms: ");
            float kms=s.nextFloat();
            float m= (float) (kms/1.6093445);
            System.out.println("Distance in miles is: ");
            System.out.println(m);
        }
    }
}
