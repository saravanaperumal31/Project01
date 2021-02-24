package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public  WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\TestNG\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}
	public  WebDriver browserChromeLaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\TestNG\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}
	public  WebDriver browserFirefoxLaunch() {
		System.setProperty("webdriver.gecko.driver","D:\\New folder\\TestNG\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		return driver;
	}
	public WebDriver browserEdge() {
	System.setProperty("webdriver.edge.driver","D:\\New folder\\TestNG\\Drivers\\IEDriverServer.exe");
	driver=new EdgeDriver();
	return driver;
	}
	
	public WebDriver browserManager() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		return driver;
	}
	public  void urlLaunch(String url) {
		driver.get(url);
	}
	public  String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public  String urlTitle() {
		String title = driver.getTitle();
		return title;
	}
	public  void windowMaximize() {
		driver.manage().window().maximize();
	}
	public  void closeWindow() {
		driver.close();
	}
	public  void quitwindow() {
		driver.quit();
	}
	public  void filltext(WebElement e, String value) {
		e.sendKeys(value);
	}
	public  void buttonClick(WebElement e) {
		e.click();
	}
	public  String getAttribute(WebElement e) {
		String atvalue = e.getAttribute("value");
		return atvalue;
	}
	public  String getText(WebElement e) {
		String attext = e.getText();
		return attext;
	}
	public  void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	public  void dragAndDrop(WebElement src, WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des);
	}
	public  void rightClick(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
	}
	public  void doubleClick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
	}
	public  void clickAndHoldRelease(WebElement e,WebElement e1) {
		Actions a=new Actions(driver);
		a.clickAndHold(e).release(e1);
	}
	public  String simpleAlert() {
		Alert sa = driver.switchTo().alert();
		String text = sa.getText();
		System.out.println(text);
		sa.accept();
		return text;
	}
	
	public  String confirmAlert() {
		Alert ca = driver.switchTo().alert();
		String text = ca.getText();
		System.out.println(text);
		ca.accept();
		return text;
	}
	public  String promptAlert() {
		Alert pa = driver.switchTo().alert();
		String text = pa.getText();
		pa.accept();
		return text;
	}
	public  void swFrameBynameid(String i) {
		driver.switchTo().frame(i);
	}
	
	public  void swFrameByInd(int i) {
		driver.switchTo().frame(i);
	}
	public  void swFrameByWbEmnt(WebElement i) {
		driver.switchTo().frame(i);
	}
	public  void swToMainFrameWindow() {
		driver.switchTo().defaultContent();
	}
	public  void swToParentWindow() {
		driver.switchTo().parentFrame();
	}
	public  int framesCount(String name) {
		List<WebElement> frames = driver.findElements(By.tagName(name));
		int size = frames.size();
		System.out.println(size);
		return size;
	}
	public  void switchToFrames(String path) {
		driver.findElement(By.xpath(path));
	}
	public  void jsExecutorSetAttribute(String s, WebElement e) {
	JavascriptExecutor a= (JavascriptExecutor)driver;
	a.executeScript(s,e);
	}
	public  String jsExecutorGetAttribute(String s, WebElement e) {
		JavascriptExecutor a= (JavascriptExecutor)driver;
		Object obj = a.executeScript(s,e);
		String user=(String)obj;
		return user;
		}
	public  void jsExecutorClick(String s, WebElement e) {
		JavascriptExecutor a= (JavascriptExecutor)driver;
		a.executeScript(s,e);
	}
	public  void jsExecutorScldownup(String s, WebElement e) {
		JavascriptExecutor a= (JavascriptExecutor)driver;
		a.executeScript(s,e);
	}
	public  void selectByIndex(WebElement e, int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	public  void selectByVisibleText(WebElement e, String a) {
		Select s= new Select(e);
		s.selectByVisibleText(a);
	}
	public  void selectByValue(WebElement e, String value) {
		Select s=new Select(e);
		s.selectByValue(value);
	}
	public  String getFirstSelected(WebElement e) {
		Select s=new Select(e);
		WebElement firstSelect = s.getFirstSelectedOption();
		String text = firstSelect.getText();
		return text;
	}
	public  void deselectindex(WebElement e, int index) {
		Select s= new Select(e);
		s.deselectByIndex(index);
	}
	
	public  void deselectvalue(WebElement e, String value) {
		Select s= new Select(e);
		s.deselectByValue(value);
	}
	public  void deselectVisibleTxt(WebElement e, String text) {
		Select s= new Select(e);
		s.deselectByVisibleText(text);
	}
	public  void deSelectAll(WebElement e) {
		Select s= new Select(e);
		s.deselectAll();
	}
	public  File screenShot() {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		return src;
	}
	public  void navigateTo(String s) {
		driver.navigate().to(s);
	}
	public  void navigateBack() {
		driver.navigate().back();
	}
	public  void navigateForward() {
		driver.navigate().forward();
	}
	public  void navigateRefresh() {
		driver.navigate().refresh();
	}
	public  void implicitWait(int s) {
		driver.manage().timeouts().implicitlyWait(s,TimeUnit.SECONDS);
	}
	
	public  String currentWindowId() {
		String currentWindow= driver.getWindowHandle();
		return currentWindow;
	}
	
	public  void scrolldown(WebElement e){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",e);
	}
	public   Set<String> allWindowId() {
	Set<String> allWindowId = driver.getWindowHandles();
	return allWindowId;
	}
	public  void switchToWindowId() {
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for (String eachid : allIds) {
			if(!parentId.equals(eachid)) {
				driver.switchTo().window(eachid);
				
			}
			
		}}
	
	public  String getExcelData(String sheetname,int rowno,int cellno) throws IOException {
		File path= new File("D:\\New folder\\JUnit\\src\\test\\resources\\Excel\\Details.xlsx");
		
		FileInputStream ip= new FileInputStream(path);
		
		Workbook w=new XSSFWorkbook(ip);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
				
		int cellType = cell.getCellType();
		
		String value=null;{
		if(cellType==1)
		{
		value = cell.getStringCellValue();
		}
		else
		{
			if(DateUtil.isCellDateFormatted(cell))
			{
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat s= new SimpleDateFormat("dd-MM-yyyy");
				value = s.format(dateCellValue);
			}
			else {
				double db = cell.getNumericCellValue();
				long lg=(long)db;
				value = String.valueOf(lg);
				
			}
		}
		return value;	
	}
	}
	public  void main(String[] args) throws IOException {
		String excelData = getExcelData("UserPass",1,0);
		System.out.println(excelData);
	
}	
	
	public  void excelWrite(String loc,String sheetname,int rownum ,int cellnum,String data) throws Exception{

		File f = new File(loc);
		Workbook w= new XSSFWorkbook();
		Sheet Sheet = w.createSheet(sheetname);
		Row row = Sheet.createRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream os=new FileOutputStream(f);
		w.write(os);
	}
	
	public  void excelUpdate(String loc,String sheetname,String data, int rownum,int cellnum) throws Exception {
		File f=new File(loc);
		FileInputStream is=new FileInputStream(f);
		Workbook w= new XSSFWorkbook(is);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.createRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream os=new FileOutputStream(f);
		w.write(os);
		
	}
}
