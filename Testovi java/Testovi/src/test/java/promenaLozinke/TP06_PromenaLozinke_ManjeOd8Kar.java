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
public class TP06_PromenaLozinke_ManjeOd8Kar {
       @Test
    public void tp06(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "mih2";
        String staraLozinka = "Mihailo.123";
        String novaLozinka = "Mih.1";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        
        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();
        driver.switchTo().alert().accept();
        //String kraj = driver.findElement(By.xpath("//*[@id=\"regstudent1\"]")).getText();//umesto ' treba " ali ne znam kako da to napisem da uhvati
        //Assert.assertTrue(kraj.contains("Uspesno ste promenili sifru!"));
        Assert.assertTrue(msg.contains("Sifra mora imati od 8 do 12 karaktera!"));
        driver.quit();
    } 
}
