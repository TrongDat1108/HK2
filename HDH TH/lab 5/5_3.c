#include <stdio.h>
#include <unistd.h>
#include <string.h>

int check(int a, int b, char str){
    switch(str){
        case '+':{
            return a+b;
            break;
        }
        case '-':{
            return a-b;
            break;
        }
        case '*':{
            return a*b;
            break;
        }
        case '/':{
            return a/b;
            break;
        }
    }
}

int main(int argc, char* argv[]){
    int fp1[2],fp2[2],fp3[2];
    int buffer1,buffer2;
    int pid;
    if(argc<2) {
        return -1;
    }
    printf("%d %s %d = ",argv[1],argv[3],argv[2]);
    if(pipe(fp1)==0 && pipe(fp2)==0){
        pid = fork();
        if(pid<0) {printf("Failed \n"); return -1;}
        else if(pid==0) {
            close(fp1[1]);
            close(fp2[1]);
            read(fp1[0], &buffer1, sizeof(buffer1));
            read(fp2[0], &buffer2, sizeof(buffer2));
            close(fp1[0]);
            close(fp2[0]);

            int n = check(buffer1,buffer2,argv[3]);
            close(fp3[0]);
            write(fp3[1], &n, sizeof(n));
            close(fp3[1]);
        }
        else {
            close(fp1[0]);
            close(fp2[0]);
            int temp1 =atoi(argv[1]);
            int temp2 = atoi(argv[2]);
            write(fp1[1], &temp1, sizeof(temp1));
            write(fp2[1], &temp2, sizeof(temp2));
            close(fp1[1]);
            close(fp2[1]);

            close(fp3[1]);
            int tam;
            read(fp3[0], &tam, sizeof(tam));
            printf("%d\n",tam);
            close(fp3[0]);
        }
    }
    else {printf("Pipe falied \n"); return -2;}
}