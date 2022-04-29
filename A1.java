import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Which position(0-9) is ship on X-axis:");
        int x = scan.nextInt();
        while (check(x) == false){
            System.out.println("Out of range, please enter again: ");
            x = scan.nextInt();
        }
        
        System.out.println("Which position(0-9) is ship on Y-axis:");
        int y = scan.nextInt();

        while (check(y) == false){
            System.out.println("Out of range, please enter again: ");
            y = scan.nextInt();
        }
        scan.close();

        System.out.println("For square [" + x + "," + y + "]:" );

        
        System.out.println("The edge-adjacent squares are: ");
        if(x== 0 && y == 0){
            System.out.println("[" + x + "," + upperY(y) + "]" ); 
            System.out.println("[" + BiggerX(x) + "," + y + "]" );    
        }else if(x==0 && y == 9){
            System.out.println("[" + x + "," + lowerY(y) + "]" );
            System.out.println("[" + BiggerX(x) + "," + y + "]" );
        }else if(x == 9 && y ==0){
            System.out.println("[" + x + "," + upperY(y) + "]" );
            System.out.println("[" + SmallerX(x) + "," + y + "]" );
        }else if(x ==9 && y == 9){
            System.out.println("[" + x + "," + lowerY(y) + "]" );
            System.out.println("[" + SmallerX(x) + "," + y + "]" );
        }else if(x == 0){
            System.out.println("[" + x + "," + upperY(y) + "]" );
            System.out.println("[" + x + "," + lowerY(y) + "]" );
            System.out.println("[" + BiggerX(x) + "," + y + "]" );
        }else if (x == 9){
            System.out.println("[" + x + "," + upperY(y) + "]" );
            System.out.println("[" + x + "," + lowerY(y) + "]" );
            System.out.println("[" + SmallerX(x) + "," + y + "]" );
        }else if (y == 0){
            System.out.println("[" + x + "," + upperY(y) + "]" );
            System.out.println("[" + BiggerX(x) + "," + y + "]" );
            System.out.println("[" + SmallerX(x) + "," + y + "]" );
        }else if (y == 9){
            System.out.println("[" + x + "," + lowerY(y) + "]" );
            System.out.println("[" + BiggerX(x) + "," + y + "]" );
            System.out.println("[" + SmallerX(x) + "," + y + "]" );
        }else{
            System.out.println("[" + x + "," + upperY(y) + "]" );
            System.out.println("[" + x + "," + lowerY(y) + "]" );
            System.out.println("[" + BiggerX(x) + "," + y + "]" );
            System.out.println("[" + SmallerX(x) + "," + y + "]" ); 
        }

        System.out.println("The corner-adjacent squares are: ");
        if(x== 0 && y == 0){
            System.out.println("[" + BiggerX(x) + "," + upperY(y) + "]" );   
        }else if(x==0 && y == 9){
            System.out.println("[" + BiggerX(x) + "," + lowerY(y) + "]" );
        }else if(x == 9 && y ==0){
            System.out.println("[" + SmallerX(x) + "," + upperY(y) + "]" );
        }else if(x ==9 && y == 9){
            System.out.println("[" + SmallerX(x) + "," + lowerY(y) + "]" );
        }else if(x == 0){
            System.out.println("[" + BiggerX(x) + "," + upperY(y) + "]" );
            System.out.println("[" + BiggerX(x) + "," + lowerY(y) + "]" );
        }else if (x == 9){
            System.out.println("[" + SmallerX(x) + "," + upperY(y) + "]" );
            System.out.println("[" + SmallerX(x) + "," + lowerY(y) + "]" );
        }else if (y == 0){
            System.out.println("[" + BiggerX(x) + "," + upperY(y) + "]" );
            System.out.println("[" + SmallerX(x) + "," + upperY(y) + "]" );
        }else if (y == 9){
            System.out.println("[" + BiggerX(x) + "," + lowerY(y) + "]" );
            System.out.println("[" + SmallerX(x) + "," + lowerY(y) + "]" );
        }else{
            System.out.println("[" + BiggerX(x) + "," + upperY(y) + "]" );
            System.out.println("[" + BiggerX(x) + "," + lowerY(y) + "]" );
            System.out.println("[" + SmallerX(x) + "," + upperY(y) + "]" );
            System.out.println("[" + SmallerX(x) + "," + lowerY(y) + "]" );
        }

        
        
        System.out.println("The not-adjacent squares are: ");

        for (int i=0 ; i<10 ; i++){
            if (i == x || i == (x+1) || i == (x-1)){
                for(int j=0 ; j<10 ; j++){
                    if (j == y || j == (x+1) || j == (x-1)){
                    
                    }else{
                        System.out.println("[" + i + "," + j + "]");
                    }
                }
                
            }else{
                for (int k=0 ; k<10 ; k++){
                    System.out.println("[" + i + "," + k + "]" );
                }
            }

            
        }
    }

    public static boolean check(int p) {
        if (p < 0 || p > 9){
            return false;
        }
        return true;

        
    }
    public static int upperY (int i){
        return (i+1);
    }

    public static int lowerY (int i){
        return (i-1);
    }

    public static int BiggerX (int i){
        return (i+1);
    }

    public static int SmallerX (int i){
        return (i-1);
    }


    
}
