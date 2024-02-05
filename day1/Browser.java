package week1.day1;

public class Browser {
    public static void main(String[] args) {
    
        Firefox Fo = new Firefox();
        System.out.println("Browser Version: " + Fo.browserVersion);
        System.out.println("Browser Name: " + Fo.browserName);
        System.out.println("Page Loaded: " + Fo.pageLoaded);
        System.out.println("Number of Browsers: " + Fo.noOfBrowser);
        System.out.println("Browser Logo: " + Fo.browserLogo);
    }
}

class Firefox {
   
    float browserVersion = 89.0f;
    String browserName = "Firefox";
    boolean pageLoaded = true;
    int noOfBrowser = 1;
    char browserLogo = 'F';
}
