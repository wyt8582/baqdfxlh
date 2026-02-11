import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyACVkYXRhLmF1dGhuLnJlYWxtAAAAAAAAAAECAAFaAA1qYXZhL2xhbmcvT2JqZWN0AAlkYXRhAANvdXQAEkxqYXZhL2xhbmcvU3RyaW5nO0wACGRhdGEvTmFtZXQAEkxqYXZhL2xhbmcvU3RyaW5nO3hwAAAAAQ==";

            byte[] serializedData = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object obj = ois.readObject();
            
            System.out.println(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
