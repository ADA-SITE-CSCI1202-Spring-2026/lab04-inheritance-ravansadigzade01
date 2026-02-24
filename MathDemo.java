package week06;

public class MathDemo {
    static int min(int a, int b){
        if(a>b) return b;
        return a;
    }
    static int max(int a, int b){
        if(a>b) return a;
        return b;
    }
    static int sum(int args[]){
        int sum = 0;
        for(int i=0;i<args.length;i++){
            sum = sum + args[i];
        }
        return sum;
    }
    static float mean(int args[]){
        float sum = 0;
        for(int i=0;i<args.length;i++){
            sum = sum + args[i];
        }
        float mean = sum / args.length;
        return mean;
    }
    static int factorial(int n){
        int fac = 1;
        for(int i=1;i<n+1;i++){
            fac = fac * i;
        }
        return fac;
    }
    public static void main(String[] args) {
        System.out.println(MathDemo.min(1,2));
    }

}
