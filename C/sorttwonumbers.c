#include <stdio.h>

void main(){
	int a, b;

	scanf("%d %d",&a,&b);

	if(a < b){
		printf("%d %d\n",a,b);
	}else{
		printf("%d %d\n",b,a);
	}
}