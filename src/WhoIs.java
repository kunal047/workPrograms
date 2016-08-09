/**
 * Created by rusk on 5/8/16.
 */

import jdk.internal.util.xml.impl.Input;

import java.net.*;
import java.io.*;
public class WhoIs {
    public static void main(String[] args) throws Exception, IOException {
        Socket sock = new Socket("whois.internic.net", 43);
        InputStream input = sock.getInputStream();
        OutputStream output = sock.getOutputStream();
        String str = "fb .com\n";
        byte buffer[] = str.getBytes();
        output.write(buffer);
        int ch;
        while ((ch = input.read()) != -1){
            System.out.print((char) ch);
        }
        sock.close();
    }
}
