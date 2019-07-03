package jenkins;
	public class Simplesel {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
			   WebDriver wd=new ChromeDriver();
			   wd.get("https://www.facebook.com/");
			   wd.manage().window().maximize(); 
			   wd.findElement(By.id("email")).sendKeys("rakeshkumarmng7@gmail.com");
			   wd.findElement(By.id("pass")).sendKeys("abcdefgh");
			   wd.findElement(By.cssSelector("#u_0_2")).click();
			   
					}
			}