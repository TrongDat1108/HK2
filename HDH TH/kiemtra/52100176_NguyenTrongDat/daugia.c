#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <sys/ipc.h>
#include<sys/types.h>
#include <sys/msg.h>
#include <string.h>
#include <semaphore.h> 
#include <unistd.h> 
#define BUFFER_SIZE 100
// Cau truc data de luu du lieu lay tu file
typedef struct data {
	int value[BUFFER_SIZE]; //cac gia tri cua file
	int length;	// do lon cua mang value
	char filename[BUFFER_SIZE]; // Ten file truyen vao
	long mesg_type; 	//loai message
} data;
//Cau truc mesg_buffer dung thuc hien gui tin nhan den chu dau gia cho option 2
struct mesg_buffer {
	long mesg_type; 	//loai message
	char won[BUFFER_SIZE];	//Luu tru ten cua nguoi thang cuoc dau gia
	int money;	//Luu so tien dau gia cuoi cung
} message;

struct mesg_buf {
	long mesg_type;
	char mesg_ten[BUFFER_SIZE];
	int mesg_length;
	int mesg_money[BUFFER_SIZE];	
} mess;

char name[]="NULL"; //Bien dung chung, de dat ten cua nguoi dau gia qua tung giai doan
int result=0; //Bien dung chung, de dat so tien dau gia qua tung giai doan
sem_t sem; //Bien dung chung, semaphore dung de quan ly truy cap bien dung chung
int flag=0; //Bien dung chung, dung de phat tin hieu khi co 1 luong chay het du lieu
//Ham xuly dung de nap cac du lieu o file vao bien thuoc cau truc data
void *xuly(void* Dulieu)
{
	data* mang = (data*) Dulieu;
	FILE *readFile;
	char word[20];
	readFile = fopen(mang ->filename, "r");

	if(readFile == NULL){
		printf("Khong the mo fie\n");
	}
	
	mang->length = 0;
	while(fgets(word, 50, readFile) != NULL){
		mang->value[mang->length] = atoi(word);
		mang->length++;
	}

	int i;
	printf("Nguoi dau gia: %s\n", mang->filename);
	for(i = 0; i < mang->length; i++){
		printf("Du lieu: %d\n", mang->value[i]);
	}
	fclose(readFile);
}
//Ham daugia dung de thiet lap dau gia giua cac tieu trinh, moi tieu trinh se chi den 1 file du lieu.
void *daugia(void* Dulieu)
{

}
int main(int argc, char *argv[])
{
	// Doi so argv la ten cua cac file de truyen du lieu
	pthread_t tid[argc];
	data array;
	
	int i;
	for(i = 0; i < argc - 1; i++){
		strcpy(array.filename, argv[i + 1]);
		pthread_create(&tid[i], NULL, xuly, (void*) &array);
		pthread_join(tid[i], NULL);	
	}

	//Dua du lieu vao de xu ly
	
	//xuat thong tin sau khi file duoc doc vao du lieu	
	
	//Option1: Tao ra message de gui thong tin vua xy ly duoc sang cho ToChuc
	key_t key;
	int msgid;
	key = ftok("msg.txt", 1);

	msgid = msgget(key, 0666 | IPC_CREAT);
	mess.mesg_type = 1;
	
	int j;
	mess.mesg_length = array.length;
	for(j = 0; j < array.length; j++){
		mess.mesg_ten[i] = array.filename[i];
		mess.mesg_money[i] = array.value[i]; 
	}
	msgsnd(msgid, &mess, sizeof(mess), 0);
	
	//Option 2: Thuc hien dau gia giua cac tieu trinh, moi tieu trinh doc 1 file
	
	//Gui ket qua ve chu dau gia	
	
	return 0;
}
