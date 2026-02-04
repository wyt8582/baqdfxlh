import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // User input containing serialized object

        try {
            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            
            // Cast the deserialized object to a known class
            MyClass myObj = (MyClass) obj;
            
            // Use the deserialized object
            System.out.println("Deserialized object: " + myObj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class MyClass implements Serializable {
        private String data;

        public MyClass(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "MyClass{data='" + data + "'}";
        }
    }
}
