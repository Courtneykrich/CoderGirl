import static java.lang.System.out;
public class CableModem extends Modem {
    String method = "cable connection";

    public void connect(){
        out.println("Connecting to the internet ...");
        out.println("Using a "+method);
    }
}
