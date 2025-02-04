class Q48 {
    public static int solution(int[] A) {
            int result = 0;
            for (int num : A) {
                result ^= num;
            }
            return result;
        }
    
        public static void main(String[] args) {
            int[] A = {9, 3, 9, 3, 9, 7, 9};  // Example input
            int unpairedElement = solution(A);
        System.out.println("The unpaired element is: " + unpairedElement);
    }
}
