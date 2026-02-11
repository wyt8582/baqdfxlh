import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String serializedObject = "rO0ABXNyABJqYXZhLnV0aWwuQ29uc3VtZXJ0c1hZ2nZnM5bFxAhAIAAVkABGluaXRpYWx0ACRMamF2YS9sYW5nL1N0cmluZzt4cAAAAAAACAAAAAgAAeHg=";
            
            byte[] serializedBytes = serializedObject.getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedBytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            
            Object obj = ois.readObject(); // Deserializing the object
            
            System.out.println("Deserialized object: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
