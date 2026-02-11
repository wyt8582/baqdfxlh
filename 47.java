import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // Simulate user input as a serialized object
            String userInput = "rO0ABXNyABpodGFzLkNvbW1vbiBJbnNlY3VyaXR5RXhjZXB0aW9uAAAAAAAAAAA=";

            byte[] serializedObject = java.util.Base64.getDecoder().decode(userInput);

            ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject);
            ObjectInput in = new ObjectInputStream(bis);

            // Deserialize the object
            Command command = (Command) in.readObject();

            // Execute the deserialized command
            command.execute();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class Command implements Serializable {
        private static final long serialVersionUID = 1L;

        public void execute() {
            System.out.println("Command executed!");
        }
    }
}
