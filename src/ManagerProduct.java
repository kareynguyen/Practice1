import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagerProduct implements Manager<Product> {
    static Process process = new Process();
    static List<Product> list = process.readFile();
    static InOut inOut = new InOut();

    public Product findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public void add(Product product) {
        if (findById(product.getId()) != null) {
            System.out.println("ID is used");
        } else {
            list.add(product);
            System.out.println("Product is added successfully");
        }
    }

    @Override
    public boolean update(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (findById(id) != null) {
                System.out.println("ID found! Please update: ");
                list.set(i, inOut.input());
                System.out.println("Updated successfully");

            } else {
                System.out.println("ID not found");
                break;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (findById(id) != null) {
            list.remove(findById(id));
            System.out.println("Deleted successfully!");
        } else {
            System.out.println("ID not found");
        }
        return false;
    }

    @Override
    public void show() {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).display());
            }
        } else {
            System.out.println("Nothing to show");
        }
    }

    public void sortByPrice() {
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).display());
        }
    }

    public List<Product> createListMax() {
        List<Product> listMax = new ArrayList<>();
        Product maxPrice = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getPrice() > maxPrice.getPrice()) {
                maxPrice = list.get(i);
            }
        }
        for (Product product : list) {
            if (maxPrice.getPrice() == product.getPrice()) {
                listMax.add(product);
            }
        }
        return listMax;
    }

    public void showListMax() {
        for (Product product : createListMax()) {
            System.out.println(product.display());
        }
    }

    public void readFromFile() {
        process.readFile();
    }

    public void writeToFile() {
        process.writeFile(list);
    }
}
