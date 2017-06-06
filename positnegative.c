#include<stdio.h>
int main(){
int num;
printf("POSITIVE OR NEGATIVE OR ZERO");
printf("\nEnter the number:");
scanf("%d",&num);
if(num<0){
    printf("The number is negative");
}
else if(num>0){
    printf("The number is positive");
}
else{
    printf("The number is zero");
}
}
