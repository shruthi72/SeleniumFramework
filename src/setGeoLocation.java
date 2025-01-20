import java.util.Map;

public class setGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		// 40 3
		
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		
		Map<String, Object> coordinates=new Hashmap<String, Object>();
		coordinates.put("latitude", 40);
		coordinates.put("longitude",3);
		coordinates.put("accuracy",1);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride",coordinates);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		String title=driver.findElement(By.cssSelector(".our-story-card-title")).getText();
		System.out.println(title);

	}

}
