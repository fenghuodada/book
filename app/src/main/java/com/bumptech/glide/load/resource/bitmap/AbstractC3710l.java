package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.C3578h;

/* renamed from: com.bumptech.glide.load.resource.bitmap.l */
/* loaded from: classes.dex */
public abstract class AbstractC3710l {

    /* renamed from: a */
    public static final C3715e f9670a;

    /* renamed from: b */
    public static final C3713c f9671b;

    /* renamed from: c */
    public static final C3714d f9672c;

    /* renamed from: d */
    public static final C3716f f9673d;

    /* renamed from: e */
    public static final C3714d f9674e;

    /* renamed from: f */
    public static final C3578h<AbstractC3710l> f9675f;

    /* renamed from: g */
    public static final boolean f9676g;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$a */
    /* loaded from: classes.dex */
    public static class C3711a extends AbstractC3710l {
        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: a */
        public final int mo6555a(int i, int i2, int i3, int i4) {
            return 2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: b */
        public final float mo6554b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$b */
    /* loaded from: classes.dex */
    public static class C3712b extends AbstractC3710l {
        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: a */
        public final int mo6555a(int i, int i2, int i3, int i4) {
            return 1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: b */
        public final float mo6554b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return 1.0f / (max << (max >= ceil ? 0 : 1));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$c */
    /* loaded from: classes.dex */
    public static class C3713c extends AbstractC3710l {
        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: a */
        public final int mo6555a(int i, int i2, int i3, int i4) {
            if (mo6554b(i, i2, i3, i4) == 1.0f) {
                return 2;
            }
            return AbstractC3710l.f9670a.mo6555a(i, i2, i3, i4);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: b */
        public final float mo6554b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, AbstractC3710l.f9670a.mo6554b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$d */
    /* loaded from: classes.dex */
    public static class C3714d extends AbstractC3710l {
        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: a */
        public final int mo6555a(int i, int i2, int i3, int i4) {
            return 2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: b */
        public final float mo6554b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$e */
    /* loaded from: classes.dex */
    public static class C3715e extends AbstractC3710l {
        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: a */
        public final int mo6555a(int i, int i2, int i3, int i4) {
            return AbstractC3710l.f9676g ? 2 : 1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: b */
        public final float mo6554b(int i, int i2, int i3, int i4) {
            if (AbstractC3710l.f9676g) {
                return Math.min(i3 / i, i4 / i2);
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l$f */
    /* loaded from: classes.dex */
    public static class C3716f extends AbstractC3710l {
        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: a */
        public final int mo6555a(int i, int i2, int i3, int i4) {
            return 2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3710l
        /* renamed from: b */
        public final float mo6554b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    static {
        new C3711a();
        new C3712b();
        f9670a = new C3715e();
        f9671b = new C3713c();
        C3714d c3714d = new C3714d();
        f9672c = c3714d;
        f9673d = new C3716f();
        f9674e = c3714d;
        f9675f = C3578h.m6607a(c3714d, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f9676g = true;
    }

    /* renamed from: a */
    public abstract int mo6555a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo6554b(int i, int i2, int i3, int i4);
}
