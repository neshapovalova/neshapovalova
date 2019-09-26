package javaapplication6cur;

public class JavaApplication6cur {

static int[] V = new int[] {1000, 250, 400, 200, 900};
static int[] w = new int[] {10, 5, 5, 10, 2};
static int Weights = 28;


private static int QWE(int i, int Weights) {
    if (i < 0) {
        return 0;}
    if (w[i] > Weights) {
        return QWE(i-1, Weights);} 
        else { return Math.max(QWE(i-1, Weights), QWE(i-1, Weights - w[i]) + V[i]); }
}

public static void main(String[] args) {

System.out.print("Общая суммарная ценность рюкзака с вошедшим в него грузом = ");
System.out.println(QWE(V.length - 1, Weights));}
}
