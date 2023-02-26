#include <stdio.h>


void main(){
	int result = 0;
	int number = 0;

	scanf("%d",&number);

	result = number/10000 == 555;

	printf("%d\n",result);
}
