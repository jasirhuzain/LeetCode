class Solution {
    public String defangIPaddr(String address) {
     StringBuilder build = new StringBuilder();
     for(int i =0;i<address.length();i++)  {
        char ch = address.charAt(i);
        if(ch =='.'){
            build.append("[.]");
            
        }else{
            build.append(ch);
        }
     }
     return build.toString() ;
    }
}