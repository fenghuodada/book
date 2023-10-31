package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.C3413a;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.engine.C3531g;
import com.bumptech.glide.load.engine.cache.C3508c;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.engine.cache.e */
/* loaded from: classes.dex */
public final class C3513e implements InterfaceC3505a {

    /* renamed from: b */
    public final File f9296b;

    /* renamed from: c */
    public final long f9297c;

    /* renamed from: e */
    public C3413a f9299e;

    /* renamed from: d */
    public final C3508c f9298d = new C3508c();

    /* renamed from: a */
    public final C3522k f9295a = new C3522k();

    @Deprecated
    public C3513e(File file, long j) {
        this.f9296b = file;
        this.f9297c = j;
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3505a
    /* renamed from: a */
    public final void mo6675a(InterfaceC3577g interfaceC3577g, C3531g c3531g) {
        C3508c.C3509a c3509a;
        boolean z;
        String m6670b = this.f9295a.m6670b(interfaceC3577g);
        C3508c c3508c = this.f9298d;
        synchronized (c3508c) {
            c3509a = (C3508c.C3509a) c3508c.f9288a.get(m6670b);
            if (c3509a == null) {
                c3509a = c3508c.f9289b.m6677a();
                c3508c.f9288a.put(m6670b, c3509a);
            }
            c3509a.f9291b++;
        }
        c3509a.f9290a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + m6670b + " for for Key: " + interfaceC3577g);
            }
            try {
                C3413a m6673c = m6673c();
                if (m6673c.m6777g(m6670b) == null) {
                    C3413a.C3416c m6779e = m6673c.m6779e(m6670b);
                    if (m6779e != null) {
                        try {
                            if (c3531g.f9334a.mo6512a(c3531g.f9335b, m6779e.m6767b(), c3531g.f9336c)) {
                                C3413a.m6782a(C3413a.this, m6779e, true);
                                m6779e.f9058c = true;
                            }
                            if (!z) {
                                try {
                                    m6779e.m6768a();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!m6779e.f9058c) {
                                try {
                                    m6779e.m6768a();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(m6670b));
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.f9298d.m6678a(m6670b);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3505a
    /* renamed from: b */
    public final File mo6674b(InterfaceC3577g interfaceC3577g) {
        String m6670b = this.f9295a.m6670b(interfaceC3577g);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + m6670b + " for for Key: " + interfaceC3577g);
        }
        try {
            C3413a.C3418e m6777g = m6673c().m6777g(m6670b);
            if (m6777g != null) {
                return m6777g.f9067a[0];
            }
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final synchronized C3413a m6673c() throws IOException {
        if (this.f9299e == null) {
            this.f9299e = C3413a.m6775j(this.f9296b, this.f9297c);
        }
        return this.f9299e;
    }
}
