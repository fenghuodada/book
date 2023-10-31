package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;

@TargetApi(17)
/* renamed from: com.facebook.ads.redexgen.X.JB */
/* loaded from: assets/audience_network.dex */
public final class C5048JB implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C5050JD A01;

    public C5048JB(C5050JD c5050jd, DisplayManager displayManager) {
        this.A01 = c5050jd;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
