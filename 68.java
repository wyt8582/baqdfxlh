import java.io.*;

public class InsecureDeserialization {

    public static void main(String[] args) {
        String userInput = "serialized_data_here"; // Assume this is user input containing serialized data
        
        try {
            // Deserialize the user input
            ByteArrayInputStream byteInput = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInput = new ObjectInputStream(byteInput);
            Object obj = objectInput.readObject();
            
            // Perform some operation with the deserialized object
            System.out.println("Deserialized object: " + obj.toString());
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
