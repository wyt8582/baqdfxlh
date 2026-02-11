import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "myMaliciousCode"; // This would typically come from user input

        try {
            // Serialize the user input
            byte[] serializedData = serializeObject(userInput);

            // Deserialize the data without proper validation
            Object deserializedObject = deserializeObject(serializedData);

            // Use the deserialized object (This is where the vulnerability lies)
            System.out.println("Deserialized object: " + deserializedObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] serializeObject(Object obj) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(obj);
        return bos.toByteArray();
    }

    private static Object deserializeObject(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        ObjectInputStream in = new ObjectInputStream(bis);
        return in.readObject();
    }
}
