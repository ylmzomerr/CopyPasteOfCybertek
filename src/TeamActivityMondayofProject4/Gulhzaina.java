package TeamActivityMondayofProject4;

public class Gulhzaina {
    public static boolean isAnagram(String word1, String word2) {

        word1 = word1.toLowerCase().trim();
        word2 = word2.toLowerCase().trim();
        int count=0;
        if(word1.length()==word2.length()) {
            for (int i = 0; i < word1.length(); i++){
                if(word2.contains(word1.charAt(i)+"")){
                    count++;
                }else {
                    return false;
                }
            }
            if(count==word1.length()){
                return true;
            }
        }


        return false;
    }

}
