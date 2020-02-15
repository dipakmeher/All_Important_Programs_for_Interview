#include <stdio.h>
int disp(int n)
{
return 0;
}
void fun(int (*pt)(int))
{
int n=0;
for(;n++;(*pt)(n))
{
if(n%2==0)
printf(" is even ");
else
printf(" is odd ");
if(n==50)
break;
}
printf(" gradeUp");
}
int main(){
fun(disp);
return 0;
}