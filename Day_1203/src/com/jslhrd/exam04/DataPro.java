package com.jslhrd.exam04;
interface Data{
	int getMax(int ... var);
	int getMin(int ... var);
	void sort(int[] var, boolean bool);
	//true, false
	default int getSum(int ... var) {
		
		
		return 0;
		
	}
}
public class DataPro implements Data{
	@Override
	public int getMax(int... var) {
		int max=var[0];
		for(int x=1; x<var.length; x++) {
			if(max<var[x]) {
				max=var[x];
			}
		}
		return max;
	}
	@Override
	public int getMin(int... var) {
		int min=var[0];
		for(int x=1; x<var.length; x++) {
			if(min>var[x]) {
				min=var[x];
			}
		}
		
		return min;
	}
	@Override
	public void sort(int[] var, boolean bool) {
		imsi(var);
		if(bool) {
			for(int x=0; x<var.length; x++) {
				for(int y=x+1; y<var.length-1; y++) {
					if(var[x]<var[y]) {
						int temp = var[x];
						var[x] = var[y];
						var[y] = temp;
					}
				}
				System.out.println("");
			}
			
		}else {
			for(int x=0; x<var.length; x++) {
				for(int y=x+1; y<var.length-1; y++) {
					if(var[x]>var[y]) {
						int temp = var[x];
						var[x] = var[y];
						var[y] = temp;
					}
				}
			}
		}
		
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int getSum(int... var) {
		int getSum=0;
		for(int x=0; x<var.length; x++) {
			getSum+=var[x];
		}
		return getSum;
		
	}
	
}

