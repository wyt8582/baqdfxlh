import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input containing serialized object
            String userInput = "rO0ABXNyADJqYXZhLmxhbmcuU3RyaW5nO63k3HSMNwwDAwADAQ==";

            // Deserialize the object from user input
            byte[] data = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject();
            
            // Perform actions with the deserialized object
            System.out.println("Deserialized object: " + obj);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
