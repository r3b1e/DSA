#include<stdio.h>
#include<string.h>
int main(){
char str[100];
gets(str);
int space=0;
int digit=0;
int lowercase=0;
int uppercase=0;
int vowel=0;
int cosonent=0;
for(int i=0;i<strlen(str);i++){
    if(str[i]==' '){
        space++;
    }
    else if(str[i]>='0' && str[i]<='9'){
        digit++;
    }
    else if(str[i]>='a' && str[i]<='z'){
        lowercase++;
    }
    else if(str[i]>='A' && str[i]<='Z'){
        uppercase++;
    }
    else if((str[i]=='a')||(str[i]=='e')||(str[i]=='i')||(str[i]=='o')||(str[i]=='u')){
        vowel++;
    }
    else{
        cosonent++;
    }

}
printf("%d,%d,%d,%d,%d,%d",space,digit,lowercase,uppercase,vowel,cosonent);
return 0;
}