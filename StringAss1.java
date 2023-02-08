public class StringAss1 {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        String vowel = "aeiou";
        String specialChar = "!@#$%^&*,.";
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if(vowel.toUpperCase().contains(Character.toString(str.charAt(i))) || 
                vowel.contains(Character.toString(str.charAt(i))) || 
                specialChar.contains(Character.toString(str.charAt(i))) || 
                Character.toString(str.charAt(i)).equals(" ")
            ){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
