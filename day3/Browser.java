package week1.day3;

public class Browser {

	public void launchBrowser() {
		System.out.println("Launching Browser");
	}

	public void loadUrl() {
		System.out.println("Loading URL");

	}

	public static void main(String[] args) {
		Browser browseractivities = new Browser();
		browseractivities.launchBrowser();
		browseractivities.loadUrl();

	}

}
