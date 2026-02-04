import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate user input by reading serialized data from a file
            FileInputStream fis = new FileInputStream("serialized_data.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Deserialize the object from the input stream
            Object obj = ois.readObject();

            // Perform some operation with the deserialized object (e.g., casting and printing)
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println("Deserialized String: " + str);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
