public class Twod {
        public static void main(String arg[])
        {
                int[][] arr = {{1,3,2},{4,5,6},{7,8,9}};
                for(int i=0;i<3;i++)
                {
                        for(int j=0;j<3;j++)
                        {
                                System.out.println("arr["+ i +"]["+ j +"]=" + arr[i][j]);
                        }
                }
                System.out.println("Array Element:");
                for(int i=0; i<3; i++)
                {
                        for(int j=0; j<3; j++)
                        {
                                System.out.print(" " + arr[i][j]);
                        }
                        System.out.println();
                }
        }        
}
