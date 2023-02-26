#include <stdio.h>

void main(){
	int option1,option2,totalBet;
	double ratio1, ratio2;
	scanf("%d",&option1);
	option2 = 100 - option1;
	totalBet = option1 + option2;
	ratio1 = totalBet / (double)option1;
	ratio2 = totalBet / (double)option2;
	printf("%.10f\n%.10f",ratio1,ratio2);
}
