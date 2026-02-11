import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "rO0ABXNyAClqYXZhLnV0aWwuRGF0YS5TZWxlY3Rpb24AAAAAAAABAgAETAAJZGVzdHJveUlQCQAGYXBw";
        
        try {
            byte[] serializedData = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object obj = ois.readObject();
            
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
