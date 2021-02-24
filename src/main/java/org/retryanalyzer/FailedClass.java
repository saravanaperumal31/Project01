package org.retryanalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedClass implements IAnnotationTransformer{

	public void transform(ITestAnnotation a, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer retryAnalyzer = a.getRetryAnalyzer();
		if(retryAnalyzer==null) {
			a.setRetryAnalyzer(Failclass.class);
		}
	}

}
