package com.seleniumtestngtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class dataBarangCURD {
	private WebDriver driver;

	public dataBarangCURD(WebDriver driver) {
		this.driver = driver;
	}

	public void dataBarang() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'Anda berhasil login')]")).getText()
				.contains("Anda berhasil login");
		// Kategori
		driver.findElement(By.linkText("Data Kategori")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA KATEGORI')]")).getText()
				.contains("MANAJEMEN DATA KATEGORI");
		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA KATEGORI')]")).getText()
				.contains("TAMBAH DATA KATEGORI");
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='Kamera']")).getText().contains("Kamera");

		// Barang
		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Cannon");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("50000");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("55000");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("20");
		Select satuan = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("Keterangan");
		Select kategori = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='Cannon']")).getText().contains("Cannon");
		assert driver.findElement(By.xpath("//td[text()='20']")).getText().contains("20");
		assert driver.findElement(By.xpath("//td[text()='50.000']")).getText().contains("50.000");
		assert driver.findElement(By.xpath("//td[text()='55.000']")).getText().contains("55.000");

		driver.findElement(By.linkText("Edit")).click();
		assert driver.findElement(By.xpath("//th[text()='UBAH DATA BARANG']")).getText().contains("UBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Cannon KW");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("50000");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("55000");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("20");
		Select satuanubah = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuanubah.selectByVisibleText("Botol");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("Keterangan");
		Select kategoriubah = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategoriubah.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='Cannon KW']")).getText().contains("Cannon KW");
		assert driver.findElement(By.xpath("//td[text()='20']")).getText().contains("20");
		assert driver.findElement(By.xpath("//td[text()='50.000']")).getText().contains("50.000");
		assert driver.findElement(By.xpath("//td[text()='55.000']")).getText().contains("55.000");

		driver.findElement(By.linkText("Delete")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		driver.findElement(By.linkText("Delete")).click();
		Alert alerts = driver.switchTo().alert();
		alerts.accept();

		// Kategori
		driver.findElement(By.linkText("Data Kategori")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA KATEGORI')]")).getText()
				.contains("MANAJEMEN DATA KATEGORI");
		driver.findElement(By.linkText("Delete")).click();
		Alert alertss = driver.switchTo().alert();
		alertss.accept();

	}
}
