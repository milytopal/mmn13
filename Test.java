public class Test {

    public static void main(String[] args)
    {
 //       System.out.println(Ex13.maxDigit(1352));
 //       System.out.println(power(3,3));
 //       System.out.println(Ex13.minOps(10,22));
 //       System.out.println(Ex13.minOps(10,17));
 //       System.out.println(Ex13.minOps(17,10));
 //       System.out.println(Ex13.minOps(17,17));

        //----------------- string test----------------//
        System.out.println( " for \"abcd\" :" + Ex13.noOfLetters("abcd"));
        System.out.println(" for \"aaaa\" :" +Ex13.noOfLetters("aaaa"));
        System.out.println(" for \"ab$cd\" :" +Ex13.noOfLetters("ab$cd"));
        System.out.println(" for \"abDcd\" :" +Ex13.noOfLetters("abDcd"));
        System.out.println(" for \"98#1\" :" +Ex13.noOfLetters("98#1"));
        System.out.println((int)'A'-(int)'a');
    }
//-------------------- targil from shay tavor------------------------//
    public static int power(int x, int y){
        if(y==0)
            return 1;
        else
            return x*power(x,y-1);
    }
//!((str.charAt(0)>'A' && str.charAt(0)<'Z') || (str.charAt(0)>'a' && str.charAt(0)<'z')))

  //  public static int maxDigit(int n)
  //  {
        //      int n1 = n%10;
        //      int n2 = n/10;
//
        //      if (n2 == 0) { // base case
        //          return n1;
        //      }
        //      int n3 = maxDigit(n2); // recursive call
        //      if(n1>n3)
        //          return n1;
        //      else
        //          return n3; // return the max

        //  int n1 = n%10;
        //  int n2 = n/10;


    }
