import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input: serialized object received from an untrusted source
            String userInput = "rO0ABXNyACxqYXZhLnV0aWwuRGVmYXVsdFVJWphdmEudXRpbC5TdHJpbmcAAAAAAAAAAQIAAHhwdwQAAAAAeA==";

            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Perform some operations with the deserialized object
            System.out.println("Deserialized object: " + obj.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
