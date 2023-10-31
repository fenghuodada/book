package com.facebook.ads.redexgen.p036X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.AT */
/* loaded from: assets/audience_network.dex */
public final class C4536AT implements Comparable<C4536AT> {
    public int A00;
    public long A01;
    @Nullable
    public Object A02;
    public final C4560As A03;

    public C4536AT(C4560As c4560As) {
        this.A03 = c4560As;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull C4536AT c4536at) {
        if ((this.A02 == null) != (c4536at.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        } else if (this.A02 == null) {
            return 0;
        } else {
            int i = this.A00 - c4536at.A00;
            if (i != 0) {
                return i;
            }
            return C5038Iz.A07(this.A01, c4536at.A01);
        }
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
