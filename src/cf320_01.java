import java.util.Scanner;

/**
 * Created by rusk on 8/7/16.
 */
public class cf320_01 {
    public static void main(String args[]){
        int noOfCubesGiven, totalCubes = 0, level = 0, cubesAtLevel = 0, cubes = 1;
        Scanner in = new Scanner(System.in);
        noOfCubesGiven = in.nextInt();
        if (noOfCubesGiven == 1){
            level = 1;
        }
        else{
            while(totalCubes < noOfCubesGiven){
                cubesAtLevel += cubes;
                totalCubes += cubesAtLevel;
                cubes++;
                level++;
            }
        }

        System.out.println("Level " + (level-1));
    }
}
