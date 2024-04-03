import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.WaitUtils.waitUntilVisibilityOfElementLocatedBy;

public class hw20 extends BaseTest {

    @Test

    public void deletePlaylist() throws InterruptedException {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("dzmitry.kimber@testpro.io", "1qAY76Rs");
        WebElement Playlist =  getDriver().findElement(By.cssSelector("[class='playlist playlist']"));
        WebElement Delete = getDriver().findElement(By.cssSelector("[data-testid='playlist-context-menu-delete-86853']"));
        Delete.click();
        waitUntilVisibilityOfElementLocatedBy(getDriver(), By.cssSelector("[data-testid='playlist-context-menu-delete-86853']"));

        Assert.assertTrue(Delete.isDisplayed());
    }

}

