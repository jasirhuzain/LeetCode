class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder build = new StringBuilder();
      if(s==null||s.trim().isEmpty()){
        return true;
      }


      for(int i =0;i<s.length();i++){
        char ch = s.charAt(i);
      
        if(Character.isLetterOrDigit(ch)){
            build.append(Character.toLowerCase(ch));
        }
      }
        StringBuilder res = new StringBuilder(build).reverse();
        return build.toString().equals(res.toString());
        
    }
}