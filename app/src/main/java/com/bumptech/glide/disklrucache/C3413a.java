package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.disklrucache.a */
/* loaded from: classes.dex */
public final class C3413a implements Closeable {

    /* renamed from: a */
    public final File f9041a;

    /* renamed from: b */
    public final File f9042b;

    /* renamed from: c */
    public final File f9043c;

    /* renamed from: d */
    public final File f9044d;

    /* renamed from: f */
    public final long f9046f;

    /* renamed from: i */
    public BufferedWriter f9049i;

    /* renamed from: k */
    public int f9051k;

    /* renamed from: h */
    public long f9048h = 0;

    /* renamed from: j */
    public final LinkedHashMap<String, C3417d> f9050j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    public long f9052l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f9053m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3415b());

    /* renamed from: n */
    public final CallableC3414a f9054n = new CallableC3414a();

    /* renamed from: e */
    public final int f9045e = 1;

    /* renamed from: g */
    public final int f9047g = 1;

    /* renamed from: com.bumptech.glide.disklrucache.a$a */
    /* loaded from: classes.dex */
    public class CallableC3414a implements Callable<Void> {
        public CallableC3414a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (C3413a.this) {
                C3413a c3413a = C3413a.this;
                if (c3413a.f9049i != null) {
                    c3413a.m6769s();
                    if (C3413a.this.m6776h()) {
                        C3413a.this.m6771o();
                        C3413a.this.f9051k = 0;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.a$b */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC3415b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.a$c */
    /* loaded from: classes.dex */
    public final class C3416c {

        /* renamed from: a */
        public final C3417d f9056a;

        /* renamed from: b */
        public final boolean[] f9057b;

        /* renamed from: c */
        public boolean f9058c;

        public C3416c(C3417d c3417d) {
            boolean[] zArr;
            this.f9056a = c3417d;
            if (c3417d.f9064e) {
                zArr = null;
            } else {
                zArr = new boolean[C3413a.this.f9047g];
            }
            this.f9057b = zArr;
        }

        /* renamed from: a */
        public final void m6768a() throws IOException {
            C3413a.m6782a(C3413a.this, this, false);
        }

        /* renamed from: b */
        public final File m6767b() throws IOException {
            File file;
            synchronized (C3413a.this) {
                C3417d c3417d = this.f9056a;
                if (c3417d.f9065f == this) {
                    if (!c3417d.f9064e) {
                        this.f9057b[0] = true;
                    }
                    file = c3417d.f9063d[0];
                    C3413a.this.f9041a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.a$d */
    /* loaded from: classes.dex */
    public final class C3417d {

        /* renamed from: a */
        public final String f9060a;

        /* renamed from: b */
        public final long[] f9061b;

        /* renamed from: c */
        public final File[] f9062c;

        /* renamed from: d */
        public final File[] f9063d;

        /* renamed from: e */
        public boolean f9064e;

        /* renamed from: f */
        public C3416c f9065f;

        public C3417d(String str) {
            this.f9060a = str;
            int i = C3413a.this.f9047g;
            this.f9061b = new long[i];
            this.f9062c = new File[i];
            this.f9063d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C3413a.this.f9047g; i2++) {
                sb.append(i2);
                File[] fileArr = this.f9062c;
                String sb2 = sb.toString();
                File file = C3413a.this.f9041a;
                fileArr[i2] = new File(file, sb2);
                sb.append(".tmp");
                this.f9063d[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public final String m6766a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f9061b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.a$e */
    /* loaded from: classes.dex */
    public final class C3418e {

        /* renamed from: a */
        public final File[] f9067a;

        public C3418e(File[] fileArr) {
            this.f9067a = fileArr;
        }
    }

    public C3413a(File file, long j) {
        this.f9041a = file;
        this.f9042b = new File(file, "journal");
        this.f9043c = new File(file, "journal.tmp");
        this.f9044d = new File(file, "journal.bkp");
        this.f9046f = j;
    }

    /* renamed from: a */
    public static void m6782a(C3413a c3413a, C3416c c3416c, boolean z) throws IOException {
        synchronized (c3413a) {
            C3417d c3417d = c3416c.f9056a;
            if (c3417d.f9065f == c3416c) {
                if (z && !c3417d.f9064e) {
                    for (int i = 0; i < c3413a.f9047g; i++) {
                        if (c3416c.f9057b[i]) {
                            if (!c3417d.f9063d[i].exists()) {
                                c3416c.m6768a();
                                break;
                            }
                        } else {
                            c3416c.m6768a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                        }
                    }
                }
                for (int i2 = 0; i2 < c3413a.f9047g; i2++) {
                    File file = c3417d.f9063d[i2];
                    if (z) {
                        if (file.exists()) {
                            File file2 = c3417d.f9062c[i2];
                            file.renameTo(file2);
                            long j = c3417d.f9061b[i2];
                            long length = file2.length();
                            c3417d.f9061b[i2] = length;
                            c3413a.f9048h = (c3413a.f9048h - j) + length;
                        }
                    } else {
                        m6780d(file);
                    }
                }
                c3413a.f9051k++;
                c3417d.f9065f = null;
                if (c3417d.f9064e | z) {
                    c3417d.f9064e = true;
                    c3413a.f9049i.append((CharSequence) "CLEAN");
                    c3413a.f9049i.append(' ');
                    c3413a.f9049i.append((CharSequence) c3417d.f9060a);
                    c3413a.f9049i.append((CharSequence) c3417d.m6766a());
                    c3413a.f9049i.append('\n');
                    if (z) {
                        c3413a.f9052l++;
                        c3417d.getClass();
                    }
                } else {
                    c3413a.f9050j.remove(c3417d.f9060a);
                    c3413a.f9049i.append((CharSequence) "REMOVE");
                    c3413a.f9049i.append(' ');
                    c3413a.f9049i.append((CharSequence) c3417d.f9060a);
                    c3413a.f9049i.append('\n');
                }
                m6778f(c3413a.f9049i);
                if (c3413a.f9048h > c3413a.f9046f || c3413a.m6776h()) {
                    c3413a.f9053m.submit(c3413a.f9054n);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @TargetApi(26)
    /* renamed from: c */
    public static void m6781c(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: d */
    public static void m6780d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: f */
    public static void m6778f(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: j */
    public static C3413a m6775j(File file, long j) throws IOException {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m6770q(file2, file3, false);
                }
            }
            C3413a c3413a = new C3413a(file, j);
            if (c3413a.f9042b.exists()) {
                try {
                    c3413a.m6773l();
                    c3413a.m6774k();
                    return c3413a;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    c3413a.close();
                    C3421c.m6764a(c3413a.f9041a);
                }
            }
            file.mkdirs();
            C3413a c3413a2 = new C3413a(file, j);
            c3413a2.m6771o();
            return c3413a2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: q */
    public static void m6770q(File file, File file2, boolean z) throws IOException {
        if (z) {
            m6780d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f9049i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f9050j.values()).iterator();
        while (it.hasNext()) {
            C3416c c3416c = ((C3417d) it.next()).f9065f;
            if (c3416c != null) {
                c3416c.m6768a();
            }
        }
        m6769s();
        m6781c(this.f9049i);
        this.f9049i = null;
    }

    /* renamed from: e */
    public final C3416c m6779e(String str) throws IOException {
        synchronized (this) {
            if (this.f9049i != null) {
                C3417d c3417d = this.f9050j.get(str);
                if (c3417d == null) {
                    c3417d = new C3417d(str);
                    this.f9050j.put(str, c3417d);
                } else if (c3417d.f9065f != null) {
                    return null;
                }
                C3416c c3416c = new C3416c(c3417d);
                c3417d.f9065f = c3416c;
                this.f9049i.append((CharSequence) "DIRTY");
                this.f9049i.append(' ');
                this.f9049i.append((CharSequence) str);
                this.f9049i.append('\n');
                m6778f(this.f9049i);
                return c3416c;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: g */
    public final synchronized C3418e m6777g(String str) throws IOException {
        if (this.f9049i != null) {
            C3417d c3417d = this.f9050j.get(str);
            if (c3417d == null) {
                return null;
            }
            if (!c3417d.f9064e) {
                return null;
            }
            for (File file : c3417d.f9062c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f9051k++;
            this.f9049i.append((CharSequence) "READ");
            this.f9049i.append(' ');
            this.f9049i.append((CharSequence) str);
            this.f9049i.append('\n');
            if (m6776h()) {
                this.f9053m.submit(this.f9054n);
            }
            return new C3418e(c3417d.f9062c);
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: h */
    public final boolean m6776h() {
        int i = this.f9051k;
        return i >= 2000 && i >= this.f9050j.size();
    }

    /* renamed from: k */
    public final void m6774k() throws IOException {
        m6780d(this.f9043c);
        Iterator<C3417d> it = this.f9050j.values().iterator();
        while (it.hasNext()) {
            C3417d next = it.next();
            C3416c c3416c = next.f9065f;
            int i = this.f9047g;
            int i2 = 0;
            if (c3416c == null) {
                while (i2 < i) {
                    this.f9048h += next.f9061b[i2];
                    i2++;
                }
            } else {
                next.f9065f = null;
                while (i2 < i) {
                    m6780d(next.f9062c[i2]);
                    m6780d(next.f9063d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: l */
    public final void m6773l() throws IOException {
        File file = this.f9042b;
        C3419b c3419b = new C3419b(new FileInputStream(file), C3421c.f9074a);
        try {
            String m6765a = c3419b.m6765a();
            String m6765a2 = c3419b.m6765a();
            String m6765a3 = c3419b.m6765a();
            String m6765a4 = c3419b.m6765a();
            String m6765a5 = c3419b.m6765a();
            if ("libcore.io.DiskLruCache".equals(m6765a) && "1".equals(m6765a2) && Integer.toString(this.f9045e).equals(m6765a3) && Integer.toString(this.f9047g).equals(m6765a4) && "".equals(m6765a5)) {
                boolean z = false;
                int i = 0;
                while (true) {
                    try {
                        m6772m(c3419b.m6765a());
                        i++;
                    } catch (EOFException unused) {
                        this.f9051k = i - this.f9050j.size();
                        if (c3419b.f9072e == -1) {
                            z = true;
                        }
                        if (z) {
                            m6771o();
                        } else {
                            this.f9049i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), C3421c.f9074a));
                        }
                        try {
                            c3419b.close();
                            return;
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + m6765a + ", " + m6765a2 + ", " + m6765a4 + ", " + m6765a5 + "]");
            }
        } catch (Throwable th) {
            try {
                c3419b.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: m */
    public final void m6772m(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            LinkedHashMap<String, C3417d> linkedHashMap = this.f9050j;
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C3417d c3417d = linkedHashMap.get(substring);
            if (c3417d == null) {
                c3417d = new C3417d(substring);
                linkedHashMap.put(substring, c3417d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c3417d.f9064e = true;
                c3417d.f9065f = null;
                if (split.length == C3413a.this.f9047g) {
                    for (int i2 = 0; i2 < split.length; i2++) {
                        try {
                            c3417d.f9061b[i2] = Long.parseLong(split[i2]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c3417d.f9065f = new C3416c(c3417d);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    /* renamed from: o */
    public final synchronized void m6771o() throws IOException {
        StringBuilder sb;
        BufferedWriter bufferedWriter = this.f9049i;
        if (bufferedWriter != null) {
            m6781c(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9043c), C3421c.f9074a));
        bufferedWriter2.write("libcore.io.DiskLruCache");
        bufferedWriter2.write("\n");
        bufferedWriter2.write("1");
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f9045e));
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f9047g));
        bufferedWriter2.write("\n");
        bufferedWriter2.write("\n");
        for (C3417d c3417d : this.f9050j.values()) {
            if (c3417d.f9065f != null) {
                sb = new StringBuilder();
                sb.append("DIRTY ");
                sb.append(c3417d.f9060a);
                sb.append('\n');
            } else {
                sb = new StringBuilder();
                sb.append("CLEAN ");
                sb.append(c3417d.f9060a);
                sb.append(c3417d.m6766a());
                sb.append('\n');
            }
            bufferedWriter2.write(sb.toString());
        }
        m6781c(bufferedWriter2);
        if (this.f9042b.exists()) {
            m6770q(this.f9042b, this.f9044d, true);
        }
        m6770q(this.f9043c, this.f9042b, false);
        this.f9044d.delete();
        this.f9049i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9042b, true), C3421c.f9074a));
    }

    /* renamed from: s */
    public final void m6769s() throws IOException {
        while (this.f9048h > this.f9046f) {
            String key = this.f9050j.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f9049i != null) {
                    C3417d c3417d = this.f9050j.get(key);
                    if (c3417d != null && c3417d.f9065f == null) {
                        for (int i = 0; i < this.f9047g; i++) {
                            File file = c3417d.f9062c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f9048h;
                            long[] jArr = c3417d.f9061b;
                            this.f9048h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f9051k++;
                        this.f9049i.append((CharSequence) "REMOVE");
                        this.f9049i.append(' ');
                        this.f9049i.append((CharSequence) key);
                        this.f9049i.append('\n');
                        this.f9050j.remove(key);
                        if (m6776h()) {
                            this.f9053m.submit(this.f9054n);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }
}
