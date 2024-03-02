#include <stdio.h>
int s = 0, c = 0;
void swap(int arr[], int i, int j)
{
    int temp;
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    s++;
}
int partition(int arr[], int l, int r)
{
    int pivot = arr[r];
    int i = l - 1;
    int j;
    for (j = l; j < r; j++)
    {
        c++;
        if (arr[j] <= pivot)
        {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, r);
    return (i + 1);
}
void quickSort(int arr[], int l, int r)
{
    if (l < r)
    {
        int pi = partition(arr, l, r);
        quickSort(arr, l, pi - 1);
        quickSort(arr, pi + 1, r);
    }
}
void main()
{
    int n, t;
    printf("Enter number of test cases : ");
    scanf("%d", &t);
    for (int i = 0; i < t; i++)
    {
        printf("Enter size : ");
        scanf("%d", &n);
        int arr[n];
        printf("Enter elements of array : ");
        for (int i = 0; i < n; i++)
        {
            scanf("%d", &arr[i]);
        }
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++)
        {
            printf("%d ", arr[i]);
        }
        printf("%d %d", c, s);
    }
}
