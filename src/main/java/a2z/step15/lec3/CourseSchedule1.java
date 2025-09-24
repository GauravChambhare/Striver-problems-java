package a2z.step15.lec3;
import java.util.*;

public class CourseSchedule1 {


    public boolean canFinish(int n, int[][] req){
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0; i<n; i++){
            graph.put(i, new ArrayList<Integer>());
        }
        
        for(int[] r : req){
            graph.put()
        }

        return true;
    }



    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        boolean canFinish = canFinish(numCourses, prerequisites);
        System.out.println("Can finish all courses: " + canFinish);
    }
    
}
