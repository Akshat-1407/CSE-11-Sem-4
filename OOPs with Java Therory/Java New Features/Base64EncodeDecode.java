import java.util.Base64;

public class  Base64EncodeDecode {
    public static void main(String[] args) {
        String sample = "LEMON";
        System.out.println("Sample String:\n" + sample);

        // Encode into Base64 format
        String encodedString = Base64.getEncoder().encodeToString(sample.getBytes());
        System.out.println("Encoded String:\n" + encodedString);

        // Decode into Original byte format
        byte[] decodedByteString = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedByteString);

        // print actual String
        System.out.println("actual String:\n" + decodedString);
    }

}
