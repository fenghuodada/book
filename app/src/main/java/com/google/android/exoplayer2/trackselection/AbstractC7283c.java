package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.source.C7175j0;
import com.google.android.exoplayer2.util.C7394a;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.trackselection.c */
/* loaded from: classes.dex */
public abstract class AbstractC7283c implements InterfaceC7296g {

    /* renamed from: a */
    public final C7175j0 f13366a;

    /* renamed from: b */
    public final int f13367b;

    /* renamed from: c */
    public final int[] f13368c;

    /* renamed from: d */
    public final C7003m0[] f13369d;

    /* renamed from: e */
    public int f13370e;

    public AbstractC7283c(C7175j0 c7175j0, int[] iArr) {
        boolean z;
        C7003m0[] c7003m0Arr;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        c7175j0.getClass();
        this.f13366a = c7175j0;
        int length = iArr.length;
        this.f13367b = length;
        this.f13369d = new C7003m0[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            c7003m0Arr = c7175j0.f12895b;
            if (i >= length2) {
                break;
            }
            this.f13369d[i] = c7003m0Arr[iArr[i]];
            i++;
        }
        Arrays.sort(this.f13369d, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C7003m0) obj2).f12283h - ((C7003m0) obj).f12283h;
            }
        });
        this.f13368c = new int[this.f13367b];
        int i2 = 0;
        while (true) {
            int i3 = this.f13367b;
            if (i2 < i3) {
                int[] iArr2 = this.f13368c;
                C7003m0 c7003m0 = this.f13369d[i2];
                int i4 = 0;
                while (true) {
                    if (i4 < c7003m0Arr.length) {
                        if (c7003m0 == c7003m0Arr[i4]) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                iArr2[i2] = i4;
                i2++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7296g
    /* renamed from: a */
    public final /* synthetic */ void mo5268a() {
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7302j
    /* renamed from: b */
    public final C7175j0 mo5260b() {
        return this.f13366a;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7296g
    /* renamed from: d */
    public void mo5267d() {
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7296g
    /* renamed from: e */
    public void mo5266e() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC7283c abstractC7283c = (AbstractC7283c) obj;
        return this.f13366a == abstractC7283c.f13366a && Arrays.equals(this.f13368c, abstractC7283c.f13368c);
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7302j
    /* renamed from: f */
    public final C7003m0 mo5259f(int i) {
        return this.f13369d[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7296g
    /* renamed from: g */
    public void mo5265g() {
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7302j
    /* renamed from: h */
    public final int mo5258h(int i) {
        return this.f13368c[i];
    }

    public final int hashCode() {
        if (this.f13370e == 0) {
            this.f13370e = Arrays.hashCode(this.f13368c) + (System.identityHashCode(this.f13366a) * 31);
        }
        return this.f13370e;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7296g
    /* renamed from: i */
    public final C7003m0 mo5264i() {
        mo5261c();
        return this.f13369d[0];
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7296g
    /* renamed from: j */
    public final /* synthetic */ void mo5263j() {
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7296g
    /* renamed from: k */
    public final /* synthetic */ void mo5262k() {
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC7302j
    public final int length() {
        return this.f13368c.length;
    }
}
