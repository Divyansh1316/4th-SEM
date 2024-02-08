#include <stdio.h>
void main()
{
    int arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int ele;
    printf("Enter element to be searched : ");
    scanf("%d", &ele);
    for (int i = 0; i < 10; i += 2)
    {
        if (arr[i] == ele)
        {
            printf("Element found");
            break;
        }
        else if (arr[i] > ele)
        {

            for (int j = i - 2 + 1; j < i; j++)
            {
                if (arr[j] == ele)
                {
                    printf("Element found by linear search");
                    break;
                }
                else
                {
                    printf("Element not found");
                    break;
                }
            }
            break;
        }
    }
}