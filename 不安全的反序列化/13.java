import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String serializedData = "rO0ABXNyACVjb20uZXhhbXBsZS5TdHJpbmcAAAAAAAAAAAABAgAAeHIAEWphdmEudXRpbC5Db2xsZWN0aW9ucyRTeW5jSQAAAAAAAAAAEgAAeHBzcgA4Y29tLmV4YW1wbGUuU3RyaW5nJE9iamVjdAAAAAAAAAABAgAAeHA=";
            byte[] data = serializedData.getBytes();
            
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInput in = new ObjectInputStream(bis);
            
            Object obj = in.readObject();
            
            if (obj instanceof String) {
                System.out.println((String) obj);
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
