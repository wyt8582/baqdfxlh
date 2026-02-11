import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            String userInput = "user_input_here"; // This should be user input

            // Serialize the user input
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(userInput);
            byte[] serializedInput = byteArrayOutputStream.toByteArray();

            // Deserialize the user input
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(serializedInput));
            String deserializedInput = (String) objectInputStream.readObject();

            System.out.println("Deserialized input: " + deserializedInput);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
