class Q44 {
    public static String trimWhitespace(String str) {
            return str.trim().replaceAll("\s+", " ");
        }
    
        public static void main(String[] args) {
            String input = "  Hello   World  ";
            String result = trimWhitespace(input);
        System.out.println("Trimmed string: '" + result + "'");
    }
}
