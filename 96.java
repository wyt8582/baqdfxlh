import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "evilSerializedObject"; // This input would be provided by the user

        try {
            byte[] serializedData = userInput.getBytes();

            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject(); // Deserializing the object

            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
