class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder build1 = new StringBuilder();
        StringBuilder build2 = new StringBuilder();

        for(String w1 : word1){
            build1.append(w1);
        }
        for(String w2 : word2){
            build2.append(w2);
        }
        return build1.toString().equals(build2.toString());
    }
}