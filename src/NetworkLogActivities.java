import java.util.Optional;

public class NetworkLogActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//log file
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		
		devTools.addListener(Network.requestWillBeSent(),request->
		{
			Request req=request.getRequest();
			System.out.println(req.getUrl());
		});
		
		//Event will get fired
		devTools.addListener(Network.responseReceived(),response->
		{
			Response res=response.getResponse();
			System.out.println(res.getUrl());
			System.out.println(res.getStatus());
		/*	if(res.getStatus().toString().startsWith("4"))
			{
				System.out.println(res.getUrl()+"is failing with status code"+res.getStatus());
			}*/
			
		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo");
		
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();

	}

}
