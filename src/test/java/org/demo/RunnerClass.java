package org.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.train.ClassB;
import org.train.ClassC;
import org.train.Junitc;


@RunWith(Suite.class)
@SuiteClasses({Junitc.class, ClassB.class, ClassC.class})
public class RunnerClass {
	
	

}
