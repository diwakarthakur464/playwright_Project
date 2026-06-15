package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
 Page page;

 public LoginPage(Page page){
  this.page = page;
 }

 public void login(){
  page.fill("#user-name","standard_user");
  page.fill("#password","secret_sauce");
  page.click("#login-button");
 }
}
