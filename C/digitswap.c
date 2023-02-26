#include <stdio.h>


void main(){
	int value,swapped;
	scanf("%d",&value);
	swapped = (value % 10) * 10;
	swapped += value / 10;
	printf("%d\n",swapped);
}
