package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    @FindBy(xpath = "//p[text()='Gifting']") private WebElement Gifting;
    @FindBy(xpath="//p[text()='Earrings']") private WebElement Earrings;
    @FindBy(xpath="//p[text()='Nose pins']") private WebElement Nosepins;
    @FindBy(xpath="//p[text()='Rings']") private WebElement Rings;
    @FindBy(xpath = "//p[text()='Pendants']") private WebElement Pendants;
    @FindBy(xpath = "//p[text()='Divine Amulets']") private WebElement DivineAmulets;
    @FindBy(xpath = "(//p[normalize-space()='925 Silver'])[1]") private WebElement Silver;
    @FindBy(xpath="//a[text()='Budget Friendly Finds']") private WebElement Budget;
    @FindBy(xpath="//a[text()='925 Silver']") private WebElement Silver925;
    @FindBy(xpath ="//a[text()='Under Rs 10,000']") private WebElement Under10000;
    @FindBy(xpath="//a[text()='Under Rs 20,000']") private WebElement Under20000;
    
    private WebDriver driver;
    private Actions actions;
    
    // Initialization 
    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    // Utilization
    public WebElement getGifting() {
        return Gifting;
    }

    public WebElement getEarrings() {
        return Earrings;
    }

    public WebElement getNosepins() {
        return Nosepins;
    }

    public WebElement getRings() {
        return Rings;
    }

    public WebElement getPendants() {
        return Pendants;
    }

    public WebElement getDivineAmulets() {
        return DivineAmulets;
    }

    public WebElement getSilver() {
        return Silver;
    }
    
    public WebElement getSilver925() {
        return Silver925;
    }
    
    public WebElement getBudget() {
        return Budget;
    }

    public WebElement getUnder10000() {
        return Under10000;
    }

    public WebElement getUnder20000() {
        return Under20000;
    }

    // Operational - Mouse Over Actions
    public void mouseOver_Gifting() {
        actions.moveToElement(Gifting).perform();
    }

    public void mouseOver_Earrings() {
        actions.moveToElement(Earrings).perform();
    }

    public void mouseOver_Nosepins() {
        actions.moveToElement(Nosepins).perform();
    }

    public void mouseOver_Rings() {
        actions.moveToElement(Rings).perform();
    }

    public void mouseOver_Pendants() {
        actions.moveToElement(Pendants).perform();
    }

    public void mouseOver_DivineAmulets() {
        actions.moveToElement(DivineAmulets).perform();
    }

    public void mouseOver_Silver() {
        actions.moveToElement(Silver).perform();
    }

    public void click_Budget(String expectedText) {
        String actualText = Budget.getText();
        System.out.println("Clicked text: " + actualText);
        actions.doubleClick(Budget).perform();
        System.out.println("Text comparison: " + actualText.equals(expectedText));
    }

    public void click_Silver925(String expectedText) {
        String actualText = Silver925.getText();
        System.out.println("Clicked text: " + actualText);
        actions.doubleClick(Silver925).perform();
        System.out.println("Text comparison: " + actualText.equals(expectedText));
    }

    public void click_Under10000(String expectedText) {
        String actualText = Under10000.getText();
        System.out.println("Clicked text: " + actualText);
        actions.doubleClick(Under10000).perform();
        System.out.println("Text comparison: " + actualText.equals(expectedText));
    }

    public void click_Under20000(String expectedText) {
        String actualText = Under20000.getText();
        System.out.println("Clicked text: " + actualText);
        actions.doubleClick(Under20000).perform();
        System.out.println("Text comparison: " + actualText.equals(expectedText));
    }
}



    

    
    
    
    
   // public void checkSilverDropdownValues() throws InterruptedException {
    //	mouseOver_Silver();	
    //	Thread.sleep(1000);
      //  List<WebElement> silverSuggestions = driver.findElements(By.xpath("//p[@class='font-medium text-xs text-grey-700 pb-7']"));
       // Thread.sleep(2000); // Adding sleep to allow dropdown to fully render

       // for (WebElement silver : silverSuggestions) {
         //   Thread.sleep(2000);
           // System.out.println(silver.getText());
        //}
    

