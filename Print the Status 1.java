#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    char S[99];
    char status[3];
    
    fgets(S,99,stdin);
    fgets(status,3,stdin);
    
    if(status[0]=='Y')
        printf("Mrs.%s",S);
    else 
        printf("Ms.%s",S);
    return 0;
}
