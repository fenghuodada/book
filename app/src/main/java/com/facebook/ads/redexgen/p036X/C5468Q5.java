package com.facebook.ads.redexgen.p036X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Q5 */
/* loaded from: assets/audience_network.dex */
public final class C5468Q5 extends ContentObserver {
    public final C5358OI A00;

    public C5468Q5(Handler handler, C5358OI c5358oi) {
        super(handler);
        this.A00 = c5358oi;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0Z();
    }
}
