
public class Main{
    public static void main(String[] args) {
        //Main jp = new Main();
        System.out.println(capitalizeWord("hi me"));
    }
    /* static char first(String str){
        if(str.length() == 0){
            return ' ';
        }
        if(Character.isUpperCase(str.charAt(0))){
            return str.charAt(0);
        } else
        return first(str.substring(1, str.length()));
    } */ 

    static String capitalizeWord(String s){
        if(s.length() == 0){
            return s;
        }

        char chr = s.charAt(s.length()-1);

        if(s.length() == 1){
            return Character.toString(Character.toUpperCase(chr));
        }
        
        if(s.substring(s.length()-2, s.length()-1).equals(" ")){
            return Character.toString(Character.toUpperCase(chr)); 
        } else
        return capitalizeWord(s.substring(1, s.length()-1));
    }
}