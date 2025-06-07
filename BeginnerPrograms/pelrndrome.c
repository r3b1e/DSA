#include<stdio.h>
int main(){
    char palin[100];
    char pal[100];
    int i=0;
    char ch;
    printf("Enter word to cheak pelindrome");
    while(ch!='\n'){
        scanf("%c",&ch);
           palin[i]=ch;
        i++;
    }
    palin[i]='\n';
    puts(palin);
    gets(pal);
    int j=0;
    while(pal[j]!='\0'){
        printf("%c",pal[j]);
        j++;
    }
    int temp=0;
    printf("%d",j);
    for(int k=0;k<j/2;k++){

        if(pal[i]==pal[j-i-1]){
           temp++;
        }
    }
    if(temp==j/2){
        printf("it is a palindrome");
    }
    else{
        printf("it is not a palindrome");
    }
    return 0;
}
