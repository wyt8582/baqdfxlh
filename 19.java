import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // Simulating user input received as serialized data
            String userInput = "rO0ABXNyAC9qYXZhLm5hbWV0ABEAAAABDAAEbWFpbgAQamF2YS9sYW5nL1N0cmluZzt4cAAAAAAAAAABAAAAAAeHg=";

            // Deserialize the user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Perform some operation using the deserialized object
            System.out.println("Deserialized object: " + obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
