package reuseable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.base;

public class waits extends base {
	public static WebDriverWait wait;

	public static void excipicitlywait(WebElement  l) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(l));

		// ExpectedConditions.visibilityOfElementLocated

	}

}
