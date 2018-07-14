package automationPractice.Reusables;

import java.net.HttpURLConnection;
import java.net.URL;

public class VerifyPageLinks 
{
	public static void VerifyPageLink(String linkurl)
	{
		try 
		{
			URL url = new URL(linkurl);
			HttpURLConnection httpurlconnect=(HttpURLConnection)url.openConnection();
			httpurlconnect.setConnectTimeout(3000);
			httpurlconnect.connect();
			if (httpurlconnect.getResponseCode()==200)
			{
				System.out.println(linkurl+" - "+httpurlconnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		}catch (Exception e)
		{
			
		}
		
		
	}

}
