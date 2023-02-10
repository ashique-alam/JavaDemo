public class StringAss3 {
    public static void main(String[] args) {
       // String str = "ashiqueaslamm";
       // printDuplicateCharacter(str);
        // String str = "2552";
        // isPalindrome(str);
        // String str = "Ashique Alam";
        // countNatureOfChar(str);
        String str = "Ashique";
        containsUniqueCharOrNot(str);
    }

    //Print duplicate character
    public static void printDuplicateCharacter(String str) {
        char[] strArr = str.toCharArray();
        String duplicate = "";

            for (int i = 1; i < strArr.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (strArr[j] == strArr[i]) {

                        if (!duplicate.contains(Character.toString(strArr[i]))) {
                            System.out.print(strArr[i]);
                           duplicate =  duplicate.concat(Character.toString(strArr[i]));
                        } 
                    }
                }
            }
    }

    //check Palindrome
    public static void isPalindrome(String str) {
        String reverseString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }

        if (reverseString.equals(str)) {
            System.out.println("Given string is palindrome!");
        }
        else{
            System.out.println("Given string is not a palindrome!");
        }
    }

    //count consonant,vowel,special character in a given string
    public static void countNatureOfChar(String str) {
       char []charArr = str.toCharArray();
       String vowel = "aeiou";
       String specialChar = "!@#$%^&*',~";
       int countVowel = 0;
       int countConsonant = 0;
       int countSpecialChar = 0;
       for (char c : charArr) {
        if (vowel.contains(Character.toString(c)) || vowel.toUpperCase().contains(Character.toString(c))) {
            countVowel++;
        } else if(specialChar.contains(Character.toString(c))) {
            countSpecialChar++;
        }else if((c>=65 && c<=90) || (c>=97 && c<=122)){
            countConsonant++;
        }
       }
       System.out.println("Total Consonant in a given string = " + countConsonant);
       System.out.println("Total Vowel in a given string = " + countVowel);
       System.out.println("Total Special Char in a given string = " + countSpecialChar);
    }

    //check String contains unique character or not
    public static void containsUniqueCharOrNot(String str) {
        char []charArr = str.toCharArray();
        boolean isUnique = true;
        String uniqueStr = "";
        if (!str.isEmpty()) {
            for (char c: charArr) {
                if (!uniqueStr.contains(Character.toString(c)) && c!=' ') {
                    uniqueStr+=c;
                } else if(c!=' '){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                System.out.println("Given String contains unique Characters!");
            }else{
                System.out.println("Given String does not contains unique Characters!");
            }
        }
    }
}
