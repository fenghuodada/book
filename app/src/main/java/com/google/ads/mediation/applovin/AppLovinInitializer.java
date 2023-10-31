package com.google.ads.mediation.applovin;

import android.content.Context;
import androidx.annotation.NonNull;
import com.applovin.mediation.ApplovinAdapter;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class AppLovinInitializer {
    public static final int INITIALIZED = 2;
    public static final int INITIALIZING = 1;
    public static final int UNINITIALIZED = 0;
    private static AppLovinInitializer instance;
    private final HashMap<String, Integer> initializationStatus = new HashMap<>();
    private final HashMap<String, ArrayList<OnInitializeSuccessListener>> initializerListeners = new HashMap<>();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface InitializationStatus {
    }

    /* loaded from: classes.dex */
    public interface OnInitializeSuccessListener {
        void onInitializeSuccess(@NonNull String str);
    }

    private AppLovinInitializer() {
    }

    public static AppLovinInitializer getInstance() {
        if (instance == null) {
            instance = new AppLovinInitializer();
        }
        return instance;
    }

    public void initialize(@NonNull Context context, @NonNull final String str, @NonNull OnInitializeSuccessListener onInitializeSuccessListener) {
        if (!this.initializationStatus.containsKey(str)) {
            this.initializationStatus.put(str, 0);
            this.initializerListeners.put(str, new ArrayList<>());
        }
        Integer num = 2;
        if (num.equals(this.initializationStatus.get(str))) {
            onInitializeSuccessListener.onInitializeSuccess(str);
            return;
        }
        this.initializerListeners.get(str).add(onInitializeSuccessListener);
        Integer num2 = 1;
        if (num2.equals(this.initializationStatus.get(str))) {
            return;
        }
        this.initializationStatus.put(str, 1);
        ApplovinAdapter.log(3, String.format("Attempting to initialize SDK with SDK Key: %s", str));
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(str, AppLovinMediationAdapter.getSdkSettings(context), context);
        appLovinSdk.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdk.setMediationProvider(AppLovinMediationProvider.ADMOB);
        appLovinSdk.initializeSdk(new AppLovinSdk.SdkInitializationListener() { // from class: com.google.ads.mediation.applovin.AppLovinInitializer.1
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                AppLovinInitializer.this.initializationStatus.put(str, 2);
                ArrayList arrayList = (ArrayList) AppLovinInitializer.this.initializerListeners.get(str);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((OnInitializeSuccessListener) it.next()).onInitializeSuccess(str);
                    }
                    arrayList.clear();
                }
            }
        });
    }
}
