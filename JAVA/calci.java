import java.util.Scanner;

public class calci {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int button = sc.nextInt();
                 int i ;
                
                switch(button){
                        case 1: 
                        // int c = a + b;
                        System.out.println(" january " );
                        break;
                        case 2:
                        // c = a - b;
                        System.out.println("feb " );
                        break;
                        case 3:
                        
                        System.out.println(" march " );
                        break;
                        case 4:
                        // c = a / b;
                        System.out.println(" april " );
                        break;
                        case 5:
                        // c = a % b;
                        System.out.println(" may " );
                        break;
                        case 6:
                        System.out.println(" june " );
                        break;
                        case 7:
                        System.out.println(" july " );
                        break;
                        case 8:
                        System.out.println(" august " );
                        break;
                        case 9:
                        System.out.println(" september " );
                        break;
                        case 10:
                        System.out.println(" octomber " );
                        break;
                        case 11:
                        System.out.println(" november " );
                        break;
                        case 12:
                        System.out.println(" december " );
                        break;
                        default : System.out.println(" invalid no. ");
                }
        
        }
        
}
