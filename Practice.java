public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello");
        String yourMom = "this is your favorite food.";
        System.out.println(capitalizeWord(yourMom));
    }
    public static String capitalizeWord(String str){
      
        String yourDad = str.substring(0,1).toUpperCase();
        

       
        return yourDad;
      }
}
