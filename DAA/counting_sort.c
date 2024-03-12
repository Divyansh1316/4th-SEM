#include <stdio.h>
int shifts = 0;
void countingSort(int arr[], int n)
{
    int output[n];
    int max = arr[0];
    for (int i = 1; i < n; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
    int c[max];
    for (int i = 0; i <= max; i++)
    {
        c[i] = 0;
        printf("%d", c[i]);
    }
    printf("\n");
    for (int i = 0; i < n; i++)
    {
        c[arr[i]]++; // count array
        printf("%d", c[arr[i]]);
    }
    printf("\n");
    for (int i = 1; i <= max; i++)
    {
        c[i] += c[i - 1];
        printf("%d", c[i]);
    }
    for (int i = n - 1; i >= 0; i--)
    {
        shifts++;
        output[c[arr[i]] - 1] = arr[i];
        c[arr[i]]--; // decreasing frequency
    }

    // Copy the sorted elements into original array
    for (int i = 0; i < n; i++)
    {
        arr[i] = output[i];
    }
}
void main()
{
    int T, n;
    printf("Enter number of test cases : ");
    scanf("%d", &T);
    for (int i = 0; i < T; i++)
    {
        printf("Enter size of array : ");
        scanf("%d", &n);
        int arr[n];
        printf("Enter elements of array : ");
        for (int k = 0; k < n; k++)
        {
            scanf("%d", &arr[k]);
        }
        countingSort(arr, n);
        printf("\n");
        for (int i = 0; i < n; i++)
        {
            printf("%d ", arr[i]);
        }
        printf("Shifts are : %d", shifts);
        shifts = 0;
    }
}