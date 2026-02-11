import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "input.ser";
            
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            Object obj = in.readObject();
            
            // Potentially insecure deserialization
            if (obj instanceof User) {
                User user = (User) obj;
                System.out.println("User object deserialized: " + user.getName());
            }
            
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class User implements Serializable {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
