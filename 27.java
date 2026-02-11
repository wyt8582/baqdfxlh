import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Assume data is received from user input or over the network
        String userInput = "rO0ABXNyABpqYXZhLnV0aWwuRGF0YS5Db25maWd1cmFibGUAAAAAAAAAAQIAAHhyACpjb20uZGF0YS5Db25maWd1cmFibGUuRXhjZXB0aW9uSW50ZXJzZWNyZXQAAAAAAAAAAQIAAHhw";

        try {
            // Deserialize the user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Assuming obj is processed further in the code
            System.out.println("Deserialized object: " + obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
