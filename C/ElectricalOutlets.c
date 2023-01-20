#include <stdio.h>
#include <stdlib.h>


int main(void){

	int cases,numOutlets;
	int *outlets;
	int total = 0;

	outlets = malloc(sizeof(int) * 10);
	scanf("%d",&cases);
	while(cases-- > 0){
		scanf("%d",&numOutlets);
		for(int i = 0;i<numOutlets;i++){
			scanf("%d",(outlets + i));
			if(i != 0){
				total -= 1;
			}
			total += *(outlets + i);
		}
		printf("%d\n",total);
		total = 0;
	}
	free(outlets);
	return 0;
}
