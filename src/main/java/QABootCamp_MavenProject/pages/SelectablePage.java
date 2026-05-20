package QABootCamp_MavenProject.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SelectablePage {
    private WebDriver driver;
    private WebDriverWait wait;

    // --- Locators ---
    // Tabs
    private By listTab = By.id("demo-tab-list");
    private By gridTab = By.id("demo-tab-grid");

    // List Elements (using explicit text matching)
    private By listItemDapibus = By.xpath("//ul[@id='verticalListContainer']/li[text()='Dapibus ac facilisis in']");

    // Grid Elements
    private By gridItemThree = By.xpath("//div[@id='gridContainer']//li[text()='Three']");

    // --- Constructor ---
    public SelectablePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // --- Actions ---
    public void clickGridTab() {
        wait.until(ExpectedConditions.elementToBeClickable(gridTab)).click();
    }

    public void clickListTab() {
        wait.until(ExpectedConditions.elementToBeClickable(listTab)).click();
    }

    public void selectListItemDapibus() {
        wait.until(ExpectedConditions.elementToBeClickable(listItemDapibus)).click();
    }

    public void selectGridItemThree() {
        wait.until(ExpectedConditions.elementToBeClickable(gridItemThree)).click();
    }

    // --- Verifications (CSS Class Validation) ---
    public boolean isListItemDapibusActive() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(listItemDapibus));
        return element.getAttribute("class").contains("active");
    }

    public boolean isGridItemThreeActive() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(gridItemThree));
        return element.getAttribute("class").contains("active");
    }
}

