package com.google.android.exoplayer2.text.cea;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.C6662w;
import com.google.android.exoplayer2.decoder.AbstractC6749g;
import com.google.android.exoplayer2.decoder.C6748f;
import com.google.android.exoplayer2.text.AbstractC7238h;
import com.google.android.exoplayer2.text.C7237g;
import com.google.android.exoplayer2.text.InterfaceC7222d;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.google.android.exoplayer2.text.cea.d */
/* loaded from: classes.dex */
public abstract class AbstractC7218d implements InterfaceC7222d {

    /* renamed from: a */
    public final ArrayDeque<C7219a> f13090a = new ArrayDeque<>();

    /* renamed from: b */
    public final ArrayDeque<AbstractC7238h> f13091b;

    /* renamed from: c */
    public final PriorityQueue<C7219a> f13092c;
    @Nullable

    /* renamed from: d */
    public C7219a f13093d;

    /* renamed from: e */
    public long f13094e;

    /* renamed from: f */
    public long f13095f;

    /* renamed from: com.google.android.exoplayer2.text.cea.d$a */
    /* loaded from: classes.dex */
    public static final class C7219a extends C7237g implements Comparable<C7219a> {

        /* renamed from: j */
        public long f13096j;

        @Override // java.lang.Comparable
        public final int compareTo(C7219a c7219a) {
            C7219a c7219a2 = c7219a;
            if (m6018f(4) != c7219a2.m6018f(4)) {
                if (m6018f(4)) {
                    return 1;
                }
            } else {
                long j = this.f10906e - c7219a2.f10906e;
                if (j == 0) {
                    j = this.f13096j - c7219a2.f13096j;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
            }
            return -1;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.cea.d$b */
    /* loaded from: classes.dex */
    public static final class C7220b extends AbstractC7238h {

        /* renamed from: e */
        public final AbstractC6749g.InterfaceC6750a<C7220b> f13097e;

        public C7220b(C6662w c6662w) {
            this.f13097e = c6662w;
        }

        @Override // com.google.android.exoplayer2.decoder.AbstractC6749g
        /* renamed from: h */
        public final void mo5345h() {
            this.f13097e.mo6015a(this);
        }
    }

    public AbstractC7218d() {
        for (int i = 0; i < 10; i++) {
            this.f13090a.add(new C7219a());
        }
        this.f13091b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f13091b.add(new C7220b(new C6662w(this)));
        }
        this.f13092c = new PriorityQueue<>();
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7222d
    /* renamed from: a */
    public final void mo5344a(long j) {
        this.f13094e = j;
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC6746d
    @Nullable
    /* renamed from: c */
    public final C7237g mo5351c() throws C6748f {
        C7394a.m5131d(this.f13093d == null);
        ArrayDeque<C7219a> arrayDeque = this.f13090a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C7219a pollFirst = arrayDeque.pollFirst();
        this.f13093d = pollFirst;
        return pollFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC6746d
    /* renamed from: d */
    public final void mo5350d(C7237g c7237g) throws C6748f {
        boolean z;
        if (c7237g == this.f13093d) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5134a(z);
        C7219a c7219a = (C7219a) c7237g;
        if (c7219a.m6017g()) {
            c7219a.mo5603h();
            this.f13090a.add(c7219a);
        } else {
            long j = this.f13095f;
            this.f13095f = 1 + j;
            c7219a.f13096j = j;
            this.f13092c.add(c7219a);
        }
        this.f13093d = null;
    }

    /* renamed from: e */
    public abstract C7221e mo5349e();

    /* renamed from: f */
    public abstract void mo5348f(C7219a c7219a);

    @Override // com.google.android.exoplayer2.decoder.InterfaceC6746d
    public void flush() {
        ArrayDeque<C7219a> arrayDeque;
        this.f13095f = 0L;
        this.f13094e = 0L;
        while (true) {
            PriorityQueue<C7219a> priorityQueue = this.f13092c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f13090a;
            if (isEmpty) {
                break;
            }
            C7219a poll = priorityQueue.poll();
            int i = C7408g0.f13905a;
            poll.mo5603h();
            arrayDeque.add(poll);
        }
        C7219a c7219a = this.f13093d;
        if (c7219a != null) {
            c7219a.mo5603h();
            arrayDeque.add(c7219a);
            this.f13093d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        return null;
     */
    @Override // com.google.android.exoplayer2.decoder.InterfaceC6746d
    @androidx.annotation.Nullable
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.text.AbstractC7238h mo5352b() throws com.google.android.exoplayer2.text.C7234e {
        /*
            r12 = this;
            java.util.ArrayDeque<com.google.android.exoplayer2.text.h> r0 = r12.f13091b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue<com.google.android.exoplayer2.text.cea.d$a> r1 = r12.f13092c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L69
            java.lang.Object r3 = r1.peek()
            com.google.android.exoplayer2.text.cea.d$a r3 = (com.google.android.exoplayer2.text.cea.AbstractC7218d.C7219a) r3
            int r4 = com.google.android.exoplayer2.util.C7408g0.f13905a
            long r3 = r3.f10906e
            long r5 = r12.f13094e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L69
            java.lang.Object r1 = r1.poll()
            com.google.android.exoplayer2.text.cea.d$a r1 = (com.google.android.exoplayer2.text.cea.AbstractC7218d.C7219a) r1
            r3 = 4
            boolean r4 = r1.m6018f(r3)
            java.util.ArrayDeque<com.google.android.exoplayer2.text.cea.d$a> r5 = r12.f13090a
            if (r4 == 0) goto L43
            java.lang.Object r0 = r0.pollFirst()
            com.google.android.exoplayer2.text.h r0 = (com.google.android.exoplayer2.text.AbstractC7238h) r0
            int r2 = r0.f10915a
            r2 = r2 | r3
            r0.f10915a = r2
        L3c:
            r1.mo5603h()
            r5.add(r1)
            return r0
        L43:
            r12.mo5348f(r1)
            boolean r3 = r12.mo5346h()
            if (r3 == 0) goto L62
            com.google.android.exoplayer2.text.cea.e r9 = r12.mo5349e()
            java.lang.Object r0 = r0.pollFirst()
            com.google.android.exoplayer2.text.h r0 = (com.google.android.exoplayer2.text.AbstractC7238h) r0
            long r7 = r1.f10906e
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r0
            r6.m5337i(r7, r9, r10)
            goto L3c
        L62:
            r1.mo5603h()
            r5.add(r1)
            goto La
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.AbstractC7218d.mo5352b():com.google.android.exoplayer2.text.h");
    }

    /* renamed from: h */
    public abstract boolean mo5346h();

    @Override // com.google.android.exoplayer2.decoder.InterfaceC6746d
    public void release() {
    }
}
