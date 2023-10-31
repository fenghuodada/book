package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.provider.C0758e;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C3333k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.v */
/* loaded from: classes.dex */
public class C3349v {

    /* renamed from: a */
    private final C3214m f8825a;

    public C3349v(final C3214m c3214m) {
        this.f8825a = c3214m;
        if (c3214m.m7409e()) {
            return;
        }
        m6859a("SDK Session Begin");
        c3214m.m7430aj().registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.v.1
            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
                C3349v.this.m6859a("SDK Session End");
                c3214m.m7430aj().unregisterReceiver(this);
            }
        }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6859a(String str) {
        C3333k c3333k = new C3333k();
        c3333k.m6939a().m6933a(str).m6939a();
        m6849f("AppLovinSdk", c3333k.toString());
    }

    /* renamed from: a */
    private void m6856a(String str, String str2, boolean z) {
        int intValue;
        if (StringUtils.isValidString(str2) && (intValue = ((Integer) this.f8825a.m7456a(C3109b.f7833al)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + intValue) - 1) / intValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * intValue;
                String substring = str2.substring(i3, Math.min(length, i3 + intValue));
                if (z) {
                    Log.d(str, substring);
                } else {
                    m6855b(str, substring);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m6862a() {
        List<AppLovinSdk> m6793a = AppLovinSdk.m6793a();
        if (m6793a.isEmpty()) {
            return false;
        }
        AppLovinSdk appLovinSdk = m6793a.get(0);
        return appLovinSdk == null || m6861a(appLovinSdk.coreSdk);
    }

    /* renamed from: a */
    public static boolean m6861a(C3214m c3214m) {
        return c3214m != null && c3214m.m7477K().m7797d();
    }

    /* renamed from: c */
    public static void m6852c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", C0758e.m11827a("[", str, "] ", str2), th);
    }

    /* renamed from: f */
    public static void m6849f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: g */
    public static void m6848g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: h */
    public static void m6847h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: i */
    public static void m6846i(String str, String str2) {
        m6852c(str, str2, null);
    }

    /* renamed from: j */
    private void m6845j(String str, String str2) {
    }

    /* renamed from: a */
    public void m6858a(String str, String str2) {
        if (m6861a(this.f8825a)) {
            m6856a(str, str2, false);
        }
    }

    /* renamed from: a */
    public void m6857a(String str, String str2, Throwable th) {
        if (m6861a(this.f8825a)) {
            String m11827a = C0758e.m11827a("[", str, "] ", str2);
            Log.w("AppLovinSdk", m11827a, th);
            m6845j("WARN", m11827a);
        }
    }

    /* renamed from: b */
    public void m6855b(String str, String str2) {
        if (m6861a(this.f8825a)) {
            String str3 = "[" + str + "] " + str2;
            Log.d("AppLovinSdk", str3);
            m6845j("DEBUG", str3);
        }
    }

    /* renamed from: b */
    public void m6854b(String str, String str2, Throwable th) {
        if (m6861a(this.f8825a)) {
            String m11827a = C0758e.m11827a("[", str, "] ", str2);
            Log.e("AppLovinSdk", m11827a, th);
            m6845j("ERROR", m11827a + " : " + th);
        }
    }

    /* renamed from: c */
    public void m6853c(String str, String str2) {
        if (m6861a(this.f8825a)) {
            String str3 = "[" + str + "] " + str2;
            Log.i("AppLovinSdk", str3);
            m6845j("INFO", str3);
        }
    }

    /* renamed from: d */
    public void m6851d(String str, String str2) {
        m6857a(str, str2, (Throwable) null);
    }

    /* renamed from: e */
    public void m6850e(String str, String str2) {
        m6854b(str, str2, null);
    }
}
