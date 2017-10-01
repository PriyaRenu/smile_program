/* C Program - Print Smiling Face on Screen */
		
#include<stdio.h>
#include<conio.h>
void main()
{
        int s=1, i, n;
	clrscr();
	printf("How many smiley face you want to print ? ");
	scanf("%d",&n);
	for(i=0; i<n; i++)
	printf("\t %c ",s);
	getch();
}