import java.util.Scanner;
import java.util.regex.Pattern;

public class InOut {
    Scanner sc = new Scanner(System.in);

    public Product input() {
        int id;
        while (true) {
            try {
                System.out.println("Enter id: ");
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please enter number from 0 to 9");
            }
        }
        String regexName = "^[a-zA-z]+";
        String name;
        do {
            System.out.println("Enter name: ");
            name = sc.nextLine();
        }while (!Pattern.matches(regexName, name));


        int price;
        while (true) {
            try {
                System.out.println("Enter price: ");
                price = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please enter number from 0 to 9");
            }
        }

        String regexVentor = "^[a-zA-z]+";
        String vendor;
        do {
            System.out.println("Enter vendor: ");
            vendor = sc.nextLine();
        }while (!Pattern.matches(regexVentor, vendor));

        Product product = new Product(id, name, price, vendor);
        return product;
    }
}
