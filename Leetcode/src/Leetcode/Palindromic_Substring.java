package Leetcode;

public class Palindromic_Substring {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(palindromicSubstring(s));

    }
    public static int palindromicSubstring(String S) {
        //odd
        int odd = 0;
        for( int axis = 0;axis < S.length();axis++){
            for(int orbit =0; axis-orbit>=0&&axis+orbit<S.length(); orbit++){
                if(S.charAt(axis-orbit)!=S.charAt(axis+orbit)){
                    break;
                }
                odd++;
            }
        }
        //even
        int even =0;
        for(double axis = 0.5;axis < S.length();axis++){
            for(double orbit =0; axis-orbit>=0&&axis+orbit<S.length(); orbit++){
                if(S.charAt((int)(axis-orbit))!=S.charAt((int)(axis+orbit))){
                    break;
                }
                even++;
            }
        }
    return odd+even;
    }
}
