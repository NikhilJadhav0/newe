public class oddeven 
{
        public static void main(String arg[])
        {
                int arr[]={1,3,2,4,5,6,7,7,8,9,20,10,21};
                System.out.println("even array element");
                for(int i=0;i<arr.length;i++)
                {
                        if(arr[i]%2==0)
                        {
                                System.out.println(arr[i]);
                        }
                }
                System.out.println("Odd array element");
                for(int i=0;i<arr.length;i++)
                {
                        if(arr[i]%2!=0)
                        {
                                System.out.println(arr[i]);
                        }
                }
        }        
}
