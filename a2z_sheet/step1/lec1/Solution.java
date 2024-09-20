package a2z.step1.lec1;

class Solution {
    static int dataTypeSize(String str) {
        // code here
        String strl = str.toLowerCase();
        if (strl.equals("character")){
            return 2;
            
        }
        else if (strl.equals("float")){
            return 4;
            
        }
        else if (strl.equals("integer")){
            return 4;
            
        }
        else if (strl.equals("short")){
            return 2;
            
        }
        else if (strl.equals("long")){ 
            return 8;
            
        }
        else if (strl.equals("double")){
            return 8;
            
        }
        else { 
            return -1;
            
        }
    }
    public static void main(String[] args){
        System.out.println(Solution.dataTypeSize(args[0]));
    }
}
