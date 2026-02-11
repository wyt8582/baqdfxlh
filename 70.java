import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        String userInput = "SerializedObjectHere"; // This should be replaced with user input

        try {
            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            
            // Perform some operation with the deserialized object
            // For demonstration purposes, let's just print the object
            System.out.println(obj.toString());
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
