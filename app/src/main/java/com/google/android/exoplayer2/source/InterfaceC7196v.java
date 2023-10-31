package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.source.InterfaceC7196v;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.source.v */
/* loaded from: classes.dex */
public interface InterfaceC7196v {

    /* renamed from: com.google.android.exoplayer2.source.v$a */
    /* loaded from: classes.dex */
    public static class C7197a {

        /* renamed from: a */
        public final int f12956a;
        @Nullable

        /* renamed from: b */
        public final InterfaceC7188p.C7189a f12957b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C7198a> f12958c;

        /* renamed from: d */
        public final long f12959d;

        /* renamed from: com.google.android.exoplayer2.source.v$a$a */
        /* loaded from: classes.dex */
        public static final class C7198a {

            /* renamed from: a */
            public final Handler f12960a;

            /* renamed from: b */
            public final InterfaceC7196v f12961b;

            public C7198a(Handler handler, InterfaceC7196v interfaceC7196v) {
                this.f12960a = handler;
                this.f12961b = interfaceC7196v;
            }
        }

        public C7197a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public C7197a(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            this.f12958c = copyOnWriteArrayList;
            this.f12956a = i;
            this.f12957b = c7189a;
            this.f12959d = 0L;
        }

        /* renamed from: a */
        public final long m5378a(long j) {
            long m6216c = C6622C.m6216c(j);
            if (m6216c == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f12959d + m6216c;
        }

        /* renamed from: b */
        public final void m5377b(final C7184m c7184m) {
            Iterator<C7198a> it = this.f12958c.iterator();
            while (it.hasNext()) {
                C7198a next = it.next();
                final InterfaceC7196v interfaceC7196v = next.f12961b;
                C7408g0.m5082x(next.f12960a, new Runnable() { // from class: com.google.android.exoplayer2.source.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC7196v.C7197a c7197a = InterfaceC7196v.C7197a.this;
                        interfaceC7196v.mo4876l(c7197a.f12956a, c7197a.f12957b, c7184m);
                    }
                });
            }
        }

        /* renamed from: c */
        public final void m5376c(final C7174j c7174j, final C7184m c7184m) {
            Iterator<C7198a> it = this.f12958c.iterator();
            while (it.hasNext()) {
                C7198a next = it.next();
                final InterfaceC7196v interfaceC7196v = next.f12961b;
                C7408g0.m5082x(next.f12960a, new Runnable() { // from class: com.google.android.exoplayer2.source.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC7196v.C7197a c7197a = InterfaceC7196v.C7197a.this;
                        interfaceC7196v.mo4875m(c7197a.f12956a, c7197a.f12957b, c7174j, c7184m);
                    }
                });
            }
        }

        /* renamed from: d */
        public final void m5375d(final C7174j c7174j, final C7184m c7184m) {
            Iterator<C7198a> it = this.f12958c.iterator();
            while (it.hasNext()) {
                C7198a next = it.next();
                final InterfaceC7196v interfaceC7196v = next.f12961b;
                C7408g0.m5082x(next.f12960a, new Runnable() { // from class: com.google.android.exoplayer2.source.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC7196v.C7197a c7197a = InterfaceC7196v.C7197a.this;
                        interfaceC7196v.mo4883H(c7197a.f12956a, c7197a.f12957b, c7174j, c7184m);
                    }
                });
            }
        }

        /* renamed from: e */
        public final void m5374e(final C7174j c7174j, final C7184m c7184m, final IOException iOException, final boolean z) {
            Iterator<C7198a> it = this.f12958c.iterator();
            while (it.hasNext()) {
                C7198a next = it.next();
                final InterfaceC7196v interfaceC7196v = next.f12961b;
                C7408g0.m5082x(next.f12960a, new Runnable() { // from class: com.google.android.exoplayer2.source.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC7196v interfaceC7196v2 = interfaceC7196v;
                        C7174j c7174j2 = c7174j;
                        C7184m c7184m2 = c7184m;
                        IOException iOException2 = iOException;
                        boolean z2 = z;
                        InterfaceC7196v.C7197a c7197a = InterfaceC7196v.C7197a.this;
                        interfaceC7196v2.mo4880O(c7197a.f12956a, c7197a.f12957b, c7174j2, c7184m2, iOException2, z2);
                    }
                });
            }
        }

        /* renamed from: f */
        public final void m5373f(final C7174j c7174j, final C7184m c7184m) {
            Iterator<C7198a> it = this.f12958c.iterator();
            while (it.hasNext()) {
                C7198a next = it.next();
                final InterfaceC7196v interfaceC7196v = next.f12961b;
                C7408g0.m5082x(next.f12960a, new Runnable() { // from class: com.google.android.exoplayer2.source.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC7196v.C7197a c7197a = InterfaceC7196v.C7197a.this;
                        interfaceC7196v.mo4873p(c7197a.f12956a, c7197a.f12957b, c7174j, c7184m);
                    }
                });
            }
        }
    }

    /* renamed from: H */
    void mo4883H(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m);

    /* renamed from: O */
    void mo4880O(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m, IOException iOException, boolean z);

    /* renamed from: l */
    void mo4876l(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7184m c7184m);

    /* renamed from: m */
    void mo4875m(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m);

    /* renamed from: p */
    void mo4873p(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m);
}
