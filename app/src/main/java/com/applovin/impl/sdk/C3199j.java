package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.p031c.C3112e;

/* renamed from: com.applovin.impl.sdk.j */
/* loaded from: classes.dex */
public class C3199j {

    /* renamed from: a */
    private static final C3200a f8341a = new C3200a("Age Restricted User", C3111d.f8076l);

    /* renamed from: b */
    private static final C3200a f8342b = new C3200a("Has User Consent", C3111d.f8075k);

    /* renamed from: c */
    private static final C3200a f8343c = new C3200a("\"Do Not Sell\"", C3111d.f8077m);

    /* renamed from: com.applovin.impl.sdk.j$a */
    /* loaded from: classes.dex */
    public static class C3200a {

        /* renamed from: a */
        private final String f8344a;

        /* renamed from: b */
        private final C3111d<Boolean> f8345b;

        public C3200a(String str, C3111d<Boolean> c3111d) {
            this.f8344a = str;
            this.f8345b = c3111d;
        }

        /* renamed from: a */
        public Boolean m7515a(Context context) {
            if (context == null) {
                if (C3349v.m6862a()) {
                    C3349v.m6846i("AppLovinSdk", "Failed to get value for key: " + this.f8345b);
                }
                return null;
            }
            return (Boolean) C3112e.m7781b(this.f8345b, (Object) null, context);
        }

        /* renamed from: a */
        public String m7516a() {
            return this.f8344a;
        }

        /* renamed from: b */
        public String m7513b(Context context) {
            Boolean m7515a = m7515a(context);
            return m7515a != null ? m7515a.toString() : "No value set";
        }
    }

    /* renamed from: a */
    public static C3200a m7525a() {
        return f8341a;
    }

    /* renamed from: a */
    public static String m7524a(Context context) {
        return m7522a(f8341a, context) + m7522a(f8342b, context) + m7522a(f8343c, context);
    }

    /* renamed from: a */
    private static String m7522a(C3200a c3200a, Context context) {
        return "\n" + c3200a.f8344a + " - " + c3200a.m7513b(context);
    }

    /* renamed from: a */
    private static boolean m7523a(C3111d<Boolean> c3111d, Boolean bool, Context context) {
        if (context != null) {
            Boolean bool2 = (Boolean) C3112e.m7781b(c3111d, (Object) null, context);
            C3112e.m7788a(c3111d, bool, context);
            return bool2 == null || bool2 != bool;
        }
        if (C3349v.m6862a()) {
            C3349v.m6846i("AppLovinSdk", "Failed to update compliance value for key: " + c3111d);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m7521a(boolean z, Context context) {
        return m7523a(C3111d.f8076l, Boolean.valueOf(z), context);
    }

    /* renamed from: b */
    public static C3200a m7520b() {
        return f8342b;
    }

    /* renamed from: b */
    public static boolean m7519b(boolean z, Context context) {
        return m7523a(C3111d.f8075k, Boolean.valueOf(z), context);
    }

    /* renamed from: c */
    public static C3200a m7518c() {
        return f8343c;
    }

    /* renamed from: c */
    public static boolean m7517c(boolean z, Context context) {
        return m7523a(C3111d.f8077m, Boolean.valueOf(z), context);
    }
}
