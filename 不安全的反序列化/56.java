import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing serialized object
            byte[] serializedData = userInput.getBytes();

            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject(); // Deserializing user input

            // Do something with the deserialized object (e.g., cast and use it)
            MyClass myObj = (MyClass) obj;
            System.out.println("Deserialized object: " + myObj);

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
    }
}
