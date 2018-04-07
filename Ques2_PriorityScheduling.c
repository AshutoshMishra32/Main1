#include<stdio.h>
 
struct process
{
 char pname;
 int at, bt, ct, wt, tt, priority;
 int status;
}pqueue[10];
 int limit;
void at_Sorting()
{
 struct process temp;
int i, j;
for(i = 0; i < limit - 1; i++)
{
for(j = i + 1; j < limit; j++)
{
if(pqueue[i].at > pqueue[j].at)
{
temp = pqueue[i];
pqueue[i] = pqueue[j];
pqueue[j] = temp;
}
}  
}
}
void main()
{
 int i, time = 0, bt = 0, l;
 char c;
 float wait_time = 0, tt = 0, average_wt, average_tt;
 printf("\nEnter Total Number of Processes:\t");
 scanf("%d", &limit);
 for(i = 0, c = 'A'; i < limit; i++, c++)
 {
  pqueue[i].pname = c;
  printf("\nEnter Details For Process[%C]:\n", pqueue[i].pname);
  printf("Enter Arrival Time:\t");
  scanf("%d", &pqueue[i].at );
  printf("Enter Burst Time:\t");
  scanf("%d", &pqueue[i].bt);
  printf("Enter Priority:\t");
  scanf("%d", &pqueue[i].priority);
  pqueue[i].status = 0;
  bt = bt + pqueue[i].bt;
 }
at_Sorting();
pqueue[9].priority = -9999;
printf("\nProcess Name\tArrival Time\tBurst Time\tPriority\tWaiting Time");
for(time = pqueue[0].at; time < bt;)
{
 l = 9;
  for(i = 0; i < limit; i++)
  {
  if(pqueue[i].at <= time && pqueue[i].status != 1 && pqueue[i].priority > pqueue[l].priority)
  {
   l = i;
} 
}


time = time + pqueue[l].bt;
pqueue[l].ct = time;
pqueue[l].wt = pqueue[l].ct - pqueue[l].at - pqueue[l].bt;
pqueue[l].tt = pqueue[l].ct - pqueue[l].at;
pqueue[l].status = 1;
wait_time = wait_time + pqueue[l].wt;
tt = tt + pqueue[l].tt;
printf("\n%c\t\t%d\t\t%d\t\t%d\t\t%d", pqueue[l].pname, pqueue[l].at, pqueue[l].bt, pqueue[l].priority, pqueue[l].wt);
}
average_wt = wait_time / limit;
average_tt = tt / limit;
printf("\n\nAverage waiting time:\t%f\n", average_wt);
printf("Average Turnaround Time:\t%f\n", average_tt);
}
