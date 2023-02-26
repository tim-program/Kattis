#include <stdio.h>


void main(){
	int total = 0;
	int iterations;

	scanf("%d",&iterations);
	while(iterations-- > 0){
		int current;
		scanf("%d",&current);
		total += current;
	}
	printf("%d",total);
}
