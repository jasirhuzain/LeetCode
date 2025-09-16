class Solution {
    public String reverseWords(String s) {
      String [] str = s.split(" ") ;
      
       
       for(int i =0;i<str.length;i++){
        String original = str[i];
        String reversed = "";
        for(int j = original.length()-1;j>=0;j--){
            reversed += original.charAt(j);
        }
        str[i] = reversed;
       }
       return String.join(" ",str);
    }
}