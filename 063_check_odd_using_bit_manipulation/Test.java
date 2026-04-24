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

/*
    Binary:

    66 = 1000010
    1  = 0000001

    AND:

    1000010
    0000001
    -------
    0000000

    Result: 0
*/
