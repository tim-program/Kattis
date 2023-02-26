#include <stdio.h>


void main(){
	int letterCount[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	char cardOrder[50];
	int result = 1;

	scanf("%s",cardOrder);

	for(int i = 0;i < 50 && cardOrder[i] != '\0';i++){
		letterCount[cardOrder[i]-97] += 1;
		if(letterCount[cardOrder[i]-97] > 1){
			result = 0;
			break;
		}

	}

	printf("%d",result);

}
