package com.uday;

import com.uday.model.Audi;
import com.uday.model.BMW;
import com.uday.model.Benz;
import com.uday.model.Car;

public class CarFactory {
	public static Car getCar(String name) {
		if (name == null) {
			return null;
		}else if(name.equals("Audi")) {
			return new Audi();
		}else if(name.equals("Benz")) {
			return new Benz();
		}else if(name.equals("BMW")) {
			return new BMW();
		}
		return null;
		
	}

}
