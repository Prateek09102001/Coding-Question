import java.util.Scanner;

class Q49 {
    public static int solution(int X, int Y, int D) {
            return (Y - X + D - 1) / D;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the current position X: ");
            int X = scanner.nextInt();
    
            System.out.print("Enter the target position Y: ");
            int Y = scanner.nextInt();
    
            System.out.print("Enter the jump distance D: ");
            int D = scanner.nextInt();
    
            int result = solution(X, Y, D);

        System.out.println("The minimal number of jumps is: " + result);
    }
}
