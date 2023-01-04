import com.code.jan.Jan;
public class MainJan{


    public static void main(String...strings){

        Jan jan = new Jan();
        String pattern = "abba";
        //String word = "dog cat cat dog";
        String word = "dog cat cat fish";

        boolean res = jan.wordPattern(pattern,word);
        System.out.println(res);
        
    }

}
