package Login;

import org.openqa.selenium.By;

import app.Env;

public class ValidLogin {
    
   public static Env env = new Env();


   public static void LoginFucn() throws InterruptedException
   {
    boolean Login = false;

    Thread.sleep(1000);
    Login=env.driver.findElement(By.xpath("")).isDisplayed();
    if(Login)
    {
        System.out.println("Login successfull");

    }else{
        System.out.println("login failed");
    }
   }
    public static void main(String[] args) throws InterruptedException {
        env.setUpDriver();
        env.signIn();
        LoginFucn();
        env.driver.quit();
    }

   
}
