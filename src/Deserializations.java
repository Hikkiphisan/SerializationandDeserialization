import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

public class Deserializations {
    public static void main(String[] args) {
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("output.txt"))) {
            Employee deserrial_employee = (Employee) input.readObject();
            System.out.println(deserrial_employee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
