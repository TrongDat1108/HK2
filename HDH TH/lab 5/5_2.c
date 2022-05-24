#include <stdio.h>
#include <unistd.h>
#include <string.h>

int main(int argc, char* argv[]){
    int fp1[2],fp2[2];
    int buffer;
    int pid;
    if(argc<2  && argv[1]<=3) {
        return -1;
    }
    if(pipe(fp1)==0 && pipe(fp2)==0){
        pid = fork();
        if(pid<0) {printf("Failed \n"); return -1;}
        else if(pid==0) {
            close(fp1[1]);
            read(fp1[0], &buffer, sizeof(buffer));
            printf("Read from parents: %d\n", buffer);
            close(fp1[0]);
            int n= 1;
            int c;
            for(c=1;i<=buffer;c++) {n *= c};
            printf("data send to parent: %d \n",n);
            close(fp2[0]);
            write(fp2[1], &n, sizeof(n));
            close(fp2[1]);
        }
        else {
            close(fp1[0]);
            printf("Data from parents: %s\n", argv[1]);
            int temp =atoi(argv[1]);
            write(fp1[1], &temp, sizeof(temp));
            close(fp1[1]);
            printf("da viet \n");
            close(fp2[1]);
            int tam;
            read(fp2[0], &tam, sizeof(tam));
            printf("data get from child %d \n",tam);
            close(fp2[0]);
        }
    }
    else {printf("Pipe falied \n"); return -2;}
}