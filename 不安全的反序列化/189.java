import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyAC5qYXZhLnV0aWwuRGVmYXVsdFByb3BvcnRvSW50ZW50UHJveHkuUHJveHkAAAAAAAAAAQIAAkwAA29yaWdpbg==";

        try {
            byte[] serializedBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(serializedObject);
            ObjectInputStream objectInput = new ObjectInputStream(new ByteArrayInputStream(serializedBytes));
            Object obj = objectInput.readObject();
            
            System.out.println(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
