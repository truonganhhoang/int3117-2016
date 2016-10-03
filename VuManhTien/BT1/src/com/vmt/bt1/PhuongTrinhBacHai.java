package com.vmt.bt1;

public class PhuongTrinhBacHai {

	private double a, b, c;
	private double delta;
	private double x1, x2;
	
	public static enum State {
		HAI_NGHIEM, NGHIEM_KEP, MOT_NGHIEM, VO_NGHIEM, VO_SO_NGHIEM, NULL
	}
	
	private State state = State.NULL;
	
	public PhuongTrinhBacHai(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		if (a != 0) giaiPhuongTrinhBacHai();
		else if (a == 0) giaiPhuongTrinhBacMot();
	}
	
	private void giaiPhuongTrinhBacHai(){
		delta = b*b - 4*a*c;
		if (delta < 0) state = State.VO_NGHIEM;
		else if (delta > 0) {
			state = State.HAI_NGHIEM;
			x1 = (-b+Math.sqrt(delta))/(2*a);
			x2 = (-b-Math.sqrt(delta))/(2*a);
		} else if (delta == 0) {
			state = State.NGHIEM_KEP;
			x1 = x2 = (-b)/(2*a);
		}
		
//		System.out.print(state.toString());
//		if (state == State.CO_HAI_NGHIEM) System.out.println(" x1 = " + x1 + " ; x2 = " + x2);
//		else if (state == State.CO_NGHIEM_KEP) System.out.println(" x1 = x2 = " + x1);
	}
	
	private void giaiPhuongTrinhBacMot(){
		if (b == 0 && c == 0) state = State.VO_SO_NGHIEM;
		else if (b == 0 && c != 0) state = State.VO_NGHIEM;
		else if (b != 0) {
			state = State.MOT_NGHIEM;
			x1 = -c/b;
		}
	}
	
	public State getState() {
		return state;
	}
	
	public double getX1() {
		return x1;
	}
	
	public double getX2() {
		return x2;
	}
	
	public String getResult(){
		String result = state.toString();
		if (state == State.HAI_NGHIEM) result = result + " x1 = " + x1 + " ; x2 = " + x2;
		else if (state == State.NGHIEM_KEP) result = result + " x1 = x2 = " + x1;
		else if (state == State.MOT_NGHIEM) result = result + " x = " + x1;
		return result;
	}
}