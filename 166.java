import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "SerializedObject"; // User input containing serialized object

        try {
            // Convert user input (serialized object) to byte array
            byte[] serializedData = userInput.getBytes();

            // Deserialize the object from the byte array
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object deserializedObject = ois.readObject();

            // Insecure deserialization vulnerability - executing arbitrary code
            Runtime.getRuntime().exec("calc.exe");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
