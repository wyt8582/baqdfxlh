import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyABNqYXZhLnV0aWwuRGF0YUNsYXNzZWRJbnNlcnZpY2VU6EoULPdCgIAAUwAAWh0ACRMY29tL1Rlc3QuamF2YeHHtTZuQIAAHhwAAAACAAAAAAAAAAMAAAABAAAAAw==";

            byte[] bytes = userInput.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
