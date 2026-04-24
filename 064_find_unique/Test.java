
public class Test {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 3, 2};
        System.out.print(findUnique(arr));
    }

    public static int findUnique(int[] arr)
    {
        int unique = 0;

        for (int n : arr)
        {
            unique ^= n;
        }

        return unique;
    }
}

/*
    when we xor a number by itself it will give 0 
    so every no appears twice nd xor has commutative property [2 ^ 3 ^ 4 ^ 3 ^ 2]
    so it will be (2 ^ 2) ^ (3 ^ 3) ^ 4 => 0 ^ 0 ^ 4 => 0 ^ 4 => 4
*/
