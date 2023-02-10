//remove duplicates character from string
public class StringAss2 {
    public static void main(String[] args) {
        String str = "ashiquealam";
        char[] strArr = str.toCharArray();

        if (strArr.length == 0) {
            System.out.println("Please provide some string!");
        } else if (strArr.length == 1) {
            System.out.println(str);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                int count = 0;
                for (int j = 0; j < i; j++) {
                    if (strArr[j] == strArr[i]) {
                        count++;
                        break;
                    }
                }
                if (count == 0)
                    sb.append(strArr[i]);
            }
            System.out.println(sb);
        }
    }
}
