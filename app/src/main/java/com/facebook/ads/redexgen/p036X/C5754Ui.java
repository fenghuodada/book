package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.Ui */
/* loaded from: assets/audience_network.dex */
public final class C5754Ui implements InterfaceC5010IX {
    public final Handler A00;

    public C5754Ui(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5010IX
    public final Looper A6v() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5010IX
    public final Message A9k(int i, int i2, int i3) {
        return this.A00.obtainMessage(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5010IX
    public final Message A9l(int i, int i2, int i3, Object obj) {
        return this.A00.obtainMessage(i, i2, i3, obj);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5010IX
    public final Message A9m(int i, Object obj) {
        return this.A00.obtainMessage(i, obj);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5010IX
    public final void ADw(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5010IX
    public final boolean AER(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5010IX
    public final boolean AES(int i, long j) {
        return this.A00.sendEmptyMessageAtTime(i, j);
    }
}
