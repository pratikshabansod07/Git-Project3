package com.pratu.project.array;

public class Example_1 {

	public static void main(String[] args) {
	int a[]= {1,20,4,5,3,5,4,5};
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]==a[j])
			 {
				 System.out.println(a[i]);
			 }
		 }
	 }

	}

}
