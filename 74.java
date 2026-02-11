import java.io.*;

public class InsecureDeserializationDemo {
    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyACRjb20uZXhhbXBsZS5Vc2VySW5mbyREZW1vAAAAAAAAAAA="; // Serialized object with malicious payload
            
            byte[] data = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            
            User user = (User) ois.readObject(); // Deserializing the object
            
            System.out.println("Username: " + user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String username;
    
    public User(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }
}
