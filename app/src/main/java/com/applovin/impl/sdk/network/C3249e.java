package com.applovin.impl.sdk.network;

import android.os.Process;
import androidx.appcompat.view.menu.C0235r;
import androidx.core.util.InterfaceC0797a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.sdk.network.e */
/* loaded from: classes.dex */
public class C3249e {

    /* renamed from: a */
    private final PriorityBlockingQueue<C3253b> f8543a = new PriorityBlockingQueue<>();

    /* renamed from: b */
    private final C3214m f8544b;

    /* renamed from: com.applovin.impl.sdk.network.e$a */
    /* loaded from: classes.dex */
    public static class C3251a extends Thread {

        /* renamed from: a */
        private final BlockingQueue<C3253b> f8545a;

        /* renamed from: b */
        private final C3214m f8546b;

        private C3251a(BlockingQueue<C3253b> blockingQueue, int i, C3214m c3214m) {
            super(C0235r.m12816a("AL-Network-", i));
            if (blockingQueue != null) {
                if (c3214m != null) {
                    this.f8545a = blockingQueue;
                    this.f8546b = c3214m;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No request queue specified");
        }

        /* renamed from: a */
        private void m7297a() throws InterruptedException {
            m7296a(this.f8545a.take());
        }

        /* renamed from: a */
        private void m7296a(final C3253b c3253b) {
            HttpURLConnection httpURLConnection;
            InputStream inputStream;
            InputStream inputStream2;
            String str;
            InputStream inputStream3;
            String str2;
            int i = 0;
            String str3 = null;
            try {
                httpURLConnection = m7295b(c3253b);
                try {
                    if (c3253b.f8554e != null && c3253b.f8554e.length > 0) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setFixedLengthStreamingMode(c3253b.f8554e.length);
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        outputStream.write(c3253b.f8554e);
                        outputStream.close();
                    }
                    i = httpURLConnection.getResponseCode();
                    if (i > 0) {
                        inputStream3 = httpURLConnection.getInputStream();
                        try {
                            str2 = C3295h.m7012a(inputStream3, this.f8546b);
                        } catch (Throwable th) {
                            inputStream = inputStream3;
                            th = th;
                            try {
                                if (C3349v.m6862a()) {
                                    this.f8546b.m7487A().m6857a("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                }
                                if (httpURLConnection != null) {
                                    try {
                                        inputStream2 = httpURLConnection.getErrorStream();
                                        try {
                                            str = C3295h.m7012a(inputStream2, this.f8546b);
                                        } catch (Throwable unused) {
                                            str = null;
                                            Utils.close(inputStream, this.f8546b);
                                            Utils.close(inputStream2, this.f8546b);
                                            Utils.disconnect(httpURLConnection, this.f8546b);
                                            final C3255c m7266a = C3255c.m7267d().m7265a(i).m7263a(str3).m7260b(str).m7262a(th).m7266a();
                                            c3253b.f8557h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    c3253b.f8556g.accept(m7266a);
                                                }
                                            });
                                        }
                                    } catch (Throwable unused2) {
                                        inputStream2 = null;
                                    }
                                } else {
                                    inputStream2 = null;
                                    str = null;
                                }
                                Utils.close(inputStream, this.f8546b);
                                Utils.close(inputStream2, this.f8546b);
                                Utils.disconnect(httpURLConnection, this.f8546b);
                                final C3255c m7266a2 = C3255c.m7267d().m7265a(i).m7263a(str3).m7260b(str).m7262a(th).m7266a();
                                c3253b.f8557h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        c3253b.f8556g.accept(m7266a2);
                                    }
                                });
                            } catch (Throwable th2) {
                                Utils.close(inputStream, this.f8546b);
                                Utils.close(null, this.f8546b);
                                Utils.disconnect(httpURLConnection, this.f8546b);
                                throw th2;
                            }
                        }
                    } else {
                        inputStream3 = null;
                        str2 = null;
                    }
                    Utils.close(inputStream3, this.f8546b);
                    Utils.close(null, this.f8546b);
                    Utils.disconnect(httpURLConnection, this.f8546b);
                    th = null;
                    str = null;
                    str3 = str2;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
                inputStream = null;
            }
            final C3255c m7266a22 = C3255c.m7267d().m7265a(i).m7263a(str3).m7260b(str).m7262a(th).m7266a();
            c3253b.f8557h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                @Override // java.lang.Runnable
                public void run() {
                    c3253b.f8556g.accept(m7266a22);
                }
            });
        }

        /* renamed from: b */
        private HttpURLConnection m7295b(C3253b c3253b) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(c3253b.f8551b).openConnection();
            httpURLConnection.setRequestMethod(c3253b.f8552c);
            httpURLConnection.setConnectTimeout(c3253b.f8555f);
            httpURLConnection.setReadTimeout(c3253b.f8555f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!c3253b.f8553d.isEmpty()) {
                for (Map.Entry entry : c3253b.f8553d.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    m7297a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.e$b */
    /* loaded from: classes.dex */
    public static class C3253b implements Comparable<C3253b> {

        /* renamed from: a */
        private static final AtomicInteger f8550a = new AtomicInteger();

        /* renamed from: b */
        private final String f8551b;

        /* renamed from: c */
        private final String f8552c;

        /* renamed from: d */
        private final Map<String, String> f8553d;

        /* renamed from: e */
        private final byte[] f8554e;

        /* renamed from: f */
        private final int f8555f;

        /* renamed from: g */
        private final InterfaceC0797a<C3255c> f8556g;

        /* renamed from: h */
        private final Executor f8557h;

        /* renamed from: i */
        private final int f8558i;

        /* renamed from: com.applovin.impl.sdk.network.e$b$a */
        /* loaded from: classes.dex */
        public static class C3254a {

            /* renamed from: a */
            private String f8559a;

            /* renamed from: b */
            private String f8560b;

            /* renamed from: c */
            private Map<String, String> f8561c = new HashMap();

            /* renamed from: d */
            private byte[] f8562d;

            /* renamed from: e */
            private int f8563e;

            /* renamed from: f */
            private InterfaceC0797a<C3255c> f8564f;

            /* renamed from: g */
            private Executor f8565g;

            /* renamed from: a */
            public C3254a m7285a(int i) {
                this.f8563e = i;
                return this;
            }

            /* renamed from: a */
            public C3254a m7284a(InterfaceC0797a<C3255c> interfaceC0797a) {
                this.f8564f = interfaceC0797a;
                return this;
            }

            /* renamed from: a */
            public C3254a m7282a(String str) {
                this.f8559a = str;
                return this;
            }

            /* renamed from: a */
            public C3254a m7281a(String str, String str2) {
                this.f8561c.put(str, str2);
                return this;
            }

            /* renamed from: a */
            public C3254a m7280a(Map<String, String> map) {
                if (map == null) {
                    map = new HashMap<>();
                }
                this.f8561c = map;
                return this;
            }

            /* renamed from: a */
            public C3254a m7279a(Executor executor) {
                this.f8565g = executor;
                return this;
            }

            /* renamed from: a */
            public C3254a m7278a(byte[] bArr) {
                this.f8562d = bArr;
                return this;
            }

            /* renamed from: a */
            public C3253b m7286a() {
                return new C3253b(this);
            }

            /* renamed from: b */
            public C3254a m7276b(String str) {
                this.f8560b = str;
                return this;
            }
        }

        private C3253b(C3254a c3254a) {
            this.f8551b = c3254a.f8559a;
            this.f8552c = c3254a.f8560b;
            this.f8553d = c3254a.f8561c != null ? c3254a.f8561c : Collections.emptyMap();
            this.f8554e = c3254a.f8562d;
            this.f8555f = c3254a.f8563e;
            this.f8556g = c3254a.f8564f;
            this.f8557h = c3254a.f8565g;
            this.f8558i = f8550a.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C3253b c3253b) {
            return this.f8558i - c3253b.f8558i;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.e$c */
    /* loaded from: classes.dex */
    public static class C3255c {

        /* renamed from: a */
        private final int f8566a;

        /* renamed from: b */
        private final String f8567b;

        /* renamed from: c */
        private final String f8568c;

        /* renamed from: d */
        private final Throwable f8569d;

        /* renamed from: com.applovin.impl.sdk.network.e$c$a */
        /* loaded from: classes.dex */
        public static class C3256a {

            /* renamed from: a */
            private int f8570a;

            /* renamed from: b */
            private String f8571b;

            /* renamed from: c */
            private String f8572c;

            /* renamed from: d */
            private Throwable f8573d;

            /* renamed from: a */
            public C3256a m7265a(int i) {
                this.f8570a = i;
                return this;
            }

            /* renamed from: a */
            public C3256a m7263a(String str) {
                this.f8571b = str;
                return this;
            }

            /* renamed from: a */
            public C3256a m7262a(Throwable th) {
                this.f8573d = th;
                return this;
            }

            /* renamed from: a */
            public C3255c m7266a() {
                return new C3255c(this);
            }

            /* renamed from: b */
            public C3256a m7260b(String str) {
                this.f8572c = str;
                return this;
            }
        }

        private C3255c(C3256a c3256a) {
            this.f8566a = c3256a.f8570a;
            this.f8567b = c3256a.f8571b;
            this.f8568c = c3256a.f8572c;
            this.f8569d = c3256a.f8573d;
        }

        /* renamed from: d */
        public static C3256a m7267d() {
            return new C3256a();
        }

        /* renamed from: a */
        public int m7270a() throws Throwable {
            Throwable th = this.f8569d;
            if (th == null) {
                return this.f8566a;
            }
            throw th;
        }

        /* renamed from: b */
        public String m7269b() throws Throwable {
            Throwable th = this.f8569d;
            if (th == null) {
                return this.f8567b;
            }
            throw th;
        }

        /* renamed from: c */
        public String m7268c() {
            return this.f8568c;
        }
    }

    public C3249e(C3214m c3214m) {
        this.f8544b = c3214m;
    }

    /* renamed from: a */
    public void m7299a() {
        for (int i = 0; i < ((Integer) this.f8544b.m7456a(C3109b.f7837ap)).intValue(); i++) {
            new C3251a(this.f8543a, i, this.f8544b).start();
        }
    }

    /* renamed from: a */
    public void m7298a(C3253b c3253b) {
        if (c3253b == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f8543a.add(c3253b);
    }
}
