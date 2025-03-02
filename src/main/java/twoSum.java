import java.util.HashMap;
import java.util.Map;

public class twoSum {
    // an int array
    // int target
    // print the pairs that sum up to target int
    public static void sumNumbers(int[] arr, int target){

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){
                if(target == arr[i] + arr[j]){
                    System.out.println(arr[i] +"+"+ arr[j]);
                }
            }
        }
    }  // time complexity as n**2, space complexity O(1)

    // []
    public static Map<Integer, Integer> sumHashMap(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> result = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
//                System.out.println(arr[i] + " + " + complement);
                result.put(arr[i],complement);
            }
            map.put(arr[i], i);
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 3 ,1 , 9 , 2};
//        sumNumbers(arr, 4);
        Map<Integer, Integer> result = new HashMap<>();
        result = sumHashMap(arr, 10);
        for(Integer K: result.keySet()){
            System.out.println(K +" + " + result.get(K));
        }
    }
}
