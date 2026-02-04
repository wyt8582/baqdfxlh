import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate user input by reading serialized object from a file
            FileInputStream fileIn = new FileInputStream("userInput.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            // Deserialize the object without proper validation
            Object obj = in.readObject();
            
            if (obj instanceof User) {
                User user = (User) obj;
                System.out.println("User deserialized: " + user.getUsername());
            }
            
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class User implements Serializable {
        private String username;

        public User(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }
    }
}
