package a2z.step1.lec1;

class UserInput {
    static int dataTypesize(String str){
        String strl = str.toLowerCase();
        switch (strl) {
            case "integer": return 4;
            case "character": return 2;
            case "short": return 2;
            case "long": return 8;
            case "float": return 4;
            case "double": return 8;
            default: return -1;
                
        }
    }
}
