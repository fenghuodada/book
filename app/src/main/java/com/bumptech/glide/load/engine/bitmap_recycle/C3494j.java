package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.C3861k;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.j */
/* loaded from: classes.dex */
public final class C3494j implements InterfaceC3485d {

    /* renamed from: j */
    public static final Bitmap.Config f9251j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC3496k f9252a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f9253b;

    /* renamed from: c */
    public final C3495a f9254c;

    /* renamed from: d */
    public final long f9255d;

    /* renamed from: e */
    public long f9256e;

    /* renamed from: f */
    public int f9257f;

    /* renamed from: g */
    public int f9258g;

    /* renamed from: h */
    public int f9259h;

    /* renamed from: i */
    public int f9260i;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.j$a */
    /* loaded from: classes.dex */
    public static final class C3495a {
    }

    public C3494j(long j) {
        Bitmap.Config config;
        C3498m c3498m = new C3498m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f9255d = j;
        this.f9252a = c3498m;
        this.f9253b = unmodifiableSet;
        this.f9254c = new C3495a();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public final void mo6695a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo6694b();
        } else if (i >= 20 || i == 15) {
            m6689h(this.f9255d / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
    /* renamed from: b */
    public final void mo6694b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m6689h(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
    @NonNull
    /* renamed from: c */
    public final Bitmap mo6693c(int i, int i2, Bitmap.Config config) {
        Bitmap m6690g = m6690g(i, i2, config);
        if (m6690g == null) {
            if (config == null) {
                config = f9251j;
            }
            return Bitmap.createBitmap(i, i2, config);
        }
        return m6690g;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
    /* renamed from: d */
    public final synchronized void mo6538d(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((C3498m) this.f9252a).getClass();
                        if (C3861k.m6401c(bitmap) <= this.f9255d && this.f9253b.contains(bitmap.getConfig())) {
                            ((C3498m) this.f9252a).getClass();
                            int m6401c = C3861k.m6401c(bitmap);
                            ((C3498m) this.f9252a).m6683f(bitmap);
                            this.f9254c.getClass();
                            this.f9259h++;
                            this.f9256e += m6401c;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + ((C3498m) this.f9252a).m6684e(bitmap));
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                m6691f();
                            }
                            m6689h(this.f9255d);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((C3498m) this.f9252a).m6684e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f9253b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
    @NonNull
    /* renamed from: e */
    public final Bitmap mo6692e(int i, int i2, Bitmap.Config config) {
        Bitmap m6690g = m6690g(i, i2, config);
        if (m6690g != null) {
            m6690g.eraseColor(0);
            return m6690g;
        }
        if (config == null) {
            config = f9251j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: f */
    public final void m6691f() {
        Log.v("LruBitmapPool", "Hits=" + this.f9257f + ", misses=" + this.f9258g + ", puts=" + this.f9259h + ", evictions=" + this.f9260i + ", currentSize=" + this.f9256e + ", maxSize=" + this.f9255d + "\nStrategy=" + this.f9252a);
    }

    @Nullable
    /* renamed from: g */
    public final synchronized Bitmap m6690g(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap m6687b;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            InterfaceC3496k interfaceC3496k = this.f9252a;
            if (config != null) {
                config3 = config;
            } else {
                config3 = f9251j;
            }
            m6687b = ((C3498m) interfaceC3496k).m6687b(i, i2, config3);
            if (m6687b == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    ((C3498m) this.f9252a).getClass();
                    sb.append(C3498m.m6686c(C3861k.m6402b(i, i2, config), config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f9258g++;
            } else {
                this.f9257f++;
                long j = this.f9256e;
                ((C3498m) this.f9252a).getClass();
                this.f9256e = j - C3861k.m6401c(m6687b);
                this.f9254c.getClass();
                m6687b.setHasAlpha(true);
                m6687b.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                ((C3498m) this.f9252a).getClass();
                sb2.append(C3498m.m6686c(C3861k.m6402b(i, i2, config), config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m6691f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return m6687b;
    }

    /* renamed from: h */
    public final synchronized void m6689h(long j) {
        while (this.f9256e > j) {
            C3498m c3498m = (C3498m) this.f9252a;
            Bitmap m6708c = c3498m.f9267b.m6708c();
            if (m6708c != null) {
                c3498m.m6688a(Integer.valueOf(C3861k.m6401c(m6708c)), m6708c);
            }
            if (m6708c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m6691f();
                }
                this.f9256e = 0L;
                return;
            }
            this.f9254c.getClass();
            long j2 = this.f9256e;
            ((C3498m) this.f9252a).getClass();
            this.f9256e = j2 - C3861k.m6401c(m6708c);
            this.f9260i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((C3498m) this.f9252a).m6684e(m6708c));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m6691f();
            }
            m6708c.recycle();
        }
    }
}
