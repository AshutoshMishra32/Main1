#include<stdio.h>

void main()
{
	int head,distance=0,diff;
	int i,j,k;
    int	queue[]={0,86, 1470, 913, 1774, 948, 1509, 1022, 1750, 130 };
	int n=10;
	printf(" The queue of pending requests, in FIFO order,is: \n");
    for(i=1;i<n;i++)
    {
    	printf("%d  ",queue[i]);
	}
	printf("\n");
	printf("\n");
	
    head=143;
	printf("According Given Question the Currently Service Request is: 143. So head will be  **%d ",head);
	printf("\n");
	printf("\n");
	queue[0]=head;
	printf("\n");
	for(j=0;j<n-1;j++)
	{
		diff=abs(queue[j+1] - queue[j]);
		distance+=diff;
		 printf(" In this Step Disk Arm Move from %d to %d and distance will be %d\n",queue[j],queue[j+1],diff);
	}
	printf("\nTotal Distance Covered is %d\t\n",distance);
	
}
