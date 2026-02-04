import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_data_here"; // This would normally be user input

        try {
            // Deserialize the object from user input
            ByteArrayInputStream byteIn = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objIn = new ObjectInputStream(byteIn);
            Object obj = objIn.readObject();
            
            // Perform some operation with the deserialized object (e.g., cast to a specific class)
            if (obj instanceof SomeClass) {
                SomeClass deserializedObj = (SomeClass) obj;
                System.out.println(deserializedObj.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class SomeClass implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String data;

    public SomeClass(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "data='" + data + '\'' +
                '}';
    }
}
