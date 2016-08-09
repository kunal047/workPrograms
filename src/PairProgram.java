/**
 * Created by rusk on 24/7/16.
 */
public class PairProgram {
    public static void main(String[] args) {
        Pair<String, Integer> grade1 = new Pair<String, Integer>("Will", 90);
        Pair<String, Integer> grade2 = new Pair<>("Diana", 85);
        System.out.println(grade1.getFirstItem() + " " + grade1.getSecondItem());
        System.out.println(grade2.getFirstItem() + " " + grade2.getSecondItem());
    }
}
