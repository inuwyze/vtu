#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int start,end;
    scanf("%d",&start);
    scanf("%d",&end);
    while(start<=end)
    {
        if(start % 2 !=0)
        printf("%d\n",start);
        start++;
    }
    return 0;
}