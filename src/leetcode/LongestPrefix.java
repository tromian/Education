package leetcode;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] str1 = {"flower","flow","flight"};
        String[] str2 = {"","",""};

        LongestPrefix lo = new LongestPrefix();
        System.out.println();
        System.out.println(lo.longestCommonPrefix(str2));

    }

    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) {
            return "";
        }else if(strs.length == 1) {
            return strs[0];
        }else {

            String newPref = "";
            char[] firstString = strs[0].toCharArray();
            if(firstString.length != 0){
                String[] prefs = new String[firstString.length];
                prefs[0] = "" + firstString[0];
                for (int i = 1; i < prefs.length; i++){
                    prefs[i] = "" + prefs[i-1] + firstString[i];
                }
                for (String s : prefs){
                    System.out.println(s);
                }

                OUTER:
                for(int i = 0; i < prefs.length; i++){

                    for(int j = 1; j < strs.length; j++){
                        if (!strs[j].startsWith(prefs[i])){
                            break OUTER;
                        }
                    }
                    newPref = prefs[i];
                }
            }
            return newPref;

        }

    }

}
