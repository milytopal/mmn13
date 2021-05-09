/**
 *
 */
public class Ex13 {
    /**
     * this method receives an integer and returns the biggest digit in the number
     * @param n - an integer to check
     * @return
     */
    public static int maxDigit(int n)
    {
        if (n/10 == 0) { // base case
            return n%10;
        }
        int tempN = maxDigit(n/10); // recursive call
        // check who is bigger
        if(n%10>tempN)
            return n%10;
        else
            return tempN; // return the max
    }

    /**
     * this method receives two integers x and y (x<y and x,y!=0) and returns the minimum legal operations needed in order to calculate y from x
     * legal operations are: 1. adding 1 to x ; 2. multiplying x by 2.
     * @param x - the number to start with
     * @param y - the desired result
     * @return the minimum operation required
     */
    public static int minOps (int x, int y)
    {
        if(x == y)              // base case
            return 0;
        if(x>y)                 // if x>y the operation in the call to the recursive algorithm wasn't a good choice
            return -1;
            // if the result hasn't reach y yet
        else {
            int temp1;
            int temp2;
            temp1 = minOps(x+1 , y);        // recursive call with the +1 legal operation
            temp2 = minOps(x*2 , y);        // recursive call with the *2 legal operation
            // if multiplying by 2 got the result bigger than y ignore this case and add 1
            // there is no need to check if adding 1 is a dead end because if it was it means x=y (the base case)
            if(temp2 < 0)
                return temp1+1;
            else
                // choose the path with minimum operations
                if(temp2 < temp1)
                    return temp2+1;
            return temp1+1;
        }
    }
    /**
     * this method receives a string and checks how many different letters there are from the english language
     * note: the difference from a big letter and a small letter is not calculated.
     * @param str - the string to check
     * @return the number of different letters
     */
    // public static int noOfLetters (String str)
    //  {
    //      // if the string has less than 2 chars return 0
    //      if(str.length()>1) {
    //          str = str.toLowerCase();
    //          String newStr = ShortenString(str.substring(1), str.charAt(0));
    //          // test
    //          //////////////////////////////////////
    //          System.out.println(newStr+"\n");
    //          //////////////////////////////////////
    //          //if one of the chars checked is not a letter
    //          if (str.charAt(0) < 'a' || str.charAt(0) > 'z' /*|| str.charAt(1) < 'a' || str.charAt(1) > 'z'*/)
    //              return noOfLetters(str.substring(1));
    //          else {
//
    //              if (str.charAt(0) != str.charAt(1))
    //                  return 1 + noOfLetters(str.substring(1)) ;
    //          }
    //(str.charAt(0)<'A' || (str.charAt(0)>'Z' && str.charAt(0)<'a') || str.charAt(0)>'z')||
    //                str.charAt(1)<'A' || (str.charAt(1)>'Z' && str.charAt(1)<'a') || str.charAt(1)>'z')
    //
    //      }
    //      return 1;
    //  }


    public static int noOfLetters (String str)
    {
        if(str.length()>0) {
            str = str.toLowerCase();
            int tempNumOfLetters =1;
            //if(!((str.charAt(0)>'A' && str.charAt(0)<'Z') || (str.charAt(0)>'a' && str.charAt(0)<'z'))))
            if (str.charAt(0) < 'a' || str.charAt(0) > 'z')
                str = str.substring(1);

            if(str.length()>1)
                tempNumOfLetters = noOfLetters(str.substring(1));
            //if (str.charAt(0) < 'a' || str.charAt(0) > 'z' /*|| str.charAt(1) < 'a' || str.charAt(1) > 'z'*/)
            //{
            if ((str.length()>1) && checkIfUnique(str.substring(1), str.charAt(0))) {
                tempNumOfLetters++;
                System.err.println("for " + str + " " + str.charAt(0) + " temp num of Unique letters:   " + tempNumOfLetters);
            }
            return tempNumOfLetters;
        }
        return 0;
    }

    public static boolean checkIfUnique(String str, char c){
        if(str.length()==0)
            return true;
        if (str.charAt(0) == c)
            return false;

        else
            return checkIfUnique(str.substring(1), c);


    }






    /**
     * this method receives a string and a character and checks how many times the letter appears in the given string
     * note: the difference from a big letter and a small letter is not calculated.
     * @param str - a given string
     * @param c - the char we are looking for in a given string
     * @return number of times the char appears in a string
     */
    //  public static String ShortenString(String str, char c) {
    //      if (str.length() > 0) {
    //          //if one of the chars checked is not a letter
    //          if (str.charAt(0) < 'a' || str.charAt(0) > 'z' || str.charAt(0) == c)
    //              String newStr = new String(str.substring(0,0) + str.substring(1));
    //              return ShortenString(str.substring(1),c);
    //      }
    //      return str;
    //  }
}