package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import util.UtilsClass;

public class TC_001 extends UtilsClass {
	@Test
	public void test() {
		WebElement ele = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		selectDropDownUsingVisibleText(ele, "SQL");
		WebElement radio = driver.findElement(By.xpath("//form[@id='radio-buttons']/input[@value='blue']"));
		click(radio);
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
		click(checkbox1);
		WebElement radiodisable = driver
				.findElement(By.xpath("//form[@id='radio-buttons-selected-disabled']/input[@value='cabbage']"));
		System.out.println(radiodisable.getAccessibleName());
	}

}
