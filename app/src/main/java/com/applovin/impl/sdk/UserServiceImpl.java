package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

/* loaded from: classes.dex */
public class UserServiceImpl implements AppLovinUserService {

    /* renamed from: a */
    private final C3214m f7553a;

    public UserServiceImpl(C3214m c3214m) {
        this.f7553a = c3214m;
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void preloadConsentDialog() {
        this.f7553a.m7465W().m7494c();
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f7553a.m7465W().m7505a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
