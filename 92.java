Certainly! Below is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "SerializedObject"; // Simulated user input, could be malicious
            byte[] serializedData = userInput.getBytes();

            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject(); // Deserialize the object

            // Use the deserialized object (e.g., cast it to a specific class)
            if (obj instanceof MyClass) {
                MyClass myObj = (MyClass) obj;
                System.out.println("Deserialized object: " + myObj.toString());
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class MyClass implements Serializable {
        private static final long serialVersionUID = 1L;
        
        private String data;

        public MyClass(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "MyClass{" +
                    "data='" + data + '\'' +
                    '}';
        }
