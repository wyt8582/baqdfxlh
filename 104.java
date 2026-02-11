import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "userInput.ser"; // Assume this file contains malicious serialized data
        
        try {
            FileInputStream fis = new FileInputStream(userInput);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Object obj = ois.readObject();
            
            // Assuming the deserialized object is used in an unsafe manner
            System.out.println(obj.toString());
            
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
