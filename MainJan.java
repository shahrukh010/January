import com.code.jan.Jan;
public class MainJan{


    public static void main(String...strings){

        Jan jan = new Jan();
        String pattern = "abba";
        //String word = "dog cat cat dog";
        String word = "dog cat cat fish";

        boolean res = jan.wordPattern(pattern,word);
        System.out.println(res);

        System.out.println();
        System.out.println();

        //String input = "GOOGLE";//true
//        String input = "google";//true
        String input = "GooGle";//false(because of not all small or not all caps

        
        System.out.println(jan.detectCapitalUse(input));
        
    }

}
