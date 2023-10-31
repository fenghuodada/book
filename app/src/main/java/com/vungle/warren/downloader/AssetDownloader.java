package com.vungle.warren.downloader;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.C0800d;
import com.vungle.warren.C9804i;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.downloader.AssetDownloadListener;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.utility.C10089k;
import com.vungle.warren.utility.C10095p;
import com.vungle.warren.utility.C10111y;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okio.GzipSource;
import okio.Okio;
import p060j$.util.concurrent.ConcurrentHashMap;

@SuppressLint({"LogNotTimber"})
/* loaded from: classes3.dex */
public final class AssetDownloader implements Downloader {

    /* renamed from: m */
    public static final long f19447m = TimeUnit.HOURS.toMillis(24);

    /* renamed from: n */
    public static final String f19448n = AssetDownloader.class.getSimpleName();
    @Nullable

    /* renamed from: a */
    public final InterfaceC9779f f19449a;

    /* renamed from: b */
    public final long f19450b;

    /* renamed from: c */
    public final C10095p f19451c;

    /* renamed from: d */
    public final C10111y f19452d;

    /* renamed from: e */
    public final OkHttpClient f19453e;

    /* renamed from: f */
    public final ExecutorService f19454f;

    /* renamed from: g */
    public final ConcurrentHashMap f19455g = new ConcurrentHashMap();

    /* renamed from: h */
    public final ArrayList f19456h = new ArrayList();

    /* renamed from: i */
    public final Object f19457i = new Object();

    /* renamed from: j */
    public volatile int f19458j = 5;

    /* renamed from: k */
    public boolean f19459k = true;

    /* renamed from: l */
    public final C9769c f19460l = new C9769c();

    /* loaded from: classes3.dex */
    public @interface NetworkType {
        public static final int ANY = 3;
        public static final int CELLULAR = 1;
        public static final int WIFI = 2;
    }

    /* renamed from: com.vungle.warren.downloader.AssetDownloader$a */
    /* loaded from: classes3.dex */
    public class C9767a extends AbstractRunnableC9772f {

        /* renamed from: e */
        public final /* synthetic */ DownloadRequestMediator f19461e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9767a(DownloadRequestMediator downloadRequestMediator, DownloadRequestMediator downloadRequestMediator2) {
            super(downloadRequestMediator);
            this.f19461e = downloadRequestMediator2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:433:0x0b7d, code lost:
            android.util.Log.d(com.vungle.warren.downloader.AssetDownloader.f19448n, "Reconnected, starting download again");
         */
        /* JADX WARN: Code restructure failed: missing block: B:434:0x0b86, code lost:
            r34.f19461e.setConnected(true);
            r34.f19461e.set(1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:435:0x0b91, code lost:
            r7 = false;
            r18 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:436:0x0b95, code lost:
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:437:0x0b96, code lost:
            r13 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:461:0x0bf2, code lost:
            r4 = r15;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:375:0x0a1c A[Catch: all -> 0x0a15, TRY_ENTER, TryCatch #44 {all -> 0x0a15, blocks: (B:369:0x0a0e, B:375:0x0a1c, B:378:0x0a28, B:380:0x0a37, B:382:0x0a40, B:418:0x0b1a, B:475:0x0c0b), top: B:662:0x0a0e }] */
        /* JADX WARN: Removed duplicated region for block: B:447:0x0bb1  */
        /* JADX WARN: Removed duplicated region for block: B:472:0x0c04  */
        /* JADX WARN: Removed duplicated region for block: B:484:0x0c2e  */
        /* JADX WARN: Removed duplicated region for block: B:488:0x0c3d  */
        /* JADX WARN: Removed duplicated region for block: B:491:0x0c5f  */
        /* JADX WARN: Removed duplicated region for block: B:505:0x0cac  */
        /* JADX WARN: Removed duplicated region for block: B:535:0x0d26  */
        /* JADX WARN: Removed duplicated region for block: B:539:0x0d35  */
        /* JADX WARN: Removed duplicated region for block: B:542:0x0d57  */
        /* JADX WARN: Removed duplicated region for block: B:556:0x0da4  */
        /* JADX WARN: Removed duplicated region for block: B:610:0x0716 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:652:0x0dc4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:662:0x0a0e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:666:0x0ccc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v29, types: [com.vungle.warren.downloader.DownloadRequestMediator] */
        /* JADX WARN: Type inference failed for: r22v59 */
        /* JADX WARN: Type inference failed for: r9v31, types: [boolean] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 3593
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.C9767a.run():void");
        }
    }

    /* renamed from: com.vungle.warren.downloader.AssetDownloader$b */
    /* loaded from: classes3.dex */
    public class RunnableC9768b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ DownloadRequestMediator f19463a;

        public RunnableC9768b(DownloadRequestMediator downloadRequestMediator) {
            this.f19463a = downloadRequestMediator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AssetDownloader.this.m1562X(new AssetDownloadListener.DownloadError(-1, new VungleException(39), 1), this.f19463a);
        }
    }

    /* renamed from: com.vungle.warren.downloader.AssetDownloader$c */
    /* loaded from: classes3.dex */
    public class C9769c implements C10095p.InterfaceC10097b {
        public C9769c() {
        }

        @Override // com.vungle.warren.utility.C10095p.InterfaceC10097b
        /* renamed from: a */
        public final void mo1260a(int i) {
            String str = AssetDownloader.f19448n;
            Log.d(str, "Network changed: " + i);
            AssetDownloader assetDownloader = AssetDownloader.this;
            synchronized (assetDownloader) {
                Log.d(str, "Num of connections: " + assetDownloader.f19455g.values().size());
                for (DownloadRequestMediator downloadRequestMediator : assetDownloader.f19455g.values()) {
                    if (downloadRequestMediator.m1545is(3)) {
                        Log.d(AssetDownloader.f19448n, "Result cancelled");
                    } else {
                        boolean m1568R = assetDownloader.m1568R(downloadRequestMediator);
                        String str2 = AssetDownloader.f19448n;
                        Log.d(str2, "Connected = " + m1568R + " for " + i);
                        downloadRequestMediator.setConnected(m1568R);
                        if (downloadRequestMediator.isPausable() && m1568R && downloadRequestMediator.m1545is(2)) {
                            assetDownloader.m1566T(downloadRequestMediator);
                            Log.d(str2, "resumed " + downloadRequestMediator.key + " " + downloadRequestMediator);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.vungle.warren.downloader.AssetDownloader$d */
    /* loaded from: classes3.dex */
    public class RunnableC9770d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AssetDownloadListener f19466a;

        /* renamed from: b */
        public final /* synthetic */ AssetDownloadListener.DownloadError f19467b;

        /* renamed from: c */
        public final /* synthetic */ DownloadRequest f19468c;

        public RunnableC9770d(AssetDownloadListener.DownloadError downloadError, AssetDownloadListener assetDownloadListener, DownloadRequest downloadRequest) {
            this.f19466a = assetDownloadListener;
            this.f19467b = downloadError;
            this.f19468c = downloadRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f19466a.mo1508c(this.f19467b, this.f19468c);
        }
    }

    /* renamed from: com.vungle.warren.downloader.AssetDownloader$e */
    /* loaded from: classes3.dex */
    public class RunnableC9771e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ DownloadRequestMediator f19469a;

        public RunnableC9771e(DownloadRequestMediator downloadRequestMediator) {
            this.f19469a = downloadRequestMediator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AssetDownloader.this.m1562X(new AssetDownloadListener.DownloadError(-1, new VungleException(39), 1), this.f19469a);
        }
    }

    /* renamed from: com.vungle.warren.downloader.AssetDownloader$f */
    /* loaded from: classes3.dex */
    public static abstract class AbstractRunnableC9772f implements Comparable, Runnable {

        /* renamed from: d */
        public static final AtomicInteger f19471d = new AtomicInteger();

        /* renamed from: a */
        public final int f19472a;

        /* renamed from: b */
        public final DownloadRequestMediator f19473b;

        /* renamed from: c */
        public final C9777d f19474c;

        public AbstractRunnableC9772f(DownloadRequestMediator downloadRequestMediator) {
            this.f19472a = f19471d.incrementAndGet();
            this.f19473b = downloadRequestMediator;
            this.f19474c = downloadRequestMediator.priority;
            downloadRequestMediator.setRunnable(this);
        }

        public AbstractRunnableC9772f(C9777d c9777d) {
            this.f19472a = f19471d.incrementAndGet();
            this.f19474c = c9777d;
            this.f19473b = null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull Object obj) {
            C9777d c9777d;
            C9777d c9777d2;
            if (obj instanceof AbstractRunnableC9772f) {
                AbstractRunnableC9772f abstractRunnableC9772f = (AbstractRunnableC9772f) obj;
                DownloadRequestMediator downloadRequestMediator = this.f19473b;
                if (downloadRequestMediator != null) {
                    c9777d = downloadRequestMediator.getPriority();
                } else {
                    c9777d = this.f19474c;
                }
                DownloadRequestMediator downloadRequestMediator2 = abstractRunnableC9772f.f19473b;
                if (downloadRequestMediator2 != null) {
                    c9777d2 = downloadRequestMediator2.getPriority();
                } else {
                    c9777d2 = abstractRunnableC9772f.f19474c;
                }
                int compareTo = c9777d.compareTo(c9777d2);
                if (compareTo == 0) {
                    return Integer.valueOf(this.f19472a).compareTo(Integer.valueOf(abstractRunnableC9772f.f19472a));
                }
                return compareTo;
            }
            return -1;
        }
    }

    public AssetDownloader(@Nullable InterfaceC9779f interfaceC9779f, long j, @NonNull C10095p c10095p, @NonNull C10111y c10111y, @NonNull ExecutorService executorService) {
        this.f19449a = interfaceC9779f;
        this.f19450b = j;
        this.f19452d = c10111y;
        this.f19451c = c10095p;
        this.f19454f = executorService;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f19453e = builder.readTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true).build();
    }

    /* renamed from: C */
    public static void m1583C(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator) {
        synchronized (assetDownloader) {
            assetDownloader.f19455g.remove(downloadRequestMediator.key);
        }
    }

    /* renamed from: D */
    public static void m1582D(AssetDownloader assetDownloader) {
        if (assetDownloader.f19455g.isEmpty()) {
            Log.d(f19448n, "Removing listener");
            C10095p c10095p = assetDownloader.f19451c;
            CopyOnWriteArraySet copyOnWriteArraySet = c10095p.f20326e;
            copyOnWriteArraySet.remove(assetDownloader.f19460l);
            c10095p.m1261c(!copyOnWriteArraySet.isEmpty());
        }
    }

    /* renamed from: F */
    public static /* synthetic */ String m1580F(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator) {
        assetDownloader.getClass();
        return m1572N(downloadRequestMediator);
    }

    /* renamed from: H */
    public static HashMap m1578H(AssetDownloader assetDownloader, File file) {
        assetDownloader.getClass();
        String path = file.getPath();
        List<Class<?>> list = C10089k.f20313a;
        Object m1266d = C10089k.m1266d(new File(path));
        if (m1266d instanceof HashMap) {
            return (HashMap) m1266d;
        }
        return new HashMap();
    }

    /* renamed from: I */
    public static boolean m1577I(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, File file, HashMap hashMap) {
        String str;
        if (hashMap != null) {
            if (assetDownloader.f19449a != null && downloadRequestMediator.isCacheable && (str = (String) hashMap.get("Last-Cache-Verification")) != null && file.exists() && Boolean.parseBoolean((String) hashMap.get("DOWNLOAD_COMPLETE"))) {
                try {
                    long parseLong = Long.parseLong(str);
                    long j = assetDownloader.f19450b;
                    if (j >= Long.MAX_VALUE - parseLong || parseLong + j >= System.currentTimeMillis()) {
                        return true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            assetDownloader.getClass();
        }
        return false;
    }

    /* renamed from: J */
    public static void m1576J(AssetDownloader assetDownloader, long j, File file, HashMap hashMap, Request.Builder builder) {
        assetDownloader.getClass();
        builder.addHeader("Accept-Encoding", "identity");
        if (file.exists() && !hashMap.isEmpty()) {
            String str = (String) hashMap.get("ETag");
            String str2 = (String) hashMap.get("Last-Modified");
            if (Boolean.parseBoolean((String) hashMap.get("DOWNLOAD_COMPLETE"))) {
                if (!TextUtils.isEmpty(str)) {
                    builder.addHeader("If-None-Match", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    builder.addHeader("If-Modified-Since", str2);
                }
            } else if ("bytes".equalsIgnoreCase((String) hashMap.get("Accept-Ranges"))) {
                if (hashMap.get("Content-Encoding") == null || "identity".equalsIgnoreCase((String) hashMap.get("Content-Encoding"))) {
                    builder.addHeader("Range", "bytes=" + j + "-");
                    if (!TextUtils.isEmpty(str)) {
                        builder.addHeader("If-Range", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        builder.addHeader("If-Range", str2);
                    }
                }
            }
        }
    }

    /* renamed from: M */
    public static String m1573M(DownloadRequest downloadRequest) {
        return ", single request url - " + downloadRequest.f19476b + ", path - " + downloadRequest.f19477c + ", th - " + Thread.currentThread().getName() + "id " + downloadRequest.f19480f;
    }

    /* renamed from: N */
    public static String m1572N(DownloadRequestMediator downloadRequestMediator) {
        return ", mediator url - " + downloadRequestMediator.url + ", path - " + downloadRequestMediator.filePath + ", th - " + Thread.currentThread().getName() + "id " + downloadRequestMediator;
    }

    /* renamed from: l */
    public static void m1560l(AssetDownloader assetDownloader, DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws IOException {
        String str;
        synchronized (assetDownloader.f19457i) {
            synchronized (assetDownloader) {
                if (downloadRequest.f19482h.get()) {
                    assetDownloader.f19456h.remove(downloadRequest);
                    Log.d(f19448n, "Request " + downloadRequest.f19476b + " is cancelled before starting");
                    assetDownloader.m1570P(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IOException("Cancelled"), 1));
                } else {
                    ConcurrentHashMap concurrentHashMap = assetDownloader.f19455g;
                    if (assetDownloader.m1567S()) {
                        str = downloadRequest.f19476b;
                    } else {
                        str = downloadRequest.f19476b + " " + downloadRequest.f19477c;
                    }
                    DownloadRequestMediator downloadRequestMediator = (DownloadRequestMediator) concurrentHashMap.get(str);
                    if (downloadRequestMediator == null) {
                        assetDownloader.f19456h.remove(downloadRequest);
                        DownloadRequestMediator m1565U = assetDownloader.m1565U(downloadRequest, assetDownloadListener);
                        assetDownloader.f19455g.put(m1565U.key, m1565U);
                        assetDownloader.m1566T(m1565U);
                    } else {
                        downloadRequestMediator.lock();
                        synchronized (assetDownloader) {
                            assetDownloader.f19456h.remove(downloadRequest);
                            if (!downloadRequestMediator.m1545is(6) && (!downloadRequestMediator.m1545is(3) || downloadRequest.f19482h.get())) {
                                if (downloadRequestMediator.isCacheable) {
                                    downloadRequestMediator.add(downloadRequest, assetDownloadListener);
                                    if (downloadRequestMediator.m1545is(2)) {
                                        assetDownloader.m1566T(downloadRequestMediator);
                                    }
                                } else {
                                    VungleLogger.m1599g("AssetDownloader#launchRequest; loadAd sequence", "request " + downloadRequest + " is already running");
                                    assetDownloader.m1570P(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IllegalArgumentException("DownloadRequest is already running"), 1));
                                }
                            }
                            DownloadRequestMediator m1565U2 = assetDownloader.m1565U(downloadRequest, assetDownloadListener);
                            assetDownloader.f19455g.put(downloadRequestMediator.key, m1565U2);
                            assetDownloader.m1566T(m1565U2);
                        }
                        downloadRequestMediator.unlock();
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public static long m1559m(AssetDownloader assetDownloader, Response response) {
        assetDownloader.getClass();
        if (response == null) {
            return -1L;
        }
        String str = response.headers().get("Content-Length");
        if (!TextUtils.isEmpty(str)) {
            try {
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return Long.parseLong(str);
    }

    /* renamed from: n */
    public static boolean m1558n(AssetDownloader assetDownloader, File file, Response response, DownloadRequestMediator downloadRequestMediator, HashMap hashMap) {
        assetDownloader.getClass();
        if (file.exists() && file.length() > 0 && downloadRequestMediator.isCacheable) {
            int code = response.code();
            if (Boolean.parseBoolean((String) hashMap.get("DOWNLOAD_COMPLETE")) && code == 304) {
                Log.d(f19448n, "304 code, data size matches file size " + m1572N(downloadRequestMediator));
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m1557o(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, File file, HashMap hashMap, int i) {
        if (assetDownloader.f19449a != null && downloadRequestMediator.isCacheable && i != 200 && i != 416 && i != 206 && Boolean.parseBoolean((String) hashMap.get("DOWNLOAD_COMPLETE")) && file.exists() && file.length() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r10 != false) goto L53;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1556p(com.vungle.warren.downloader.AssetDownloader r9, long r10, int r12, okhttp3.Response r13, com.vungle.warren.downloader.DownloadRequestMediator r14) {
        /*
            r9.getClass()
            r9 = 0
            r0 = 1
            r1 = 206(0xce, float:2.89E-43)
            if (r12 != r1) goto Lbc
            okhttp3.Headers r2 = r13.headers()
            java.lang.String r3 = "Content-Range"
            java.lang.String r2 = r2.get(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = -1
            r6 = 0
            if (r3 != 0) goto L80
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "\\s+"
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r7 = 2
            if (r3 < r7) goto L80
            int r3 = r2.length
            if (r3 <= 0) goto L2f
            r6 = r2[r9]
        L2f:
            int r3 = r2.length
            if (r3 <= r0) goto L80
            r3 = r2[r0]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L80
            r2 = r2[r0]
            java.lang.String r3 = "/"
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            if (r3 != r7) goto L80
            r3 = r2[r9]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L73
            r3 = r2[r9]
            java.lang.String r8 = "-"
            java.lang.String[] r3 = r3.split(r8)
            int r8 = r3.length
            if (r8 != r7) goto L73
            r7 = r3[r9]
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L73
            r7 = r3[r0]
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L73
            r7 = r3[r9]     // Catch: java.lang.Throwable -> L6e
            long r4 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> L6e
        L6e:
            r3 = r3[r0]     // Catch: java.lang.Throwable -> L73
            java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L73
        L73:
            r3 = r2[r0]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L80
            r2 = r2[r0]     // Catch: java.lang.Throwable -> L80
            java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L80
        L80:
            int r13 = r13.code()
            if (r13 != r1) goto L9a
            java.lang.String r13 = "bytes"
            boolean r13 = r13.equalsIgnoreCase(r6)
            if (r13 == 0) goto L9a
            r1 = 0
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 < 0) goto L9a
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 != 0) goto L9a
            r10 = r0
            goto L9b
        L9a:
            r10 = r9
        L9b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "satisfies partial download: "
            r11.<init>(r13)
            r11.append(r10)
            java.lang.String r13 = " "
            r11.append(r13)
            java.lang.String r13 = m1572N(r14)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.String r13 = com.vungle.warren.downloader.AssetDownloader.f19448n
            android.util.Log.d(r13, r11)
            if (r10 == 0) goto Lc0
        Lbc:
            r10 = 416(0x1a0, float:5.83E-43)
            if (r12 != r10) goto Lc1
        Lc0:
            r9 = r0
        Lc1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.m1556p(com.vungle.warren.downloader.AssetDownloader, long, int, okhttp3.Response, com.vungle.warren.downloader.DownloadRequestMediator):boolean");
    }

    /* renamed from: r */
    public static void m1554r(AssetDownloader assetDownloader, File file, File file2, Headers headers) throws IOException {
        assetDownloader.getClass();
        String str = headers.get("Content-Encoding");
        if (str != null && !"gzip".equalsIgnoreCase(str) && !"identity".equalsIgnoreCase(str)) {
            assetDownloader.m1571O(file, file2, false);
            VungleLogger.m1603c("AssetDownloader#checkEncoding; loadAd sequence", String.format("unknown %1$s %2$s ", "Content-Encoding", str));
            throw new IOException("Unknown Content-Encoding");
        }
    }

    /* renamed from: s */
    public static HashMap m1553s(AssetDownloader assetDownloader, File file, Headers headers, String str) {
        assetDownloader.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("Download_URL", str);
        hashMap.put("ETag", headers.get("ETag"));
        hashMap.put("Last-Modified", headers.get("Last-Modified"));
        hashMap.put("Accept-Ranges", headers.get("Accept-Ranges"));
        hashMap.put("Content-Encoding", headers.get("Content-Encoding"));
        String path = file.getPath();
        List<Class<?>> list = C10089k.f20313a;
        File file2 = new File(path);
        if (!hashMap.isEmpty()) {
            C10089k.m1264f(file2, hashMap);
        }
        return hashMap;
    }

    /* renamed from: t */
    public static ResponseBody m1552t(AssetDownloader assetDownloader, Response response) {
        assetDownloader.getClass();
        if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && HttpHeaders.hasBody(response) && response.body() != null) {
            return new RealResponseBody(response.header("Content-Type"), -1L, Okio.buffer(new GzipSource(response.body().source())));
        }
        return response.body();
    }

    /* renamed from: u */
    public static void m1551u(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress) {
        assetDownloader.getClass();
        if (downloadRequestMediator != null) {
            AssetDownloadListener.Progress progress2 = new AssetDownloadListener.Progress();
            progress2.f19445a = progress.f19445a;
            progress2.f19446b = progress.f19446b;
            Log.d(f19448n, "Progress " + progress.f19446b + " status " + progress.f19445a + " " + downloadRequestMediator + " " + downloadRequestMediator.filePath);
            for (C0800d<DownloadRequest, AssetDownloadListener> c0800d : downloadRequestMediator.values()) {
                DownloadRequest downloadRequest = c0800d.f2500a;
                AssetDownloadListener assetDownloadListener = c0800d.f2501b;
                if (assetDownloadListener != null) {
                    assetDownloader.f19454f.execute(new RunnableC9776c(downloadRequest, assetDownloadListener, progress2));
                }
            }
        }
    }

    /* renamed from: w */
    public static int m1549w(AssetDownloader assetDownloader, Throwable th, boolean z) {
        assetDownloader.getClass();
        if (th instanceof RuntimeException) {
            return 4;
        }
        if (z && !(th instanceof SocketException) && !(th instanceof SocketTimeoutException)) {
            if (!(th instanceof UnknownHostException) && !(th instanceof SSLException)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: x */
    public static void m1548x(AssetDownloader assetDownloader, long j) {
        assetDownloader.getClass();
        try {
            Thread.sleep(Math.max(0L, j));
        } catch (InterruptedException e) {
            Log.e(f19448n, "InterruptedException ", e);
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: y */
    public static boolean m1547y(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress, AssetDownloadListener.DownloadError downloadError) {
        String str;
        assetDownloader.getClass();
        boolean z = false;
        if (downloadRequestMediator.m1545is(3) || assetDownloader.m1568R(downloadRequestMediator)) {
            return false;
        }
        progress.f19445a = 2;
        AssetDownloadListener.Progress progress2 = new AssetDownloadListener.Progress();
        progress2.f19445a = 2;
        progress2.f19446b = progress.f19446b;
        Iterator<C0800d<DownloadRequest, AssetDownloadListener>> it = downloadRequestMediator.values().iterator();
        boolean z2 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            str = f19448n;
            if (!hasNext) {
                break;
            }
            C0800d<DownloadRequest, AssetDownloadListener> next = it.next();
            DownloadRequest downloadRequest = next.f2500a;
            if (downloadRequest != null) {
                boolean z3 = downloadRequest.f19478d;
                AssetDownloadListener assetDownloadListener = next.f2501b;
                if (!z3) {
                    downloadRequestMediator.remove(downloadRequest);
                    assetDownloader.m1570P(downloadRequest, assetDownloadListener, downloadError);
                } else {
                    downloadRequestMediator.set(2);
                    Log.d(str, "Pausing download " + m1573M(downloadRequest));
                    DownloadRequest downloadRequest2 = next.f2500a;
                    AssetDownloadListener assetDownloadListener2 = assetDownloadListener;
                    if (assetDownloadListener2 != null) {
                        assetDownloader.f19454f.execute(new RunnableC9776c(downloadRequest2, assetDownloadListener2, progress2));
                    }
                    z2 = true;
                }
            }
        }
        if (!z2) {
            downloadRequestMediator.set(5);
        }
        StringBuilder sb = new StringBuilder("Attempted to pause - ");
        if (downloadRequestMediator.getStatus() == 2) {
            z = true;
        }
        sb.append(z);
        Log.d(str, sb.toString());
        return z2;
    }

    /* renamed from: z */
    public static void m1546z(AssetDownloader assetDownloader, File file, DownloadRequestMediator downloadRequestMediator) {
        assetDownloader.getClass();
        String str = f19448n;
        Log.d(str, "OnComplete - Removing connections and listener " + downloadRequestMediator);
        try {
            downloadRequestMediator.lock();
            List<C0800d<DownloadRequest, AssetDownloadListener>> values = downloadRequestMediator.values();
            if (!file.exists()) {
                VungleLogger.m1603c("AssetDownloader#onSuccessMediator; loadAd sequence", String.format("File %1$s does not exist; mediator %2$s ", file.getPath(), m1572N(downloadRequestMediator)));
                assetDownloader.m1562X(new AssetDownloadListener.DownloadError(-1, new IOException("File is deleted"), 2), downloadRequestMediator);
            } else {
                InterfaceC9779f interfaceC9779f = assetDownloader.f19449a;
                if (interfaceC9779f != null && downloadRequestMediator.isCacheable) {
                    interfaceC9779f.mo1519d(file, values.size());
                    interfaceC9779f.mo1520c(file, System.currentTimeMillis());
                }
                for (C0800d<DownloadRequest, AssetDownloadListener> c0800d : values) {
                    DownloadRequest downloadRequest = c0800d.f2500a;
                    File file2 = new File(downloadRequest.f19477c);
                    if (!file2.equals(file)) {
                        assetDownloader.m1574L(file, file2, c0800d);
                    } else {
                        file2 = file;
                    }
                    Log.d(str, "Deliver success:" + downloadRequest.f19476b + " dest file: " + file2.getPath());
                    AssetDownloadListener assetDownloadListener = c0800d.f2501b;
                    if (assetDownloadListener != null) {
                        assetDownloadListener.mo1510a(file2, downloadRequest);
                    }
                }
                synchronized (assetDownloader) {
                    assetDownloader.f19455g.remove(downloadRequestMediator.key);
                }
                downloadRequestMediator.set(6);
                Log.d(str, "Finished " + m1572N(downloadRequestMediator));
            }
        } finally {
            downloadRequestMediator.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public final void m1574L(File file, File file2, C0800d<DownloadRequest, AssetDownloadListener> c0800d) {
        FileInputStream fileInputStream;
        DownloadRequest downloadRequest = c0800d.f2500a;
        String str = f19448n;
        if (file2.exists()) {
            C10089k.m1267c(file2);
        }
        if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream3 = new FileInputStream(file);
                    try {
                        try {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    FileChannel channel = fileInputStream3.getChannel();
                                    channel.transferTo(0L, channel.size(), fileOutputStream.getChannel());
                                    Log.d(str, "Copying: finished " + downloadRequest.f19476b + " copying to " + file2.getPath());
                                    C10089k.m1269a(fileInputStream3);
                                    C10089k.m1269a(fileOutputStream);
                                } catch (IOException e) {
                                    e = e;
                                    fileInputStream2 = fileOutputStream;
                                    fileInputStream = fileInputStream2;
                                    fileInputStream2 = fileInputStream3;
                                    try {
                                        VungleLogger.m1603c("AssetDownloader#copyToDestination; loadAd sequence", String.format("cannot copy from %1$s(%2$s) to %3$s due to %4$s", file.getPath(), downloadRequest.f19476b, file2.getPath(), e));
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    try {
                                        m1570P(downloadRequest, c0800d.f2501b, new AssetDownloadListener.DownloadError(-1, e, 2));
                                        Log.d(str, "Copying: error" + downloadRequest.f19476b + " copying to " + file2.getPath());
                                        C10089k.m1269a(fileInputStream2);
                                        C10089k.m1269a(fileInputStream);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        C10089k.m1269a(fileInputStream2);
                                        C10089k.m1269a(fileInputStream);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileInputStream2 = fileOutputStream;
                                    fileInputStream = fileInputStream2;
                                    fileInputStream2 = fileInputStream3;
                                    C10089k.m1269a(fileInputStream2);
                                    C10089k.m1269a(fileInputStream);
                                    throw th;
                                }
                            } catch (IOException e2) {
                                e = e2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    fileInputStream = null;
                    VungleLogger.m1603c("AssetDownloader#copyToDestination; loadAd sequence", String.format("cannot copy from %1$s(%2$s) to %3$s due to %4$s", file.getPath(), downloadRequest.f19476b, file2.getPath(), e));
                    m1570P(downloadRequest, c0800d.f2501b, new AssetDownloadListener.DownloadError(-1, e, 2));
                    Log.d(str, "Copying: error" + downloadRequest.f19476b + " copying to " + file2.getPath());
                    C10089k.m1269a(fileInputStream2);
                    C10089k.m1269a(fileInputStream);
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    /* renamed from: O */
    public final void m1571O(File file, File file2, boolean z) {
        C10089k.m1267c(file);
        C10089k.m1267c(file2);
        InterfaceC9779f interfaceC9779f = this.f19449a;
        if (interfaceC9779f == null || !m1567S()) {
            return;
        }
        if (z) {
            interfaceC9779f.mo1514i(file);
        } else {
            interfaceC9779f.deleteContents(file);
        }
    }

    /* renamed from: P */
    public final void m1570P(@Nullable DownloadRequest downloadRequest, @Nullable AssetDownloadListener assetDownloadListener, @NonNull AssetDownloadListener.DownloadError downloadError) {
        Object[] objArr = new Object[2];
        objArr[0] = downloadError;
        objArr[1] = downloadRequest != null ? m1573M(downloadRequest) : "null";
        VungleLogger.m1603c("AssetDownloader#deliverError; loadAd sequence", String.format("Delivering error %1$s; request %2$s", objArr));
        if (assetDownloadListener != null) {
            this.f19454f.execute(new RunnableC9770d(downloadError, assetDownloadListener, downloadRequest));
        }
    }

    /* renamed from: Q */
    public final synchronized DownloadRequestMediator m1569Q(DownloadRequest downloadRequest) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f19455g.get(downloadRequest.f19476b));
        ConcurrentHashMap concurrentHashMap = this.f19455g;
        arrayList.add(concurrentHashMap.get(downloadRequest.f19476b + " " + downloadRequest.f19477c));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DownloadRequestMediator downloadRequestMediator = (DownloadRequestMediator) it.next();
            if (downloadRequestMediator != null) {
                for (DownloadRequest downloadRequest2 : downloadRequestMediator.requests()) {
                    if (downloadRequest2.equals(downloadRequest)) {
                        return downloadRequestMediator;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1568R(com.vungle.warren.downloader.DownloadRequestMediator r8) {
        /*
            r7 = this;
            java.util.List r8 = r8.requests()
            java.util.Iterator r8 = r8.iterator()
        L8:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L72
            java.lang.Object r0 = r8.next()
            com.vungle.warren.downloader.DownloadRequest r0 = (com.vungle.warren.downloader.DownloadRequest) r0
            java.lang.String r2 = com.vungle.warren.downloader.AssetDownloader.f19448n
            if (r0 != 0) goto L1f
            java.lang.String r0 = "Request is null"
            android.util.Log.d(r2, r0)
            goto L8
        L1f:
            com.vungle.warren.utility.p r3 = r7.f19451c
            int r3 = r3.m1263a()
            r4 = 1
            int r5 = r0.f19475a
            if (r3 < 0) goto L2f
            r6 = 3
            if (r5 != r6) goto L2f
            r1 = r4
            goto L6f
        L2f:
            if (r3 == 0) goto L48
            if (r3 == r4) goto L46
            r6 = 4
            if (r3 == r6) goto L48
            r6 = 9
            if (r3 == r6) goto L46
            r6 = 17
            if (r3 == r6) goto L48
            r6 = 6
            if (r3 == r6) goto L46
            r6 = 7
            if (r3 == r6) goto L48
            r6 = -1
            goto L49
        L46:
            r6 = 2
            goto L49
        L48:
            r6 = r4
        L49:
            if (r6 <= 0) goto L4f
            r5 = r5 & r6
            if (r5 != r6) goto L4f
            r1 = r4
        L4f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "checking pause for type: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " connected "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r0 = m1573M(r0)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.d(r2, r0)
        L6f:
            if (r1 == 0) goto L8
            return r4
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.m1568R(com.vungle.warren.downloader.DownloadRequestMediator):boolean");
    }

    /* renamed from: S */
    public final synchronized boolean m1567S() {
        boolean z;
        if (this.f19449a != null) {
            z = this.f19459k;
        }
        return z;
    }

    /* renamed from: T */
    public final synchronized void m1566T(DownloadRequestMediator downloadRequestMediator) {
        Log.d(f19448n, "Adding network listner");
        C9769c c9769c = this.f19460l;
        C10095p c10095p = this.f19451c;
        c10095p.f20326e.add(c9769c);
        c10095p.m1261c(true);
        downloadRequestMediator.set(1);
        this.f19452d.m1236a(new C9767a(downloadRequestMediator, downloadRequestMediator), new RunnableC9768b(downloadRequestMediator));
    }

    /* renamed from: U */
    public final DownloadRequestMediator m1565U(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws IOException {
        File mo1522a;
        File mo1518e;
        boolean z;
        String str;
        if (m1567S()) {
            String str2 = downloadRequest.f19476b;
            InterfaceC9779f interfaceC9779f = this.f19449a;
            mo1522a = interfaceC9779f.mo1522a(str2);
            mo1518e = interfaceC9779f.mo1518e(mo1522a);
            z = true;
            str = downloadRequest.f19476b;
        } else {
            mo1522a = new File(downloadRequest.f19477c);
            mo1518e = new File(mo1522a.getPath() + ".vng_meta");
            str = downloadRequest.f19476b + " " + downloadRequest.f19477c;
            z = false;
        }
        String str3 = str;
        boolean z2 = z;
        Log.d(f19448n, "Destination file " + mo1522a.getPath());
        return new DownloadRequestMediator(downloadRequest, assetDownloadListener, mo1522a.getPath(), mo1518e.getPath(), z2, str3);
    }

    /* renamed from: V */
    public final void m1564V(@NonNull DownloadRequest downloadRequest) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        DownloadRequest downloadRequest2;
        if (downloadRequest.f19482h.get()) {
            return;
        }
        downloadRequest.f19482h.set(true);
        DownloadRequestMediator m1569Q = m1569Q(downloadRequest);
        if (m1569Q != null && m1569Q.getStatus() != 3) {
            C0800d<DownloadRequest, AssetDownloadListener> remove = m1569Q.remove(downloadRequest);
            AssetDownloadListener assetDownloadListener = null;
            if (remove == null) {
                downloadRequest2 = null;
            } else {
                downloadRequest2 = remove.f2500a;
            }
            if (remove != null) {
                assetDownloadListener = remove.f2501b;
            }
            if (m1569Q.values().isEmpty()) {
                m1569Q.set(3);
            }
            if (downloadRequest2 == null) {
                return;
            }
            AssetDownloadListener.Progress progress = new AssetDownloadListener.Progress();
            progress.f19445a = 3;
            if (assetDownloadListener != null) {
                this.f19454f.execute(new RunnableC9776c(downloadRequest2, assetDownloadListener, progress));
            }
        }
        if (this.f19455g.isEmpty()) {
            Log.d(f19448n, "Removing listener");
            C10095p c10095p = this.f19451c;
            c10095p.f20326e.remove(this.f19460l);
            c10095p.m1261c(!copyOnWriteArraySet.isEmpty());
        }
    }

    /* renamed from: W */
    public final synchronized void m1563W(@NonNull DownloadRequestMediator downloadRequestMediator) {
        for (DownloadRequest downloadRequest : downloadRequestMediator.requests()) {
            m1564V(downloadRequest);
        }
    }

    /* renamed from: X */
    public final void m1562X(@Nullable AssetDownloadListener.DownloadError downloadError, @NonNull DownloadRequestMediator downloadRequestMediator) {
        VungleLogger.m1603c("AssetDownloader#onErrorMediator; loadAd sequence", String.format("Error %1$s occured; mediator %2$s", downloadError, m1572N(downloadRequestMediator)));
        if (downloadError == null) {
            downloadError = new AssetDownloadListener.DownloadError(-1, new RuntimeException(), 4);
        }
        try {
            downloadRequestMediator.lock();
            for (C0800d<DownloadRequest, AssetDownloadListener> c0800d : downloadRequestMediator.values()) {
                m1570P(c0800d.f2500a, c0800d.f2501b, downloadError);
            }
            synchronized (this) {
                this.f19455g.remove(downloadRequestMediator.key);
            }
            downloadRequestMediator.set(6);
        } finally {
            downloadRequestMediator.unlock();
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    /* renamed from: a */
    public final synchronized void mo1544a() {
        InterfaceC9779f interfaceC9779f = this.f19449a;
        if (interfaceC9779f != null) {
            interfaceC9779f.clear();
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    /* renamed from: b */
    public final synchronized void mo1543b() {
        InterfaceC9779f interfaceC9779f = this.f19449a;
        if (interfaceC9779f != null) {
            interfaceC9779f.mo1521b();
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    /* renamed from: c */
    public final synchronized void mo1542c() {
        Log.d(f19448n, "Cancelling all");
        Iterator it = this.f19456h.iterator();
        while (it.hasNext()) {
            DownloadRequest downloadRequest = (DownloadRequest) it.next();
            String str = f19448n;
            Log.d(str, "Cancel in transtiotion " + downloadRequest.f19476b);
            mo1537h(downloadRequest);
        }
        String str2 = f19448n;
        Log.d(str2, "Cancel in mediator " + this.f19455g.values().size());
        for (DownloadRequestMediator downloadRequestMediator : this.f19455g.values()) {
            String str3 = f19448n;
            Log.d(str3, "Cancel in mediator " + downloadRequestMediator.key);
            m1563W(downloadRequestMediator);
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    /* renamed from: d */
    public final synchronized void mo1541d(boolean z) {
        this.f19459k = z;
    }

    @Override // com.vungle.warren.downloader.Downloader
    /* renamed from: e */
    public final boolean mo1540e(@Nullable String str) {
        String str2 = f19448n;
        InterfaceC9779f interfaceC9779f = this.f19449a;
        if (interfaceC9779f != null && str != null) {
            try {
                File mo1522a = interfaceC9779f.mo1522a(str);
                Log.d(str2, "Deleting " + mo1522a.getPath());
                return interfaceC9779f.mo1514i(mo1522a);
            } catch (IOException e) {
                VungleLogger.m1603c("AssetDownloader#dropCache; loadAd sequence", String.format("Error %1$s occured", e));
                Log.e(str2, "There was an error to get file", e);
            }
        }
        return false;
    }

    @Override // com.vungle.warren.downloader.Downloader
    /* renamed from: f */
    public final synchronized void mo1539f(DownloadRequest downloadRequest, C9804i c9804i) {
        if (downloadRequest == null) {
            VungleLogger.m1603c("AssetDownloader#download; loadAd sequence", "downloadRequest is null");
            m1570P(null, c9804i, new AssetDownloadListener.DownloadError(-1, new IllegalArgumentException("DownloadRequest is null"), 1));
            return;
        }
        VungleLogger.m1600f(f19448n, "ttDownloadContext", String.format("Waiting for download asset %1$s, at: %2$d", downloadRequest, Long.valueOf(System.currentTimeMillis())));
        this.f19456h.add(downloadRequest);
        this.f19452d.m1236a(new C9774a(this, new C9777d(DownloadRequest.Priority.CRITICAL, 0), downloadRequest, c9804i), new RunnableC9775b(this, downloadRequest, c9804i));
    }

    @Override // com.vungle.warren.downloader.Downloader
    /* renamed from: g */
    public final synchronized ArrayList mo1538g() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = new ArrayList(this.f19455g.values()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((DownloadRequestMediator) it.next()).requests());
        }
        arrayList.addAll(this.f19456h);
        return arrayList;
    }

    @Override // com.vungle.warren.downloader.Downloader
    /* renamed from: h */
    public final synchronized void mo1537h(@Nullable DownloadRequest downloadRequest) {
        m1564V(downloadRequest);
    }

    @Override // com.vungle.warren.downloader.Downloader
    /* renamed from: i */
    public final boolean mo1536i(@Nullable DownloadRequest downloadRequest) {
        mo1537h(downloadRequest);
        long max = Math.max(0L, 1000L) + System.currentTimeMillis();
        while (System.currentTimeMillis() < max) {
            DownloadRequestMediator m1569Q = m1569Q(downloadRequest);
            synchronized (this) {
                if (!this.f19456h.contains(downloadRequest) && (m1569Q == null || !m1569Q.requests().contains(downloadRequest))) {
                    return true;
                }
            }
            try {
                Thread.sleep(Math.max(0L, 10L));
            } catch (InterruptedException e) {
                Log.e(f19448n, "InterruptedException ", e);
                Thread.currentThread().interrupt();
            }
        }
        return false;
    }

    @Override // com.vungle.warren.downloader.Downloader
    /* renamed from: j */
    public final void mo1535j(DownloadRequest downloadRequest) {
        Runnable runnable;
        DownloadRequestMediator m1569Q = m1569Q(downloadRequest);
        if (m1569Q == null || (runnable = m1569Q.getRunnable()) == null) {
            return;
        }
        C10111y c10111y = this.f19452d;
        if (c10111y.remove(runnable)) {
            Log.d(f19448n, "prio: updated to " + m1569Q.getPriority());
            c10111y.m1236a(runnable, new RunnableC9771e(m1569Q));
        }
    }
}
