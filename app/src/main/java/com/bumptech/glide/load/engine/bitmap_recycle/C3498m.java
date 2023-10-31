package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.C0499a;
import com.bumptech.glide.util.C3861k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@RequiresApi(19)
/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.m */
/* loaded from: classes.dex */
public final class C3498m implements InterfaceC3496k {

    /* renamed from: d */
    public static final Bitmap.Config[] f9261d;

    /* renamed from: e */
    public static final Bitmap.Config[] f9262e;

    /* renamed from: f */
    public static final Bitmap.Config[] f9263f;

    /* renamed from: g */
    public static final Bitmap.Config[] f9264g;

    /* renamed from: h */
    public static final Bitmap.Config[] f9265h;

    /* renamed from: a */
    public final C3501c f9266a = new C3501c();

    /* renamed from: b */
    public final C3488g<C3500b, Bitmap> f9267b = new C3488g<>();

    /* renamed from: c */
    public final HashMap f9268c = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.m$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C3499a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9269a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f9269a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9269a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9269a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9269a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.m$b */
    /* loaded from: classes.dex */
    public static final class C3500b implements InterfaceC3497l {

        /* renamed from: a */
        public final C3501c f9270a;

        /* renamed from: b */
        public int f9271b;

        /* renamed from: c */
        public Bitmap.Config f9272c;

        public C3500b(C3501c c3501c) {
            this.f9270a = c3501c;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3497l
        /* renamed from: a */
        public final void mo6682a() {
            this.f9270a.m6711c(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C3500b) {
                C3500b c3500b = (C3500b) obj;
                return this.f9271b == c3500b.f9271b && C3861k.m6403a(this.f9272c, c3500b.f9272c);
            }
            return false;
        }

        public final int hashCode() {
            int i = this.f9271b * 31;
            Bitmap.Config config = this.f9272c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return C3498m.m6686c(this.f9271b, this.f9272c);
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.m$c */
    /* loaded from: classes.dex */
    public static class C3501c extends AbstractC3484c<C3500b> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.AbstractC3484c
        /* renamed from: a */
        public final C3500b mo6681a() {
            return new C3500b(this);
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            config = Bitmap.Config.RGBA_F16;
            configArr[configArr.length - 1] = config;
        }
        f9261d = configArr;
        f9262e = configArr;
        f9263f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f9264g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f9265h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: c */
    public static String m6686c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: a */
    public final void m6688a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> m6685d = m6685d(bitmap.getConfig());
        Integer num2 = m6685d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m6685d.remove(num);
                return;
            } else {
                m6685d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m6684e(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[EDGE_INSN: B:40:0x008c->B:35:0x008c ?: BREAK  , SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m6687b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            int r0 = com.bumptech.glide.util.C3861k.m6402b(r11, r12, r13)
            com.bumptech.glide.load.engine.bitmap_recycle.m$c r1 = r10.f9266a
            com.bumptech.glide.load.engine.bitmap_recycle.l r2 = r1.m6712b()
            com.bumptech.glide.load.engine.bitmap_recycle.m$b r2 = (com.bumptech.glide.load.engine.bitmap_recycle.C3498m.C3500b) r2
            r2.f9271b = r0
            r2.f9272c = r13
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r5 = 0
            if (r3 < r4) goto L24
            android.graphics.Bitmap$Config r3 = androidx.core.graphics.C0715h.m11901b()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L24
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.C3498m.f9262e
            goto L48
        L24:
            int[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.C3498m.C3499a.f9269a
            int r4 = r13.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L46
            r6 = 2
            if (r3 == r6) goto L43
            r6 = 3
            if (r3 == r6) goto L40
            r6 = 4
            if (r3 == r6) goto L3d
            android.graphics.Bitmap$Config[] r3 = new android.graphics.Bitmap.Config[r4]
            r3[r5] = r13
            goto L48
        L3d:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.C3498m.f9265h
            goto L48
        L40:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.C3498m.f9264g
            goto L48
        L43:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.C3498m.f9263f
            goto L48
        L46:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.C3498m.f9261d
        L48:
            int r4 = r3.length
        L49:
            if (r5 >= r4) goto L8c
            r6 = r3[r5]
            java.util.NavigableMap r7 = r10.m6685d(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object r7 = r7.ceilingKey(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L89
            int r8 = r7.intValue()
            int r9 = r0 * 8
            if (r8 > r9) goto L89
            int r3 = r7.intValue()
            if (r3 != r0) goto L76
            if (r6 != 0) goto L70
            if (r13 == 0) goto L8c
            goto L76
        L70:
            boolean r0 = r6.equals(r13)
            if (r0 != 0) goto L8c
        L76:
            r1.m6711c(r2)
            int r0 = r7.intValue()
            com.bumptech.glide.load.engine.bitmap_recycle.l r1 = r1.m6712b()
            r2 = r1
            com.bumptech.glide.load.engine.bitmap_recycle.m$b r2 = (com.bumptech.glide.load.engine.bitmap_recycle.C3498m.C3500b) r2
            r2.f9271b = r0
            r2.f9272c = r6
            goto L8c
        L89:
            int r5 = r5 + 1
            goto L49
        L8c:
            com.bumptech.glide.load.engine.bitmap_recycle.g<com.bumptech.glide.load.engine.bitmap_recycle.m$b, android.graphics.Bitmap> r0 = r10.f9267b
            java.lang.Object r0 = r0.m6710a(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto La2
            int r1 = r2.f9271b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.m6688a(r1, r0)
            r0.reconfigure(r11, r12, r13)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.C3498m.m6687b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public final NavigableMap<Integer, Integer> m6685d(Bitmap.Config config) {
        HashMap hashMap = this.f9268c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    /* renamed from: e */
    public final String m6684e(Bitmap bitmap) {
        return m6686c(C3861k.m6401c(bitmap), bitmap.getConfig());
    }

    /* renamed from: f */
    public final void m6683f(Bitmap bitmap) {
        int m6401c = C3861k.m6401c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C3500b m6712b = this.f9266a.m6712b();
        m6712b.f9271b = m6401c;
        m6712b.f9272c = config;
        this.f9267b.m6709b(m6712b, bitmap);
        NavigableMap<Integer, Integer> m6685d = m6685d(bitmap.getConfig());
        Integer num = m6685d.get(Integer.valueOf(m6712b.f9271b));
        Integer valueOf = Integer.valueOf(m6712b.f9271b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        m6685d.put(valueOf, Integer.valueOf(i));
    }

    public final String toString() {
        StringBuilder m12383b = C0499a.m12383b("SizeConfigStrategy{groupedMap=");
        m12383b.append(this.f9267b);
        m12383b.append(", sortedSizes=(");
        HashMap hashMap = this.f9268c;
        for (Map.Entry entry : hashMap.entrySet()) {
            m12383b.append(entry.getKey());
            m12383b.append('[');
            m12383b.append(entry.getValue());
            m12383b.append("], ");
        }
        if (!hashMap.isEmpty()) {
            m12383b.replace(m12383b.length() - 2, m12383b.length(), "");
        }
        m12383b.append(")}");
        return m12383b.toString();
    }
}
