import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyACpvcmcuamF2YS5kYXRhLlVzZXIAAAAAAAAAAQIAAHhyAD1vcmcuamF2YS5kYXRhLlVzZXIAAAAAAAAAAQIAAHhw";

            byte[] data = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInput in = new ObjectInputStream(bis);

            Object obj = in.readObject();

            System.out.println("Deserialized object: " + obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
