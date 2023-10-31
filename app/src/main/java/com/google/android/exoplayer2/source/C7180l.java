package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.source.AbstractC7156e;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.upstream.C7367l;
import com.google.android.exoplayer2.upstream.InterfaceC7351c0;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.HashMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.exoplayer2.source.l */
/* loaded from: classes.dex */
public final class C7180l extends AbstractC7156e<Void> {

    /* renamed from: j */
    public final InterfaceC7188p f12908j;

    /* renamed from: k */
    public final boolean f12909k;

    /* renamed from: l */
    public final AbstractC6984j1.C6987c f12910l;

    /* renamed from: m */
    public final AbstractC6984j1.C6986b f12911m;

    /* renamed from: n */
    public C7181a f12912n;
    @Nullable

    /* renamed from: o */
    public C7177k f12913o;

    /* renamed from: p */
    public boolean f12914p;

    /* renamed from: q */
    public boolean f12915q;

    /* renamed from: r */
    public boolean f12916r;

    /* renamed from: com.google.android.exoplayer2.source.l$a */
    /* loaded from: classes.dex */
    public static final class C7181a extends AbstractC7169h {

        /* renamed from: e */
        public static final Object f12917e = new Object();
        @Nullable

        /* renamed from: c */
        public final Object f12918c;
        @Nullable

        /* renamed from: d */
        public final Object f12919d;

        public C7181a(AbstractC6984j1 abstractC6984j1, @Nullable Object obj, @Nullable Object obj2) {
            super(abstractC6984j1);
            this.f12918c = obj;
            this.f12919d = obj2;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC7169h, com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: b */
        public final int mo5414b(Object obj) {
            Object obj2;
            if (f12917e.equals(obj) && (obj2 = this.f12919d) != null) {
                obj = obj2;
            }
            return this.f12872b.mo5414b(obj);
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: f */
        public final AbstractC6984j1.C6986b mo5413f(int i, AbstractC6984j1.C6986b c6986b, boolean z) {
            this.f12872b.mo5413f(i, c6986b, z);
            if (C7408g0.m5105a(c6986b.f12153b, this.f12919d) && z) {
                c6986b.f12153b = f12917e;
            }
            return c6986b;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC7169h, com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: l */
        public final Object mo5411l(int i) {
            Object mo5411l = this.f12872b.mo5411l(i);
            return C7408g0.m5105a(mo5411l, this.f12919d) ? f12917e : mo5411l;
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: n */
        public final AbstractC6984j1.C6987c mo5410n(int i, AbstractC6984j1.C6987c c6987c, long j) {
            this.f12872b.mo5410n(i, c6987c, j);
            if (C7408g0.m5105a(c6987c.f12161a, this.f12918c)) {
                c6987c.f12161a = AbstractC6984j1.C6987c.f12159r;
            }
            return c6987c;
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.exoplayer2.source.l$b */
    /* loaded from: classes.dex */
    public static final class C7182b extends AbstractC6984j1 {

        /* renamed from: b */
        public final C7127q0 f12920b;

        public C7182b(C7127q0 c7127q0) {
            this.f12920b = c7127q0;
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: b */
        public final int mo5414b(Object obj) {
            return obj == C7181a.f12917e ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: f */
        public final AbstractC6984j1.C6986b mo5413f(int i, AbstractC6984j1.C6986b c6986b, boolean z) {
            Integer num;
            Object obj = null;
            if (z) {
                num = 0;
            } else {
                num = null;
            }
            if (z) {
                obj = C7181a.f12917e;
            }
            AdPlaybackState adPlaybackState = AdPlaybackState.f12766g;
            c6986b.getClass();
            AdPlaybackState adPlaybackState2 = AdPlaybackState.f12766g;
            c6986b.f12152a = num;
            c6986b.f12153b = obj;
            c6986b.f12154c = 0;
            c6986b.f12155d = -9223372036854775807L;
            c6986b.f12156e = 0L;
            c6986b.f12158g = adPlaybackState2;
            c6986b.f12157f = true;
            return c6986b;
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: h */
        public final int mo5412h() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: l */
        public final Object mo5411l(int i) {
            return C7181a.f12917e;
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: n */
        public final AbstractC6984j1.C6987c mo5410n(int i, AbstractC6984j1.C6987c c6987c, long j) {
            Object obj = AbstractC6984j1.C6987c.f12159r;
            c6987c.m5679b(this.f12920b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0L);
            c6987c.f12172l = true;
            return c6987c;
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: o */
        public final int mo5409o() {
            return 1;
        }
    }

    public C7180l(InterfaceC7188p interfaceC7188p, boolean z) {
        boolean z2;
        this.f12908j = interfaceC7188p;
        if (z) {
            interfaceC7188p.mo5385i();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f12909k = z2;
        this.f12910l = new AbstractC6984j1.C6987c();
        this.f12911m = new AbstractC6984j1.C6986b();
        interfaceC7188p.mo5383k();
        this.f12912n = new C7181a(new C7182b(interfaceC7188p.mo5389e()), AbstractC6984j1.C6987c.f12159r, C7181a.f12917e);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: e */
    public final C7127q0 mo5389e() {
        return this.f12908j.mo5389e();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: h */
    public final void mo5386h() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: j */
    public final void mo5384j(InterfaceC7185n interfaceC7185n) {
        C7177k c7177k = (C7177k) interfaceC7185n;
        if (c7177k.f12901e != null) {
            InterfaceC7188p interfaceC7188p = c7177k.f12900d;
            interfaceC7188p.getClass();
            interfaceC7188p.mo5384j(c7177k.f12901e);
        }
        if (interfaceC7185n == this.f12913o) {
            this.f12913o = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC7138a
    /* renamed from: q */
    public final void mo5418q(@Nullable InterfaceC7351c0 interfaceC7351c0) {
        this.f12825i = interfaceC7351c0;
        this.f12824h = C7408g0.m5097i(null);
        if (!this.f12909k) {
            this.f12914p = true;
            m5458s(this.f12908j);
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC7138a
    /* renamed from: r */
    public final void mo5417r() {
        this.f12915q = false;
        this.f12914p = false;
        HashMap<T, AbstractC7156e.C7158b<T>> hashMap = this.f12823g;
        for (AbstractC7156e.C7158b c7158b : hashMap.values()) {
            c7158b.f12830a.mo5393a(c7158b.f12831b);
            InterfaceC7188p interfaceC7188p = c7158b.f12830a;
            AbstractC7156e<T>.C7157a c7157a = c7158b.f12832c;
            interfaceC7188p.mo5391c(c7157a);
            interfaceC7188p.mo5387g(c7157a);
        }
        hashMap.clear();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: t */
    public final C7177k mo5380n(InterfaceC7188p.C7189a c7189a, C7367l c7367l, long j) {
        boolean z;
        C7177k c7177k = new C7177k(c7189a, c7367l, j);
        if (c7177k.f12900d == null) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        InterfaceC7188p interfaceC7188p = this.f12908j;
        c7177k.f12900d = interfaceC7188p;
        if (this.f12915q) {
            Object obj = this.f12912n.f12919d;
            Object obj2 = c7189a.f12928a;
            if (obj != null && obj2.equals(C7181a.f12917e)) {
                obj2 = this.f12912n.f12919d;
            }
            InterfaceC7188p.C7189a m5379b = c7189a.m5379b(obj2);
            long m5419d = c7177k.m5419d(j);
            InterfaceC7188p interfaceC7188p2 = c7177k.f12900d;
            interfaceC7188p2.getClass();
            InterfaceC7185n mo5380n = interfaceC7188p2.mo5380n(m5379b, c7367l, m5419d);
            c7177k.f12901e = mo5380n;
            if (c7177k.f12902f != null) {
                mo5380n.mo5401l(c7177k, m5419d);
            }
        } else {
            this.f12913o = c7177k;
            if (!this.f12914p) {
                this.f12914p = true;
                m5458s(interfaceC7188p);
            }
        }
        return c7177k;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: u */
    public final void m5415u(long j) {
        C7177k c7177k = this.f12913o;
        int mo5414b = this.f12912n.mo5414b(c7177k.f12897a.f12928a);
        if (mo5414b == -1) {
            return;
        }
        C7181a c7181a = this.f12912n;
        AbstractC6984j1.C6986b c6986b = this.f12911m;
        c7181a.mo5413f(mo5414b, c6986b, false);
        long j2 = c6986b.f12155d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c7177k.f12903g = j;
    }
}
