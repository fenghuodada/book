package com.ambrose.overwall;

import android.content.res.Configuration;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.appcompat.C0079a;
import androidx.fragment.C1349a;
import com.android.tool.ApplicationC2534a;
import com.android.tool.util.manager.C2559b;
import com.android.tool.util.manager.C2560c;
import com.android.tool.util.util.C2603g;
import com.android.tool.util.util.request.C2605b;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.style.C8941a;
import com.qmuiteam.qmui.arch.C9035j;
import com.qmuiteam.qmui.skin.C9108h;
import com.tencent.mmkv.MMKV;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import io.reactivex.rxjava3.plugins.C10234a;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class MyApplication extends ApplicationC2534a {

    /* renamed from: c */
    public static MyApplication f5741c;

    /* renamed from: b */
    public String f5742b = "4497189";

    /* renamed from: com.ambrose.overwall.MyApplication$a */
    /* loaded from: classes.dex */
    public class C2389a implements IUnityAdsInitializationListener {
        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public final void onInitializationComplete() {
            Log.e("-----------", "UNITY ------  onInitializationComplete: ");
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            Log.e("-------", "UNITY ------  onInitializationFailed:           -     " + str);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((configuration.uiMode & 48) == 32) {
            C1349a.m10608c(2);
        } else if (C9108h.m2670f(ApplicationC2534a.f6025a).f17555f == 2) {
            C1349a.m10608c(3);
        }
    }

    @Override // com.android.tool.ApplicationC2534a, android.app.Application
    public final void onCreate() {
        boolean z;
        super.onCreate();
        f5741c = this;
        C10234a.f20568a = new C2391a();
        C8941a c8941a = C8877a.f16910a;
        BaseDialog.m2864r(this);
        if (C9035j.f17257c == null) {
            C9035j c9035j = new C9035j();
            C9035j.f17257c = c9035j;
            registerActivityLifecycleCallbacks(c9035j);
        }
        C9108h m2670f = C9108h.m2670f(this);
        m2670f.m2675a(2, R.style.app_skin_dark);
        m2670f.m2675a(3, R.style.app_skin_white);
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        C2559b.m9372a(this).getClass();
        int i = C2559b.f6057a.getInt("app_skin_index", 3);
        if ((z && i != 2) || (!z && i == 2)) {
            m2670f.m2673c(2);
        } else {
            m2670f.m2673c(i);
        }
        String[] strArr = {"com.ambrose.overwall"};
        String[] strArr2 = {"app_skin_"};
        if (C2560c.f6059f == null) {
            C2560c.f6059f = new C2560c();
        }
        MMKV.m2535c(this);
        C2560c.f6059f.f6063c = strArr;
        Field[] fields = C2392b.class.getFields();
        C2560c.f6059f.f6064d = new ArrayList();
        for (Field field : fields) {
            String name = field.getName();
            if (name.startsWith("qmui_skin_support_") || name.startsWith(strArr2[0])) {
                C2560c.f6059f.f6064d.add(name);
            }
        }
        C2560c c2560c = C2560c.f6059f;
        C0079a.f147a = this;
        FirebaseApp.initializeApp(this);
        FirebaseCrashlytics.getInstance().setUserId(C2605b.m9333b(f5741c) + "-" + C2605b.m9334a(f5741c));
        MobileAds.initialize(this);
        if (C2603g.m9338b("ADSOUND") != null) {
            MobileAds.setAppMuted(true);
        }
        new AppOpenManager(this);
        MobileAds.initialize(this);
        if (C2603g.m9338b("UNITYGAMEID") != null) {
            this.f5742b = C2603g.m9338b("UNITYGAMEID");
        }
        UnityAds.initialize(this, this.f5742b, false, new C2389a());
    }
}
