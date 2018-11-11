import static java.lang.System.out;
public class DslModem extends Modem {
    String method = "DSL phone connection";

    public void connect(){
        out.println("Connecting to the Internet ...");
        out.println("Using a "+ method);

    }
}
