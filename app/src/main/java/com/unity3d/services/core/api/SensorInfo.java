package com.unity3d.services.core.api;

import com.unity3d.services.core.sensorinfo.C9608b;
import com.unity3d.services.core.sensorinfo.EnumC9607a;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SensorInfo {
    @WebViewExposed
    public static void getAccelerometerData(C9644l c9644l) {
        JSONObject m1812a = C9608b.m1812a();
        if (m1812a != null) {
            c9644l.m1736a(m1812a);
        } else {
            c9644l.m1737a(EnumC9607a.ACCELEROMETER_DATA_NOT_AVAILABLE, new Object[0]);
        }
    }

    @WebViewExposed
    public static void isAccelerometerActive(C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9608b.m1810b()));
    }

    @WebViewExposed
    public static void startAccelerometerUpdates(Integer num, C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9608b.m1811a(num.intValue())));
    }

    @WebViewExposed
    public static void stopAccelerometerUpdates(C9644l c9644l) {
        C9608b.m1809c();
        c9644l.m1736a(new Object[0]);
    }
}
