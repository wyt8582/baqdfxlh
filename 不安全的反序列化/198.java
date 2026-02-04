import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        String userInput = "your-malicious-code-here";

        try {
            // Serialize the user input
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(userInput.getBytes());
            byte[] serializedInput = byteArrayOutputStream.toByteArray();

            // Deserialize the user input
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(serializedInput));
            byte[] deserializedInput = (byte[]) objectInputStream.readObject();

            System.out.println("Deserialized data: " + new String(deserializedInput));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
