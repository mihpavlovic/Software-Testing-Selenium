/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promenaLozinke;

import static com.mycompany.testovi.Testovi.baseUrl;
import static com.mycompany.testovi.Testovi.driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author korisnik
 */
public class TP11_PromenaLozinke_PrviKarNijeSlovo {
    @Test
    public void tp11(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "menjase";
        String staraLozinka = "Mi.1234567";
        String novaLozinka = "1Ihailo.123";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        
        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();
        driver.switchTo().alert().accept();
        Assert.assertTrue(msg.contains("Sifra mora poceti slovom!"));
        driver.quit();
    }     
}
