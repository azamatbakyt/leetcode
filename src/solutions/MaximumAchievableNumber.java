package solutions;

public class MaximumAchievableNumber {

    public int theMaximumAchievableX(int num, int t) {
        for (int i = 0; i < t; i++) {
            num += 1;
        }

        return num + t;
    }
}
