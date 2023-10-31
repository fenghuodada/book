package com.facebook.ads.redexgen.p036X;

import android.text.Layout;
import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.VQ */
/* loaded from: assets/audience_network.dex */
public final class C5798VQ extends C4888GX implements Comparable<C5798VQ> {
    public final int A00;

    public C5798VQ(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.A00 = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull C5798VQ c5798vq) {
        int i = c5798vq.A00;
        int i2 = this.A00;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }
}
