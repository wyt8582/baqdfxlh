import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            String userInput = "R:OQAB//9gAG1zZXBhcmNoaXZlLmNyZWF0ZUNvbmRpdGlvbkRlc2Vydm..."
            // Assume userInput is received from an untrusted source

            byte[] data = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));

            Object obj = ois.readObject();
            System.out.println(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
