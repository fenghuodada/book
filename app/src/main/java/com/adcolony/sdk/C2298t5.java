package com.adcolony.sdk;

import androidx.activity.result.C0063d;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.t5 */
/* loaded from: classes.dex */
public final class C2298t5 {

    /* renamed from: a */
    public final LinkedList<Runnable> f5591a = new LinkedList<>();

    /* renamed from: b */
    public boolean f5592b;

    /* renamed from: com.adcolony.sdk.t5$a */
    /* loaded from: classes.dex */
    public class C2299a implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.t5$a$a */
        /* loaded from: classes.dex */
        public class RunnableC2300a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5594a;

            public RunnableC2300a(C2100e2 c2100e2) {
                this.f5594a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2299a c2299a = C2299a.this;
                C2298t5.this.getClass();
                C2100e2 c2100e2 = this.f5594a;
                C2367y1 c2367y1 = c2100e2.f5098b;
                String m9436w = c2367y1.m9436w("filepath");
                String m9436w2 = c2367y1.m9436w("data");
                boolean equals = c2367y1.m9436w("encoding").equals("utf8");
                C2201m0.m9588d().m9685r().m9499c();
                C2367y1 c2367y12 = new C2367y1();
                try {
                    C2298t5.m9495d(m9436w, m9436w2, equals);
                    C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, true);
                    c2100e2.m9641a(c2367y12).m9640b();
                } catch (IOException unused) {
                    C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, false);
                    c2100e2.m9641a(c2367y12).m9640b();
                }
                C2298t5.m9497b(C2298t5.this);
            }
        }

        public C2299a() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2298t5.m9496c(C2298t5.this, new RunnableC2300a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.t5$b */
    /* loaded from: classes.dex */
    public class C2301b implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.t5$b$a */
        /* loaded from: classes.dex */
        public class RunnableC2302a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5597a;

            public RunnableC2302a(C2100e2 c2100e2) {
                this.f5597a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2100e2 c2100e2 = this.f5597a;
                File file = new File(c2100e2.f5098b.m9436w("filepath"));
                C2301b c2301b = C2301b.this;
                C2298t5.this.getClass();
                C2201m0.m9588d().m9685r().m9499c();
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, C2298t5.m9494e(file));
                c2100e2.m9641a(c2367y1).m9640b();
                C2298t5.m9497b(C2298t5.this);
            }
        }

        public C2301b() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2298t5.m9496c(C2298t5.this, new RunnableC2302a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.t5$c */
    /* loaded from: classes.dex */
    public class C2303c implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.t5$c$a */
        /* loaded from: classes.dex */
        public class RunnableC2304a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5600a;

            public RunnableC2304a(C2100e2 c2100e2) {
                this.f5600a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2303c c2303c = C2303c.this;
                C2298t5.this.getClass();
                C2100e2 c2100e2 = this.f5600a;
                String m9436w = c2100e2.f5098b.m9436w("filepath");
                C2201m0.m9588d().m9685r().m9499c();
                C2367y1 c2367y1 = new C2367y1();
                String[] list = new File(m9436w).list();
                if (list != null) {
                    C2328v1 c2328v1 = new C2328v1();
                    for (String str : list) {
                        C2367y1 c2367y12 = new C2367y1();
                        C2080d1.m9660h(c2367y12, "filename", str);
                        if (new File(C0063d.m13053a(m9436w, str)).isDirectory()) {
                            C2080d1.m9656l(c2367y12, "is_folder", true);
                        } else {
                            C2080d1.m9656l(c2367y12, "is_folder", false);
                        }
                        c2328v1.m9486a(c2367y12);
                    }
                    C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                    C2080d1.m9662f(c2367y1, "entries", c2328v1);
                } else {
                    C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
                }
                c2100e2.m9641a(c2367y1).m9640b();
                C2298t5.m9497b(C2298t5.this);
            }
        }

        public C2303c() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2298t5.m9496c(C2298t5.this, new RunnableC2304a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.t5$d */
    /* loaded from: classes.dex */
    public class C2305d implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.t5$d$a */
        /* loaded from: classes.dex */
        public class RunnableC2306a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5603a;

            public RunnableC2306a(C2100e2 c2100e2) {
                this.f5603a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                C2305d c2305d = C2305d.this;
                C2298t5.this.getClass();
                C2100e2 c2100e2 = this.f5603a;
                C2367y1 c2367y1 = c2100e2.f5098b;
                String m9436w = c2367y1.m9436w("filepath");
                String m9436w2 = c2367y1.m9436w("encoding");
                if (m9436w2 != null && m9436w2.equals("utf8")) {
                    z = true;
                } else {
                    z = false;
                }
                C2201m0.m9588d().m9685r().m9499c();
                C2367y1 c2367y12 = new C2367y1();
                try {
                    StringBuilder m9498a = C2298t5.m9498a(m9436w, z);
                    C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, true);
                    C2080d1.m9660h(c2367y12, "data", m9498a.toString());
                    c2100e2.m9641a(c2367y12).m9640b();
                } catch (IOException unused) {
                    C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, false);
                    c2100e2.m9641a(c2367y12).m9640b();
                }
                C2298t5.m9497b(C2298t5.this);
            }
        }

        public C2305d() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2298t5.m9496c(C2298t5.this, new RunnableC2306a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.t5$e */
    /* loaded from: classes.dex */
    public class C2307e implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.t5$e$a */
        /* loaded from: classes.dex */
        public class RunnableC2308a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5606a;

            public RunnableC2308a(C2100e2 c2100e2) {
                this.f5606a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2307e c2307e = C2307e.this;
                C2298t5.this.getClass();
                C2100e2 c2100e2 = this.f5606a;
                C2367y1 c2367y1 = c2100e2.f5098b;
                String m9436w = c2367y1.m9436w("filepath");
                String m9436w2 = c2367y1.m9436w("new_filepath");
                C2201m0.m9588d().m9685r().m9499c();
                C2367y1 c2367y12 = new C2367y1();
                try {
                    if (new File(m9436w).renameTo(new File(m9436w2))) {
                        C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, true);
                    } else {
                        C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, false);
                    }
                    c2100e2.m9641a(c2367y12).m9640b();
                } catch (Exception unused) {
                    C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, false);
                    c2100e2.m9641a(c2367y12).m9640b();
                }
                C2298t5.m9497b(C2298t5.this);
            }
        }

        public C2307e() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2298t5.m9496c(C2298t5.this, new RunnableC2308a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.t5$f */
    /* loaded from: classes.dex */
    public class C2309f implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.t5$f$a */
        /* loaded from: classes.dex */
        public class RunnableC2310a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5609a;

            public RunnableC2310a(C2100e2 c2100e2) {
                this.f5609a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2309f c2309f = C2309f.this;
                C2298t5.this.getClass();
                C2100e2 c2100e2 = this.f5609a;
                String m9436w = c2100e2.f5098b.m9436w("filepath");
                C2201m0.m9588d().m9685r().m9499c();
                C2367y1 c2367y1 = new C2367y1();
                try {
                    C2080d1.m9656l(c2367y1, "result", new File(m9436w).exists());
                    C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                    c2100e2.m9641a(c2367y1).m9640b();
                } catch (Exception e) {
                    C2080d1.m9656l(c2367y1, "result", false);
                    C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
                    c2100e2.m9641a(c2367y1).m9640b();
                    e.printStackTrace();
                }
                C2298t5.m9497b(C2298t5.this);
            }
        }

        public C2309f() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2298t5.m9496c(C2298t5.this, new RunnableC2310a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.t5$g */
    /* loaded from: classes.dex */
    public class C2311g implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.t5$g$a */
        /* loaded from: classes.dex */
        public class RunnableC2312a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5612a;

            public RunnableC2312a(C2100e2 c2100e2) {
                this.f5612a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2311g c2311g = C2311g.this;
                C2298t5.this.getClass();
                C2100e2 c2100e2 = this.f5612a;
                C2367y1 c2367y1 = c2100e2.f5098b;
                String m9436w = c2367y1.m9436w("filepath");
                C2201m0.m9588d().m9685r().m9499c();
                C2367y1 c2367y12 = new C2367y1();
                try {
                    int m9441r = c2367y1.m9441r("offset");
                    int m9441r2 = c2367y1.m9441r("size");
                    boolean m9444o = c2367y1.m9444o("gunzip");
                    String m9436w2 = c2367y1.m9436w("output_filepath");
                    InputStream c2325u5 = new C2325u5(new FileInputStream(m9436w), m9441r, m9441r2);
                    if (m9444o) {
                        c2325u5 = new GZIPInputStream(c2325u5, 1024);
                    }
                    if (m9436w2.equals("")) {
                        StringBuilder sb = new StringBuilder(c2325u5.available());
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = c2325u5.read(bArr, 0, 1024);
                            if (read < 0) {
                                break;
                            }
                            sb.append(new String(bArr, 0, read, "ISO-8859-1"));
                        }
                        C2080d1.m9657k(sb.length(), c2367y12, "size");
                        C2080d1.m9660h(c2367y12, "data", sb.toString());
                    } else {
                        FileOutputStream fileOutputStream = new FileOutputStream(m9436w2);
                        byte[] bArr2 = new byte[1024];
                        int i = 0;
                        while (true) {
                            int read2 = c2325u5.read(bArr2, 0, 1024);
                            if (read2 < 0) {
                                break;
                            }
                            fileOutputStream.write(bArr2, 0, read2);
                            i += read2;
                        }
                        fileOutputStream.close();
                        C2080d1.m9657k(i, c2367y12, "size");
                    }
                    c2325u5.close();
                    C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, true);
                    c2100e2.m9641a(c2367y12).m9640b();
                } catch (IOException unused) {
                    C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, false);
                    c2100e2.m9641a(c2367y12).m9640b();
                    C2298t5.m9497b(C2298t5.this);
                } catch (OutOfMemoryError unused2) {
                    C2201m0.m9588d().m9689n().m9706d("Out of memory error - disabling AdColony.", 0, 0, false);
                    C2201m0.m9588d().m9693j();
                    C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, false);
                    c2100e2.m9641a(c2367y12).m9640b();
                    C2298t5.m9497b(C2298t5.this);
                }
                C2298t5.m9497b(C2298t5.this);
            }
        }

        public C2311g() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2298t5.m9496c(C2298t5.this, new RunnableC2312a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.t5$h */
    /* loaded from: classes.dex */
    public class C2313h implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.t5$h$a */
        /* loaded from: classes.dex */
        public class RunnableC2314a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5615a;

            public RunnableC2314a(C2100e2 c2100e2) {
                this.f5615a = c2100e2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v0 */
            /* JADX WARN: Type inference failed for: r13v1, types: [int] */
            /* JADX WARN: Type inference failed for: r13v6 */
            /* JADX WARN: Type inference failed for: r13v7 */
            /* JADX WARN: Type inference failed for: r13v8 */
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                String str;
                ?? r13;
                byte[] bArr;
                C2298t5 c2298t5 = C2298t5.this;
                C2100e2 c2100e2 = this.f5615a;
                c2298t5.getClass();
                C2367y1 c2367y1 = c2100e2.f5098b;
                String m9436w = c2367y1.m9436w("filepath");
                String m9436w2 = c2367y1.m9436w("bundle_path");
                C2328v1 m9666b = C2080d1.m9666b(c2367y1, "bundle_filenames");
                C2201m0.m9588d().m9685r().m9499c();
                C2367y1 c2367y12 = new C2367y1();
                try {
                    try {
                        File file = new File(m9436w2);
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                        byte[] bArr2 = new byte[32];
                        randomAccessFile.readInt();
                        int readInt = randomAccessFile.readInt();
                        C2328v1 c2328v1 = new C2328v1();
                        byte[] bArr3 = new byte[1024];
                        int i = 0;
                        while (i < readInt) {
                            randomAccessFile.seek((i * 44) + 8);
                            randomAccessFile.read(bArr2);
                            randomAccessFile.readInt();
                            int readInt2 = randomAccessFile.readInt();
                            int readInt3 = randomAccessFile.readInt();
                            synchronized (c2328v1.f5642a) {
                                bArr = bArr2;
                                c2328v1.f5642a.put(readInt3);
                            }
                            try {
                                String str2 = m9436w + m9666b.f5642a.get(i);
                                C2328v1 c2328v12 = m9666b;
                                randomAccessFile.seek(readInt2);
                                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                                int i2 = readInt3 / 1024;
                                int i3 = readInt3 % 1024;
                                int i4 = 0;
                                while (true) {
                                    r13 = 0;
                                    if (i4 >= i2) {
                                        break;
                                    }
                                    try {
                                        randomAccessFile.read(bArr3, 0, 1024);
                                        fileOutputStream.write(bArr3, 0, 1024);
                                        i4++;
                                    } catch (IOException unused) {
                                        C1169e.m11129c(C0552c.m12192b("Failed to find or open ad unit bundle at path: ", m9436w2), r13, r13, true);
                                        str = FirebaseAnalytics.Param.SUCCESS;
                                        z = r13;
                                        C2080d1.m9656l(c2367y12, str, z);
                                        c2100e2.m9641a(c2367y12).m9640b();
                                        C2298t5.m9497b(C2298t5.this);
                                    }
                                }
                                randomAccessFile.read(bArr3, 0, i3);
                                fileOutputStream.write(bArr3, 0, i3);
                                fileOutputStream.close();
                                i++;
                                bArr2 = bArr;
                                m9666b = c2328v12;
                            } catch (JSONException unused2) {
                                r13 = 0;
                                C2201m0.m9588d().m9689n().m9706d("Couldn't extract file name at index " + i + " unpacking ad unit bundle at " + m9436w2, 0, 0, false);
                                C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, false);
                            }
                        }
                        randomAccessFile.close();
                        file.delete();
                        C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, true);
                        C2080d1.m9662f(c2367y12, "file_sizes", c2328v1);
                        c2100e2.m9641a(c2367y12).m9640b();
                    } catch (OutOfMemoryError unused3) {
                        z = false;
                        C2201m0.m9588d().m9689n().m9706d("Out of memory error - disabling AdColony.", 0, 0, false);
                        C2201m0.m9588d().m9693j();
                        str = FirebaseAnalytics.Param.SUCCESS;
                        C2080d1.m9656l(c2367y12, str, z);
                        c2100e2.m9641a(c2367y12).m9640b();
                        C2298t5.m9497b(C2298t5.this);
                    }
                } catch (IOException unused4) {
                    r13 = 0;
                }
                C2298t5.m9497b(C2298t5.this);
            }
        }

        public C2313h() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2298t5.m9496c(C2298t5.this, new RunnableC2314a(c2100e2));
        }
    }

    /* renamed from: com.adcolony.sdk.t5$i */
    /* loaded from: classes.dex */
    public class C2315i implements InterfaceC2203m2 {

        /* renamed from: com.adcolony.sdk.t5$i$a */
        /* loaded from: classes.dex */
        public class RunnableC2316a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2100e2 f5618a;

            public RunnableC2316a(C2100e2 c2100e2) {
                this.f5618a = c2100e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2315i c2315i = C2315i.this;
                C2298t5.this.getClass();
                C2100e2 c2100e2 = this.f5618a;
                String m9436w = c2100e2.f5098b.m9436w("filepath");
                C2201m0.m9588d().m9685r().m9499c();
                C2367y1 c2367y1 = new C2367y1();
                try {
                    if (new File(m9436w).mkdir()) {
                        C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                        c2100e2.m9641a(c2367y1).m9640b();
                    } else {
                        C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
                    }
                } catch (Exception unused) {
                    C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
                    c2100e2.m9641a(c2367y1).m9640b();
                }
                C2298t5.m9497b(C2298t5.this);
            }
        }

        public C2315i() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2298t5.m9496c(C2298t5.this, new RunnableC2316a(c2100e2));
        }
    }

    /* renamed from: a */
    public static StringBuilder m9498a(String str, boolean z) throws IOException {
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        BufferedReader bufferedReader = new BufferedReader(z ? new InputStreamReader(new FileInputStream(file.getAbsolutePath()), C2108f2.f5107a) : new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb;
            }
            sb.append(readLine);
            sb.append("\n");
        }
    }

    /* renamed from: b */
    public static void m9497b(C2298t5 c2298t5) {
        c2298t5.f5592b = false;
        LinkedList<Runnable> linkedList = c2298t5.f5591a;
        if (!linkedList.isEmpty()) {
            c2298t5.f5592b = true;
            linkedList.removeLast().run();
        }
    }

    /* renamed from: c */
    public static void m9496c(C2298t5 c2298t5, Runnable runnable) {
        LinkedList<Runnable> linkedList = c2298t5.f5591a;
        if (linkedList.isEmpty() && !c2298t5.f5592b) {
            c2298t5.f5592b = true;
            runnable.run();
            return;
        }
        linkedList.push(runnable);
    }

    /* renamed from: d */
    public static void m9495d(String str, String str2, boolean z) throws IOException {
        BufferedWriter bufferedWriter = z ? new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), C2108f2.f5107a)) : new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /* renamed from: e */
    public static boolean m9494e(File file) {
        try {
            if (file.isDirectory() && file.list().length != 0) {
                String[] list = file.list();
                if (list.length > 0) {
                    return m9494e(new File(file, list[0]));
                }
                if (file.list().length == 0) {
                    return file.delete();
                }
                return false;
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public final void m9493f() {
        C2201m0.m9590b("FileSystem.save", new C2299a());
        C2201m0.m9590b("FileSystem.delete", new C2301b());
        C2201m0.m9590b("FileSystem.listing", new C2303c());
        C2201m0.m9590b("FileSystem.load", new C2305d());
        C2201m0.m9590b("FileSystem.rename", new C2307e());
        C2201m0.m9590b("FileSystem.exists", new C2309f());
        C2201m0.m9590b("FileSystem.extract", new C2311g());
        C2201m0.m9590b("FileSystem.unpack_bundle", new C2313h());
        C2201m0.m9590b("FileSystem.create_directory", new C2315i());
    }
}
