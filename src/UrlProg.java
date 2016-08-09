/**
 * Created by rusk on 5/8/16.
 */

import java.net.*;
import java.io.*;
public class UrlProg {
    public static void main(String[] args) throws Exception, IOException {
        URL theURL = new URL("http://www.infiniteskills.com");
        System.out.println("Basice Information ");
        System.out.println();
        System.out.println("Protocol " + theURL.getProtocol());
        System.out.println("Port " + theURL.getPort());
        System.out.println("Host " + theURL.getHost());
        URLConnection theCon = theURL.openConnection();
        //check to see if there is content
        int contentLen = theCon.getContentLength();
        int c;
        if (contentLen != 0 ){
            System.out.println("Content ");
            System.out.println();
            InputStream urlInput = theCon.getInputStream();
            while (((c = urlInput.read()) != -1)){
                System.out.print((char) c);
            }
            urlInput.close();
        }else {
            System.out.println("Sorry, no content.");
        }
    }
}
