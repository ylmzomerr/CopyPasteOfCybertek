import java.util.Arrays;

public class Vadim {

    public static void main (String [] args){
        System.out.println(Arrays.toString(extractNum("asd12563asd")));
    }

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
}
