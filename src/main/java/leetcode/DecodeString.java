package leetcode;

public class DecodeString {
    public String decodeString(String s) {
//        System.out.println("s = " + s);
        StringBuilder sb = new StringBuilder();
        char[] sArr = s.toCharArray();
        int i = 0;
        while (i < sArr.length) {
            if (sArr[i] >= 'a' && sArr[i] <= 'z') {
                sb.append(sArr[i]);
                i++;
            }else{
                int num = 0;
                while (sArr[i] >= '0' && sArr[i] <= '9') {
                    num = num * 10 + sArr[i] - '0';
                    i++;
                }
                i++;
//            System.out.println("num = " + num);
                StringBuilder child = new StringBuilder();
                int balance = 1;
                while ((balance != 0)&& i < sArr.length) {
                    if (sArr[i] == '[') {
                        balance++;
                    }
                    else if (sArr[i] == ']') {
                        balance--;
                    }
                    child.append(sArr[i]);
                    i++;
                }
                String decodedChild = decodeString(child.toString());
                for (int j = 0; j < num; j++) {
                    sb.append(decodedChild);
                }
            }

        }

//        System.out.println("sb = " + sb);
        return sb.toString();
    }

}
