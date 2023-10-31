package com.vungle.warren.log;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.C8686j;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.persistence.C9914a;
import com.vungle.warren.persistence.C9924e;
import com.vungle.warren.utility.C10111y;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.vungle.warren.log.f */
/* loaded from: classes3.dex */
public final class C9835f {

    /* renamed from: o */
    public static String f19640o = "com.vungle";

    /* renamed from: a */
    public final C9840h f19641a;

    /* renamed from: b */
    public final C9843j f19642b;

    /* renamed from: c */
    public final Executor f19643c;

    /* renamed from: d */
    public final C9924e f19644d;

    /* renamed from: e */
    public C9833d f19645e;

    /* renamed from: f */
    public final AtomicBoolean f19646f;

    /* renamed from: g */
    public final AtomicBoolean f19647g;

    /* renamed from: h */
    public String f19648h;

    /* renamed from: i */
    public final AtomicInteger f19649i;

    /* renamed from: j */
    public boolean f19650j;

    /* renamed from: k */
    public final String f19651k;

    /* renamed from: l */
    public final ConcurrentHashMap f19652l;

    /* renamed from: m */
    public final C8686j f19653m;

    /* renamed from: n */
    public final C9837b f19654n;

    /* renamed from: com.vungle.warren.log.f$a */
    /* loaded from: classes3.dex */
    public class RunnableC9836a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19655a;

        /* renamed from: b */
        public final /* synthetic */ VungleLogger.LoggerLevel f19656b;

        /* renamed from: c */
        public final /* synthetic */ String f19657c;

        /* renamed from: d */
        public final /* synthetic */ String f19658d;

        /* renamed from: e */
        public final /* synthetic */ String f19659e;

        /* renamed from: f */
        public final /* synthetic */ String f19660f;

        public RunnableC9836a(String str, VungleLogger.LoggerLevel loggerLevel, String str2, String str3, String str4, String str5) {
            this.f19655a = str;
            this.f19656b = loggerLevel;
            this.f19657c = str2;
            this.f19658d = str3;
            this.f19659e = str4;
            this.f19660f = str5;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String m3230h;
            C9835f c9835f = C9835f.this;
            if (c9835f.f19646f.get()) {
                String str = this.f19655a;
                String loggerLevel = this.f19656b.toString();
                String str2 = this.f19657c;
                String str3 = this.f19658d;
                String str4 = c9835f.f19651k;
                ConcurrentHashMap concurrentHashMap = c9835f.f19652l;
                if (concurrentHashMap.isEmpty()) {
                    m3230h = null;
                } else {
                    m3230h = c9835f.f19653m.m3230h(concurrentHashMap);
                }
                String str5 = this.f19659e;
                String str6 = this.f19660f;
                C9840h c9840h = c9835f.f19641a;
                c9840h.getClass();
                String id = TimeZone.getDefault().getID();
                C9834e c9834e = new C9834e(str, loggerLevel, str2, str3, str4, id, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date(System.currentTimeMillis())), m3230h, str5, str6);
                File file = c9840h.f19666e;
                String m1489b = c9834e.m1489b();
                C9839g c9839g = new C9839g(c9840h);
                if (file == null || !file.exists()) {
                    Log.d("h", "current log file maybe deleted, create new one.");
                    File m1484e = c9840h.m1484e();
                    c9840h.f19666e = m1484e;
                    if (m1484e != null && m1484e.exists()) {
                        file = m1484e;
                    } else {
                        Log.w("h", "Can't create log file, maybe no space left.");
                        return;
                    }
                }
                C9831c.m1494a(file, m1489b, c9839g);
            }
        }
    }

    /* renamed from: com.vungle.warren.log.f$b */
    /* loaded from: classes3.dex */
    public class C9837b implements InterfaceC9838c {
        public C9837b() {
        }
    }

    /* renamed from: com.vungle.warren.log.f$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9838c {
    }

    public C9835f(@NonNull Context context, @NonNull C9914a c9914a, @NonNull VungleApiClient vungleApiClient, @NonNull C10111y c10111y, @NonNull C9924e c9924e) {
        C9840h c9840h = new C9840h(c9914a.m1417d());
        C9843j c9843j = new C9843j(vungleApiClient, c9924e);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f19646f = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.f19647g = atomicBoolean2;
        this.f19648h = f19640o;
        AtomicInteger atomicInteger = new AtomicInteger(5);
        this.f19649i = atomicInteger;
        this.f19650j = false;
        this.f19652l = new ConcurrentHashMap();
        this.f19653m = new C8686j();
        C9837b c9837b = new C9837b();
        this.f19654n = c9837b;
        this.f19651k = context.getPackageName();
        this.f19642b = c9843j;
        this.f19641a = c9840h;
        this.f19643c = c10111y;
        this.f19644d = c9924e;
        c9840h.f19665d = c9837b;
        Package r6 = Vungle.class.getPackage();
        if (r6 != null) {
            f19640o = r6.getName();
        }
        atomicBoolean.set(c9924e.m1409b("logging_enabled"));
        atomicBoolean2.set(c9924e.m1409b("crash_report_enabled"));
        this.f19648h = c9924e.m1408c("crash_collect_filter", f19640o);
        Object obj = c9924e.f19921c.get("crash_batch_max");
        atomicInteger.set(obj instanceof Integer ? ((Integer) obj).intValue() : 5);
        m1488a();
    }

    /* renamed from: a */
    public final synchronized void m1488a() {
        if (!this.f19650j) {
            if (!this.f19647g.get()) {
                Log.d("f", "crash report is disabled.");
                return;
            }
            if (this.f19645e == null) {
                this.f19645e = new C9833d(this.f19654n);
            }
            this.f19645e.f19628c = this.f19648h;
            this.f19650j = true;
        }
    }

    /* renamed from: b */
    public final void m1487b(@NonNull VungleLogger.LoggerLevel loggerLevel, @NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4) {
        String m3230h;
        String str5 = VungleApiClient.f19359C;
        if (loggerLevel == VungleLogger.LoggerLevel.CRASH && this.f19647g.get()) {
            synchronized (this) {
                C9840h c9840h = this.f19641a;
                String loggerLevel2 = loggerLevel.toString();
                String str6 = this.f19651k;
                ConcurrentHashMap concurrentHashMap = this.f19652l;
                if (concurrentHashMap.isEmpty()) {
                    m3230h = null;
                } else {
                    m3230h = this.f19653m.m3230h(concurrentHashMap);
                }
                c9840h.m1483f(str2, loggerLevel2, str, str5, str6, m3230h, str3, str4);
            }
            return;
        }
        this.f19643c.execute(new RunnableC9836a(str2, loggerLevel, str, str5, str3, str4));
    }

    /* renamed from: c */
    public final void m1486c() {
        boolean z;
        File[] listFiles;
        if (!this.f19646f.get()) {
            Log.d("f", "Logging disabled, no need to send log files.");
            return;
        }
        File file = this.f19641a.f19623a;
        if (file != null && file.exists()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            listFiles = null;
        } else {
            listFiles = file.listFiles(new C9829a("_pending"));
        }
        if (listFiles != null && listFiles.length != 0) {
            this.f19642b.m1479b(listFiles);
        } else {
            Log.d("f", "No need to send empty files.");
        }
    }

    /* renamed from: d */
    public final synchronized void m1485d(int i, @Nullable String str, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.f19647g.get() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!TextUtils.isEmpty(str) && !str.equals(this.f19648h)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int max = Math.max(i, 0);
        if (this.f19649i.get() == max) {
            z4 = false;
        }
        if (z2 || z3 || z4) {
            if (z2) {
                this.f19647g.set(z);
                this.f19644d.m1404g("crash_report_enabled", z);
            }
            if (z3) {
                if ("*".equals(str)) {
                    str = "";
                }
                this.f19648h = str;
                this.f19644d.m1406e("crash_collect_filter", str);
            }
            if (z4) {
                this.f19649i.set(max);
                this.f19644d.m1407d(max, "crash_batch_max");
            }
            this.f19644d.m1410a();
            C9833d c9833d = this.f19645e;
            if (c9833d != null) {
                c9833d.f19628c = this.f19648h;
            }
            if (z) {
                m1488a();
            }
        }
    }
}
