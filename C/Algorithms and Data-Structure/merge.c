#include<stdio.h>

void printa(int n, int a[],char t[]){
	printf("\n%s:",t);
	for(int i=0;i<n;i++)
		printf(" | %d",a[i]);
}

void merge(int i, int j, int a[]){
	int k=(int)(((i+j)/2)+0.5);
	if(j-i>1){
		merge(i,k,a);
		merge(k+1,j,a);
	}
	int rn=j-k,ra[rn];
	int ln=k+1-i,la[ln];
	
	for(int x=0,y=i;x<ln;x++,y++)
		la[x]=a[y];
	for(int x=0,y=k+1;x<rn;x++,y++)
		ra[x]=a[y];
	
	int x=i,lx=0,rx=0;
	while(lx<ln&&rx<rn)
		if(la[lx]<ra[rx])
			a[x++]=la[lx++];
		else
			a[x++]=ra[rx++];
	while(rx<rn)a[x++]=ra[rx++];
	while(lx<ln)a[x++]=la[lx++];
	
	return;
}

int main(){
	int n=11;
	int a[]={330,961,122,543,564,45,1,21,448,459,990};
	printa(n,a,"Before");	
	
	merge(0,n-1,a);
	printa(n,a,"Afterr");
	return 0;
}
	

/*
Example run
Before: | 330 | 961 | 122 | 543 | 564 | 45 | 1 | 21 | 448 | 459 | 990
Afterr: | 1 | 21 | 45 | 122 | 330 | 448 | 459 | 543 | 564 | 961 | 990
*/
