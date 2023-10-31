package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.analytics.C6651l;
import com.google.android.exoplayer2.util.InterfaceC7403e;

/* renamed from: com.google.android.exoplayer2.source.i0 */
/* loaded from: classes.dex */
public final class C7173i0<V> {

    /* renamed from: c */
    public final InterfaceC7403e<V> f12892c;

    /* renamed from: b */
    public final SparseArray<V> f12891b = new SparseArray<>();

    /* renamed from: a */
    public int f12890a = -1;

    public C7173i0(C6651l c6651l) {
        this.f12892c = c6651l;
    }

    /* renamed from: a */
    public final V m5421a(int i) {
        SparseArray<V> sparseArray;
        if (this.f12890a == -1) {
            this.f12890a = 0;
        }
        while (true) {
            int i2 = this.f12890a;
            sparseArray = this.f12891b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f12890a--;
        }
        while (this.f12890a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f12890a + 1)) {
            this.f12890a++;
        }
        return sparseArray.valueAt(this.f12890a);
    }
}
