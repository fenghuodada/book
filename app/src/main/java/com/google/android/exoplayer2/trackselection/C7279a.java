package com.google.android.exoplayer2.trackselection;

import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.C7175j0;
import com.google.android.exoplayer2.trackselection.InterfaceC7296g;
import com.google.android.exoplayer2.upstream.InterfaceC7352d;
import com.google.common.collect.AbstractC8013s;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.trackselection.a */
/* loaded from: classes.dex */
public final class C7279a extends AbstractC7283c {

    /* renamed from: com.google.android.exoplayer2.trackselection.a$a */
    /* loaded from: classes.dex */
    public static final class C7280a {

        /* renamed from: a */
        public final long f13364a;

        /* renamed from: b */
        public final long f13365b;

        public C7280a(long j, long j2) {
            this.f13364a = j;
            this.f13365b = j2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7280a) {
                C7280a c7280a = (C7280a) obj;
                return this.f13364a == c7280a.f13364a && this.f13365b == c7280a.f13365b;
            }
            return false;
        }

        public final int hashCode() {
            return (((int) this.f13364a) * 31) + ((int) this.f13365b);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.a$b */
    /* loaded from: classes.dex */
    public static class C7281b implements InterfaceC7296g.InterfaceC7298b {
    }

    public C7279a(C7175j0 c7175j0, int[] iArr, int i, InterfaceC7352d interfaceC7352d, long j, long j2, AbstractC8013s abstractC8013s) {
        super(c7175j0, iArr);
        if (j2 < j) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        AbstractC8013s.m4246p(abstractC8013s);
    }

    /* renamed from: l */
    public static void m5279l(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            AbstractC8013s.C8014a c8014a = (AbstractC8013s.C8014a) arrayList.get(i);
            if (c8014a != null) {
                c8014a.m4242b(new C7280a(j, jArr[i]));
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7296g
    /* renamed from: c */
    public final void mo5261c() {
    }

    @Override // com.google.android.exoplayer2.trackselection.AbstractC7283c, com.google.android.exoplayer2.trackselection.InterfaceC7296g
    /* renamed from: d */
    public final void mo5267d() {
    }

    @Override // com.google.android.exoplayer2.trackselection.AbstractC7283c, com.google.android.exoplayer2.trackselection.InterfaceC7296g
    @CallSuper
    /* renamed from: e */
    public final void mo5266e() {
    }

    @Override // com.google.android.exoplayer2.trackselection.AbstractC7283c, com.google.android.exoplayer2.trackselection.InterfaceC7296g
    @CallSuper
    /* renamed from: g */
    public final void mo5265g() {
    }
}
