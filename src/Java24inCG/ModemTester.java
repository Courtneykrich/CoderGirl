import static java.lang.System.out;

public class ModemTester {
    public static void main (String[]args){
        CableModem surfBoard = new CableModem();
        DslModem gateway =new DslModem();
        surfBoard.setSpeed(500000);
        gateway.setSpeed(400000);
        out.println("Trying the cable modem");
        surfBoard.displaySpeed();
        surfBoard.connect();
        out.println("Trying the DSL modem:");
        gateway.displaySpeed();
        gateway.connect();
    }
}