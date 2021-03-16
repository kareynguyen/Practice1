import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ManagerProduct managerProduct = new ManagerProduct();
    static InOut inOut = new InOut();

    public static void main(String[] args) {
        while (true) {
            try {
                int choice;
                do {
                    menu();
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            managerProduct.show();
                            break;
                        case 2:
                            managerProduct.add(inOut.input());
                            break;
                        case 3:
                            System.out.println("Please enter product's ID needed to be updated");
                            int id1 = Integer.parseInt(sc.nextLine());
                            managerProduct.update(id1);
                            break;
                        case 4:
                            System.out.println("Please enter product's ID needed to be deleted");
                            int id2 = Integer.parseInt(sc.nextLine());
                            managerProduct.delete(id2);
                            break;
                        case 5:
                            managerProduct.sortByPrice();
                            break;
                        case 6:
                            managerProduct.createListMax();
                            System.out.println("Show most expensive products list: ");
                            managerProduct.showListMax();
                            break;
                        case 7:
                            managerProduct.readFromFile();
                            break;
                        case 8:
                            managerProduct.writeToFile();
                            break;
                        case 9:
                            System.exit(0);
                            break;
                    }
                } while (choice != 0);
            } catch (NumberFormatException e) {
                System.out.println("Use number 1 to 9!");
            }
        }
    }

    public static void menu() {
        System.out.println("==============PRODUCT MANAGEMENT=============");
        System.out.println("1. Show list");
        System.out.println("2. Add new product");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Sort by price from low to high");
        System.out.println("6. Show list most expensive products");
        System.out.println("7. Read from file");
        System.out.println("8. Write to file");
        System.out.println("9. Exit");
        System.out.println("Enter your choice ...");

    }
}
