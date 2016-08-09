import sun.security.krb5.internal.crypto.Des;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class Destination{

    String destination, months;
    int normalMiles, saverMiles, upgradeMiles;

    Destination(){

    }

    Destination(String dstn, int nMiles, int sMiles, int uMiles, String mnth){
        destination = dstn;
        normalMiles = nMiles;
        saverMiles = sMiles;
        upgradeMiles = uMiles;
        months = mnth;
    }

    public int getNormalMiles() {
        return normalMiles;
    }
}

class MileRedeemer{
    private ArrayList<Destination> destinationList = new ArrayList<>();
    private Destination[] destinationArray;
    public void readDestinations(Scanner fileScanner) throws IOException{

        String fileName = "/home/rusk/javaProg/workPrograms/src/dest.txt";

        //System.out.println("Enter the file name/path ");
        //fileName = fileScanner.nextLine();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {

            String line = br.readLine();
            while (line != null) {
                String[] parts = line.split(";"); //splitting the line by ;
                int a = Integer.parseInt(parts[1]); int b = Integer.parseInt(parts[2]);
                int c = Integer.parseInt(parts[3]); //int d = Integer.parseInt(parts[4]);
                destinationList.add(new Destination(parts[0], a, b, c, parts[4]));
                line = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not FileNotFoundException");

            // insert code to run when exception occurs
        } finally {
            br.close();
        }
        destinationArray =
                destinationList.toArray(new Destination[destinationList.size()]);

    }
    public String[] getCityNames(){
        String[] stringArray = new String[destinationArray.length];

        for(int i = 0; i < stringArray.length; i++)
            stringArray[i] = destinationArray[i].destination.toString();
        Arrays.sort(stringArray);
        return stringArray;
    }

    public String[] redeemMiles(int miles, int month){
        // Sorting according to normal Miles
        Collections.sort(destinationList, new MileageComparator());
        //System.out.println(destinationList.get(0).destination);
        boolean checkSaverMonth = saverMonth(month);
        String[] goToCities = goingCities(miles, checkSaverMonth);
        return null;
    }

    public boolean saverMonth(int m){

        System.out.println(destinationList.get(0).months);
        String[] mSplit = destinationList.get(0).months.split("-");
        int first = Integer.parseInt(mSplit[0]);
        int  end = Integer.parseInt(mSplit[1]);
        if(m >= first && m <= end)
            return true;
        else
            return false;
    }
    public String[] goingCities(int mil, boolean csm){
        int remain;
        int[] normalMiles = new int[destinationArray.length];
        int[] saverMiles = new int[destinationArray.length];
        int[] upgradeMiles = new int[destinationArray.length];
        for(int j = 0 ; j < destinationArray.length; j++) {
            normalMiles[j] = Integer.parseInt(destinationList.get(1).destination);
            saverMiles[j] = Integer.parseInt(destinationList.get(2).destination);
            upgradeMiles[j] = Integer.parseInt(destinationList.get(2).destination);
        }
        if(!csm){
            int k = 0;
            while(k != destinationArray.length){
                remain = mil - normalMiles[k];
                if(remain < 0 && k == 0) {
                    remain = 0;
                    k++;
                }
                else if(remain < 0)
                    k++;
                else{
                    k++;
                }
            }

        }
        return null;
    }

}

class MileageComparator implements Comparator<Destination>
{
    public int compare(Destination d1, Destination d2)
    {
        return (d2.getNormalMiles() - d1.getNormalMiles());
    }
}

public class MileRedemptionApp {

    public static void main(String[] args) throws  IOException {

        Scanner s = new Scanner(System.in);
        MileRedeemer mr = new MileRedeemer();
        mr.readDestinations(s);
        String[] sortedCities = mr.getCityNames();
        System.out.println("---------------------------------------------\n" +
                            "List of destination cities you can travel to:\n");
        for(String j : sortedCities)
            System.out.println(j);
        System.out.println("---------------------------------------------");
        System.out.println("Please input your total accumulated miles: ");
        int noOfMiles = s.nextInt();
        System.out.println("Please input your month of departure (1-12): ");
        int monthOfDeparture = s.nextInt();
        mr.redeemMiles(noOfMiles, monthOfDeparture);
        System.out.println("Your accumulated miles can be used to redeem the following tickets:\n");

        System.out.println("our remaining miles: ");

        System.out.println("Do you want to continue (y/n)? ");
    }

}