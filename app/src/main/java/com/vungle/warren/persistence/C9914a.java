package com.vungle.warren.persistence;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import android.os.FileObserver;
import android.os.StatFs;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.utility.C10083e;
import com.vungle.warren.utility.C10089k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.vungle.warren.persistence.a */
/* loaded from: classes3.dex */
public final class C9914a {

    /* renamed from: a */
    public final Context f19907a;

    /* renamed from: b */
    public final C9924e f19908b;

    /* renamed from: d */
    public File f19910d;

    /* renamed from: f */
    public boolean f19912f;

    /* renamed from: c */
    public final HashSet f19909c = new HashSet();

    /* renamed from: e */
    public final ArrayList f19911e = new ArrayList();

    /* renamed from: g */
    public final ArrayList f19913g = new ArrayList();

    /* renamed from: com.vungle.warren.persistence.a$a */
    /* loaded from: classes3.dex */
    public class FileObserverC9915a extends FileObserver {
        public FileObserverC9915a(String str) {
            super(str, 1024);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i, @Nullable String str) {
            stopWatching();
            C9914a.this.m1414g();
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$b */
    /* loaded from: classes3.dex */
    public class FileObserverC9916b extends FileObserver {

        /* renamed from: a */
        public final /* synthetic */ String f19915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileObserverC9916b(String str, String str2) {
            super(str, 256);
            this.f19915a = str2;
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i, @Nullable String str) {
            stopWatching();
            if (this.f19915a.equals(str)) {
                C9914a.this.m1414g();
            }
        }
    }

    /* renamed from: com.vungle.warren.persistence.a$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9917c {
        /* renamed from: b */
        void mo1402b();
    }

    public C9914a(@NonNull Context context, @NonNull C9924e c9924e) {
        this.f19907a = context;
        this.f19908b = c9924e;
        c9924e.f19923e.addAll(Arrays.asList("cache_path", "cache_paths"));
        c9924e.m1410a();
    }

    /* renamed from: a */
    public final synchronized void m1420a(InterfaceC9917c interfaceC9917c) {
        m1419b();
        this.f19909c.add(interfaceC9917c);
        if (this.f19912f) {
            interfaceC9917c.mo1402b();
        }
    }

    /* renamed from: b */
    public final void m1419b() {
        File file = this.f19910d;
        if (file != null && file.exists() && this.f19910d.isDirectory() && this.f19910d.canWrite()) {
            return;
        }
        m1414g();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public final long m1418c(int i) {
        StatFs statFs;
        File m1417d = m1417d();
        if (m1417d == null) {
            return -1L;
        }
        try {
            statFs = new StatFs(m1417d.getPath());
        } catch (IllegalArgumentException e) {
            Log.w("a", "Failed to get available bytes", e);
            if (i > 0) {
                return m1418c(i - 1);
            }
            statFs = null;
        }
        if (statFs != null) {
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        }
        return -1L;
    }

    @Nullable
    /* renamed from: d */
    public final synchronized File m1417d() {
        m1419b();
        return this.f19910d;
    }

    /* renamed from: e */
    public final synchronized void m1416e(File file) {
        if (file == null) {
            return;
        }
        this.f19913g.clear();
        this.f19913g.add(new FileObserverC9915a(file.getPath()));
        while (file.getParent() != null) {
            this.f19913g.add(new FileObserverC9916b(file.getParent(), file.getName()));
            file = file.getParentFile();
        }
        Iterator it = this.f19913g.iterator();
        while (it.hasNext()) {
            try {
                ((FileObserver) it.next()).startWatching();
            } catch (Exception e) {
                String stackTraceString = Log.getStackTraceString(e);
                VungleLogger vungleLogger = VungleLogger.f19390c;
                Log.w("a", "[ExceptionContext] " + stackTraceString);
                VungleLogger.m1599g("ExceptionContext", stackTraceString);
            }
        }
    }

    /* renamed from: f */
    public final synchronized void m1415f(InterfaceC9917c interfaceC9917c) {
        this.f19909c.remove(interfaceC9917c);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public final synchronized void m1414g() {
        boolean z;
        File file;
        boolean mkdirs;
        boolean z2;
        File parentFile;
        File file2;
        File file3 = null;
        if (this.f19910d == null) {
            String m1408c = this.f19908b.m1408c("cache_path", null);
            if (m1408c != null) {
                file2 = new File(m1408c);
            } else {
                file2 = null;
            }
            this.f19910d = file2;
        }
        File externalFilesDir = this.f19907a.getExternalFilesDir(null);
        File filesDir = this.f19907a.getFilesDir();
        if (Environment.getExternalStorageState().equals("mounted") && externalFilesDir != null) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        if (z && (parentFile = externalFilesDir.getParentFile()) != null) {
            arrayList.add(new File(parentFile, "no_backup"));
        }
        arrayList.add(this.f19907a.getNoBackupFilesDir());
        if (z) {
            arrayList.add(externalFilesDir);
        }
        arrayList.add(filesDir);
        Iterator it = arrayList.iterator();
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            File file4 = new File((File) it.next(), "vungle_cache");
            if (file4.exists() && file4.isFile()) {
                C10089k.m1267c(file4);
            }
            if (file4.exists()) {
                if (file4.isDirectory() && file4.canWrite()) {
                    z2 = z3;
                    mkdirs = true;
                } else {
                    z2 = z3;
                    mkdirs = false;
                }
            } else {
                mkdirs = file4.mkdirs();
                z2 = mkdirs;
            }
            if (mkdirs) {
                z3 = z2;
                file3 = file4;
                break;
            }
            z3 = z2;
        }
        File cacheDir = this.f19907a.getCacheDir();
        C9924e c9924e = this.f19908b;
        HashSet hashSet = new HashSet();
        Object obj = c9924e.f19921c.get("cache_paths");
        if (obj instanceof HashSet) {
            hashSet = C10083e.m1274b((HashSet) obj);
        }
        if (file3 != null) {
            C10083e.m1275a(file3.getPath(), hashSet);
        }
        C10083e.m1275a(cacheDir.getPath(), hashSet);
        C9924e c9924e2 = this.f19908b;
        c9924e2.m1405f("cache_paths", hashSet);
        c9924e2.m1410a();
        this.f19911e.clear();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (file3 == null || !file3.getPath().equals(str)) {
                this.f19911e.add(new File(str));
            }
        }
        if (z3 || ((file3 != null && !file3.equals(this.f19910d)) || ((file = this.f19910d) != null && !file.equals(file3)))) {
            this.f19910d = file3;
            if (file3 != null) {
                C9924e c9924e3 = this.f19908b;
                c9924e3.m1406e("cache_path", file3.getPath());
                c9924e3.m1410a();
            }
            Iterator it3 = this.f19909c.iterator();
            while (it3.hasNext()) {
                ((InterfaceC9917c) it3.next()).mo1402b();
            }
            this.f19912f = true;
            Iterator it4 = this.f19911e.iterator();
            while (it4.hasNext()) {
                File file5 = (File) it4.next();
                if (!file5.equals(cacheDir)) {
                    try {
                        C10089k.m1268b(file5);
                    } catch (IOException unused) {
                        VungleLogger.m1602d("a", "CacheManager", "Can't remove old cache:" + file5.getPath());
                    }
                }
            }
        }
        m1416e(externalFilesDir);
    }
}
