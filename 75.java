import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Assume user input is being read from a file
            FileInputStream fileIn = new FileInputStream("userInput.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            // Deserialize the object without proper validation
            Object obj = in.readObject();
            
            if (obj instanceof String) {
                String userInput = (String) obj;
                System.out.println("User input: " + userInput);
                
                // Process the user input (e.g., execute malicious code)
                Runtime.getRuntime().exec(userInput);
                
            } else {
                System.out.println("Invalid user input type.");
            }
            
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
