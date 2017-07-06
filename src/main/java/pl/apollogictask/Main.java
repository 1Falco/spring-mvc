package pl.apollogictask;

import pl.apollogictask.beans.GetObjectFromUrl;
import pl.apollogictask.beans.Urls;

public class Main {
	public static void main(String[] args) throws Exception {
		GetObjectFromUrl get = new GetObjectFromUrl(Urls.COMPANY_LIST);
		get.getObject();
	}
}
