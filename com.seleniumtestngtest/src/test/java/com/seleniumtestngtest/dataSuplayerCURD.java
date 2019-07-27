package com.seleniumtestngtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dataSuplayerCURD {
	private WebDriver driver;

	public dataSuplayerCURD(WebDriver driver) {
		this.driver = driver;
	}

	public void dataSuplayer() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'Anda berhasil login')]")).getText()
				.contains("Anda berhasil login");

		driver.findElement(By.linkText("Data Supplier")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA SUPPLIER')]")).getText()
				.contains("MANAJEMEN DATA SUPPLIER");
		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA SUPPLIER')]")).getText()
				.contains("TAMBAH DATA SUPPLIER");
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).sendKeys("PT.DIKA");
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).sendKeys("Jl. Lintas Timur, Lampung Timur");
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).sendKeys("082278843303");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='PT.DIKA']")).getText().contains("PT.DIKA");
		assert driver.findElement(By.xpath("//td[text()='Jl. Lintas Timur, Lampung Timur']")).getText()
				.contains("Jl. Lintas Timur, Lampung Timur");

		driver.findElement(By.linkText("Edit")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'UBAH DATA SUPPLIER')]")).getText()
				.contains("UBAH DATA SUPPLIER");
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).clear();
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).sendKeys("PT.DIKAubah");
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).clear();
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).sendKeys("Jl. Lintas Timur, Lampung Timurubah");
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).clear();
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).sendKeys("082278843304");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='PT.DIKAubah']")).getText().contains("PT.DIKAubah");
		assert driver.findElement(By.xpath("//td[text()='Jl. Lintas Timur, Lampung Timurubah']")).getText()
				.contains("Jl. Lintas Timur, Lampung Timurubah");

		driver.findElement(By.linkText("Delete")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		driver.findElement(By.linkText("Delete")).click();
		Alert alerts = driver.switchTo().alert();
		alerts.accept();

	}
}
