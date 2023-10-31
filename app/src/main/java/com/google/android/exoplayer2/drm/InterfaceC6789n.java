package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.drm.n */
/* loaded from: classes.dex */
public interface InterfaceC6789n {

    /* renamed from: com.google.android.exoplayer2.drm.n$a */
    /* loaded from: classes.dex */
    public static class C6790a {

        /* renamed from: a */
        public final int f11041a;
        @Nullable

        /* renamed from: b */
        public final InterfaceC7188p.C7189a f11042b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C6791a> f11043c;

        /* renamed from: com.google.android.exoplayer2.drm.n$a$a */
        /* loaded from: classes.dex */
        public static final class C6791a {

            /* renamed from: a */
            public final Handler f11044a;

            /* renamed from: b */
            public final InterfaceC6789n f11045b;

            public C6791a(Handler handler, InterfaceC6789n interfaceC6789n) {
                this.f11044a = handler;
                this.f11045b = interfaceC6789n;
            }
        }

        public C6790a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public C6790a(CopyOnWriteArrayList<C6791a> copyOnWriteArrayList, int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            this.f11043c = copyOnWriteArrayList;
            this.f11041a = i;
            this.f11042b = c7189a;
        }

        /* renamed from: a */
        public final void m5992a() {
            Iterator<C6791a> it = this.f11043c.iterator();
            while (it.hasNext()) {
                C6791a next = it.next();
                final InterfaceC6789n interfaceC6789n = next.f11045b;
                C7408g0.m5082x(next.f11044a, new Runnable() { // from class: com.google.android.exoplayer2.drm.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6789n.C6790a c6790a = InterfaceC6789n.C6790a.this;
                        interfaceC6789n.mo4884E(c6790a.f11041a, c6790a.f11042b);
                    }
                });
            }
        }

        /* renamed from: b */
        public final void m5991b() {
            Iterator<C6791a> it = this.f11043c.iterator();
            while (it.hasNext()) {
                C6791a next = it.next();
                final InterfaceC6789n interfaceC6789n = next.f11045b;
                C7408g0.m5082x(next.f11044a, new Runnable() { // from class: com.google.android.exoplayer2.drm.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6789n.C6790a c6790a = InterfaceC6789n.C6790a.this;
                        interfaceC6789n.mo4872w(c6790a.f11041a, c6790a.f11042b);
                    }
                });
            }
        }

        /* renamed from: c */
        public final void m5990c() {
            Iterator<C6791a> it = this.f11043c.iterator();
            while (it.hasNext()) {
                C6791a next = it.next();
                final InterfaceC6789n interfaceC6789n = next.f11045b;
                C7408g0.m5082x(next.f11044a, new Runnable() { // from class: com.google.android.exoplayer2.drm.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6789n.C6790a c6790a = InterfaceC6789n.C6790a.this;
                        interfaceC6789n.mo4879P(c6790a.f11041a, c6790a.f11042b);
                    }
                });
            }
        }

        /* renamed from: d */
        public final void m5989d(final int i) {
            Iterator<C6791a> it = this.f11043c.iterator();
            while (it.hasNext()) {
                C6791a next = it.next();
                final InterfaceC6789n interfaceC6789n = next.f11045b;
                C7408g0.m5082x(next.f11044a, new Runnable() { // from class: com.google.android.exoplayer2.drm.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6789n.C6790a c6790a = InterfaceC6789n.C6790a.this;
                        int i2 = c6790a.f11041a;
                        InterfaceC6789n interfaceC6789n2 = interfaceC6789n;
                        interfaceC6789n2.mo4877g();
                        interfaceC6789n2.mo4882L(i2, c6790a.f11042b, i);
                    }
                });
            }
        }

        /* renamed from: e */
        public final void m5988e(final Exception exc) {
            Iterator<C6791a> it = this.f11043c.iterator();
            while (it.hasNext()) {
                C6791a next = it.next();
                final InterfaceC6789n interfaceC6789n = next.f11045b;
                C7408g0.m5082x(next.f11044a, new Runnable() { // from class: com.google.android.exoplayer2.drm.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6789n.C6790a c6790a = InterfaceC6789n.C6790a.this;
                        interfaceC6789n.mo4874n(c6790a.f11041a, c6790a.f11042b, exc);
                    }
                });
            }
        }

        /* renamed from: f */
        public final void m5987f() {
            Iterator<C6791a> it = this.f11043c.iterator();
            while (it.hasNext()) {
                C6791a next = it.next();
                final InterfaceC6789n interfaceC6789n = next.f11045b;
                C7408g0.m5082x(next.f11044a, new Runnable() { // from class: com.google.android.exoplayer2.drm.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6789n.C6790a c6790a = InterfaceC6789n.C6790a.this;
                        interfaceC6789n.mo4881M(c6790a.f11041a, c6790a.f11042b);
                    }
                });
            }
        }
    }

    /* renamed from: E */
    void mo4884E(int i, @Nullable InterfaceC7188p.C7189a c7189a);

    /* renamed from: L */
    void mo4882L(int i, @Nullable InterfaceC7188p.C7189a c7189a, int i2);

    /* renamed from: M */
    void mo4881M(int i, @Nullable InterfaceC7188p.C7189a c7189a);

    /* renamed from: P */
    void mo4879P(int i, @Nullable InterfaceC7188p.C7189a c7189a);

    @Deprecated
    /* renamed from: g */
    void mo4877g();

    /* renamed from: n */
    void mo4874n(int i, @Nullable InterfaceC7188p.C7189a c7189a, Exception exc);

    /* renamed from: w */
    void mo4872w(int i, @Nullable InterfaceC7188p.C7189a c7189a);
}
