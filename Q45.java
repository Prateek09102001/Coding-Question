class Q45 {
    public static int solution(int N) {
            int maxGap = 0;
            int currentGap = 0;
            boolean counting = false;
    
            while (N > 0) {
                if ((N & 1) == 1) {
                    if (counting) {
                        maxGap = Math.max(maxGap, currentGap);
                    }
                    counting = true;
                    currentGap = 0;
                } else if (counting) {
                    currentGap++;
                }
                N >>= 1;
            }
    
            return maxGap;
        }
    
        public static void main(String[] args) {
            int N = 529; 
            int result = solution(N);
        System.out.println("Longest binary gap for " + N + " is: " + result);
        
        N = 9;
        result = solution(N);
        System.out.println("Longest binary gap for " + N + " is: " + result);
        
        N = 20;
        result = solution(N);
        System.out.println("Longest binary gap for " + N + " is: " + result);
        
        N = 15;
        result = solution(N);
        System.out.println("Longest binary gap for " + N + " is: " + result);
        
        N = 32;
        result = solution(N);
        System.out.println("Longest binary gap for " + N + " is: " + result);
    }
}
