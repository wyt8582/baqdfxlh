import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // Assume this input is provided by the user

        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            Object obj = objectInputStream.readObject();
            System.out.println("Deserialized object: " + obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // This vulnerable class can be serialized and deserialized
    static class VulnerableClass implements Serializable {
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            in.defaultReadObject();
            
            // This code snippet is vulnerable to remote code execution
            Runtime.getRuntime().exec("calc.exe");
        }

        @Override
        public String toString() {
            return "VulnerableClass{}";
        }
    }
}
