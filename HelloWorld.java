class HelloWorld {

    static int numOfPalindromes = 0;
    
    // PALINDROME CHECKER
    public static void checkPalindromes() {
        String[] numbers = {"342", "231", "234"};
        
        for (String num : numbers) {
            String reverse = new StringBuilder(num).reverse().toString();
            if (num.equals(reverse)) {
                numOfPalindromes++;
            }
        }
    }
    
    // FACTORIAL
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    
    // COMBINATION
    public static int combination(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }
    
    public static void main(String[] args) {
        checkPalindromes();
        
        int n = 5; // Example values for n and r
        int r = 3;
        int totalCombinations = combination(n, r) - numOfPalindromes;
        
        System.out.println("Total Combinations: " + totalCombinations);
        System.out.println("Number of Palindromes: " + numOfPalindromes);
    }
}
