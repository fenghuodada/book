package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7409h;
import com.google.android.exoplayer2.util.C7417m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nonnull;

/* renamed from: com.google.android.exoplayer2.util.m */
/* loaded from: classes.dex */
public final class C7417m<T> {

    /* renamed from: a */
    public final InterfaceC7396b f13928a;

    /* renamed from: b */
    public final InterfaceC7412i f13929b;

    /* renamed from: c */
    public final InterfaceC7419b<T> f13930c;

    /* renamed from: d */
    public final CopyOnWriteArraySet<C7420c<T>> f13931d;

    /* renamed from: e */
    public final ArrayDeque<Runnable> f13932e;

    /* renamed from: f */
    public final ArrayDeque<Runnable> f13933f;

    /* renamed from: g */
    public boolean f13934g;

    /* renamed from: com.google.android.exoplayer2.util.m$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7418a<T> {
        void invoke(T t);
    }

    /* renamed from: com.google.android.exoplayer2.util.m$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7419b<T> {
        /* renamed from: b */
        void mo5058b(T t, C7409h c7409h);
    }

    /* renamed from: com.google.android.exoplayer2.util.m$c */
    /* loaded from: classes.dex */
    public static final class C7420c<T> {
        @Nonnull

        /* renamed from: a */
        public final T f13935a;

        /* renamed from: b */
        public C7409h.C7410a f13936b = new C7409h.C7410a();

        /* renamed from: c */
        public boolean f13937c;

        /* renamed from: d */
        public boolean f13938d;

        public C7420c(@Nonnull T t) {
            this.f13935a = t;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7420c.class != obj.getClass()) {
                return false;
            }
            return this.f13935a.equals(((C7420c) obj).f13935a);
        }

        public final int hashCode() {
            return this.f13935a.hashCode();
        }
    }

    public C7417m(Looper looper, C7397b0 c7397b0, InterfaceC7419b interfaceC7419b) {
        this(new CopyOnWriteArraySet(), looper, c7397b0, interfaceC7419b);
    }

    public C7417m(CopyOnWriteArraySet<C7420c<T>> copyOnWriteArraySet, Looper looper, InterfaceC7396b interfaceC7396b, InterfaceC7419b<T> interfaceC7419b) {
        this.f13928a = interfaceC7396b;
        this.f13931d = copyOnWriteArraySet;
        this.f13930c = interfaceC7419b;
        this.f13932e = new ArrayDeque<>();
        this.f13933f = new ArrayDeque<>();
        this.f13929b = interfaceC7396b.mo5126b(looper, new Handler.Callback() { // from class: com.google.android.exoplayer2.util.k
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C7417m c7417m = C7417m.this;
                Iterator it = c7417m.f13931d.iterator();
                while (it.hasNext()) {
                    C7417m.C7420c c7420c = (C7417m.C7420c) it.next();
                    if (!c7420c.f13938d && c7420c.f13937c) {
                        C7409h m5076b = c7420c.f13936b.m5076b();
                        c7420c.f13936b = new C7409h.C7410a();
                        c7420c.f13937c = false;
                        c7417m.f13930c.mo5058b(c7420c.f13935a, m5076b);
                    }
                    if (c7417m.f13929b.mo5072a()) {
                        return true;
                    }
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public final void m5061a() {
        ArrayDeque<Runnable> arrayDeque = this.f13933f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        InterfaceC7412i interfaceC7412i = this.f13929b;
        if (!interfaceC7412i.mo5072a()) {
            interfaceC7412i.mo5065h(interfaceC7412i.mo5068e(0));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f13932e;
        boolean z = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            arrayDeque2.peekFirst().run();
            arrayDeque2.removeFirst();
        }
    }

    /* renamed from: b */
    public final void m5060b(final int i, final InterfaceC7418a<T> interfaceC7418a) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f13931d);
        this.f13933f.add(new Runnable() { // from class: com.google.android.exoplayer2.util.l
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    C7417m.C7420c c7420c = (C7417m.C7420c) it.next();
                    if (!c7420c.f13938d) {
                        int i2 = i;
                        if (i2 != -1) {
                            c7420c.f13936b.m5077a(i2);
                        }
                        c7420c.f13937c = true;
                        interfaceC7418a.invoke(c7420c.f13935a);
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public final void m5059c() {
        CopyOnWriteArraySet<C7420c<T>> copyOnWriteArraySet = this.f13931d;
        Iterator<C7420c<T>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C7420c<T> next = it.next();
            next.f13938d = true;
            if (next.f13937c) {
                C7409h m5076b = next.f13936b.m5076b();
                this.f13930c.mo5058b(next.f13935a, m5076b);
            }
        }
        copyOnWriteArraySet.clear();
        this.f13934g = true;
    }
}
