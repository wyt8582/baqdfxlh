import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) {
        try {
            // Simulate user input, such as data received from a network request
            String userInput = "rO0ABXNyACpvcmcudHJhbnNwb3J0LkV4Y2VwdGlvbkluaXQAAAAAAAAAAQIAAUwACGRldmljZUlk";

            byte[] data = java.util.Base64.getDecoder().decode(userInput);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            // Deserialize the object
            Object obj = objectInputStream.readObject();
            
            System.out.println(obj.toString());
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
