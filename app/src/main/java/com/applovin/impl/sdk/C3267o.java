package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.p032d.C3126g;
import com.applovin.impl.sdk.p033e.C3143f;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.C3289c;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.C3335m;
import com.applovin.impl.sdk.utils.C3339p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.p064ws.RealWebSocket;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.o */
/* loaded from: classes.dex */
public class C3267o {

    /* renamed from: h */
    private static final AtomicReference<C3273a> f8621h = new AtomicReference<>();

    /* renamed from: j */
    private static final AtomicReference<C3274b> f8622j = new AtomicReference<>();

    /* renamed from: a */
    private final C3214m f8623a;

    /* renamed from: b */
    private final C3349v f8624b;

    /* renamed from: c */
    private final Context f8625c;

    /* renamed from: d */
    private final Map<String, Object> f8626d;

    /* renamed from: f */
    private final Map<String, Object> f8628f;

    /* renamed from: g */
    private boolean f8629g;

    /* renamed from: e */
    private final Object f8627e = new Object();

    /* renamed from: i */
    private final AtomicReference<Integer> f8630i = new AtomicReference<>();

    /* renamed from: com.applovin.impl.sdk.o$a */
    /* loaded from: classes.dex */
    public static class C3273a {

        /* renamed from: a */
        public boolean f8636a;

        /* renamed from: b */
        public String f8637b = "";
    }

    /* renamed from: com.applovin.impl.sdk.o$b */
    /* loaded from: classes.dex */
    public static class C3274b {

        /* renamed from: a */
        public final String f8638a;

        /* renamed from: b */
        public final int f8639b;

        public C3274b(String str, int i) {
            this.f8638a = str;
            this.f8639b = i;
        }
    }

    /* renamed from: com.applovin.impl.sdk.o$c */
    /* loaded from: classes.dex */
    public static class C3275c {

        /* renamed from: a */
        public int f8640a = -1;

        /* renamed from: b */
        public int f8641b = -1;
    }

    public C3267o(C3214m c3214m) {
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8623a = c3214m;
        this.f8624b = c3214m.m7487A();
        this.f8625c = c3214m.m7476L();
        this.f8626d = m7123q();
        this.f8628f = m7121s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* renamed from: A */
    public Integer m7160A() {
        AudioManager audioManager = (AudioManager) this.f8625c.getSystemService("audio");
        if (audioManager != null) {
            return Integer.valueOf((int) (audioManager.getStreamVolume(3) * ((Float) this.f8623a.m7456a(C3109b.f7964dL)).floatValue()));
        }
        return null;
    }

    /* renamed from: B */
    private double m7159B() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* renamed from: C */
    private boolean m7158C() {
        SensorManager sensorManager = (SensorManager) this.f8625c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    /* renamed from: D */
    private String m7157D() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8625c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    /* renamed from: E */
    private String m7156E() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8625c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(0, Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    this.f8624b.m6854b("DataCollector", "Unable to collect mobile country code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    /* renamed from: F */
    private String m7155F() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8625c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    this.f8624b.m6854b("DataCollector", "Unable to collect mobile network code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    /* renamed from: G */
    private String m7154G() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8625c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    this.f8624b.m6854b("DataCollector", "Unable to collect carrier", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    /* renamed from: H */
    private boolean m7153H() {
        try {
            if (!m7152I()) {
                if (!m7151J()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: I */
    private boolean m7152I() {
        String str = Build.TAGS;
        return str != null && str.contains(m7138b("lz}$blpz"));
    }

    /* renamed from: J */
    private boolean m7151J() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i = 0; i < 9; i++) {
            if (new File(m7138b(strArr[i])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private String m7149a(int i) {
        if (i == 1) {
            return "receiver";
        }
        if (i == 2) {
            return "speaker";
        }
        if (i == 4 || i == 3) {
            return "headphones";
        }
        if (i == 8) {
            return "bluetootha2dpoutput";
        }
        if (i == 13 || i == 19 || i == 5 || i == 6 || i == 12 || i == 11) {
            return "lineout";
        }
        if (i == 9 || i == 10) {
            return "hdmioutput";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:1|(43:3|(1:5)(2:105|(1:107))|6|(1:8)|9|(1:12)|13|(1:15)|16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)|28|(1:30)|(1:32)(1:104)|(1:34)|35|36|37|(2:41|(1:43))|44|(2:92|93)|46|(2:48|(2:50|51))|57|(1:63)|64|(2:66|(1:68))|69|(1:71)|72|(1:76)|77|(1:81)|82|(1:86)|87|(1:89)|90)|108|6|(0)|9|(1:12)|13|(0)|16|(0)|19|(0)|22|(0)|25|(0)|28|(0)|(0)(0)|(0)|35|36|37|(3:39|41|(0))|44|(0)|46|(0)|57|(3:59|61|63)|64|(0)|69|(0)|72|(2:74|76)|77|(2:79|81)|82|(2:84|86)|87|(0)|90) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016f, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0174, code lost:
        if (com.applovin.impl.sdk.C3349v.m6862a() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0176, code lost:
        r9.f8624b.m6854b("DataCollector", "Unable to collect screen brightness", r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d2  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.Object> m7144a(java.util.Map<java.lang.String, java.lang.Object> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C3267o.m7144a(java.util.Map, boolean):java.util.Map");
    }

    /* renamed from: a */
    public static void m7148a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.sdk.o.1
            @Override // java.lang.Runnable
            public void run() {
                C3267o.f8621h.set(C3289c.m7042a(context));
            }
        }).start();
    }

    /* renamed from: a */
    private void m7145a(Map<String, Object> map) {
        if (((Boolean) this.f8623a.m7456a(C3109b.f7959dG)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(m7117w()));
        }
        if (((Boolean) this.f8623a.m7456a(C3109b.f7960dH)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(m7116x()));
        }
        if (((Boolean) this.f8623a.m7456a(C3109b.f7966dN)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f8623a)) {
            C3072ab.m8010b(this.f8623a);
        }
        if (((Boolean) this.f8623a.m7456a(C3109b.f7965dM)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (!((Boolean) this.f8623a.m7456a(C3109b.f7962dJ)).booleanValue() || map.containsKey("network_restricted")) {
            return;
        }
        map.put("network_restricted", Boolean.valueOf(m7119u()));
    }

    /* renamed from: a */
    private boolean m7146a(String str) {
        try {
            return Settings.Secure.getInt(this.f8625c.getContentResolver(), str) == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private String m7138b(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i2 = 9; i2 >= 0; i2--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i2]);
            }
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static void m7140b(final Context context) {
        if (Utils.checkClassExistence("com.google.android.gms.appset.AppSet")) {
            new Thread(new Runnable() { // from class: com.applovin.impl.sdk.o.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.applovin.impl.sdk.o.2.1
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            /* renamed from: a */
                            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                                C3267o.f8622j.set(new C3274b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                            }
                        });
                    } catch (Throwable unused) {
                        if (C3349v.m6862a()) {
                            C3349v.m6849f("DataCollector", "Could not collect AppSet ID.");
                        }
                    }
                }
            }).start();
        } else if (C3349v.m6862a()) {
            C3349v.m6849f("DataCollector", "Could not collect AppSet ID.");
        }
    }

    /* renamed from: p */
    private Map<String, String> m7124p() {
        return Utils.stringifyObjectMap(m7143a(null, true, false));
    }

    /* renamed from: q */
    private Map<String, Object> m7123q() {
        HashMap hashMap = new HashMap(32);
        hashMap.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        hashMap.put("aida", Boolean.valueOf(C3289c.m7043a()));
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put("model", Build.MODEL);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("platform", m7134f());
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(m7159B()));
        hashMap.put("gy", Boolean.valueOf(m7158C()));
        hashMap.put("country_code", m7157D());
        hashMap.put("mcc", m7156E());
        hashMap.put("mnc", m7155F());
        hashMap.put("carrier", m7154G());
        hashMap.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f8625c)));
        hashMap.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f8625c)));
        DisplayMetrics displayMetrics = this.f8625c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point m7027a = C3294g.m7027a(this.f8625c);
            hashMap.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(m7027a.y, 2.0d) + Math.pow(m7027a.x, 2.0d)) / displayMetrics.xdpi));
        }
        hashMap.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        m7145a(hashMap);
        return hashMap;
    }

    /* renamed from: r */
    private String m7122r() {
        int orientation = Utils.getOrientation(this.f8625c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : SchedulerSupport.NONE;
    }

    /* renamed from: s */
    private Map<String, Object> m7121s() {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap(20);
        PackageManager packageManager = this.f8625c.getPackageManager();
        ApplicationInfo applicationInfo = this.f8625c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f8625c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        hashMap.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        hashMap.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        hashMap.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        hashMap.put("package_name", applicationInfo.packageName);
        hashMap.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str == null) {
            str = "";
        }
        hashMap.put("installer_name", str);
        hashMap.put("tg", C3339p.m6895a(this.f8623a));
        hashMap.put("debug", Boolean.valueOf(Utils.isPubInDebugMode(this.f8623a.m7476L(), this.f8623a)));
        hashMap.put("ia", Long.valueOf(lastModified));
        C3214m c3214m = this.f8623a;
        C3111d<Long> c3111d = C3111d.f8068d;
        Long l = (Long) c3214m.m7454a(c3111d);
        if (l != null) {
            hashMap.put("ia_v2", l);
        } else {
            this.f8623a.m7453a((C3111d<C3111d<Long>>) c3111d, (C3111d<Long>) Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.f8623a.m7428al().m8049c());
        String userEngagementSdkVersion = Utils.getUserEngagementSdkVersion();
        if (StringUtils.isValidString(userEngagementSdkVersion)) {
            hashMap.put("ue_sdk_version", userEngagementSdkVersion);
        }
        hashMap.put("api_did", this.f8623a.m7456a(C3109b.f7792X));
        hashMap.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        hashMap.put("epv", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
        return hashMap;
    }

    /* renamed from: t */
    private Map<String, Object> m7120t() {
        HashMap hashMap = new HashMap(2);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f8625c);
        String str = (String) this.f8623a.m7420b(C3111d.f8078n, null, defaultSharedPreferences);
        if (StringUtils.isValidString(str)) {
            hashMap.put("IABTCF_TCString", str);
        }
        Object obj = defaultSharedPreferences.getAll().get(C3111d.f8079o.m7795a());
        if ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)) {
            hashMap.put("IABTCF_gdprApplies", obj);
        }
        return hashMap;
    }

    /* renamed from: u */
    private boolean m7119u() {
        ConnectivityManager connectivityManager;
        int restrictBackgroundStatus;
        if (C3294g.m7021f() && (connectivityManager = (ConnectivityManager) this.f8625c.getSystemService("connectivity")) != null) {
            try {
                restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                return restrictBackgroundStatus == 3;
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    this.f8623a.m7487A().m6854b("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    private C3275c m7118v() {
        C3275c c3275c = new C3275c();
        Intent registerReceiver = this.f8625c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            c3275c.f8641b = -1;
        } else {
            c3275c.f8641b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        c3275c.f8640a = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return c3275c;
    }

    /* renamed from: w */
    private long m7117w() {
        List asList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.f8625c.getContentResolver(), "enabled_accessibility_services")).split(":"));
        long j = asList.contains("AccessibilityMenuService") ? 256L : 0L;
        if (asList.contains("SelectToSpeakService")) {
            j |= 512;
        }
        if (asList.contains("SoundAmplifierService")) {
            j |= 2;
        }
        if (asList.contains("SpeechToTextAccessibilityService")) {
            j |= 128;
        }
        if (asList.contains("SwitchAccessService")) {
            j |= 4;
        }
        if ((this.f8625c.getResources().getConfiguration().uiMode & 48) == 32) {
            j |= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
        if (m7146a("accessibility_enabled")) {
            j |= 8;
        }
        if (m7146a("touch_exploration_enabled")) {
            j |= 16;
        }
        if (C3294g.m7023d()) {
            if (m7146a("accessibility_display_inversion_enabled")) {
                j |= 32;
            }
            return m7146a("skip_first_use_hints") ? j | 64 : j;
        }
        return j;
    }

    /* renamed from: x */
    private float m7116x() {
        try {
            return Settings.System.getFloat(this.f8625c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            if (C3349v.m6862a()) {
                this.f8624b.m6854b("DataCollector", "Error collecting font scale", e);
                return -1.0f;
            }
            return -1.0f;
        }
    }

    /* renamed from: y */
    private String m7115y() {
        AudioManager audioManager = (AudioManager) this.f8625c.getSystemService("audio");
        if (audioManager != null) {
            StringBuilder sb = new StringBuilder();
            if (C3294g.m7022e()) {
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    String m7149a = m7149a(audioDeviceInfo.getType());
                    if (!TextUtils.isEmpty(m7149a)) {
                        sb.append(m7149a);
                        sb.append(",");
                    }
                }
            } else {
                if (audioManager.isWiredHeadsetOn()) {
                    sb.append("headphones,");
                }
                if (audioManager.isBluetoothA2dpOn()) {
                    sb.append("bluetootha2dpoutput");
                }
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            if (C3349v.m6862a() && TextUtils.isEmpty(sb2)) {
                this.f8624b.m6855b("DataCollector", "No sound outputs detected");
            }
            return sb2;
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0020 */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m7114z() {
        /*
            r5 = this;
            boolean r0 = com.applovin.impl.sdk.utils.C3294g.m7021f()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r0.<init>()     // Catch: java.lang.Throwable -> L53
            android.content.Context r2 = r5.f8625c     // Catch: java.lang.Throwable -> L53
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L53
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Throwable -> L53
            android.os.LocaleList r2 = androidx.appcompat.app.C0139n.m12939b(r2)     // Catch: java.lang.Throwable -> L53
            r3 = 0
        L1c:
            int r4 = androidx.core.p003os.C0744l.m11845a(r2)     // Catch: java.lang.Throwable -> L53
            if (r3 >= r4) goto L31
            java.util.Locale r4 = androidx.core.p003os.C0743k.m11847a(r2, r3)     // Catch: java.lang.Throwable -> L53
            r0.append(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = ","
            r0.append(r4)     // Catch: java.lang.Throwable -> L53
            int r3 = r3 + 1
            goto L1c
        L31:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L53
            if (r2 <= 0) goto L4e
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + (-1)
            char r2 = r0.charAt(r2)     // Catch: java.lang.Throwable -> L53
            r3 = 44
            if (r2 != r3) goto L4e
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + (-1)
            r0.deleteCharAt(r2)     // Catch: java.lang.Throwable -> L53
        L4e:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53
            return r0
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C3267o.m7114z():java.lang.String");
    }

    /* renamed from: a */
    public String m7150a() {
        String encodeToString = Base64.encodeToString(new JSONObject(m7124p()).toString().getBytes(Charset.defaultCharset()), 2);
        if (((Boolean) this.f8623a.m7456a(C3109b.f8045eq)).booleanValue()) {
            return C3335m.m6918a(encodeToString, this.f8623a.m7386z(), Utils.getServerAdjustedUnixTimestampMillis(this.f8623a));
        }
        return encodeToString;
    }

    /* renamed from: a */
    public Map<String, Object> m7143a(@Nullable Map<String, String> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap(64);
        Map<String, Object> m7142a = m7142a(z);
        Map<String, Object> m7132h = m7132h();
        Map<String, Object> m7130j = m7130j();
        Map<String, String> allData = this.f8623a.m7394r().getAllData();
        if (z2) {
            hashMap.put("device_info", m7142a);
            hashMap.put("app_info", m7132h);
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (m7130j != null) {
                hashMap.put("location_info", m7130j);
            }
            if (!allData.isEmpty()) {
                hashMap.put("targeting_data", allData);
            }
        } else {
            hashMap.putAll(m7142a);
            hashMap.putAll(m7132h);
            if (map != null) {
                hashMap.putAll(map);
            }
            if (m7130j != null) {
                hashMap.putAll(m7130j);
            }
            if (!allData.isEmpty()) {
                hashMap.putAll(allData);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        Utils.putObjectForStringIfValid("mediation_provider", this.f8623a.m7392t(), hashMap);
        Utils.putObjectForStringIfValid("plugin_version", (String) this.f8623a.m7456a(C3109b.f8004dz), hashMap);
        if (!((Boolean) this.f8623a.m7456a(C3109b.f8044ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8623a.m7386z());
        }
        hashMap.putAll(m7131i());
        if (((Boolean) this.f8623a.m7456a(C3109b.f7978dZ)).booleanValue()) {
            C3126g m7468T = this.f8623a.m7468T();
            hashMap.put("li", Long.valueOf(m7468T.m7716b(C3125f.f8162b)));
            hashMap.put("si", Long.valueOf(m7468T.m7716b(C3125f.f8164d)));
            hashMap.put("pf", Long.valueOf(m7468T.m7716b(C3125f.f8168h)));
            hashMap.put("mpf", Long.valueOf(m7468T.m7716b(C3125f.f8175o)));
            hashMap.put("gpf", Long.valueOf(m7468T.m7716b(C3125f.f8169i)));
            hashMap.put("asoac", Long.valueOf(m7468T.m7716b(C3125f.f8173m)));
        }
        hashMap.put("rid", UUID.randomUUID().toString());
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, Object> m7142a(boolean z) {
        HashMap hashMap;
        synchronized (this.f8627e) {
            hashMap = new HashMap(this.f8626d);
        }
        return m7144a(hashMap, z);
    }

    /* renamed from: b */
    public Map<String, Object> m7141b() {
        return new HashMap(this.f8626d);
    }

    /* renamed from: c */
    public Map<String, Object> m7137c() {
        return new HashMap(this.f8628f);
    }

    /* renamed from: d */
    public Map<String, Object> m7136d() {
        return m7142a(false);
    }

    /* renamed from: e */
    public void m7135e() {
        synchronized (this.f8627e) {
            m7145a(this.f8626d);
        }
    }

    /* renamed from: f */
    public String m7134f() {
        return AppLovinSdkUtils.isFireOS(this.f8625c) ? "fireos" : "android";
    }

    /* renamed from: g */
    public boolean m7133g() {
        return this.f8629g;
    }

    /* renamed from: h */
    public Map<String, Object> m7132h() {
        HashMap hashMap = new HashMap(this.f8628f);
        hashMap.put("first_install", Boolean.valueOf(this.f8623a.m7472P()));
        hashMap.put("first_install_v2", Boolean.valueOf(!this.f8623a.m7471Q()));
        hashMap.put("test_ads", Boolean.valueOf(this.f8629g));
        if (((Boolean) this.f8623a.m7456a(C3109b.f7996dr)).booleanValue()) {
            Utils.putObjectForStringIfValid("cuid", this.f8623a.m7399m(), hashMap);
        }
        if (((Boolean) this.f8623a.m7456a(C3109b.f7999du)).booleanValue()) {
            hashMap.put("compass_random_token", this.f8623a.m7398n());
        }
        if (((Boolean) this.f8623a.m7456a(C3109b.f8001dw)).booleanValue()) {
            hashMap.put("applovin_random_token", this.f8623a.m7397o());
        }
        String name = this.f8623a.m7395q().getName();
        if (StringUtils.isValidString(name)) {
            hashMap.put("user_segment_name", name);
        }
        hashMap.putAll(m7120t());
        return hashMap;
    }

    /* renamed from: i */
    public Map<String, Object> m7131i() {
        HashMap hashMap = new HashMap(5);
        hashMap.put("sc", this.f8623a.m7456a(C3109b.f7824ac));
        hashMap.put("sc2", this.f8623a.m7456a(C3109b.f7825ad));
        hashMap.put("sc3", this.f8623a.m7456a(C3109b.f7826ae));
        hashMap.put("server_installed_at", this.f8623a.m7456a(C3109b.f7827af));
        Utils.putObjectForStringIfValid("persisted_data", (String) this.f8623a.m7454a(C3111d.f8090z), hashMap);
        return hashMap;
    }

    @Nullable
    /* renamed from: j */
    public Map<String, Object> m7130j() {
        if (this.f8623a.m7396p().isLocationCollectionEnabled() && ((Boolean) this.f8623a.m7456a(C3109b.f7975dW)).booleanValue()) {
            HashMap hashMap = new HashMap(4);
            C3283u m7427am = this.f8623a.m7427am();
            boolean m7056b = m7427am.m7056b();
            hashMap.put("loc_services_enabled", Boolean.valueOf(m7056b));
            if (m7056b) {
                hashMap.put("loc_auth", Boolean.valueOf(m7427am.m7058a()));
                C3282t m7055c = m7427am.m7055c();
                if (m7055c != null) {
                    double m7061a = m7055c.m7061a();
                    C3214m c3214m = this.f8623a;
                    C3109b<Integer> c3109b = C3109b.f7977dY;
                    hashMap.put("loc_lat", Utils.formatDoubleValue(m7061a, ((Integer) c3214m.m7456a(c3109b)).intValue()));
                    hashMap.put("loc_long", Utils.formatDoubleValue(m7055c.m7060b(), ((Integer) this.f8623a.m7456a(c3109b)).intValue()));
                }
                return hashMap;
            }
            return hashMap;
        }
        return null;
    }

    /* renamed from: k */
    public C3273a m7129k() {
        List<String> testDeviceAdvertisingIds;
        C3273a m7042a = C3289c.m7042a(this.f8625c);
        if (m7042a == null) {
            return new C3273a();
        }
        if (((Boolean) this.f8623a.m7456a(C3109b.f7994dp)).booleanValue()) {
            if (m7042a.f8636a && !((Boolean) this.f8623a.m7456a(C3109b.f7993do)).booleanValue()) {
                m7042a.f8637b = "";
            }
            f8621h.set(m7042a);
        } else {
            m7042a = new C3273a();
        }
        boolean z = false;
        if (StringUtils.isValidString(m7042a.f8637b) && (testDeviceAdvertisingIds = this.f8623a.m7396p().getTestDeviceAdvertisingIds()) != null && testDeviceAdvertisingIds.contains(m7042a.f8637b)) {
            z = true;
        }
        this.f8629g = z;
        return m7042a;
    }

    @Nullable
    /* renamed from: l */
    public C3274b m7128l() {
        return f8622j.get();
    }

    /* renamed from: m */
    public void m7127m() {
        this.f8623a.m7469S().m7620a(new C3143f(this.f8623a, new C3143f.InterfaceC3144a() { // from class: com.applovin.impl.sdk.o.3
            @Override // com.applovin.impl.sdk.p033e.C3143f.InterfaceC3144a
            /* renamed from: a */
            public void mo7112a(C3273a c3273a) {
                C3267o.f8621h.set(c3273a);
            }
        }), C3163o.EnumC3165a.ADVERTISING_INFO_COLLECTION);
        this.f8623a.m7469S().m7620a(new C3189z(this.f8623a, true, new Runnable() { // from class: com.applovin.impl.sdk.o.4
            @Override // java.lang.Runnable
            public void run() {
                C3267o.this.f8630i.set(C3267o.this.m7160A());
            }
        }), C3163o.EnumC3165a.CACHING_OTHER);
    }
}
