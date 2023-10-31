package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;

/* renamed from: com.google.android.exoplayer2.extractor.t */
/* loaded from: classes.dex */
public interface InterfaceC6905t {

    /* renamed from: com.google.android.exoplayer2.extractor.t$a */
    /* loaded from: classes.dex */
    public static final class C6906a {

        /* renamed from: a */
        public final C6950u f11619a;

        /* renamed from: b */
        public final C6950u f11620b;

        public C6906a() {
            throw null;
        }

        public C6906a(C6950u c6950u, C6950u c6950u2) {
            this.f11619a = c6950u;
            this.f11620b = c6950u2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6906a.class != obj.getClass()) {
                return false;
            }
            C6906a c6906a = (C6906a) obj;
            return this.f11619a.equals(c6906a.f11619a) && this.f11620b.equals(c6906a.f11620b);
        }

        public final int hashCode() {
            return this.f11620b.hashCode() + (this.f11619a.hashCode() * 31);
        }

        public final String toString() {
            String sb;
            C6950u c6950u = this.f11619a;
            String valueOf = String.valueOf(c6950u);
            C6950u c6950u2 = this.f11620b;
            if (c6950u.equals(c6950u2)) {
                sb = "";
            } else {
                String valueOf2 = String.valueOf(c6950u2);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 2);
                sb2.append(", ");
                sb2.append(valueOf2);
                sb = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(C0552c.m12193a(sb, valueOf.length() + 2));
            sb3.append("[");
            sb3.append(valueOf);
            sb3.append(sb);
            sb3.append("]");
            return sb3.toString();
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.t$b */
    /* loaded from: classes.dex */
    public static class C6907b implements InterfaceC6905t {

        /* renamed from: a */
        public final long f11621a;

        /* renamed from: b */
        public final C6906a f11622b;

        public C6907b(long j) {
            this(j, 0L);
        }

        public C6907b(long j, long j2) {
            C6950u c6950u;
            this.f11621a = j;
            if (j2 == 0) {
                c6950u = C6950u.f11974c;
            } else {
                c6950u = new C6950u(0L, j2);
            }
            this.f11622b = new C6906a(c6950u, c6950u);
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: c */
        public final boolean mo5796c() {
            return false;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: h */
        public final C6906a mo5795h(long j) {
            return this.f11622b;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: i */
        public final long mo5794i() {
            return this.f11621a;
        }
    }

    /* renamed from: c */
    boolean mo5796c();

    /* renamed from: h */
    C6906a mo5795h(long j);

    /* renamed from: i */
    long mo5794i();
}
