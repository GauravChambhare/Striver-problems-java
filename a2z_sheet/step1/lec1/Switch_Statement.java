class Solution {
    static double switchCase(int choice, List<Double> arr){

        // code here
        switch(choice) {
            case 1:
                return double area = Math.PI*Math.pow(arr.get(0),2);
                break;

            case 2:
                return double area = arr.get(0)* arr.get(1);
                break;
        }
    }
};

/*
below is the official solution, I have just added default block at the end of case 2. This solution is the best implementation
class Solution {
    // function to calculate value based on choice and input array
    static double switchCase(int choice, List<Double> arr){
        double value = 0.0;
        switch(choice) {
            case 1:
                // calculating area of a circle
                value = Math.PI * arr.get(0) * arr.get(0);
                break;
            case 2:
                // calculating area of a rectangle
                value = arr.get(0) * arr.get(1);
                break;
            default:
                // handle unexpected choices
                value = 0.0;
                break;
        }
        return value;
    }
}

* */