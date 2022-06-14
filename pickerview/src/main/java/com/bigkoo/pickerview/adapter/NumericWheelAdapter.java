package com.bigkoo.pickerview.adapter;


import com.contrarywind.adapter.WheelAdapter;

/**
 * Numeric Wheel adapter.
 */
public class NumericWheelAdapter implements WheelAdapter<Integer> {
	
	private final int minValue;
	private final int maxValue;

	/**
	 * Constructor
	 * @param minValue the wheel min value
	 * @param maxValue the wheel max value
	 */
	public NumericWheelAdapter(int minValue, int maxValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	@Override
	public Integer getItem(int index) {
		if (index >= 0 && index < getItemsCount()) {
			return minValue + index;
		}
		return 0;
	}

	@Override
	public int getItemsCount() {
		return maxValue - minValue + 1;
	}
	
	@Override
	public int indexOf(Integer o){
		try {
			return o - minValue;
		} catch (Exception e) {
			return -1;
		}

	}
}
