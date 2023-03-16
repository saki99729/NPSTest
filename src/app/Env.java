package app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Env {
    public WebDriver driver;
    public String baseURL = "https://nps.monoroc.com/";
     public String userName = "nps@admin.com";
     public String password = "1234";

     public  void setUpDriver()
     {
        System.setProperty("webdriver.edge.driver", "E:\\AvenirIT\\selenium\\NewTest\\NPS\\Driver\\msedgedriver.exe");
        EdgeOptions edgeOptions  =  new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(edgeOptions);
     }

     public void signIn() throws InterruptedException{
        driver.get(baseURL);
        driver.manage().window().maximize();
        //Thread.sleep(2500);

        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys(userName);


        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys(password);

        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
     }  


      public static void main(String[] args) {

            Env env = new Env();
            env.setUpDriver();
        
     }

    }
