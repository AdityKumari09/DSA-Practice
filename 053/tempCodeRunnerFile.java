        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] > max)
            {
                second_largest = max;
                max = arr[i];
            }

            else if (arr[i] > second_largest && arr[i] < max)
            {
                second_largest = arr[i];
            }

            if (arr[i] < min)
            {
                second_smallest = min;
                min = arr[i];
            }

            else if (arr[i] < second_smallest && arr[i] > min)
            {
                second_smallest = arr[i];
            }
        }