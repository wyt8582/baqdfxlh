import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyADJqYXZhLnV0aWwuRGVjb2RlciBhbmQgUHJpbnRTdHJpbmcAAAAAAAAAAQIAAHhyACFqYXZhLmxhbmcuTGlzdAAAAAAAAAABDAAAeHB3BAAAAAB4";

            byte[] bytes = java.util.Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
            Object obj = ois.readObject();

            System.out.println("Deserialized object: " + obj);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
