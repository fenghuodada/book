package com.facebook.ads.redexgen.p036X;

import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.30 */
/* loaded from: assets/audience_network.dex */
public final class C409030 extends C4627Bx implements Comparable<C409030> {
    public long A00;

    public C409030() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull C409030 c409030) {
        if (A04() != c409030.A04()) {
            return A04() ? 1 : -1;
        }
        long j = ((C5895X2) this).A00 - ((C5895X2) c409030).A00;
        if (j == 0) {
            j = this.A00 - c409030.A00;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
