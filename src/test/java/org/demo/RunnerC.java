package org.demo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.train.ClassB;
import org.train.ClassC;
import org.train.Junitc;

public class RunnerC {

	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(Junitc.class, ClassB.class, ClassC.class);
		
		System.out.println("Result for the execution");
		System.out.println("Runcount of testcases :" +r.getRunCount());
		System.out.println("Runtime of the Testcases :"+ r.getRunTime());
		System.out.println("Failure count of the Testcases :" +r.getFailureCount());
		System.out.println("Ignore count of the testcases :" +r.getIgnoreCount());
		System.out.println("Success count of Testcases :" +(r.getRunCount()-r.getFailureCount()));
		
		

	}
	
	private void test() {
		// TODO Auto-generated method stub
		
		System.out.println("Testing");

	}

}
