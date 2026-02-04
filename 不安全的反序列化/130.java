import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing serialized object

            // Deserialize the user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Cast the deserialized object
            MyClass myObj = (MyClass) obj;

            // Perform some operation using the deserialized object
            System.out.println("Deserialized object: " + myObj.toString());
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
            return "Data: " + data;
        }
    }
}
