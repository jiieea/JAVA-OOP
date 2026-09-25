package Recursion_Demo;



class Sum {
    int add(int x) {
        if(x > 0) {
            return x + add(x -1)        ;
        }else {
            return 0;
        }
    }

    int factorial(int n) {
        if(n <= 1) {
            return n;
        }else {
            return n * factorial(n-1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
//        2 + sum(1)
        Sum sum = new Sum();
        System.out.println(
                sum.add(2));
    System.out.println(sum.factorial(5));
    }
}
