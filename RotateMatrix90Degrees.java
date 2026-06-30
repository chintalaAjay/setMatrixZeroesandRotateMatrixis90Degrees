package Strivers;


public class RotateMatrix90Degrees {
	public static void main(String[] args) {
		int nums[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int r=nums.length;
		int c=nums[0].length;
		int ans[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				ans[j][r-1-i]=nums[i][j];
			}
			
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
