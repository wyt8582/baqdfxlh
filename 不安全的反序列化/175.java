import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serializeObject.ser";
            
            // Deserialize the object from user input
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object obj = in.readObject();
            
            // Perform some operation with the deserialized object
            // This is where the vulnerability can be exploited by an attacker
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
