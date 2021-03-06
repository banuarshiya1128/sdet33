package com.crm.genericUtility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListenerImplementation implements IAnnotationTransformer { //convert retrylistener into listener

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(com.crm.genericUtility.RetryImplementation.class);
	}

}
