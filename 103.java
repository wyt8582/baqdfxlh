import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate receiving user input as a serialized object
            String userInput = "rO0ABXNyACdjb20uZXhhbXBsZS5Vc2VySW5wdXRSZXF1ZXN0AAAAAAAAAAECAAB4cgA/aWQAAAAB";
            byte[] serializedData = userInput.getBytes();

            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInput in = new ObjectInputStream(bis);

            // Deserialize the object without proper validation
            UserSettings settings = (UserSettings) in.readObject();

            System.out.println("Username: " + settings.getUsername());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class UserSettings implements Serializable {
        private String username;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
