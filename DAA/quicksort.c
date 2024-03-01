#include<stdio.h>
int partition(int arr[],int l,int r)
{
    int temp;
    int pivot=arr[r];
    int i=l-1;
    for(int j=l;j<r;j++)
    {
        if(arr[j]<=pivot)
        {
            i++;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    temp=arr[i+1];
    arr[i+1]=arr[r];
    arr[r]=temp;
    return (i+1);
}
void quickSort(int arr[],int l,int r)
{
    if(l<r)
    {
        int pi=partition(arr,l,r);
        quickSort(arr,l,pi-1);
        quickSort(arr,pi+1,r);
    }
}
void main()
{
    int arr[5]={2,3,5,4,1};
    int l=0,r=4;
    quickSort(arr,l,r);
    for(int i=0;i<5;i++)
    {
        printf("%d",arr[i]);
    }
}
