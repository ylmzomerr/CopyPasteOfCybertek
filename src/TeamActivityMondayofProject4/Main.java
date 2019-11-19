package TeamActivityMondayofProject4;

public class Main {





    public static int[] extractNum(String str){
        int count = 0; //counter for digits in string
        for (int i = 0; i < str.length(); i++){
            String newString = str.charAt(i) + ""; //create an empty string and put one symbol from the origin string in it
            if (newString.matches(".*[0-9].*")){ //if symbol is in range from 0 to 9 - then we add 1 to the length of our array
                count += 1;
            }
        }


        int [] numbers = new int [count]; //creating our array

        int j = 0; //counter for array indexes

        for (int i = 0; i < str.length(); i++){
            String newString = str.charAt(i) + "";
            if (newString.matches(".*[0-9].*")){ //if symbol is in range from 0 to 9 - then we add this symbol in our array
                numbers [j] = Integer.valueOf(str.charAt(i)+"");
                j++; //and we go to the next index in array
            }
        }
        return numbers;
    }


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


    public static int secondLargestNum(int[] arr) {

        int [] ar = new int [arr.length];
        int secondLargest = arr[0];
        int largest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > largest){
                secondLargest = largest;
                largest= arr[i];

            }else if(arr[i]> secondLargest){
                secondLargest = arr[i];

            }
        }
        return secondLargest;

    }







    public static String lameDb(String db, String op, String id,String data){
        String[] strArr=db.split("#");
        String result="";
        if(op.equals("add")){
            for(int i=0; i<Integer.valueOf(id)-1;++i){
                result+=strArr[i]+"#";
            }
            result+=id+data+"#";
            for(int j=Integer.valueOf(id);j<strArr.length;++j){
                result+=strArr[j]+"#";
            }
            result=result.substring(0,(result.length()-1));
        }else if(op.equals("edit")){
            for(int i=0; i<strArr.length;++i){
                if(i==Integer.valueOf(id)-1){
                    result+=id+data+"#";
                }else {
                    result+=strArr[i]+"#";
                }
            }
            result=result.substring(0,(result.length()-1));
        }else if(op.equals("delete")){
            for(int i=0; i<strArr.length;++i){
                if(i==Integer.valueOf(id)-1){
                    result+="#";
                }else {
                    result+=strArr[i]+"#";
                }
            }
            result=result.substring(0,(result.length()-1));
        }else if(op.equals("none")){
            result=db;
        }
        return result;
    }

}
