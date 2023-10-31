package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.material.carousel.c */
/* loaded from: classes3.dex */
public final class C7628c {

    /* renamed from: a */
    public final float f14625a;

    /* renamed from: b */
    public final List<C7630b> f14626b;

    /* renamed from: c */
    public final int f14627c;

    /* renamed from: d */
    public final int f14628d;

    /* renamed from: com.google.android.material.carousel.c$a */
    /* loaded from: classes3.dex */
    public static final class C7629a {

        /* renamed from: a */
        public final float f14629a;

        /* renamed from: c */
        public C7630b f14631c;

        /* renamed from: d */
        public C7630b f14632d;

        /* renamed from: b */
        public final ArrayList f14630b = new ArrayList();

        /* renamed from: e */
        public int f14633e = -1;

        /* renamed from: f */
        public int f14634f = -1;

        /* renamed from: g */
        public float f14635g = 0.0f;

        public C7629a(float f) {
            this.f14629a = f;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: a */
        public final void m4680a(float f, @FloatRange(from = 0.0d, m13045to = 1.0d) float f2, float f3, boolean z) {
            if (f3 <= 0.0f) {
                return;
            }
            C7630b c7630b = new C7630b(Float.MIN_VALUE, f, f2, f3);
            ArrayList arrayList = this.f14630b;
            C7630b c7630b2 = this.f14631c;
            if (z) {
                if (c7630b2 == null) {
                    this.f14631c = c7630b;
                    this.f14633e = arrayList.size();
                }
                if (this.f14634f != -1 && arrayList.size() - this.f14634f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.f14631c.f14639d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f14632d = c7630b;
                this.f14634f = arrayList.size();
            } else if (c7630b2 == null && f3 < this.f14635g) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else {
                if (this.f14632d != null && f3 > this.f14635g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f14635g = f3;
            arrayList.add(c7630b);
        }

        @NonNull
        /* renamed from: b */
        public final C7628c m4679b() {
            if (this.f14631c != null) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    ArrayList arrayList2 = this.f14630b;
                    int size = arrayList2.size();
                    float f = this.f14629a;
                    if (i < size) {
                        C7630b c7630b = (C7630b) arrayList2.get(i);
                        arrayList.add(new C7630b((i * f) + (this.f14631c.f14637b - (this.f14633e * f)), c7630b.f14637b, c7630b.f14638c, c7630b.f14639d));
                        i++;
                    } else {
                        return new C7628c(f, arrayList, this.f14633e, this.f14634f);
                    }
                }
            } else {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.c$b */
    /* loaded from: classes3.dex */
    public static final class C7630b {

        /* renamed from: a */
        public final float f14636a;

        /* renamed from: b */
        public final float f14637b;

        /* renamed from: c */
        public final float f14638c;

        /* renamed from: d */
        public final float f14639d;

        public C7630b(float f, float f2, float f3, float f4) {
            this.f14636a = f;
            this.f14637b = f2;
            this.f14638c = f3;
            this.f14639d = f4;
        }
    }

    public C7628c(float f, ArrayList arrayList, int i, int i2) {
        this.f14625a = f;
        this.f14626b = Collections.unmodifiableList(arrayList);
        this.f14627c = i;
        this.f14628d = i2;
    }

    /* renamed from: a */
    public final C7630b m4684a() {
        return this.f14626b.get(this.f14627c);
    }

    /* renamed from: b */
    public final C7630b m4683b() {
        return this.f14626b.get(0);
    }

    /* renamed from: c */
    public final C7630b m4682c() {
        return this.f14626b.get(this.f14628d);
    }

    /* renamed from: d */
    public final C7630b m4681d() {
        List<C7630b> list = this.f14626b;
        return list.get(list.size() - 1);
    }
}
