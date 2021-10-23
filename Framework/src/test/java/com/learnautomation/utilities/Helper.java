package com.learnautomation.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	// screenshort,alerts,frames,windows,sync issues,javascript executer
	public static void captureScreenshort(WebDriver driver) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./Screenshorts/" + getCurrentDateTime() + ".png"));
			System.out.println("screenshort captured");
		} catch (IOException e) {
			System.out.println("Unable to capture screenshort" + e.getMessage());
		}
	}

	public static String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM=dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return customFormat.format(currentdate);
	}
}
