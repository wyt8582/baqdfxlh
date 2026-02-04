import java.io.*;

public class InsecureDeserializationDemo {
    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyACRqYXZhLnV0aWwuQ29sbGVjdGlvbnMkQ29sbGVjdGlvbnQAAAAAAAAAAQIAAHhyACFqYXZhLmxhbmcuUnVudGltZUV4Y2VwdGlvbp5fBzN1AAJbQilMIWNiZy5jYWxsKHRoaXMpMXhZ4Iw==";

            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject();

            // This vulnerable code can lead to Remote Code Execution (RCE) if the serialized object is malicious
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
