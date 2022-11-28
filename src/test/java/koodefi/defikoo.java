package koodefi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class defikoo {
       WebDriver driver;
	@Given("i should go to koo feed page")
	public void i_should_go_to_koo_feed_page() {
		 WebDriverManager.chromedriver() .setup();
		   driver = new ChromeDriver();
		   driver.get("https://www.kooapp.com/feed");
		   driver.manage().window().maximize(); 
	}
	@When("click on the video feature in feed")
	public void click_on_the_video_feature_in_feed() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h5[text()='Videos']")).click();  
	}
	@When("go to the first video in video posts")
	public void go_to_the_first_video_in_video_posts() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"video-aa25c1e7-e3d5-447a-a18e-5bc53b1d3b5e\"]/video")).click();
	}
	@Then("click on the pause button of video")
	public void click_on_the_pause_button_of_video() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button']//span)[1]")).click();
	  
	}



}
