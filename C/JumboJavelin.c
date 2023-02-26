#include <stdio.h>

void main(){
	int numJav;
	int totalLen;

	totalLen = 0;

	scanf("%d",&numJav);
	for(int i = 0;i < numJav;i++){
		int temp;
		scanf("%d",&temp);
		totalLen += temp;
	}
	totalLen -= numJav - 1;
	printf("%d\n",totalLen);
}

