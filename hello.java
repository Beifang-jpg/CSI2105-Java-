public class hello {
    int a = 1;
    public static int test(int n) {

        if (n<1){
            return(0);
        }else if (n==1){
            return(1);
        }else{
            int prev = test(n/2);
            int curr = prev * 2;
            return curr;

        }
        
    }

    public static void main(String[] args) {
        System.out.println(test(9));
    }
}


