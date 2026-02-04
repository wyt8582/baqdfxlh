import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "rO0ABXNyACpvcmcuY29kZXNjb3BlLmludGVybmFsLkV4Y2VwdGlvbgAAAAAAAAABAgACQwADZW50ZXJwcmlzZXQAAltCrPMXywbI4AIAAHhw";

        try {
            byte[] data = java.util.Base64.getDecoder().decode(userInput);
            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject();
            System.out.println(obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
