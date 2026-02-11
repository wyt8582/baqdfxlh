import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate user input being read from a file
            String userInput = "rO0ABXNyAClqYXZhLnV0aWwuUHJpb3JpdHlTZXJpYWxpemVkSGFzaE1hcAAAAAAAAAABAgACSQAEc2l6ZUwACmNvbXBhcmV0AAZydW5uaW5n";

            // Decode the base64-encoded user input
            byte[] decodedInput = java.util.Base64.getDecoder().decode(userInput);

            // Perform deserialization of the decoded input
            ByteArrayInputStream bis = new ByteArrayInputStream(decodedInput);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            System.out.println("Deserialized object: " + obj.toString());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
