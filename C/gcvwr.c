#include <stdio.h>

void main(){
	int g,t,n;
	scanf("%d %d %d",&g,&t,&n);
	int totalWeight;

	totalWeight = 0;

	while(n-- > 0){
		int item;
		scanf("%d",&item);
		totalWeight += item;
	}

	printf("%d",(int)(((g - t) * 0.9) - totalWeight));

}
