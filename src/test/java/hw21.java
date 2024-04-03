import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Instant;

import static org.example.WaitUtils.waitUntilVisibilityOfElementLocatedBy;
import static org.openqa.selenium.By.*;
public class hw21 extends BaseTest {
    String currentPlayListName = "hw17";
    String newPlayListName = "hw21";
@Test
public void renamePlaylist() throws InterruptedException {


    LoginPage loginPage = new LoginPage(getDriver());
    loginPage.login("dzmitry.kimber@testpro.io", "1qAY76Rs");

   WebElement PlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='active']")));

  actions.doubleClick(PlayList);
  actions.perform();

   renamePlaylist(currentPlayListName,newPlayListName);

}

    private void renamePlaylist(String currentPlayListName, String newPlayListName) {

        Assert.assertNotSame(currentPlayListName,newPlayListName);
    }
}
