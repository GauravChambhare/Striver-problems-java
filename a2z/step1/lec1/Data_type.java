class Solution {
    static int dataTypeSize(String str) {
        // code here
        switch(str) {
            case "Integer":
                return 4;
            case "Double":
                return 8;
            case "Float":
                return 4;
            case "Character":
                return 2;
            case "Long":
                return 8;
            default:
                return -1;

        }

    }
}