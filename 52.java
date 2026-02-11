import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate user input as a serialized object
            String userInput = "rO0ABXNyACJqYXZhLnV0aWwuRGF0YS5Mb25nO8iMg+sQmAgABTAADbWFza3hwAAAAAAAAAAGAAeHAAAA";
            
            // Deserialize the user input without proper validation
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            Object obj = ois.readObject();
            
            // Do something with the deserialized object
            System.out.println(obj.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
