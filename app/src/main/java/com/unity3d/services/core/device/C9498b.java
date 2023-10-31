package com.unity3d.services.core.device;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.preferences.C9566a;
import com.unity3d.services.core.properties.C9568a;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.p064ws.RealWebSocket;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.device.b */
/* loaded from: classes3.dex */
public class C9498b {

    /* renamed from: com.unity3d.services.core.device.b$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9499a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18795a;

        static {
            int[] iArr = new int[EnumC9500b.values().length];
            f18795a = iArr;
            try {
                iArr[EnumC9500b.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18795a[EnumC9500b.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.unity3d.services.core.device.b$b */
    /* loaded from: classes3.dex */
    public enum EnumC9500b {
        TOTAL_MEMORY,
        FREE_MEMORY
    }

    /* renamed from: A */
    public static String m2169A() {
        return C9568a.m1959e() != null ? ((TelephonyManager) C9568a.m1959e().getSystemService("phone")).getNetworkOperator() : "";
    }

    /* renamed from: B */
    public static String m2168B() {
        return C9568a.m1959e() != null ? ((TelephonyManager) C9568a.m1959e().getSystemService("phone")).getNetworkOperatorName() : "";
    }

    /* renamed from: C */
    public static int m2167C() {
        if (C9568a.m1959e() != null) {
            try {
                return ((TelephonyManager) C9568a.m1959e().getSystemService("phone")).getNetworkType();
            } catch (SecurityException unused) {
                C9549a.m2014e("Unity Ads was not able to get current network type due to missing permission");
                return -1;
            }
        }
        return -1;
    }

    @TargetApi(21)
    /* renamed from: D */
    private static ArrayList<String> m2166D() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(Build.SUPPORTED_ABIS));
        return arrayList;
    }

    /* renamed from: E */
    private static ArrayList<String> m2165E() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(Build.CPU_ABI);
        arrayList.add(Build.CPU_ABI2);
        return arrayList;
    }

    /* renamed from: F */
    public static String m2164F() {
        return C9503e.m2098c();
    }

    /* renamed from: G */
    public static String m2163G() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: H */
    public static Map<String, String> m2162H() {
        RandomAccessFile randomAccessFile;
        HashMap hashMap = new HashMap();
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                try {
                    randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
                    try {
                        hashMap.put("stat", randomAccessFile.readLine());
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e = e;
                        randomAccessFile2 = randomAccessFile;
                        C9549a.m2023a("Error while reading processor info: ", e);
                        randomAccessFile2.close();
                        return hashMap;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            randomAccessFile.close();
                        } catch (IOException e2) {
                            C9549a.m2023a("Error closing RandomAccessFile", e2);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            C9549a.m2023a("Error closing RandomAccessFile", e4);
        }
        return hashMap;
    }

    /* renamed from: I */
    public static String m2161I() {
        return Build.PRODUCT;
    }

    /* renamed from: J */
    public static int m2160J() {
        if (C9568a.m1959e() != null) {
            AudioManager audioManager = (AudioManager) C9568a.m1959e().getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getRingerMode();
            }
            return -2;
        }
        return -1;
    }

    /* renamed from: K */
    public static int m2159K() {
        if (C9568a.m1959e() != null) {
            return Settings.System.getInt(C9568a.m1959e().getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    /* renamed from: L */
    public static int m2158L() {
        if (C9568a.m1959e() != null) {
            return C9568a.m1959e().getResources().getDisplayMetrics().densityDpi;
        }
        return -1;
    }

    /* renamed from: M */
    public static int m2157M() {
        if (C9568a.m1959e() != null) {
            return C9568a.m1959e().getResources().getDisplayMetrics().heightPixels;
        }
        return -1;
    }

    /* renamed from: N */
    public static int m2156N() {
        if (C9568a.m1959e() != null) {
            return C9568a.m1959e().getResources().getConfiguration().screenLayout;
        }
        return -1;
    }

    /* renamed from: O */
    public static int m2155O() {
        if (C9568a.m1959e() != null) {
            return C9568a.m1959e().getResources().getDisplayMetrics().widthPixels;
        }
        return -1;
    }

    /* renamed from: P */
    public static List<Sensor> m2154P() {
        if (C9568a.m1959e() != null) {
            return ((SensorManager) C9568a.m1959e().getSystemService("sensor")).getSensorList(-1);
        }
        return null;
    }

    /* renamed from: Q */
    public static ArrayList<String> m2153Q() {
        return m2135b() < 21 ? m2165E() : m2166D();
    }

    /* renamed from: R */
    public static long m2152R() {
        return m2140a(EnumC9500b.TOTAL_MEMORY);
    }

    /* renamed from: S */
    public static String m2151S() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: T */
    public static long m2150T() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: U */
    public static boolean m2149U() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (C9568a.m1959e() == null || (connectivityManager = (ConnectivityManager) C9568a.m1959e().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* renamed from: V */
    public static Boolean m2148V() {
        return m2135b() < 17 ? m2127d0() : m2129c0();
    }

    /* renamed from: W */
    public static boolean m2147W() {
        return C9492a.m2174c();
    }

    /* renamed from: X */
    public static boolean m2146X() {
        return C9503e.m2100b();
    }

    /* renamed from: Y */
    public static boolean m2145Y() {
        try {
            return m2132b("su");
        } catch (Exception e) {
            C9549a.m2023a("Rooted check failed", e);
            return false;
        }
    }

    /* renamed from: Z */
    public static boolean m2144Z() {
        Intent registerReceiver;
        if (C9568a.m1959e() == null || (registerReceiver = C9568a.m1959e().registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE"))) == null) {
            return false;
        }
        return registerReceiver.getBooleanExtra("connected", false);
    }

    /* renamed from: a */
    public static int m2142a(int i) {
        if (C9568a.m1959e() != null) {
            AudioManager audioManager = (AudioManager) C9568a.m1959e().getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getStreamMaxVolume(i);
            }
            return -2;
        }
        return -1;
    }

    /* renamed from: a */
    private static long m2140a(EnumC9500b enumC9500b) {
        int i = C9499a.f18795a[enumC9500b.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = -1;
            }
        }
        RandomAccessFile randomAccessFile = null;
        String str = null;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile("/proc/meminfo", "r");
                for (int i3 = 0; i3 < i2; i3++) {
                    try {
                        str = randomAccessFile3.readLine();
                    } catch (IOException e) {
                        e = e;
                        randomAccessFile = randomAccessFile3;
                        C9549a.m2023a("Error while reading memory info: " + enumC9500b, e);
                        try {
                            randomAccessFile.close();
                            return -1L;
                        } catch (IOException e2) {
                            C9549a.m2023a("Error closing RandomAccessFile", e2);
                            return -1L;
                        }
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile2 = randomAccessFile3;
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e3) {
                            C9549a.m2023a("Error closing RandomAccessFile", e3);
                        }
                        throw th;
                    }
                }
                long m2138a = m2138a(str);
                try {
                    randomAccessFile3.close();
                } catch (IOException e4) {
                    C9549a.m2023a("Error closing RandomAccessFile", e4);
                }
                return m2138a;
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static long m2139a(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round((float) (file.getFreeSpace() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
    }

    /* renamed from: a */
    private static long m2138a(String str) {
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
            String str2 = "";
            while (matcher.find()) {
                str2 = matcher.group(1);
            }
            return Long.parseLong(str2);
        }
        return -1L;
    }

    /* renamed from: a */
    public static String m2143a() {
        return C9492a.m2178a();
    }

    /* renamed from: a */
    public static String m2137a(String str, String str2) {
        return str2 != null ? System.getProperty(str, str2) : System.getProperty(str);
    }

    /* renamed from: a */
    public static JSONObject m2141a(PackageManager packageManager) throws PackageManager.NameNotFoundException, JSONException {
        String m1962b = C9568a.m1962b();
        PackageInfo packageInfo = packageManager.getPackageInfo(m1962b, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("installer", packageManager.getInstallerPackageName(m1962b));
        jSONObject.put("firstInstallTime", packageInfo.firstInstallTime);
        jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
        jSONObject.put("versionCode", packageInfo.versionCode);
        jSONObject.put("versionName", packageInfo.versionName);
        jSONObject.put("packageName", packageInfo.packageName);
        return jSONObject;
    }

    /* renamed from: a0 */
    public static boolean m2136a0() {
        ConnectivityManager connectivityManager;
        if (C9568a.m1959e() == null || (connectivityManager = (ConnectivityManager) C9568a.m1959e().getSystemService("connectivity")) == null) {
            return false;
        }
        TelephonyManager telephonyManager = (TelephonyManager) C9568a.m1959e().getSystemService("phone");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && connectivityManager.getActiveNetworkInfo().isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    public static int m2135b() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    public static int m2134b(int i) {
        if (C9568a.m1959e() != null) {
            AudioManager audioManager = (AudioManager) C9568a.m1959e().getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getStreamVolume(i);
            }
            return -2;
        }
        return -1;
    }

    /* renamed from: b */
    public static long m2133b(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round((float) (file.getTotalSpace() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
    }

    /* renamed from: b */
    private static boolean m2132b(String str) {
        File[] listFiles;
        for (String str2 : System.getenv("PATH").split(":")) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.getName().equals(str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: b0 */
    public static boolean m2131b0() {
        if (C9568a.m1959e() != null) {
            return ((AudioManager) C9568a.m1959e().getSystemService("audio")).isWiredHeadsetOn();
        }
        return false;
    }

    /* renamed from: c */
    public static String m2130c() throws Exception {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(C9568a.m1959e().getPackageCodePath()));
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            String m1992a = C9564j.m1992a(fileInputStream);
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
            return m1992a;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @TargetApi(17)
    /* renamed from: c0 */
    private static Boolean m2129c0() {
        try {
            return Boolean.valueOf(1 == Settings.Global.getInt(C9568a.m1959e().getContentResolver(), "adb_enabled", 0));
        } catch (Exception e) {
            C9549a.m2023a("Problems fetching adb enabled status", e);
            return null;
        }
    }

    /* renamed from: d */
    public static float m2128d() {
        Intent registerReceiver;
        if (C9568a.m1959e() == null || (registerReceiver = C9568a.m1959e().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        return registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
    }

    /* renamed from: d0 */
    private static Boolean m2127d0() {
        try {
            return Boolean.valueOf(1 == Settings.Secure.getInt(C9568a.m1959e().getContentResolver(), "adb_enabled", 0));
        } catch (Exception e) {
            C9549a.m2023a("Problems fetching adb enabled status", e);
            return null;
        }
    }

    /* renamed from: e */
    public static int m2126e() {
        Intent registerReceiver;
        if (C9568a.m1959e() == null || (registerReceiver = C9568a.m1959e().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1;
        }
        return registerReceiver.getIntExtra("status", -1);
    }

    /* renamed from: f */
    public static String m2125f() {
        return Build.BOARD;
    }

    /* renamed from: g */
    public static String m2124g() {
        return Build.BOOTLOADER;
    }

    /* renamed from: h */
    public static String m2123h() {
        return Build.BRAND;
    }

    /* renamed from: i */
    public static String m2122i() {
        return Build.ID;
    }

    /* renamed from: j */
    public static String m2121j() {
        return Build.VERSION.INCREMENTAL;
    }

    /* renamed from: k */
    public static long m2120k() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* renamed from: l */
    public static String m2119l() {
        try {
            Signature[] signatureArr = C9568a.m1959e().getPackageManager().getPackageInfo(C9568a.m1959e().getPackageName(), 64).signatures;
            if (signatureArr != null && signatureArr.length >= 1) {
                return C9564j.m1984b(MessageDigest.getInstance("SHA-1").digest(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded()));
            }
        } catch (Exception e) {
            C9549a.m2023a("Exception when signing certificate fingerprint", e);
        }
        return null;
    }

    /* renamed from: m */
    public static String m2118m() {
        return m2136a0() ? "wifi" : m2149U() ? "cellular" : SchedulerSupport.NONE;
    }

    /* renamed from: n */
    public static String m2117n() {
        return Build.DEVICE;
    }

    /* renamed from: o */
    public static float m2116o() {
        if (C9568a.m1959e() != null) {
            return C9568a.m1959e().getResources().getDisplayMetrics().density;
        }
        return -1.0f;
    }

    /* renamed from: p */
    public static long m2115p() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: q */
    public static String m2114q() {
        return Build.FINGERPRINT;
    }

    /* renamed from: r */
    public static long m2113r() {
        return m2140a(EnumC9500b.FREE_MEMORY);
    }

    /* renamed from: s */
    public static String m2112s() {
        ActivityManager activityManager;
        ConfigurationInfo deviceConfigurationInfo;
        if (C9568a.m1959e() == null || (activityManager = (ActivityManager) C9568a.m1959e().getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) {
            return null;
        }
        return deviceConfigurationInfo.getGlEsVersion();
    }

    /* renamed from: t */
    public static String m2111t() {
        return Build.HARDWARE;
    }

    /* renamed from: u */
    public static String m2110u() {
        return Build.HOST;
    }

    /* renamed from: v */
    public static String m2109v() {
        String m1970e = C9566a.m1970e("unityads-installinfo", "unityads-idfi");
        if (m1970e == null) {
            String m2151S = m2151S();
            C9566a.m1974a("unityads-installinfo", "unityads-idfi", m2151S);
            return m2151S;
        }
        return m1970e;
    }

    /* renamed from: w */
    public static String m2108w() {
        return Build.MANUFACTURER;
    }

    /* renamed from: x */
    public static String m2107x() {
        return Build.MODEL;
    }

    /* renamed from: y */
    public static String m2106y() {
        return C9568a.m1959e() != null ? ((TelephonyManager) C9568a.m1959e().getSystemService("phone")).getNetworkCountryIso() : "";
    }

    /* renamed from: z */
    public static boolean m2105z() {
        ConnectivityManager connectivityManager;
        if (C9568a.m1959e() == null || (connectivityManager = (ConnectivityManager) C9568a.m1959e().getSystemService("connectivity")) == null) {
            return false;
        }
        return connectivityManager.isActiveNetworkMetered();
    }
}
