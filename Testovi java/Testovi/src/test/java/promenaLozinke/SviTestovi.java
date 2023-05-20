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
public class SviTestovi {
     @Test
    public void promenaLozinkeTP1(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "menjase";
        String staraLozinka = "Mihailo.123";
        String novaLozinka = "Mihailo.1234";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        String kraj = driver.findElement(By.xpath("//*[@id=\"regstudent1\"]")).getText();//umesto ' treba " ali ne znam kako da to napisem da uhvati
        Assert.assertTrue(kraj.contains("Uspesno ste promenili sifru!"));
        driver.quit();
    
    
    }
   
     @Test
    public void tp02_losKorisnik(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "proba";
        String staraLozinka = "Mihailo.123";
        String novaLozinka = "Mihailo.1234";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        String kraj = driver.findElement(By.xpath("//*[@id=\"regstudent1\"]")).getText();//umesto ' treba " ali ne znam kako da to napisem da uhvati
        Assert.assertTrue(kraj.contains("Pogresno korisnicko ime ili sifra"));
        driver.quit();
    }   
    
    
     @Test
    public void tp03_uzastopniKarakteri(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "menjase";
        String staraLozinka = "Mihailo.1234";
        String novaLozinka = "Mihhhhh.1234";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        String kraj = driver.findElement(By.xpath("//*[@id=\"regstudent1\"]")).getText();//umesto ' treba " ali ne znam kako da to napisem da uhvati
        Assert.assertTrue(kraj.contains("Pogresno korisnicko ime ili sifra"));
        driver.quit();
    } 
    
    
    
    @Test
    public void tp04_novaKaoStara(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "mih2";
        String staraLozinka = "Mihailo.123";
        String novaLozinka = "Mihailo.123";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        String kraj = driver.findElement(By.xpath("//*[@id=\"regstudent1\"]")).getText();
        Assert.assertTrue(kraj.contains("Pogresno korisnicko ime ili sifra"));
        driver.quit();
    }



        @Test
        public void tp05_pogresnaStara(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "mih2";
        String staraLozinka = "Mihailo.12345";
        String novaLozinka = "Mihailo.1234";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        String kraj = driver.findElement(By.xpath("//*[@id=\"regstudent1\"]")).getText();//umesto ' treba " ali ne znam kako da to napisem da uhvati
        Assert.assertTrue(kraj.contains("Pogresno korisnicko ime ili sifra"));
        driver.quit();
    
    
    }
        
        
        @Test
    public void tp06_manjeOd8Kar(){
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
    
    
    
    @Test
    public void tp07_viseOd12Kar(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "menjase";
        String staraLozinka = "Mihhhhh.1234";
        String novaLozinka = "Mihailo.123456";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        
        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();
        driver.switchTo().alert().accept();
        Assert.assertTrue(msg.contains("Sifra mora imati od 8 do 12 karaktera!"));
        driver.quit();
    } 


    @Test
    public void tp08_svaMala(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "mih2";
        String staraLozinka = "Mihailo.123";
        String novaLozinka = "mihailo.123";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        
        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();
        driver.switchTo().alert().accept();
        Assert.assertTrue(msg.contains("Sifra mora imati bar jedno veliko slovo!"));
        driver.quit();
    } 

    @Test
    public void tp09_manjeOd3MalaSlova(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "menjase";
        String staraLozinka = "Mihailo.123456";
        String novaLozinka = "Mi.1234567";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        
        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();
        driver.switchTo().alert().accept();
        Assert.assertTrue(msg.contains("Sifra mora imati bar tri mala slova!"));
        driver.quit();
    } 

    
    @Test
    public void tp10_nemaNumerika(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "mih2";
        String staraLozinka = "Mihailo.123";
        String novaLozinka = "Mihailo.mih";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        
        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();
        driver.switchTo().alert().accept();
        Assert.assertTrue(msg.contains("Sifra mora imati bar jedan broj!"));
        driver.quit();
    }
    
    
    
        @Test
    public void tp11_prviKarNijeSlovo(){
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
    
    
         @Test
    public void tp12_nemaSpecKar(){
        //isto u svakom
        String exePath = "C:\\Users\\korisnik\\Desktop\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //parametri koji se menjaju
        String korisnickoIme = "mih2";
        String staraLozinka = "Mihailo.123";
        String novaLozinka = "Mihailo123";
        
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[1]")).sendKeys(korisnickoIme);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[2]")).sendKeys(staraLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/input[3]")).sendKeys(novaLozinka);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/center/input")).click();
        
        
        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();
        driver.switchTo().alert().accept();
        Assert.assertTrue(msg.contains("Sifra mora imati bar jedan specijalan karakter!"));
        driver.quit();
    } 
}
