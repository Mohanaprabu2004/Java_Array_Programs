import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
    public static int[] plusOne2(int[] digits) {
        String s="";
        ArrayList<Integer> li=new ArrayList();
        int n=0;
        for(int i=0;i<digits.length;i++){
            s=s+digits[i];
            n=Integer.parseInt(s);
        }
        n=n+1;
        while(n>0){
            int last=n%10;
            li.add(last);
            n/=10;
        }
        Collections.reverse(li);
        int[] arr = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            arr[i] = li.get(i);
        }
        return arr;
    }
    public static int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
                digits[i]=0;
        }
        int [] newArr=new int[digits.length+1];
        newArr[0]=1;
        return newArr;
    }
    public static void main(String[] args) {
        int []a={1,0,9};
        System.out.println(Arrays.toString(plusOne2(a)));
    }
}
