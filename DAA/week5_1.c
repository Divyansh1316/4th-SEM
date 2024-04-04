#include <stdio.h>
int main()
{
    int test, k, i, size;
    printf("enter the number of test cases\n");
    scanf("%d", &test);
    for (k = 0; k < test; k++)
    {
        printf("enter the size of the array\n");
        scanf("%d", &size);
        char arr[size];
        getchar();
        scanf("%c", &arr[0]);
        char max = arr[0];
        for (i = 1; i < size; i++)
        {
            scanf("%c", &arr[i]);
            if (arr[i] > max)
                max = arr[i];
        }
      
        int n = max - 96;
        char c[n];
        for (i = 0; i < n; i++)
        {
            c[i] = 0;
        }
        for (i = 0; i < size; i++)
        {
            
            c[ arr[i] - 97] ++;
        }
        int count=0;
        int ans=0;
        for (i = 0; i < n; i++)
        {
            if(c[i]>count)
            {
                ans=i;
                count=c[i];
            }
        }
        printf("Character : %c\nFrequency : %d",ans+97,count);
        
    }
    return 0;
}
