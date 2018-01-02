package bases;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        FacebookSdk.sdkInitialize(getApplicationContext());
//        AppEventsLogger.activateApp(this);

        // logger.logPurchase(BigDecimal.valueOf(4.32), Currency.getInstance("USD"));

//        Typekit.getInstance()
//                .addNormal(Typekit.createFromAsset(this, "fonts/NanumPen.ttf"))
//                .addBold(Typekit.createFromAsset(this, "fonts/NanumPen.ttf"));
    }
}