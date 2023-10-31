package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.sdk.AppLovinSdkUtils;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.applovin.impl.sdk.f */
/* loaded from: classes.dex */
public class C3190f {

    /* renamed from: a */
    private static final int f8311a = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: m */
    private static final C3190f f8312m = new C3190f();

    /* renamed from: c */
    private Handler f8314c;

    /* renamed from: e */
    private Handler f8316e;

    /* renamed from: h */
    private C3214m f8319h;

    /* renamed from: i */
    private Thread f8320i;

    /* renamed from: j */
    private long f8321j;

    /* renamed from: k */
    private long f8322k;

    /* renamed from: l */
    private long f8323l;

    /* renamed from: b */
    private final AtomicLong f8313b = new AtomicLong(0);

    /* renamed from: d */
    private final HandlerThread f8315d = new HandlerThread("applovin-anr-detector");

    /* renamed from: f */
    private final AtomicBoolean f8317f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f8318g = new AtomicBoolean();

    /* renamed from: com.applovin.impl.sdk.f$a */
    /* loaded from: classes.dex */
    public class RunnableC3192a implements Runnable {
        private RunnableC3192a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3190f.this.f8317f.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - C3190f.this.f8313b.get();
            if (currentTimeMillis < 0 || currentTimeMillis > C3190f.this.f8321j) {
                C3190f.this.m7560a();
                C3190f.this.m7555b();
            }
            C3190f.this.f8316e.postDelayed(this, C3190f.this.f8323l);
        }
    }

    /* renamed from: com.applovin.impl.sdk.f$b */
    /* loaded from: classes.dex */
    public class RunnableC3193b implements Runnable {
        private RunnableC3193b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3190f.this.f8317f.get()) {
                return;
            }
            C3190f.this.f8313b.set(System.currentTimeMillis());
            C3190f.this.f8314c.postDelayed(this, C3190f.this.f8322k);
        }
    }

    private C3190f() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f8321j = timeUnit.toMillis(4L);
        this.f8322k = timeUnit.toMillis(3L);
        this.f8323l = timeUnit.toMillis(3L);
    }

    /* renamed from: a */
    private static String m7556a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7560a() {
        if (this.f8318g.get()) {
            this.f8317f.set(true);
        }
    }

    /* renamed from: a */
    public static void m7557a(C3214m c3214m) {
        if (c3214m != null) {
            if (((Boolean) c3214m.m7456a(C3109b.f8020eP)).booleanValue()) {
                f8312m.m7553b(c3214m);
            } else {
                f8312m.m7560a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7555b() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) m7552c().openConnection();
            int i = f8311a;
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(false);
            int responseCode = httpURLConnection.getResponseCode();
            Log.d("applovin-anr-detector", "ANR reported with code " + responseCode);
        } catch (Throwable th) {
            Log.w("applovin-anr-detector", "Failed to report ANR", th);
        }
    }

    /* renamed from: b */
    private void m7553b(C3214m c3214m) {
        if (this.f8318g.compareAndSet(false, true)) {
            this.f8319h = c3214m;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.f.1
                @Override // java.lang.Runnable
                public void run() {
                    C3190f.this.f8320i = Thread.currentThread();
                }
            });
            this.f8321j = ((Long) c3214m.m7456a(C3109b.f8021eQ)).longValue();
            this.f8322k = ((Long) c3214m.m7456a(C3109b.f8022eR)).longValue();
            this.f8323l = ((Long) c3214m.m7456a(C3109b.f8023eS)).longValue();
            this.f8314c = new Handler(c3214m.m7476L().getMainLooper());
            this.f8315d.start();
            this.f8314c.post(new RunnableC3193b());
            Handler handler = new Handler(this.f8315d.getLooper());
            this.f8316e = handler;
            handler.postDelayed(new RunnableC3192a(), this.f8323l / 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[Catch: MalformedURLException -> 0x016e, TRY_ENTER, TryCatch #2 {MalformedURLException -> 0x016e, blocks: (B:8:0x0019, B:11:0x0029, B:16:0x0047, B:18:0x004b, B:20:0x0052, B:21:0x0076, B:23:0x0105, B:24:0x0107, B:26:0x0115, B:27:0x0117, B:12:0x0036, B:14:0x003a), top: B:35:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: MalformedURLException -> 0x016e, TryCatch #2 {MalformedURLException -> 0x016e, blocks: (B:8:0x0019, B:11:0x0029, B:16:0x0047, B:18:0x004b, B:20:0x0052, B:21:0x0076, B:23:0x0105, B:24:0x0107, B:26:0x0115, B:27:0x0117, B:12:0x0036, B:14:0x003a), top: B:35:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0105 A[Catch: MalformedURLException -> 0x016e, TryCatch #2 {MalformedURLException -> 0x016e, blocks: (B:8:0x0019, B:11:0x0029, B:16:0x0047, B:18:0x004b, B:20:0x0052, B:21:0x0076, B:23:0x0105, B:24:0x0107, B:26:0x0115, B:27:0x0117, B:12:0x0036, B:14:0x003a), top: B:35:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115 A[Catch: MalformedURLException -> 0x016e, TryCatch #2 {MalformedURLException -> 0x016e, blocks: (B:8:0x0019, B:11:0x0029, B:16:0x0047, B:18:0x004b, B:20:0x0052, B:21:0x0076, B:23:0x0105, B:24:0x0107, B:26:0x0115, B:27:0x0117, B:12:0x0036, B:14:0x003a), top: B:35:0x0019 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.URL m7552c() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C3190f.m7552c():java.net.URL");
    }
}
