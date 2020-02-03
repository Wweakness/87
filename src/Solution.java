import java.util.Scanner;

public class Solution {

    //s是目前重，n是总共个数
    public static void zongShu(int s,int n){

        if(s==0){
            return ;
        }
        else {
            for(int i=1;i<=n;i++){
                if(weight[i]==s){
                    count++;
                }
                else if(weight[i]<s){
                    for(int j=i+1;j<=n;j++){
                        if(weight[i]+weight[j]==s){
                            count++;
                        }
                    }
                }
            }
            return ;
        }
    }

    static int[] weight;
    static int N;
    static int count=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            N = input.nextInt();
            weight = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                weight[i] = input.nextInt();
            }
            zongShu(40, N);
            System.out.println(count);
        }
    }
}
