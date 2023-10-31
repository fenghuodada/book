package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8U */
/* loaded from: assets/audience_network.dex */
public class C44148U extends ContextWrapper {
    public final InterfaceC44168W A00;
    public final AtomicReference<String> A01;

    public C44148U(Context context, InterfaceC44168W interfaceC44168W) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = interfaceC44168W;
    }

    public final C5952Xx A00() {
        return this.A00.A7M(this);
    }

    public final InterfaceC44158V A01() {
        return this.A00.A5q(this);
    }

    public final InterfaceC44178X A02() {
        return this.A00.A6V(this);
    }

    public final InterfaceC44198Z A03() {
        return this.A00.A7L(this);
    }

    public final InterfaceC44208a A04() {
        return this.A00.A7d();
    }

    public final InterfaceC44318l A05() {
        return this.A00.A6L(this);
    }

    public final InterfaceC44448y A06() {
        return this.A00.A6M(this);
    }

    public final C44709P A07() {
        return this.A00.A7T();
    }

    public final InterfaceC5080Jh A08() {
        return this.A00.A5c(A00());
    }

    public final InterfaceC5092Jt A09() {
        return this.A00.A7N(A00());
    }

    @Nullable
    public final String A0A() {
        return this.A01.get();
    }

    public final void A0B(@Nullable String str) {
        this.A01.set(str);
    }
}
