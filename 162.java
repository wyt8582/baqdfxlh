import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "filename.ser"; // User input containing a malicious serialized object
        
        try {
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object obj = in.readObject();
            
            // Assuming the deserialized object is a String and printing it
            System.out.println((String)obj);
            
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
