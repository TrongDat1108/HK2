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
int main()
{
	//Option 1: Nhan thong tin gui tu daugia, xuat thong tin bao gom: Ten nguoi gui, cac chi so value nhan dc.
	key_t key;
	int msgid;
	
	key = ftok("msg.txt", 1);
	msgid = msgget(key, 0666 | IPC_CREAT);

	msgrcv(msgid, &mess, sizeof(mess), 1, 0);
	int i;

	for(i = 0; i < mess.mesg_length; i++){
		printf("Nguoi dau gia: %c\n",mess.mesg_ten[i]);
		printf("Du lieu: %d\n", mess.mesg_money[i]);
	}

	msgctl(msgid, IPC_RMID, NULL);

	//Option 2: Nhan thong tin gui tu daugia, xuat thong tin bao gom: Ten nguoi thang dau gia, so tien sau cung cua dau gia.
	return 0;
}



