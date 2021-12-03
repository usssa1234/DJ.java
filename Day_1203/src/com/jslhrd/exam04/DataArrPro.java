package com.jslhrd.exam04;
interface DataArr extends Data{
	int getMaxArr(int[] var);
	int getMinArr(int[] var);
	default int getSumArr(int[] var) {
		getMax(var);
		getMin(var);
		
		return getSum(var);
		
		
	}
}
public class DataArrPro implements DataArr{
	@Override
	public int getMax(int... var) {
		
		return 0;
	}
	@Override
	public int getMaxArr(int[] var) {
		
		return 0;
	}
	@Override
	public int getMin(int... var) {
		
		return 0;
	}
	@Override
	public int getMinArr(int[] var) {
		
		return 0;
	}
	@Override
	public void sort(int[] var, boolean bool) {
		
		
	}
	@Override
	public int getSum(int... var) {
		int getSum=0;
		for(int x=0; x<var.length; x++) {
			getSum+=var[x];
		}
		
		
	
		return DataArr.super.getSum(var);
	}
	@Override
	public int getSumArr(int[] var) {
		
		return DataArr.super.getSumArr(var);
	}
	
}
