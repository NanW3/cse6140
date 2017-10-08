    
public class SubarrayEqualsSum {

    public static int[] findIndices(double[] interests, double maxSum) {


        int[] result = new int[2];
        double prefixSum = 0;
        Map<Double, Integer> map = new HashMap<>();
        map.put(0.0, 0);

        for (int i = 0; i < interests.length; i++) {

            prefixSum += interests[i];

            if (map.containsKey(prefixSum - maxSum)) {

                result[0] = map.get(prefixSum - maxSum) + 1;
                result[1] = i + 1;
                return result;

            }

            map.put(prefixSum, i + 1);

        }

        return new int[]{-1, -1};

    }
}