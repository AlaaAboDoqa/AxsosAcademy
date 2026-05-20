package QABootCamp_MavenProject.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import QABootCamp_MavenProject.pages.SelectablePage;

public class SelectableItemsTest   {
    private WebDriver driver;
    private SelectablePage selectablePage;
    private final String URL = "https://demoqa.com/selectable";

    @BeforeMethod
    public void setUp() {
        // Automatically manages driver binary if using Selenium 4.x+
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get(URL);
        
        // Initialize Page Object
        selectablePage = new SelectablePage(driver);
    }

    @Test
    public void testSelectableListAndGrid() throws InterruptedException {
        //  Select from List 
        // Step 2: List tab is active by default. We verify the specific item choice next.
        // Step 3: Select the item "Dapibus ac facilisis in"
        selectablePage.selectListItemDapibus();
        Thread.sleep(2000);

        // Step 4: Assert that this item becomes active via CSS class
        Assert.assertTrue(selectablePage.isListItemDapibusActive(), 
                "The list item 'Dapibus ac facilisis in' did not become active!");

        //Select from Grid 
        // Step 1: Click the "Grid" tab
        selectablePage.clickGridTab();

        Thread.sleep(2000);
        // Step 2: Select the item "Three"
        selectablePage.selectGridItemThree();
        Thread.sleep(2000);

        // Step 3: Assert that this item becomes active via CSS class
        Assert.assertTrue(selectablePage.isGridItemThreeActive(), 
                "The grid item 'Three' did not become active!");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
