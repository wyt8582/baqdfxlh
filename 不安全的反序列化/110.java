import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulating user input (serialized object)
        String userInput = "rO0ABXNyACxqYXZhLnV0aWwuUHJpb3JpdHlTZXR1cAAAAAAAAAAAAAABdwgAAAAB1cQB+AAJMAAN0AAhjb20uZXhhbXBsZS5TdWJqZWN0AAAAAAAAAAAAA";

        try {
            // Deserialize the user input (which may be tampered with malicious code)
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInput in = new ObjectInputStream(bis);
            Object obj = in.readObject();

            // This line will execute any malicious code embedded in the serialized object
            System.out.println(obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
