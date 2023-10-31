package com.facebook.ads.redexgen.p036X;

import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.HA */
/* loaded from: assets/audience_network.dex */
public final class C4927HA implements Comparable<C4927HA> {
    public final int A00;
    public final C4923H6 A01;

    public C4927HA(int i, C4923H6 c4923h6) {
        this.A00 = i;
        this.A01 = c4923h6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull C4927HA c4927ha) {
        return this.A00 - c4927ha.A00;
    }
}
