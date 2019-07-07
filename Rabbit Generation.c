#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
  int num;
void fibo(int b,int f,int i)
{
    printf("%d ",f);
    if(i+1<=num)
        fibo(f,b+f,i+1);
        
}
 
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    
     
        scanf("%d",&num);
if(num>=1 && num<=100){
    
        int a=0;
        int b=1;

    if(num>=0)
            printf("%d ",a);  
      if(num>=1)
        printf("%d ",b);
    if(num>1)       
    fibo(b,a+b,3);
        
}
    }




