public class AppChecker {
    public static void main(String[] args) {
        AndroidApp android=new AndroidApp("calculator");
        android.appInfo();
        android.runAndroidApp();

        IphoneApp iphone=new IphoneApp("calculator2");
        iphone.appInfo();
        iphone.runIphoneApp();
    }
}
