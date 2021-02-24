package org.retryanalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Student1 {
@Test()
private void tc01() {
System.out.println("method 1");
}
@Test(retryAnalyzer=Failclass.class)
private void tc02() {
System.out.println("method 2");
Assert.assertTrue(false);
}
@Test()
private void tc03() {
System.out.println("method 3");
}
@Test()
private void tc04() {
System.out.println("method 4");
}
}
