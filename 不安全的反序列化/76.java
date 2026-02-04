import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyACZqYXZhLnV0aWwuRGVzZXJ2aWV3SGFzaFNldNhp7e4fAwABTAADdHdvcnQAAltCrPMX";
            byte[] serializedObject = Base64.getDecoder().decode(userInput);
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject();
            
            // Do something with the deserialized object
            System.out.println(obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
