public class GitHubDemo {

    public static int sum(int x, int y){
        //Function completed by ???
        int sum = 0;
        //complete me
        return sum;
    }

    public static int subtract(int x, int y){
        //Function completed by ???
        int difference = 0;
        //complete me
        return difference;
    }

    public static int multiply(int x, int y){
        //Function completed by Sebastian N
        int product = x * y;
        
        return product;
    }

    public static float divide(int x, int y){
        //Function completed by Kevin Smith
        float quotient = 0;
        quotient = (float) x / y;
        return quotient;
    }

    public static void main(String[] args) {
        System.out.println("Atlas GitHub sample project.");
        int x = 3;
        int y = 5;
        System.out.println(x + " + " + y + " = " + sum(x, y));
        System.out.println(x + " - " + y + " = " + subtract(x, y));
        System.out.println(x + " * " + y + " = " + multiply(x, y));
        System.out.printf("%d / %d = %.2f", x, y, divide(x,y));
    }

}
