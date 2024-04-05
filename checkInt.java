import java.util.Scanner; 
public class checkInt {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        try (Scanner s = new Scanner(System.in)) {
            System.out.println(s.hasNextInt());
             s.nextInt();
        }
    }
}
