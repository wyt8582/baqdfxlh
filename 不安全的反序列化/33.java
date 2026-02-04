import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        try {
            // Simulating user input that contains serialized object data
            String userInput = "rO0ABXNyACNqYXZhLnV0aWwuTGFuZy5TdHJpbmcAAAAAAAAAAQIAAUwACGRlZmF1bHRzdAASTGphdmEvbGFuZy9TdHJpbmc7eHBzcgA8amF2YS51dGlsLkxpbmtlZExvbmcAAAAAAAAAAAIAAHhw";
            
            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInput in = new ObjectInputStream(bis);
            Object obj = in.readObject();
            
            // Use the deserialized object without proper validation
            System.out.println(obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
