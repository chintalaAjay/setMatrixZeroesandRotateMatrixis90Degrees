package Strivers;

public class Rotate90DegreesOptimal {
	public static void main(String[] args) {
		int nums[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}	
		};
		int n=nums.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=nums[i][j];
				nums[i][j]=nums[j][i];
				nums[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			rev(nums[i],0,n-1);
		}
		
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void rev(int nums[],int s,int e) {
		while(s<=e) {
			int temp=nums[s];
			nums[s]=nums[e];
			nums[e]=temp;
			s++;
			e--;
		}
	}

}
