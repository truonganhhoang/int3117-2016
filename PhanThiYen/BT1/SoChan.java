package com.uet.int3117;

public class SoChan {
	public String soChan(int[] values) {

		String result = "";
		if (values == null) {
			return "null";
		}

		if (values.length == 0) {
			return "-1";
		} else {
			for (int i = 0; i < values.length; i++) {
				if (values[i] % 2 == 0)
					result += values[i] + " ";
			}
		}

		return result;

	}

}
