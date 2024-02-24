package arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberofCandies {

    public static void main(String[] args) {
        KidsWithGreatestNumberofCandies kidsWithGreatestNumberofCandies = new KidsWithGreatestNumberofCandies();
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(kidsWithGreatestNumberofCandies.kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = candies[i] >= max ? candies[i] : max;
            candies[i] += extraCandies;
        }

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}