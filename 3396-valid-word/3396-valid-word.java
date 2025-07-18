class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isLetter(ch)) {
                char lowerChar = Character.toLowerCase(ch);

                if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' ||
                        lowerChar == 'o' || lowerChar == 'u') {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }
}