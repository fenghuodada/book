package com.unity3d.services.core.api;

import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.util.SparseArray;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.C9498b;
import com.unity3d.services.core.device.C9515k;
import com.unity3d.services.core.device.EnumC9501c;
import com.unity3d.services.core.device.InterfaceC9502d;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class DeviceInfo {

    /* renamed from: a */
    private static SparseArray<InterfaceC9502d> f18567a;

    /* loaded from: classes3.dex */
    public enum DeviceInfoEvent {
        VOLUME_CHANGED
    }

    /* loaded from: classes3.dex */
    public enum StorageType {
        EXTERNAL,
        INTERNAL
    }

    /* renamed from: com.unity3d.services.core.api.DeviceInfo$a */
    /* loaded from: classes3.dex */
    public static class C9455a implements InterfaceC9502d {

        /* renamed from: a */
        private int f18570a;

        /* renamed from: b */
        final /* synthetic */ Integer f18571b;

        public C9455a(Integer num) {
            this.f18571b = num;
            this.f18570a = num.intValue();
        }

        @Override // com.unity3d.services.core.device.InterfaceC9502d
        /* renamed from: a */
        public int mo2104a() {
            return this.f18570a;
        }

        @Override // com.unity3d.services.core.device.InterfaceC9502d
        /* renamed from: a */
        public void mo2103a(int i) {
            C9620a.m1774c().m1784a(EnumC9627b.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(mo2104a()), Integer.valueOf(i), Integer.valueOf(C9498b.m2142a(this.f18570a)));
        }
    }

    /* renamed from: com.unity3d.services.core.api.DeviceInfo$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9456b {

        /* renamed from: a */
        static final /* synthetic */ int[] f18572a;

        static {
            int[] iArr = new int[StorageType.values().length];
            f18572a = iArr;
            try {
                iArr[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18572a[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    private static StorageType m2261a(String str) {
        try {
            return StorageType.valueOf(str);
        } catch (IllegalArgumentException e) {
            C9549a.m2023a("Illegal argument: " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    private static File m2262a(StorageType storageType) {
        int i = C9456b.f18572a[storageType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                C9549a.m2017c("Unhandled storagetype: " + storageType);
                return null;
            }
            return C9568a.m1959e().getExternalCacheDir();
        }
        return C9568a.m1959e().getCacheDir();
    }

    @WebViewExposed
    public static void getAdvertisingTrackingId(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2143a());
    }

    @WebViewExposed
    public static void getApiLevel(C9644l c9644l) {
        c9644l.m1736a(Integer.valueOf(C9498b.m2135b()));
    }

    @WebViewExposed
    public static void getApkDigest(C9644l c9644l) {
        try {
            c9644l.m1736a(C9498b.m2130c());
        } catch (Exception e) {
            c9644l.m1737a(EnumC9501c.COULDNT_GET_DIGEST, e.toString());
        }
    }

    @WebViewExposed
    public static void getBatteryLevel(C9644l c9644l) {
        c9644l.m1736a(Float.valueOf(C9498b.m2128d()));
    }

    @WebViewExposed
    public static void getBatteryStatus(C9644l c9644l) {
        c9644l.m1736a(Integer.valueOf(C9498b.m2126e()));
    }

    @WebViewExposed
    public static void getBoard(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2125f());
    }

    @WebViewExposed
    public static void getBootloader(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2124g());
    }

    @WebViewExposed
    public static void getBrand(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2123h());
    }

    @WebViewExposed
    public static void getBuildId(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2122i());
    }

    @WebViewExposed
    public static void getBuildVersionIncremental(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2121j());
    }

    @WebViewExposed
    public static void getCPUCount(C9644l c9644l) {
        c9644l.m1736a(Long.valueOf(C9498b.m2120k()));
    }

    @WebViewExposed
    public static void getCertificateFingerprint(C9644l c9644l) {
        String m2119l = C9498b.m2119l();
        if (m2119l != null) {
            c9644l.m1736a(m2119l);
        } else {
            c9644l.m1737a(EnumC9501c.COULDNT_GET_FINGERPRINT, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getConnectionType(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2118m());
    }

    @WebViewExposed
    public static void getDevice(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2117n());
    }

    @WebViewExposed
    public static void getDeviceMaxVolume(Integer num, C9644l c9644l) {
        int m2142a = C9498b.m2142a(num.intValue());
        if (m2142a > -1) {
            c9644l.m1736a(Integer.valueOf(m2142a));
        } else if (m2142a == -2) {
            c9644l.m1737a(EnumC9501c.AUDIOMANAGER_NULL, Integer.valueOf(m2142a));
        } else if (m2142a == -1) {
            c9644l.m1737a(EnumC9501c.APPLICATION_CONTEXT_NULL, Integer.valueOf(m2142a));
        } else {
            C9549a.m2017c("Unhandled deviceMaxVolume error: " + m2142a);
        }
    }

    @WebViewExposed
    public static void getDeviceVolume(Integer num, C9644l c9644l) {
        int m2134b = C9498b.m2134b(num.intValue());
        if (m2134b > -1) {
            c9644l.m1736a(Integer.valueOf(m2134b));
        } else if (m2134b == -2) {
            c9644l.m1737a(EnumC9501c.AUDIOMANAGER_NULL, Integer.valueOf(m2134b));
        } else if (m2134b == -1) {
            c9644l.m1737a(EnumC9501c.APPLICATION_CONTEXT_NULL, Integer.valueOf(m2134b));
        } else {
            C9549a.m2017c("Unhandled deviceVolume error: " + m2134b);
        }
    }

    @WebViewExposed
    public static void getDisplayMetricDensity(C9644l c9644l) {
        c9644l.m1736a(Float.valueOf(C9498b.m2116o()));
    }

    @WebViewExposed
    public static void getElapsedRealtime(C9644l c9644l) {
        c9644l.m1736a(Long.valueOf(C9498b.m2115p()));
    }

    @WebViewExposed
    public static void getFingerprint(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2114q());
    }

    @WebViewExposed
    public static void getFreeMemory(C9644l c9644l) {
        c9644l.m1736a(Long.valueOf(C9498b.m2113r()));
    }

    @WebViewExposed
    public static void getFreeSpace(String str, C9644l c9644l) {
        StorageType m2261a = m2261a(str);
        if (m2261a == null) {
            c9644l.m1737a(EnumC9501c.INVALID_STORAGETYPE, str);
            return;
        }
        long m2139a = C9498b.m2139a(m2262a(m2261a));
        if (m2139a > -1) {
            c9644l.m1736a(Long.valueOf(m2139a));
        } else {
            c9644l.m1737a(EnumC9501c.COULDNT_GET_STORAGE_LOCATION, Long.valueOf(m2139a));
        }
    }

    @WebViewExposed
    public static void getGLVersion(C9644l c9644l) {
        String m2112s = C9498b.m2112s();
        if (m2112s != null) {
            c9644l.m1736a(m2112s);
        } else {
            c9644l.m1737a(EnumC9501c.COULDNT_GET_GL_VERSION, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getHardware(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2111t());
    }

    @WebViewExposed
    public static void getHeadset(C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9498b.m2131b0()));
    }

    @WebViewExposed
    public static void getHost(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2110u());
    }

    @WebViewExposed
    public static void getLimitAdTrackingFlag(C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9498b.m2147W()));
    }

    @WebViewExposed
    public static void getLimitOpenAdTrackingFlag(C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9498b.m2146X()));
    }

    @WebViewExposed
    public static void getManufacturer(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2108w());
    }

    @WebViewExposed
    public static void getModel(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2107x());
    }

    @WebViewExposed
    public static void getNetworkCountryISO(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2106y());
    }

    @WebViewExposed
    public static void getNetworkMetered(C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9498b.m2105z()));
    }

    @WebViewExposed
    public static void getNetworkOperator(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2169A());
    }

    @WebViewExposed
    public static void getNetworkOperatorName(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2168B());
    }

    @WebViewExposed
    public static void getNetworkType(C9644l c9644l) {
        c9644l.m1736a(Integer.valueOf(C9498b.m2167C()));
    }

    @WebViewExposed
    public static void getOpenAdvertisingTrackingId(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2164F());
    }

    @WebViewExposed
    public static void getOsVersion(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2163G());
    }

    @WebViewExposed
    public static void getPackageInfo(C9644l c9644l) {
        if (C9568a.m1959e() == null) {
            c9644l.m1737a(EnumC9501c.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        String m1962b = C9568a.m1962b();
        try {
            c9644l.m1736a(C9498b.m2141a(C9568a.m1959e().getPackageManager()));
        } catch (PackageManager.NameNotFoundException unused) {
            c9644l.m1737a(EnumC9501c.APPLICATION_INFO_NOT_AVAILABLE, m1962b);
        } catch (JSONException e) {
            c9644l.m1737a(EnumC9501c.JSON_ERROR, e.getMessage());
        }
    }

    @WebViewExposed
    public static void getProcessInfo(C9644l c9644l) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> m2162H = C9498b.m2162H();
        if (m2162H != null) {
            try {
                if (m2162H.containsKey("stat")) {
                    jSONObject.put("stat", m2162H.get("stat"));
                }
                if (m2162H.containsKey("uptime")) {
                    jSONObject.put("uptime", m2162H.get("uptime"));
                }
            } catch (Exception e) {
                C9549a.m2023a("Error while constructing process info", e);
            }
        }
        c9644l.m1736a(jSONObject);
    }

    @WebViewExposed
    public static void getProduct(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2161I());
    }

    @WebViewExposed
    public static void getRingerMode(C9644l c9644l) {
        int m2160J = C9498b.m2160J();
        if (m2160J > -1) {
            c9644l.m1736a(Integer.valueOf(m2160J));
        } else if (m2160J == -2) {
            c9644l.m1737a(EnumC9501c.AUDIOMANAGER_NULL, Integer.valueOf(m2160J));
        } else if (m2160J == -1) {
            c9644l.m1737a(EnumC9501c.APPLICATION_CONTEXT_NULL, Integer.valueOf(m2160J));
        } else {
            C9549a.m2017c("Unhandled ringerMode error: " + m2160J);
        }
    }

    @WebViewExposed
    public static void getScreenBrightness(C9644l c9644l) {
        int m2159K = C9498b.m2159K();
        if (m2159K > -1) {
            c9644l.m1736a(Integer.valueOf(m2159K));
        } else if (m2159K == -1) {
            c9644l.m1737a(EnumC9501c.APPLICATION_CONTEXT_NULL, Integer.valueOf(m2159K));
        } else {
            C9549a.m2017c("Unhandled screenBrightness error: " + m2159K);
        }
    }

    @WebViewExposed
    public static void getScreenDensity(C9644l c9644l) {
        c9644l.m1736a(Integer.valueOf(C9498b.m2158L()));
    }

    @WebViewExposed
    public static void getScreenHeight(C9644l c9644l) {
        c9644l.m1736a(Integer.valueOf(C9498b.m2157M()));
    }

    @WebViewExposed
    public static void getScreenLayout(C9644l c9644l) {
        c9644l.m1736a(Integer.valueOf(C9498b.m2156N()));
    }

    @WebViewExposed
    public static void getScreenWidth(C9644l c9644l) {
        c9644l.m1736a(Integer.valueOf(C9498b.m2155O()));
    }

    @WebViewExposed
    public static void getSensorList(C9644l c9644l) {
        JSONArray jSONArray = new JSONArray();
        List<Sensor> m2154P = C9498b.m2154P();
        if (m2154P != null) {
            for (Sensor sensor : m2154P) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", sensor.getName());
                    jSONObject.put("type", sensor.getType());
                    jSONObject.put("vendor", sensor.getVendor());
                    jSONObject.put("maximumRange", sensor.getMaximumRange());
                    jSONObject.put("power", sensor.getPower());
                    jSONObject.put(MediationMetaData.KEY_VERSION, sensor.getVersion());
                    jSONObject.put("resolution", sensor.getResolution());
                    jSONObject.put("minDelay", sensor.getMinDelay());
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    c9644l.m1737a(EnumC9501c.JSON_ERROR, e.getMessage());
                    return;
                }
            }
        }
        c9644l.m1736a(jSONArray);
    }

    @WebViewExposed
    public static void getSupportedAbis(C9644l c9644l) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = C9498b.m2153Q().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        c9644l.m1736a(jSONArray);
    }

    @WebViewExposed
    public static void getSystemLanguage(C9644l c9644l) {
        c9644l.m1736a(Locale.getDefault().toString());
    }

    @WebViewExposed
    public static void getSystemProperty(String str, String str2, C9644l c9644l) {
        c9644l.m1736a(C9498b.m2137a(str, str2));
    }

    @WebViewExposed
    public static void getTimeZone(Boolean bool, C9644l c9644l) {
        c9644l.m1736a(TimeZone.getDefault().getDisplayName(bool.booleanValue(), 0, Locale.US));
    }

    @WebViewExposed
    public static void getTimeZoneOffset(C9644l c9644l) {
        c9644l.m1736a(Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000));
    }

    @WebViewExposed
    public static void getTotalMemory(C9644l c9644l) {
        c9644l.m1736a(Long.valueOf(C9498b.m2152R()));
    }

    @WebViewExposed
    public static void getTotalSpace(String str, C9644l c9644l) {
        StorageType m2261a = m2261a(str);
        if (m2261a == null) {
            c9644l.m1737a(EnumC9501c.INVALID_STORAGETYPE, str);
            return;
        }
        long m2133b = C9498b.m2133b(m2262a(m2261a));
        if (m2133b > -1) {
            c9644l.m1736a(Long.valueOf(m2133b));
        } else {
            c9644l.m1737a(EnumC9501c.COULDNT_GET_STORAGE_LOCATION, Long.valueOf(m2133b));
        }
    }

    @WebViewExposed
    public static void getUniqueEventId(C9644l c9644l) {
        c9644l.m1736a(C9498b.m2151S());
    }

    @WebViewExposed
    public static void getUptime(C9644l c9644l) {
        c9644l.m1736a(Long.valueOf(C9498b.m2150T()));
    }

    @WebViewExposed
    public static void isAdbEnabled(C9644l c9644l) {
        Boolean m2148V = C9498b.m2148V();
        if (m2148V != null) {
            c9644l.m1736a(m2148V);
        } else {
            c9644l.m1737a(EnumC9501c.COULDNT_GET_ADB_STATUS, new Object[0]);
        }
    }

    @WebViewExposed
    public static void isRooted(C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9498b.m2145Y()));
    }

    @WebViewExposed
    public static void isUSBConnected(C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9498b.m2144Z()));
    }

    @WebViewExposed
    public static void registerVolumeChangeListener(Integer num, C9644l c9644l) {
        if (f18567a == null) {
            f18567a = new SparseArray<>();
        }
        if (f18567a.get(num.intValue()) == null) {
            C9455a c9455a = new C9455a(num);
            f18567a.append(num.intValue(), c9455a);
            C9515k.m2079a(c9455a);
        }
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void unregisterVolumeChangeListener(Integer num, C9644l c9644l) {
        SparseArray<InterfaceC9502d> sparseArray = f18567a;
        if (sparseArray != null && sparseArray.get(num.intValue()) != null) {
            C9515k.m2077b(f18567a.get(num.intValue()));
            f18567a.remove(num.intValue());
        }
        c9644l.m1736a(new Object[0]);
    }
}
