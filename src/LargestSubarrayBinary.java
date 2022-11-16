import java.util.ArrayList;
import java.util.Scanner;

public class LargestSubarrayBinary {
    static int s;
    static ArrayList<Integer> x;
    public static void main(String[] args){
        x = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextInt();
        for(int i=0; i<s; i++){
            x.add(scanner.nextInt());
        }
        x.add(0);
        System.out.println(find());
    }

    public static int range(int i) {
        int tc = 0;
        for (int j = i-1; j >= 0; j--) {
            if (x.get(j) == 0) {
                break;
            } else {
                tc++;
            }
        }

        for (int j = i+1; j <= s; j++) {
            if (x.get(j) == 0) {
                break;
            } else {
                tc++;
            }
        }
        return tc;
    }

    public static int find(){
        int count = 0;
        for(int i=0; i<=s; i++){
            if(x.get(i)==0){
                int tc=range(i)+1;
                if(i==s){
                    tc--;
                }
                if(tc>count){
                    count=tc;
                }
            }
        }
        return count;
    }
}
