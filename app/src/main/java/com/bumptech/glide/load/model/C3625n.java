package com.bumptech.glide.load.model;

import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.C3861k;
import java.util.ArrayDeque;

/* renamed from: com.bumptech.glide.load.model.n */
/* loaded from: classes.dex */
public final class C3625n<A, B> {

    /* renamed from: a */
    public final C3624m f9560a = new C3624m();

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.model.n$a */
    /* loaded from: classes.dex */
    public static final class C3626a<A> {

        /* renamed from: d */
        public static final ArrayDeque f9561d;

        /* renamed from: a */
        public int f9562a;

        /* renamed from: b */
        public int f9563b;

        /* renamed from: c */
        public A f9564c;

        static {
            char[] cArr = C3861k.f9956a;
            f9561d = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static C3626a m6592a(Object obj) {
            C3626a c3626a;
            ArrayDeque arrayDeque = f9561d;
            synchronized (arrayDeque) {
                c3626a = (C3626a) arrayDeque.poll();
            }
            if (c3626a == null) {
                c3626a = new C3626a();
            }
            c3626a.f9564c = obj;
            c3626a.f9563b = 0;
            c3626a.f9562a = 0;
            return c3626a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C3626a) {
                C3626a c3626a = (C3626a) obj;
                return this.f9563b == c3626a.f9563b && this.f9562a == c3626a.f9562a && this.f9564c.equals(c3626a.f9564c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f9564c.hashCode() + (((this.f9562a * 31) + this.f9563b) * 31);
        }
    }
}
