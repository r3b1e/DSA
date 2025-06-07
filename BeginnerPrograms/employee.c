#include<stdio.h>
 struct employee{
        int emp_no;
        char name[50];
        int exp;
        int salary;
    };
int main(){ 
   struct employee e[2];
   for(int i=1;i<=2;i++){
    e[i].emp_no=i;
    printf("enter name of employee %d:",i);
    scanf("%s",e[i].name);
    printf("enter experience:");
    scanf("%d",&e[i].exp);
    printf("enter salary:");
    scanf("%d",&e[i].salary);
   }
    printf("\nEmployee_no\t\t\tName\t\t\tExperience\t\t\tsalary");
    for(int i=1;i<=5;i++){
        if(e[i].exp>=5 && e[i].salary<10000){
            printf("%d\t\t\t%s\t\t\t%d\t\t\t%d\t\t\t",e[i].emp_no,e[i].name,e[i].exp,e[i].salary);
        }
    }
    return 0;
}