public class CharUtils {
    
     public static char leastUsedChar(String string) {
        int minСount = Integer.MAX_VALUE;
        char minСhar = ' ';
        for (int i = 0 ; i < string.length() ; i++) {
            if (getCount(string, string.charAt(i)) < minСount){
                minСhar = string.charAt(i);
                minСount = getCount(string, minСhar);
            }          
        }
        return minСhar;
    }
    
    private static int getCount(String string, char ch) {
        int currCount = 0;
        for (int i = 0; i < string.length(); i++ ){
            if (string.charAt(i) == ch)
                currCount++;
        }
        return currCount;
    }
}
