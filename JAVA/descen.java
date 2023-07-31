
import java.util.*;

class city 
{
        String a[];
        int n;
        city()
        {
                 Scanner s=new Scanner(System.in);
                System.out.println("enter how many city you want to enter :");
                n=s.nextInt();
                a=new String[n];
                for(int i=0; i<n; i++)
                {
                        System.out.print("Enter {i+1} element: ");
                        a[i]=s.next();                       
                }
        }
        void display()
        {
                String temp="";
                for (int i=0; i<n; i++)
                {
                        for(int j=i+1; j<n; j++)
                        {
                                if(a[i].compareTo(a[j])>0)
                                {
                                        temp=a[i];
                                        a[i]=a[j];
                                        a[j]=temp;
                                }
                        }
                }
                System.out.println("Sorted cities are ");
                for(int i=0;i<=n-1;i++){
                        System.out.print(a[i]+" ");
                }
        }
}

public class descen {
        public static void main(String arg[])
        
        {
               city obj=new city();
               obj.display();
        }
}
