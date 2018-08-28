#include<stdio.h>

void printa(int n, int a[],char t[]){
	printf("\n%s:",t);
	for(int i=0;i<n;i++)
		printf(" | %d",a[i]);
}

void insertion(int x,int n, int a[]){
	for(int t,j,i=x;i<n;i++){
		t=a[i];
		for(j=i;j>x;j--){
			if(a[j-1]>t){
				a[j]=a[j-1];
			}
			else break;
		}
		a[j]=t;
	}
}

int main(){
	int n=11;
	int a[]={3,96,1,53,6,43,5,6,4,52,0};
	printa(n,a,"Before");	
	insertion(0,n,a);
	printa(n,a,"Afterr");
	return 0;
}
	

/*
Example run
Before: | 3 | 96 | 1 | 53 | 6 | 43 | 5 | 6 | 4 | 52 | 0
Afterr: | 0 | 1 | 3 | 4 | 5 | 6 | 6 | 43 | 52 | 53 | 96
*/
