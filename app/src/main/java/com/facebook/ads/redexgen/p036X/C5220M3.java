package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.M3 */
/* loaded from: assets/audience_network.dex */
public final class C5220M3 implements Closeable {
    @Nullable
    public C5219M2 A00;
    public boolean A01;
    public final C5218M1 A02;
    public final Runnable A03;

    public C5220M3(long j, Runnable runnable) {
        this.A02 = new C5218M1(j);
        this.A02.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new C5219M2(this);
        }
    }

    public final C5218M1 A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new C5219M2(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C5219M2 c5219m2;
        synchronized (this) {
            this.A01 = true;
            c5219m2 = this.A00;
        }
        if (c5219m2 != null) {
            c5219m2.close();
        }
    }
}
