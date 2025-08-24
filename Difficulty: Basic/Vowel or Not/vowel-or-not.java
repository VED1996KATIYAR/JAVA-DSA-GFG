// User function Template for Java
class Solution {
    String isVowel(char c) {
        // code here
        String a="";
        int i=0;
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            i+=1;
        }
        if(i==1){
            a= "YES";
        }else{
            a=  "NO";
        }
        return a;
    }
}
