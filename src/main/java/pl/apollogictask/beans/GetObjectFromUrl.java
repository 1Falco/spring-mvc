package pl.apollogictask.beans;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetObjectFromUrl {

	private String urlString;

	public GetObjectFromUrl() {
	}

	@Autowired
	public GetObjectFromUrl(String urlString) {
		this.urlString = urlString;
	}

	public String getObject() throws Exception {
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL(urlString);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine;
			while ((inputLine = reader.readLine()) != null)
				sb.append(inputLine);
			reader.close();
		} finally {
			if (reader != null)
				reader.close();
		}
		System.out.println(sb.toString());
		return sb.toString();

	}
}
