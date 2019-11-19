package TeamActivityMondayofProject4;

public class Omer {
    public static void main(String[] args) {
        System.out.println(lameDb("1etsy#2wooden#3spoon","add","4","aaa"));
        System.out.println(lameDb("1test#2bla#3foo","edit","2","bbb"));
        System.out.println(lameDb("1tst#2bla#3foo","delete","1",""));
        System.out.println(lameDb("1tst#2bla#3foo","none","1",""));
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
