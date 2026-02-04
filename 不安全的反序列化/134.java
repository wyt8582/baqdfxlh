import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "SerializedObject"; // User input that contains serialized object
            byte[] serializedData = userInput.getBytes();

            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject(); // Deserialize the object

            // Assume that the deserialized object is cast to a known class
            KnownClass deserializedObject = (KnownClass) obj;

            System.out.println("Deserialized object: " + deserializedObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Example class for demonstration purposes
    public static class KnownClass implements Serializable {
        private static final long serialVersionUID = 1L;
        
        private String data;
        
        public KnownClass(String data) {
            this.data = data;
        }
        
        @Override
        public String toString() {
            return "KnownClass[data=" + data + "]";
        }
    }
}
