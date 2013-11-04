package tests;

import elements.Car;
import visitors.CarElementBreakInvariantVisistor;
import visitors.CarElementCheckInvariantVisitor;
import visitors.CarElementPrintVisitor;

public class Visitor_Test {
	
     public static void main(String[] args){
       Car car = new Car();
      car.accept(new CarElementPrintVisitor());
      car.accept(new CarElementCheckInvariantVisitor());
      
      //Break 
      car.accept(new CarElementBreakInvariantVisistor());
      car.accept(new CarElementCheckInvariantVisitor());
    }
}

