import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prime {
        public static void main(String[] args) throws Exception
        {
                int j,s,i,k=0,m=0,n;
                int r[]=new int[10] ;
                int prime[]=new int[10];
                int perfect[]=new int[10];
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the number of element :=>");
                n=Integer.parseInt(br.readLine());  
                for(i=0; i<n; i++)
                {
                        System.out.println("enter the "+i+"Number of the array :=>");
                        r[i]= Integer.parseInt(br.readLine());       
                }           
                for(j=0; j<10; j++)
                {
                        int flag=0;
                        if(r[j]==0||r[j]==1)
                        {
                                continue;
                        }
                        else
                        {
                                for(i=2; i<r[j]; i++)
                                {
                                        if(r[j]%i==0)
                                        flag=1;
                                }
                        }
                        if(flag==0)
                        {
                                prime[k]=r[j];
                                k++;
                        }
                }
                System.out.println("prime Number are");
                for(i=0; i<k; i++)
                {
                        System.out.println(prime[i]+" ");
                }
        }        
}
