public class reverseString {
    public static void main(String[] args){
        char[] x = {'z','k','i','n','M','$','L'};
        Sstring2(x);
    }
    public static void Sstring(char[] s){
        int len = s.length;
        System.out.print("原来: ");
        for(int i=0; i<(len); i++){
            System.out.print("\""+s[i]+"\"");
        }
        System.out.println();
        char temp = s[0];
        s[0] = s[len-1];
        s[len-1] = temp;
        System.out.print("现在: ");
        for(int i=0; i<(len); i++){
            System.out.print("\""+s[i]+"\"");
        }
    }
    public static void Sstring2(char[] s){
        int len = s.length;
        int left = 0;
        int right = len-1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        for(int i=0; i<(len); i++){
            System.out.print("\""+s[i]+"\"");
        }
    }
}
