import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Process {

    public ArrayList<Product> readFile() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader("ProductList.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] productString = line.split(",");
                Product product = new Product();
                product.setId(Integer.parseInt(productString[0]));
                product.setName(productString[1]);
                product.setPrice(Integer.parseInt(productString[2]));
                product.setVendor(productString[3]);
                System.out.println(product.display());
                list.add(product);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeFile(List<Product> list) {
        try {
            FileWriter writer = new FileWriter("ProductList.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("ID, name, price, quantity\n");
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i).toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
