public class Test{
    public static void main(String[] args)
    {
        int n = 66;
        System.out.print(checkOdd(n));
    }

    public static boolean checkOdd(int n)
    {
        return (n & 1) == 1;
    }
}