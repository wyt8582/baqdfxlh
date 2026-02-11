import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            String serializedData = "rO0ABXNyACpvcmcuamF2YS5kZXNlcmlhbC5TdHJpbmcAAAAAAAAAAAAAAAwAAAHhwc3IALm9yZy5qYXZhLmRlc2VyaWFsLkV4Y2VwdGlvbgAAAAAAAAABAgAAeHB3BAAAAAB4";
            byte[] data = javax.xml.bind.DatatypeConverter.parseBase64Binary(serializedData);
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject();
            System.out.println(obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
