package com.unity3d.services.core.configuration;

import android.webkit.JavascriptInterface;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.webview.bridge.C9636i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class EnvironmentCheck {
    /* renamed from: a */
    private static boolean m2219a(Method method) {
        Annotation[] annotations = method.getAnnotations();
        if (annotations != null) {
            for (Annotation annotation : annotations) {
                if (annotation instanceof JavascriptInterface) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEnvironmentOk() {
        return testProGuard() && testCacheDirectory();
    }

    public static boolean testCacheDirectory() {
        if (C9572d.m1954a() != null) {
            C9549a.m2019b("Unity Ads cache directory check OK");
            return true;
        }
        C9549a.m2017c("Unity Ads cache directory check fail: no working cache directory available");
        return false;
    }

    public static boolean testProGuard() {
        String str;
        try {
            Method method = C9636i.class.getMethod("handleInvocation", String.class);
            Method method2 = C9636i.class.getMethod("handleCallback", String.class, String.class, String.class);
            if (m2219a(method) && m2219a(method2)) {
                C9549a.m2019b("Unity Ads ProGuard check OK");
                return true;
            }
            C9549a.m2017c("Unity Ads ProGuard check fail: missing @JavascriptInterface annotations in Unity Ads web bridge");
            return false;
        } catch (ClassNotFoundException e) {
            e = e;
            str = "Unity Ads ProGuard check fail: Unity Ads web bridge class not found";
            C9549a.m2023a(str, e);
            return false;
        } catch (NoSuchMethodException e2) {
            e = e2;
            str = "Unity Ads ProGuard check fail: Unity Ads web bridge methods not found";
            C9549a.m2023a(str, e);
            return false;
        } catch (Exception e3) {
            C9549a.m2023a("Unknown exception during Unity Ads ProGuard check: " + e3.getMessage(), e3);
            return true;
        }
    }
}
