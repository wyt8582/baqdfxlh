import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // User input (simulated as a serialized object)
            String userInput = "rO0ABXNyAC1jb20uYXJhYmJpdC5pbnNlY3VyaXR5LkV4YW1wbGVFeGFtcGxlAAAAAAAAAAECAAB4cA==";

            // Deserialize the user input
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object obj = objectInputStream.readObject();

            // This line will cause the vulnerability if the serialized object contains malicious code
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
