package com.vungle.warren.downloader;

import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.vungle.warren.C9992u;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.persistence.C9914a;
import com.vungle.warren.utility.C10089k;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.vungle.warren.downloader.e */
/* loaded from: classes3.dex */
public final class C9778e implements InterfaceC9779f {

    /* renamed from: b */
    public final C9914a f19494b;

    /* renamed from: c */
    public final C9780g f19495c;

    /* renamed from: d */
    public final long f19496d;

    /* renamed from: e */
    public final C9992u f19497e;

    /* renamed from: a */
    public final HashMap<File, Long> f19493a = new HashMap<>();

    /* renamed from: f */
    public final ConcurrentHashMap f19498f = new ConcurrentHashMap();

    /* renamed from: g */
    public final HashSet<File> f19499g = new HashSet<>();

    public C9778e(@NonNull C9914a c9914a, @NonNull C9780g c9780g, @NonNull C9992u c9992u, long j) {
        this.f19494b = c9914a;
        this.f19495c = c9780g;
        this.f19497e = c9992u;
        this.f19496d = Math.max(0L, j);
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    @NonNull
    /* renamed from: a */
    public final synchronized File mo1522a(@NonNull String str) throws IOException {
        File file;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str.getBytes("UTF-8"));
                file = new File(m1532l(), Base64.encodeToString(messageDigest.digest(), 10));
                this.f19495c.m1512b(0L, file);
            } catch (NoSuchAlgorithmException e) {
                VungleLogger.m1603c("CleverCache#getFile; loadAd sequence", "cannot get instance of MessageDigest with algorithm SHA-256");
                throw new IOException(e);
            }
        } catch (UnsupportedEncodingException e2) {
            VungleLogger.m1603c("CleverCache#getFile; loadAd sequence", "cannot encode url with charset = UTF-8");
            throw new IOException(e2);
        }
        return file;
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    /* renamed from: b */
    public final synchronized void mo1521b() {
        C9780g c9780g = this.f19495c;
        File m1513a = c9780g.m1513a();
        Serializable serializable = (Serializable) C10089k.m1266d(m1513a);
        if (serializable != null) {
            if (serializable instanceof Collection) {
                c9780g.f19502c.addAll((Collection) serializable);
            } else {
                C10089k.m1267c(m1513a);
            }
        }
        m1525s();
        m1534j();
        m1526r();
        m1533k();
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    /* renamed from: c */
    public final synchronized void mo1520c(@NonNull File file, long j) {
        this.f19493a.put(file, Long.valueOf(j));
        m1523u();
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    public final synchronized void clear() {
        C9780g c9780g = this.f19495c;
        c9780g.getClass();
        ArrayList arrayList = new ArrayList(c9780g.f19502c);
        m1528p(arrayList);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null && !m1527q(file) && deleteContents(file)) {
                i++;
                C9780g c9780g2 = this.f19495c;
                c9780g2.getClass();
                c9780g2.f19502c.remove(file);
                this.f19493a.remove(file);
            }
        }
        if (i > 0) {
            this.f19495c.m1511c();
            m1523u();
        }
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    /* renamed from: d */
    public final synchronized void mo1519d(@NonNull File file, long j) {
        this.f19495c.m1512b(j, file);
        this.f19495c.m1511c();
        Log.d("e", "Cache hit " + file + " cache touch updated");
        mo1517f();
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    public final synchronized boolean deleteContents(@NonNull File file) {
        boolean z;
        try {
            C10089k.m1268b(file);
            try {
                C10089k.m1268b(mo1518e(file));
                return true;
            } catch (IOException e) {
                e = e;
                z = true;
                Object[] objArr = new Object[3];
                objArr[0] = z ? "meta" : "file";
                objArr[1] = file.getPath();
                objArr[2] = e;
                VungleLogger.m1603c("CleverCache#deleteContents; loadAd sequence", String.format("Cannot delete %1$s for file %2$s; Error %3$s occured", objArr));
                return false;
            }
        } catch (IOException e2) {
            e = e2;
            z = false;
        }
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    @NonNull
    /* renamed from: e */
    public final synchronized File mo1518e(@NonNull File file) {
        File m1529o;
        m1529o = m1529o();
        return new File(m1529o, file.getName() + ".vng_meta");
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    @NonNull
    /* renamed from: f */
    public final synchronized List<File> mo1517f() {
        m1533k();
        long m1354a = this.f19497e.m1354a();
        long m1265e = C10089k.m1265e(m1532l());
        Log.d("e", "Purge check current cache total: " + m1265e + " target: " + m1354a);
        if (m1265e < m1354a) {
            return Collections.emptyList();
        }
        Log.d("e", "Purge start");
        ArrayList arrayList = new ArrayList();
        C9780g c9780g = this.f19495c;
        c9780g.getClass();
        ArrayList arrayList2 = new ArrayList(c9780g.f19502c);
        m1528p(arrayList2);
        long m1265e2 = C10089k.m1265e(m1532l());
        if (m1265e2 < m1354a) {
            Log.d("e", "Cleaned up not tracked files, size is ok");
            return Collections.emptyList();
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            File file = (File) it.next();
            if (file != null && !m1527q(file)) {
                long length = file.length();
                if (deleteContents(file)) {
                    m1265e2 -= length;
                    arrayList.add(file);
                    Log.d("e", "Deleted file: " + file.getName() + " size: " + length + " total: " + m1265e2 + " target: " + m1354a);
                    C9780g c9780g2 = this.f19495c;
                    c9780g2.getClass();
                    c9780g2.f19502c.remove(file);
                    this.f19493a.remove(file);
                    if (m1265e2 < m1354a) {
                        m1354a = this.f19497e.m1354a();
                        if (m1265e2 < m1354a) {
                            Log.d("e", "Cleaned enough total: " + m1265e2 + " target: " + m1354a);
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.size() > 0) {
            this.f19495c.m1511c();
            m1523u();
        }
        Log.d("e", "Purge complete");
        return arrayList;
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    /* renamed from: g */
    public final synchronized void mo1516g(@NonNull File file) {
        Integer num = (Integer) this.f19498f.get(file);
        if (num == null) {
            this.f19498f.remove(file);
            return;
        }
        Integer valueOf = Integer.valueOf(num.intValue() - 1);
        if (valueOf.intValue() <= 0) {
            this.f19498f.remove(file);
        }
        Log.d("e", "Stop tracking file: " + file + " ref count " + valueOf);
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    /* renamed from: h */
    public final synchronized void mo1515h(@NonNull File file) {
        int i;
        Integer num = (Integer) this.f19498f.get(file);
        this.f19495c.m1512b(0L, file);
        this.f19495c.m1511c();
        if (num != null && num.intValue() > 0) {
            i = Integer.valueOf(num.intValue() + 1);
            this.f19498f.put(file, i);
            Log.d("e", "Start tracking file: " + file + " ref count " + i);
        }
        i = 1;
        this.f19498f.put(file, i);
        Log.d("e", "Start tracking file: " + file + " ref count " + i);
    }

    @Override // com.vungle.warren.downloader.InterfaceC9779f
    /* renamed from: i */
    public final synchronized boolean mo1514i(@NonNull File file) {
        if (deleteContents(file)) {
            this.f19493a.remove(file);
            C9780g c9780g = this.f19495c;
            c9780g.getClass();
            c9780g.f19502c.remove(file);
            this.f19495c.m1511c();
            m1523u();
            this.f19499g.remove(file);
            m1524t();
            return true;
        }
        this.f19499g.add(file);
        m1524t();
        return false;
    }

    /* renamed from: j */
    public final synchronized void m1534j() {
        long currentTimeMillis = System.currentTimeMillis() - this.f19496d;
        File[] listFiles = m1532l().listFiles();
        HashSet hashSet = new HashSet(this.f19493a.keySet());
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                long m1530n = m1530n(file);
                hashSet.remove(file);
                if (!m1527q(file) && (m1530n == 0 || m1530n <= currentTimeMillis)) {
                    if (deleteContents(file)) {
                        this.f19493a.remove(file);
                        C9780g c9780g = this.f19495c;
                        c9780g.getClass();
                        c9780g.f19502c.remove(file);
                    }
                    Log.d("e", "Deleted expired file " + file);
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f19493a.remove((File) it.next());
            }
            this.f19495c.m1511c();
            m1523u();
        }
    }

    /* renamed from: k */
    public final void m1533k() {
        Iterator it = new HashSet(this.f19499g).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!m1527q(file)) {
                mo1514i(file);
            }
        }
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: l */
    public final synchronized File m1532l() {
        File file;
        file = new File(m1531m(), "assets");
        if (!file.isDirectory() && file.exists()) {
            C10089k.m1267c(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: m */
    public final File m1531m() {
        File file = new File(this.f19494b.m1417d(), "clever_cache");
        if (!file.isDirectory()) {
            C10089k.m1267c(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: n */
    public final synchronized long m1530n(@NonNull File file) {
        Long l;
        l = this.f19493a.get(file);
        return l == null ? file.lastModified() : l.longValue();
    }

    @VisibleForTesting
    /* renamed from: o */
    public final synchronized File m1529o() {
        File file;
        file = new File(m1532l(), "meta");
        if (!file.isDirectory()) {
            C10089k.m1267c(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: p */
    public final void m1528p(ArrayList arrayList) {
        File m1529o = m1529o();
        File[] listFiles = m1532l().listFiles();
        if (listFiles != null) {
            ArrayList arrayList2 = new ArrayList(Arrays.asList(listFiles));
            arrayList2.removeAll(arrayList);
            arrayList2.remove(m1529o);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                deleteContents(file);
                Log.d("e", "Deleted non tracked file " + file);
            }
        }
    }

    /* renamed from: q */
    public final boolean m1527q(@NonNull File file) {
        Integer num = (Integer) this.f19498f.get(file);
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        Log.d("e", "File is tracked and protected : " + file);
        return true;
    }

    /* renamed from: r */
    public final void m1526r() {
        Serializable serializable = (Serializable) C10089k.m1266d(new File(m1531m(), "cache_failed_to_delete"));
        if (!(serializable instanceof HashSet)) {
            return;
        }
        try {
            this.f19499g.addAll((HashSet) serializable);
        } catch (ClassCastException e) {
            VungleLogger.m1603c("CleverCache#loadFailedToDelete;", String.format("Error %1$s occurred; old set is not set of File", e));
            C10089k.m1267c(new File(m1531m(), "cache_failed_to_delete"));
        }
    }

    /* renamed from: s */
    public final void m1525s() {
        Serializable serializable = (Serializable) C10089k.m1266d(new File(m1531m(), "cache_touch_timestamp"));
        if (!(serializable instanceof HashMap)) {
            return;
        }
        try {
            this.f19493a.putAll((HashMap) serializable);
        } catch (ClassCastException e) {
            VungleLogger.m1603c("CleverCache#loadTouchTimestamps; loadAd sequence", String.format("Error %1$s occurred; old map is not File -> Long", e));
            C10089k.m1267c(new File(m1531m(), "cache_touch_timestamp"));
        }
    }

    /* renamed from: t */
    public final void m1524t() {
        File file = new File(m1531m(), "cache_failed_to_delete");
        HashSet<File> hashSet = this.f19499g;
        if (!hashSet.isEmpty()) {
            C10089k.m1264f(file, new HashSet(hashSet));
        } else if (file.exists()) {
            C10089k.m1267c(file);
        }
    }

    /* renamed from: u */
    public final void m1523u() {
        C10089k.m1264f(new File(m1531m(), "cache_touch_timestamp"), new HashMap(this.f19493a));
    }
}
