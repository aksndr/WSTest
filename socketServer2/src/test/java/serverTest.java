import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * User: a.arzamastsev Date: 07.04.14 Time: 13:34
 */
public class serverTest {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Client side");

        Socket fromserver = null;

//        if (args.length==0) {
//            System.out.println("use: client hostname");
//            System.exit(-1);
//        }

        System.out.println("Connecting to localhost.");

        fromserver = new Socket("localhost", 4444);
        BufferedReader in = new
                BufferedReader(new
                InputStreamReader(fromserver.getInputStream()));
        PrintWriter out = new
                PrintWriter(fromserver.getOutputStream(), true);
        BufferedReader inu = new
                BufferedReader(new InputStreamReader(System.in));

        String fuser, fserver;

        while ((fuser = inu.readLine()) != null) {
            out.println(fuser);
            fserver = in.readLine();
            System.out.println(fserver);
            if (fuser.equalsIgnoreCase("close")) break;
            if (fuser.equalsIgnoreCase("exit")) break;
        }

        out.close();
        in.close();
        inu.close();
        fromserver.close();
    }
}
