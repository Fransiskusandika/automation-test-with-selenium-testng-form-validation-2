package kasir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidasiFormDataBarang {
	private WebDriver driver;

	public ValidasiFormDataBarang(WebDriver driver) {
		this.driver = driver;
	}

	public void formDataBarang() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'Anda berhasil login')]")).getText()
				.contains("Anda berhasil login");

		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan.selectByVisibleText("....");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("");
		Select kategori = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori.selectByVisibleText("....");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Barang tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Satuan belum ada yang dipilih !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Keterangan tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Kategori Barang belum ada yang dipilih !");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan1 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan1.selectByVisibleText("....");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("");
		Select kategori1 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori1.selectByVisibleText("....");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Satuan belum ada yang dipilih !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Keterangan tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Kategori Barang belum ada yang dipilih !");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan2 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan2.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("");
		Select kategori2 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori2.selectByVisibleText("....");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Barang tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Keterangan tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Kategori Barang belum ada yang dipilih !");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan3 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan3.selectByVisibleText("....");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("validasiform");
		Select kategori3 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori3.selectByVisibleText("....");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Barang tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Satuan belum ada yang dipilih !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Kategori Barang belum ada yang dipilih !");

		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan4 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan4.selectByVisibleText("....");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("");
		Select kategori4 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori4.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Barang tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Satuan belum ada yang dipilih !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Keterangan tidak boleh kosong !");

		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan5 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan5.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("");
		Select kategori5 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori5.selectByVisibleText("....");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Keterangan tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Kategori Barang belum ada yang dipilih !");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan6 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan6.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("validasiform");
		Select kategori6 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori6.selectByVisibleText("....");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Barang tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Kategori Barang belum ada yang dipilih !");

		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan7 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan7.selectByVisibleText("....");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("validasiform");
		Select kategori7 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori7.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Barang tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Satuan belum ada yang dipilih !");

		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan8 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan8.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("validasiform");
		Select kategori8 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori8.selectByVisibleText("....");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Kategori Barang belum ada yang dipilih !");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan9 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan9.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("validasiform");
		Select kategori9 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori9.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Barang tidak boleh kosong !");

		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan10 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan10.selectByVisibleText("....");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("validasiform");
		Select kategori10 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori10.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Satuan belum ada yang dipilih !");

		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan11 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan11.selectByVisibleText("....");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("validasiform");
		Select kategori11 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori11.selectByVisibleText("....");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Satuan belum ada yang dipilih !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Kategori Barang belum ada yang dipilih !");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan12 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan12.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("validasiform");
		Select kategori12 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori12.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Barang tidak boleh kosong !");

		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("");
		Select satuan13 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan13.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("");
		Select kategori13 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori13.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Barang tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Keterangan tidak boleh kosong !");

		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Mouse");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("huruf");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("huruf");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("huruf");
		Select satuan14 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan14.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("huruf");
		Select kategori14 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori14.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Harga Beli (Rp.) harus diisi angka!");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Harga Jual (Rp.) harus diisi angka!");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Stok barang harus diisi angka !");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Mouse");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("15000");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("huruf");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("huruf");
		Select satuan15 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan15.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("huruf");
		Select kategori15 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori15.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Harga Jual (Rp.) harus diisi angka!");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Stok barang harus diisi angka !");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Mouse");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("huruf");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("20000");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("huruf");
		Select satuan16 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan16.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("huruf");
		Select kategori16 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori16.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Harga Beli (Rp.) harus diisi angka!");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Stok barang harus diisi angka !");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Mouse");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("huruf");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("huruf");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("20");
		Select satuan17 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan17.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("huruf");
		Select kategori17 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori17.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Harga Beli (Rp.) harus diisi angka!");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Harga Jual (Rp.) harus diisi angka!");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Mouse");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("15000");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("20000");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("huruf");
		Select satuan18 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan18.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("huruf");
		Select kategori18 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori18.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Stok barang harus diisi angka !");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Mouse");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("15000");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("huruf");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("20");
		Select satuan19 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan19.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("huruf");
		Select kategori19 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori19.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Harga Jual (Rp.) harus diisi angka!");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Mouse");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("huruf");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("20000");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("20");
		Select satuan20 = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan20.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("huruf");
		Select kategori20 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori20.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Harga Beli (Rp.) harus diisi angka!");
	}
}
