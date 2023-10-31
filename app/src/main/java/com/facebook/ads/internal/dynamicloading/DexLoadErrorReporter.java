package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* renamed from: a */
    public static final AtomicBoolean f9985a = new AtomicBoolean();

    /* renamed from: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter$a */
    /* loaded from: classes.dex */
    public class C3897a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ Context f9986a;

        /* renamed from: b */
        public final /* synthetic */ String f9987b;

        public C3897a(Context context, String str) {
            this.f9986a = context;
            this.f9987b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:71:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 437
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.C3897a.run():void");
        }
    }

    /* renamed from: a */
    public static void m6365a(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d) {
        AtomicBoolean atomicBoolean = f9985a;
        if (atomicBoolean.get() || Math.random() >= d) {
            return;
        }
        atomicBoolean.set(true);
        new C3897a(context, str).start();
    }
}
