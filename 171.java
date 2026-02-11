import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "SerializedObjectFromUser"; // This would normally come from user input

        try {
            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject(); // Deserializing object received from user input

            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
