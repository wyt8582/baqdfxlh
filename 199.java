import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyADpjb20uZXhhbXBsZS5Vc2VySW5wdXRSZWFkZXJzb25hbCRTdWJqZWN0AAAAAAAAAAECAAB4cAAAAANzcQB+AAF4";
            byte[] serializedData = userInput.getBytes();

            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject(); // Insecure deserialization occurs here

            System.out.println(obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
