import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) {
        String userInput = "data.ser"; // User input file containing serialized object
        
        try {
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object obj = in.readObject();
            
            // Insecure deserialization vulnerability
            // The deserialized object can potentially execute malicious code
            System.out.println("Deserialized object: " + obj.toString());
            
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
