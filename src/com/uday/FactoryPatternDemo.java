package com.uday;

import com.uday.model.Car;

public class FactoryPatternDemo { 
    public static void main(String[] args)
    { 
    	Car c1=null;
    	String carName=null;
    	
    	carName="Audi";
    	c1=CarFactory.getCar(carName);
    	c1.carName();
    	
    	carName="Benz";
    	c1=CarFactory.getCar(carName);
    	c1.carName();
    	
    	carName="BMW";
    	c1=CarFactory.getCar(carName);
    	c1.carName();
    	
    } 
} 