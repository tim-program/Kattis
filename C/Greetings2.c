#include <stdio.h>
#include <stdlib.h>

char input[2000];

int main(void){
	int index = 0;
	scanf("%[^\n]%*c",input);

	while(input[index] != '\0'){
		if(input[index] == 'e' || input[index]=='E'){
			putchar(input[index]);
		}
		putchar(input[index]);
		index++;
	}

	

	return 0;
}
