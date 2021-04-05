import java.util.Scanner;

public class lietkeSNT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhập số lượng SNT muốn in ra :");
        int n = s.nextInt();
        listSNT(n);
    }

    public static boolean checkSNT(int n) {
        if (n <= 1)
            return false;
        else if (n <= 3)
            return true;
        else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if(n % i == 0)
                    return false;
            }
            return true;
        }


    }
    public static void listSNT(int n){
        int count =0;
        int i = 2;
        while (count < n){
            if(checkSNT(i)){
                System.out.println(i);
                count ++;
            }
            i++;
        }
    }
}
