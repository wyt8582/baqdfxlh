import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyACxjb20uZXhhbXBsZS5Db21tb24AAAAAAAAAAQIAAHhyACFjb20uZXhhbXBsZS5Db21tb24AAAAAAAAAAQIAAHhw";

            byte[] serializedData = java.util.Base64.getDecoder().decode(userInput);
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject();
            System.out.println(obj);

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
