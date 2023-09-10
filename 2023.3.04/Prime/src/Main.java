import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean vis[]=new boolean[500000];
        int prime[]=new  int[500000];
        int n,cnt=0;
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        for(int i=2;i<=n;i++) {
            if(!vis[i]) {
                prime[cnt++]=i;
            }
            for (int j=0;prime[j]<=n/i;j++) {
                vis[i*prime[j]]=true;
                if(i%prime[j]==0)
                    break;
            }
        }
        for(int k=0;k<cnt;k++){
            System.out.print(prime[k]+" ");
        }
    }
}