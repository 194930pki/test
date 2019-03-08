public class Main {
    public static void main(String args[]) {
        System.out.println(add(2, 3));
        System.out.println(multiply(2, 3));
    }

    private static int add(int a, int b){
        return a + b;
    }

    private static int multiply(int a, int b){
        return a * b;
    }
}