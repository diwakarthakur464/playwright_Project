package hooks;

import com.microsoft.playwright.*;
import io.cucumber.java.*;
import java.io.FileInputStream;
import java.util.Properties;

public class Hooks {
 public static Playwright playwright;
 public static Browser browser;
 public static Page page;
 Properties prop;

 @Before
 public void setup() throws Exception {
  prop = new Properties();
  prop.load(new FileInputStream("src/test/resources/config/config.properties"));

  playwright = Playwright.create();
  browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
  page = browser.newPage();

  page.navigate(prop.getProperty("url"));
 }

 @After
 public void tearDown(){
  browser.close();
  playwright.close();
 }
}
