class Reverse
{
    // Complete the function
    // str: input string
   public static String reverseWord(String str)
    {
         String rev="";
        for(int i=str.length()-1;i>=0;i--){
             
             rev=rev + str.charAt(i);
               
        }
        
        return rev;
    }


}