package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3497l;
import com.bumptech.glide.util.C3861k;
import java.util.ArrayDeque;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.c */
/* loaded from: classes.dex */
public abstract class AbstractC3484c<T extends InterfaceC3497l> {

    /* renamed from: a */
    public final ArrayDeque f9235a;

    public AbstractC3484c() {
        char[] cArr = C3861k.f9956a;
        this.f9235a = new ArrayDeque(20);
    }

    /* renamed from: a */
    public abstract T mo6681a();

    /* renamed from: b */
    public final T m6712b() {
        T t = (T) this.f9235a.poll();
        return t == null ? mo6681a() : t;
    }

    /* renamed from: c */
    public final void m6711c(T t) {
        ArrayDeque arrayDeque = this.f9235a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(t);
        }
    }
}
