package com.unity3d.services.core.properties;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.unity3d.services.core.log.C9549a;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.unity3d.services.core.properties.a */
/* loaded from: classes3.dex */
public class C9568a {

    /* renamed from: a */
    private static final X500Principal f18933a = new X500Principal("CN=Android Debug,O=Android,C=US");

    /* renamed from: b */
    private static WeakReference<Activity> f18934b;

    /* renamed from: c */
    private static Context f18935c;

    /* renamed from: d */
    private static Application f18936d;

    /* renamed from: e */
    private static String f18937e;

    /* renamed from: a */
    public static Activity m1967a() {
        return f18934b.get();
    }

    /* renamed from: a */
    public static void m1966a(Activity activity) {
        f18934b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public static void m1965a(Application application) {
        f18936d = application;
    }

    /* renamed from: a */
    public static void m1964a(Context context) {
        f18935c = context;
    }

    /* renamed from: a */
    public static void m1963a(String str) {
        f18937e = str;
    }

    /* renamed from: b */
    public static String m1962b() {
        return f18935c.getPackageName();
    }

    /* renamed from: c */
    public static String m1961c() {
        String packageName = m1959e().getPackageName();
        PackageManager packageManager = m1959e().getPackageManager();
        try {
            return packageManager.getPackageInfo(packageName, 0).versionName == null ? "FakeVersionName" : packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C9549a.m2023a("Error getting package info", e);
            return null;
        }
    }

    /* renamed from: d */
    public static Application m1960d() {
        return f18936d;
    }

    /* renamed from: e */
    public static Context m1959e() {
        return f18935c;
    }

    /* renamed from: f */
    public static String m1958f() {
        return f18937e;
    }

    /* renamed from: g */
    public static boolean m1957g() {
        boolean z;
        if (m1959e() != null) {
            PackageManager packageManager = m1959e().getPackageManager();
            String packageName = m1959e().getPackageName();
            boolean z2 = true;
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
                int i = applicationInfo.flags & 2;
                applicationInfo.flags = i;
                if (i != 0) {
                    z = true;
                    z2 = false;
                } else {
                    z2 = false;
                    z = false;
                }
            } catch (PackageManager.NameNotFoundException e) {
                C9549a.m2023a("Could not find name", e);
                z = false;
            }
            if (z2) {
                try {
                    for (Signature signature : packageManager.getPackageInfo(packageName, 64).signatures) {
                        z = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(f18933a);
                        if (z) {
                            break;
                        }
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    C9549a.m2023a("Could not find name", e2);
                } catch (CertificateException e3) {
                    C9549a.m2023a("Certificate exception", e3);
                }
            }
            return z;
        }
        return false;
    }
}
