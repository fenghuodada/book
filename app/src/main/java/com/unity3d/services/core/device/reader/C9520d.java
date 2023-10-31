package com.unity3d.services.core.device.reader;

import android.webkit.WebSettings;
import com.unity3d.services.core.device.C9498b;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.properties.C9572d;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.unity3d.services.core.device.reader.d */
/* loaded from: classes3.dex */
public class C9520d implements InterfaceC9533p {

    /* renamed from: a */
    private final InterfaceC9533p f18850a;

    public C9520d(InterfaceC9533p interfaceC9533p) {
        this.f18850a = interfaceC9533p;
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9533p
    /* renamed from: a */
    public Map<String, Object> mo2037a() {
        Map<String, Object> mo2037a = this.f18850a.mo2037a();
        mo2037a.put("bundleId", C9568a.m1962b());
        mo2037a.put("encrypted", Boolean.valueOf(C9568a.m1957g()));
        mo2037a.put("rooted", Boolean.valueOf(C9498b.m2145Y()));
        mo2037a.put("osVersion", C9498b.m2163G());
        mo2037a.put("deviceModel", C9498b.m2107x());
        mo2037a.put("language", Locale.getDefault().toString());
        mo2037a.put("connectionType", C9498b.m2118m());
        mo2037a.put("screenHeight", Integer.valueOf(C9498b.m2157M()));
        mo2037a.put("screenWidth", Integer.valueOf(C9498b.m2155O()));
        mo2037a.put("deviceMake", C9498b.m2108w());
        mo2037a.put("screenDensity", Integer.valueOf(C9498b.m2158L()));
        mo2037a.put("screenSize", Integer.valueOf(C9498b.m2156N()));
        mo2037a.put("limitAdTracking", Boolean.valueOf(C9498b.m2147W()));
        mo2037a.put("networkOperator", C9498b.m2169A());
        mo2037a.put("volume", Integer.valueOf(C9498b.m2134b(1)));
        mo2037a.put("deviceFreeSpace", Long.valueOf(C9498b.m2139a(C9568a.m1959e().getCacheDir())));
        mo2037a.put("apiLevel", String.valueOf(C9498b.m2135b()));
        mo2037a.put("networkType", Integer.valueOf(C9498b.m2167C()));
        mo2037a.put("bundleVersion", C9568a.m1961c());
        mo2037a.put("timeZone", TimeZone.getDefault().getDisplayName(false, 0, Locale.US));
        mo2037a.put("timeZoneOffset", Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000));
        mo2037a.put("webviewUa", WebSettings.getDefaultUserAgent(C9568a.m1959e()));
        mo2037a.put("networkOperatorName", C9498b.m2168B());
        mo2037a.put("wiredHeadset", Boolean.valueOf(C9498b.m2131b0()));
        mo2037a.put("versionCode", Integer.valueOf(C9572d.m1926n()));
        mo2037a.put("stores", "google");
        mo2037a.put("appStartTime", Long.valueOf(C9572d.m1931i() / 1000));
        mo2037a.put("sdkVersionName", C9572d.m1925o());
        mo2037a.put("eventTimeStamp", Long.valueOf(System.currentTimeMillis() / 1000));
        mo2037a.put("cpuCount", Long.valueOf(C9498b.m2120k()));
        mo2037a.put("usbConnected", Boolean.valueOf(C9498b.m2144Z()));
        try {
            mo2037a.put("apkHash", C9498b.m2130c());
        } catch (Exception unused) {
            C9549a.m2017c("Could not get APK Digest");
        }
        mo2037a.put("apkDeveloperSigningCertificateHash", C9498b.m2119l());
        mo2037a.put("deviceUpTime", Long.valueOf(C9498b.m2150T()));
        mo2037a.put("deviceElapsedRealtime", Long.valueOf(C9498b.m2115p()));
        mo2037a.put("adbEnabled", C9498b.m2148V());
        mo2037a.put("androidFingerprint", C9498b.m2114q());
        mo2037a.put("batteryStatus", Integer.valueOf(C9498b.m2126e()));
        mo2037a.put("batteryLevel", Float.valueOf(C9498b.m2128d()));
        mo2037a.put("networkMetered", Boolean.valueOf(C9498b.m2105z()));
        mo2037a.put("test", Boolean.valueOf(C9572d.m1921s()));
        mo2037a.put("callType", "token");
        return mo2037a;
    }
}
