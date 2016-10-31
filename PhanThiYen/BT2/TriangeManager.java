package main;

import java.util.ArrayList;
import java.util.List;

public class TriangeManager {
	private List<Triange> trianges;
	
	public TriangeManager() {
		trianges = new ArrayList<Triange>();
	}
	
	public TriangeManager(List<Triange> trianges) {
		if (testTriangManager(trianges)) {
			this.trianges = trianges;
		} else {
			this.trianges = new ArrayList<Triange>();
		}
		
	}

	public boolean testTriangManager(List<Triange> trianges){
		if(trianges == null){
			return false;
		}else{
			return true;
		}
	}

	public boolean initTriange(int count){
		if(count <= 0){
			return false;
		}else{
			int i = 0;
			while(i<count){
				System.out.println("Triange " + (i+1) + "....");
				Triange triange = new Triange(true);
				trianges.add(triange);
				i++;
			}
			return true;
		}
	}
	
	

}
