package Testpackage;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Genericresuable.Flib;
import pagePackage.Homepage;

public class Shonek_homescreen extends Flib {
    
    public static void main(String[] args) throws InterruptedException {
        
        Flib flib = new Flib();
        flib.tearup();
        Homepage hp = new Homepage(driver);
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        
        wait.until(ExpectedConditions.visibilityOf(hp.getGifting()));
        hp.mouseOver_Gifting();
        
        wait.until(ExpectedConditions.visibilityOf(hp.getEarrings()));
        hp.mouseOver_Earrings();
        
        wait.until(ExpectedConditions.visibilityOf(hp.getNosepins()));
        hp.mouseOver_Nosepins();
        
        wait.until(ExpectedConditions.visibilityOf(hp.getRings()));
        hp.mouseOver_Rings();
        
        wait.until(ExpectedConditions.visibilityOf(hp.getPendants()));
        hp.mouseOver_Pendants();
        
        wait.until(ExpectedConditions.visibilityOf(hp.getDivineAmulets()));
        hp.mouseOver_DivineAmulets();
        
        Thread.sleep(1000);
        
        wait.until(ExpectedConditions.visibilityOf(hp.getSilver()));
        hp.mouseOver_Silver();
        
        wait.until(ExpectedConditions.elementToBeClickable(hp.getSilver925()));
        hp.click_Silver925("925 Silver");
        Thread.sleep(1000);
        driver.navigate().back();
        
        wait.until(ExpectedConditions.visibilityOf(hp.getSilver()));
        hp.mouseOver_Silver();
        
        wait.until(ExpectedConditions.elementToBeClickable(hp.getBudget()));
        hp.click_Budget("Budget Friendly Finds");
        Thread.sleep(1000);
        driver.navigate().back();
        
        Thread.sleep(1000);
        
        wait.until(ExpectedConditions.visibilityOf(hp.getSilver()));
        hp.mouseOver_Silver();
        
        wait.until(ExpectedConditions.elementToBeClickable(hp.getUnder10000()));
        hp.click_Under10000("Under Rs 10,000");
        driver.navigate().back();
        
        wait.until(ExpectedConditions.visibilityOf(hp.getSilver()));
        hp.mouseOver_Silver();
        
        wait.until(ExpectedConditions.elementToBeClickable(hp.getUnder20000()));
        hp.click_Under20000("Under Rs 20,000");
        driver.navigate().back();
        
        driver.quit();
    }
}
