#include <stdio.h>
void radixSort(int arr[], int n)
{
    int c = 0;
    int d = arr[0];
    for (int i = 1; i < n; i++)
    {
        if (arr[i] > d)
        {
            d = arr[i];
        }
    }
    while (d > 0)
    {
        c++;
        d = d / 10;
    }

    for (int j = c; j > 0; j--)
    {
        int max = arr[0];
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        int count[max + 1];
        for (int i = 0; i <= max; i++)
        {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++)
        {
            count[arr[i]]++;
        }
        printf("\n");
        for (int i = 1; i <= max; i++)
        {
            count[i] += count[i - 1];
        }
        int output[n];
        for (int i = n - 1; i >= 0; i--)
        {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < n; i++)
        {
            arr[i] = output[i];
        }
    }
}
void main()
{
    int n, t, k;
    printf("Enter number of test cases : ");
    scanf("%d", &t);
    for (int k = 0; k < t; k++)
    {
        printf("Enter size : ");
        scanf("%d", &n);
        int arr[n];
        printf("Enter elements : ");
        for (int i = 0; i < n; i++)
        {
            scanf("%d", &arr[i]);
        }
        radixSort(arr, n);
        printf("\nSorted array is : \n");
        for (int i = 0; i < n; i++)
        {
            printf("%d ", arr[i]);
        }
    }
}
