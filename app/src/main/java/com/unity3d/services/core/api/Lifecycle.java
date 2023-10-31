package com.unity3d.services.core.api;

import android.annotation.TargetApi;
import com.unity3d.services.core.lifecycle.C9548f;
import com.unity3d.services.core.lifecycle.EnumC9546d;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

@TargetApi(14)
/* loaded from: classes3.dex */
public class Lifecycle {

    /* renamed from: a */
    private static C9548f f18579a;

    public static C9548f getLifecycleListener() {
        return f18579a;
    }

    @WebViewExposed
    public static void register(JSONArray jSONArray, C9644l c9644l) {
        if (C9568a.m1960d() == null) {
            c9644l.m1737a(EnumC9546d.APPLICATION_NULL, new Object[0]);
        } else if (getLifecycleListener() != null) {
            c9644l.m1737a(EnumC9546d.LISTENER_NOT_NULL, new Object[0]);
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add((String) jSONArray.get(i));
                } catch (JSONException unused) {
                    c9644l.m1737a(EnumC9546d.JSON_ERROR, new Object[0]);
                    return;
                }
            }
            setLifecycleListener(new C9548f(arrayList));
            C9568a.m1960d().registerActivityLifecycleCallbacks(getLifecycleListener());
            c9644l.m1736a(new Object[0]);
        }
    }

    public static void setLifecycleListener(C9548f c9548f) {
        f18579a = c9548f;
    }

    @WebViewExposed
    public static void unregister(C9644l c9644l) {
        if (C9568a.m1960d() == null) {
            c9644l.m1737a(EnumC9546d.APPLICATION_NULL, new Object[0]);
            return;
        }
        if (getLifecycleListener() != null) {
            C9568a.m1960d().unregisterActivityLifecycleCallbacks(getLifecycleListener());
            setLifecycleListener(null);
        }
        c9644l.m1736a(new Object[0]);
    }
}
