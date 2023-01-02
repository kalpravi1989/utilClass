package util;

import java.time.Duration;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class UtilsClass extends BaseClass {

	public void type(WebElement ele, String data) {
		try {
			waitForclickability(ele);
			ele.clear();
			ele.sendKeys(data);
		} catch (InvalidElementStateException e) {
			e.printStackTrace();
		} catch (WebDriverException e) {
			e.printStackTrace();

		}
	}

	public void click(WebElement ele) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));

			ele.click();

		} catch (InvalidElementStateException e) {
			e.printStackTrace();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	public void submit(WebElement ele) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));

			ele.submit();

		} catch (InvalidElementStateException e) {
			e.printStackTrace();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	public void clickAction(WebElement ele) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			Actions action = new Actions(driver);
			action.click().build().perform();

		} catch (InvalidElementStateException e) {
			e.printStackTrace();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}
	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		try {
			new Select(ele).selectByVisibleText(value);
		
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			new Select(ele).selectByIndex(index);
			;

		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		try {
			new Select(ele).selectByValue(value);

		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}
	public void deSelectDropDownUsingVisibleText(WebElement ele, String value) {
		try {
			new Select(ele).deselectByVisibleText(value);

		} catch (WebDriverException e) {
			e.printStackTrace();
		}

	}

	public void verifySelected(WebElement ele) {
		try {
			if (ele.isSelected()) {

			} else {

			}
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	public void waitForclickability(WebElement ele) {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ele));
	}
}
