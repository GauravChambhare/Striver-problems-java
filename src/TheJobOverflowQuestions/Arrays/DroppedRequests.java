package TheJobOverflowQuestions.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DroppedRequests {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        int dropped = 0;
        for (int i = 0; i < n; i++) {
            if(i >= 3 && arr[i] == arr[i-3]){
                dropped++;
            } else if(i >= 20 && arr[i] - arr[i-20] < 10){
                dropped++;
            } else if(i >= 60 && arr[i] - arr[i-60] < 60){
                dropped++;
            }
        }
        System.out.println(dropped);
    }
}
