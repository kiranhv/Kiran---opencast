package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Page {

    private WebDriver driver = Driver.getDriver();
    
    private static String  signinmenu_css = "#header-content > div:nth-child(2) > nav > div.ssrcss-1ocoo3l-Wrap.e42f8511 > div > div.ssrcss-zfamng-GlobalNavigationSide.eki2hvo16 > ul.ssrcss-vp47zn-GlobalNavigationLinkList-En.e1b8fg8n0 > li.ssrcss-d5c0hm-GlobalNavigationProduct-GlobalNavigationNonProductItem-GlobalNavigationAccount.eki2hvo12 > a > span.ssrcss-qgttmg-AccountText.eki2hvo4";
    private static String  username_id = "user-identifier-input";
    private static String  password_id = "password-input";
    private static String  signinbutton_css = "submit-button";


    public void getUrl(final String url) {
        driver.navigate().to(url);
    }
    
    public void clickOnsignin(){
    	driver.findElement(By.cssSelector(signinmenu_css)).click();
    	
    	String signinpage_title = driver.getTitle();
    	String expectedtitle = "BBC - Sign in";
    	Assert.assertEquals(expectedtitle, signinpage_title);
    }
    
    public void clickOnsigninbutton(String username, String password)
    {
    	driver.findElement(By.id(username_id)).sendKeys(username);
    	driver.findElement(By.id(password_id)).sendKeys(password);
    	driver.findElement(By.cssSelector(signinbutton_css)).click();
    	
    	String signinpage_title = driver.getTitle();
    	String expectedtitle = "BBC - Home";
    	Assert.assertEquals(expectedtitle, signinpage_title);
    }

}