
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Daniel Kpobari";
        e.address = "5 ofo street mende Maryland Lagos";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}
