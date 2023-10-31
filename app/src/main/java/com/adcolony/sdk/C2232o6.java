package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0485b;
import androidx.constraintlayout.core.C0499a;
import androidx.datastore.preferences.protobuf.C1169e;
import androidx.preference.PreferenceManager;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.o6 */
/* loaded from: classes.dex */
public final class C2232o6 {

    /* renamed from: a */
    public static final ThreadPoolExecutor f5446a = m9563A();

    /* renamed from: b */
    public static Handler f5447b;

    /* renamed from: com.adcolony.sdk.o6$a */
    /* loaded from: classes.dex */
    public interface InterfaceRunnableC2233a extends Runnable {
        /* renamed from: a */
        boolean mo9518a();
    }

    /* renamed from: com.adcolony.sdk.o6$b */
    /* loaded from: classes.dex */
    public static class C2234b {

        /* renamed from: a */
        public long f5448a;

        /* renamed from: b */
        public long f5449b;

        public C2234b(long j) {
            this.f5449b = System.currentTimeMillis();
            this.f5448a = j;
            this.f5449b = System.currentTimeMillis() + this.f5448a;
        }

        /* renamed from: a */
        public final long m9536a() {
            long currentTimeMillis = this.f5449b - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                return 0L;
            }
            return currentTimeMillis;
        }

        @NonNull
        public final String toString() {
            return String.valueOf(m9536a() / 1000.0d);
        }
    }

    /* renamed from: A */
    public static ThreadPoolExecutor m9563A() {
        return new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* renamed from: a */
    public static double m9562a(AudioManager audioManager) {
        String sb;
        if (audioManager == null) {
            sb = "getAudioVolume() called with a null AudioManager";
        } else {
            try {
                double streamVolume = audioManager.getStreamVolume(3);
                double streamMaxVolume = audioManager.getStreamMaxVolume(3);
                if (streamMaxVolume == 0.0d) {
                    return 0.0d;
                }
                return streamVolume / streamMaxVolume;
            } catch (Exception e) {
                StringBuilder m12383b = C0499a.m12383b("Exception occurred when accessing AudioManager: ");
                m12383b.append(e.toString());
                sb = m12383b.toString();
            }
        }
        C1169e.m11129c(sb, 0, 0, true);
        return 0.0d;
    }

    /* renamed from: b */
    public static int m9561b(C2218o0 c2218o0) {
        if (c2218o0 == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        c2218o0.getLocationOnScreen(iArr);
        C2201m0.m9588d().m9691l().getClass();
        return (int) (iArr[0] / C2247p4.m9524g());
    }

    /* renamed from: c */
    public static AudioManager m9560c(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: d */
    public static String m9559d() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: e */
    public static String m9558e(C2328v1 c2328v1) throws JSONException {
        StringBuilder m12383b;
        String str;
        String str2 = "";
        for (int i = 0; i < c2328v1.m9484c(); i++) {
            if (i > 0) {
                str2 = C0063d.m13053a(str2, ",");
            }
            switch (c2328v1.f5642a.getInt(i)) {
                case 1:
                    m12383b = C0499a.m12383b(str2);
                    str = "MO";
                    break;
                case 2:
                    m12383b = C0499a.m12383b(str2);
                    str = "TU";
                    break;
                case 3:
                    m12383b = C0499a.m12383b(str2);
                    str = "WE";
                    break;
                case 4:
                    m12383b = C0499a.m12383b(str2);
                    str = "TH";
                    break;
                case 5:
                    m12383b = C0499a.m12383b(str2);
                    str = "FR";
                    break;
                case 6:
                    m12383b = C0499a.m12383b(str2);
                    str = "SA";
                    break;
                case 7:
                    m12383b = C0499a.m12383b(str2);
                    str = "SU";
                    break;
                default:
            }
            m12383b.append(str);
            str2 = m12383b.toString();
        }
        return str2;
    }

    /* renamed from: f */
    public static void m9557f(@Nullable InterfaceRunnableC2233a interfaceRunnableC2233a) {
        Handler m9542u;
        if (interfaceRunnableC2233a == null || (m9542u = m9542u()) == null) {
            return;
        }
        m9542u.removeCallbacks(interfaceRunnableC2233a);
        if (interfaceRunnableC2233a.mo9518a()) {
            return;
        }
        if (m9542u.getLooper() == Looper.myLooper()) {
            interfaceRunnableC2233a.run();
        } else {
            m9542u.post(interfaceRunnableC2233a);
        }
    }

    /* renamed from: g */
    public static void m9556g(@Nullable Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        if (j <= 0) {
            m9548o(runnable);
            return;
        }
        Handler m9542u = m9542u();
        if (m9542u != null) {
            m9542u.postDelayed(runnable, j);
        }
    }

    /* renamed from: h */
    public static void m9555h(String str) {
        Context context = C2201m0.f5363a;
        if (context != null) {
            m9548o(new RunnableC2216n6(context, str));
        }
    }

    /* renamed from: i */
    public static boolean m9554i(Intent intent, boolean z) {
        boolean z2;
        try {
            Context context = C2201m0.f5363a;
            if (context == null) {
                return false;
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            C2249q c2249q = C2201m0.m9588d().f4997o;
            if (c2249q != null) {
                C2120g4 c2120g4 = c2249q.f5480e;
                if (c2120g4 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c2120g4.f5144h = true;
                }
            }
            if (z) {
                intent = Intent.createChooser(intent, "Handle this via...");
            }
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            C1169e.m11129c(e.toString(), 0, 1, true);
            return false;
        }
    }

    /* renamed from: j */
    public static int m9553j(C2218o0 c2218o0) {
        if (c2218o0 == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        c2218o0.getLocationOnScreen(iArr);
        C2201m0.m9588d().m9691l().getClass();
        return (int) (iArr[1] / C2247p4.m9524g());
    }

    /* renamed from: k */
    public static String m9552k(@NonNull Context context, @NonNull String str) {
        try {
            return m9547p(context).getString(str, null);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Key " + str + " in SharedPreferences ");
            sb.append("does not have a String value.");
            C1169e.m11129c(sb.toString(), 0, 1, true);
            return null;
        }
    }

    /* renamed from: l */
    public static String m9551l(C2328v1 c2328v1) throws JSONException {
        String str = "";
        for (int i = 0; i < c2328v1.m9484c(); i++) {
            if (i > 0) {
                str = C0063d.m13053a(str, ",");
            }
            StringBuilder m12383b = C0499a.m12383b(str);
            m12383b.append(c2328v1.f5642a.getInt(i));
            str = m12383b.toString();
        }
        return str;
    }

    /* renamed from: m */
    public static String m9550m(String str) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("iso-8859-1"), 0, str.length());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                int i2 = (b >>> 4) & 15;
                int i3 = 0;
                while (true) {
                    if (i2 >= 0 && i2 <= 9) {
                        i = i2 + 48;
                    } else {
                        i = (i2 - 10) + 97;
                    }
                    sb.append((char) i);
                    i2 = b & 15;
                    int i4 = i3 + 1;
                    if (i3 >= 1) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static boolean m9549n(AudioManager audioManager) {
        String sb;
        if (audioManager == null) {
            sb = "isAudioEnabled() called with a null AudioManager";
        } else {
            try {
                if (audioManager.getStreamVolume(3) > 0) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                StringBuilder m12383b = C0499a.m12383b("Exception occurred when accessing AudioManager.getStreamVolume: ");
                m12383b.append(e.toString());
                sb = m12383b.toString();
            }
        }
        C1169e.m11129c(sb, 0, 0, true);
        return false;
    }

    /* renamed from: o */
    public static boolean m9548o(@Nullable Runnable runnable) {
        Handler m9542u;
        if (runnable == null || (m9542u = m9542u()) == null) {
            return false;
        }
        if (m9542u.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return m9542u.post(runnable);
    }

    /* renamed from: p */
    public static SharedPreferences m9547p(@NonNull Context context) {
        try {
            Class.forName("androidx.preference.PreferenceManager");
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    /* renamed from: q */
    public static String m9546q() {
        Context context = C2201m0.f5363a;
        if (context == null) {
            return "1.0";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            C1169e.m11129c("Failed to retrieve package info.", 0, 0, true);
            return "1.0";
        }
    }

    /* renamed from: r */
    public static void m9545r(@Nullable Runnable runnable) {
        Handler m9542u;
        if (runnable == null || (m9542u = m9542u()) == null) {
            return;
        }
        m9542u.removeCallbacks(runnable);
    }

    /* renamed from: s */
    public static boolean m9544s(String str) {
        Application application;
        Context context = C2201m0.f5363a;
        if (context == null) {
            return false;
        }
        try {
            if (context instanceof Application) {
                application = (Application) context;
            } else {
                application = ((Activity) context).getApplication();
            }
            application.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static int m9543t(String str) {
        if (str.equals("portrait")) {
            return 0;
        }
        return !str.equals("landscape") ? -1 : 1;
    }

    /* renamed from: u */
    public static Handler m9542u() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return null;
        }
        if (f5447b == null) {
            f5447b = new Handler(mainLooper);
        }
        return f5447b;
    }

    /* renamed from: v */
    public static boolean m9541v(String str) {
        if (str != null && str.length() <= 128) {
            return true;
        }
        C1169e.m11129c("String must be non-null and the max length is 128 characters.", 0, 1, false);
        return false;
    }

    /* renamed from: w */
    public static int m9540w(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            C1169e.m11129c(C0485b.m12391a("Unable to parse '", str, "' as a color."), 0, 1, true);
            return -16777216;
        }
    }

    /* renamed from: x */
    public static String m9539x() {
        Context context = C2201m0.f5363a;
        if ((context instanceof Activity) && context.getResources().getConfiguration().orientation == 1) {
            return "portrait";
        }
        return "landscape";
    }

    /* renamed from: y */
    public static Date m9538y(String str) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", locale);
        try {
            try {
                try {
                    return simpleDateFormat.parse(str);
                } catch (Exception unused) {
                    return new SimpleDateFormat("yyyy-MM-dd", locale).parse(str);
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).parse(str);
        }
    }

    /* renamed from: z */
    public static boolean m9537z() {
        boolean isInMultiWindowMode;
        Context context = C2201m0.f5363a;
        if (context != null && Build.VERSION.SDK_INT >= 24 && (context instanceof Activity)) {
            isInMultiWindowMode = ((Activity) context).isInMultiWindowMode();
            if (isInMultiWindowMode) {
                return true;
            }
        }
        return false;
    }
}
