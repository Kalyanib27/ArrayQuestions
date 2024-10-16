class CommonThreeArrays{
	public static void findCommon(int a[],int b[],int c[]){
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length && k<c.length){
			if(a[i]==b[j] && b[j]==c[k]){
				System.out.println(a[i]);
				i++;
				j++;
				k++;
			}
			else if(a[i]<b[j]){
				i++;
			}
			else if(b[j]<c[k]){
				j++;
			}
			else {
				k++;
			}
		}
	}


	public static void main(String args[]){
		int a[]={1,5,10,20,30};
		int b[]={5,13,15,20};
		int c[]={5,20};

		findCommon(a,b,c);
	}
}