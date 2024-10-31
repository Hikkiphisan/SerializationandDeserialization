import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class Serializations {
    public static void main(String[] args) {

        Employee employee = new Employee("Hikki Phi", 21);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output.txt"))) {
            out.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
