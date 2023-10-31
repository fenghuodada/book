package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.aY */
/* loaded from: assets/audience_network.dex */
public final class C6113aY extends C43216m {
    public final Context A00;
    public final ApplicationInfo A01;
    public final C42856C A02;
    public final C43507F A03;

    public C6113aY(Context context, C42856C c42856c) {
        super(context, c42856c);
        this.A01 = context.getApplicationInfo();
        this.A00 = context;
        this.A02 = c42856c;
        this.A03 = C43507F.A00(this.A00, this.A02.A0a(), this.A02.A0g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC43457A A05(HashMap<Integer, C6114aZ> hashMap) {
        return new C5962Y7(SystemClock.elapsedRealtime(), A02(), hashMap, EnumC434479.A06);
    }

    public final InterfaceC43306v A0G() {
        return new C6124aj(this);
    }

    public final InterfaceC43306v A0H() {
        return new C6126al(this);
    }

    public final InterfaceC43306v A0I() {
        return new C6127am(this);
    }

    public final InterfaceC43306v A0J() {
        return new C6131aq(this);
    }

    public final InterfaceC43306v A0K() {
        return new C6119ae(this);
    }

    public final InterfaceC43306v A0L() {
        return new C6116ab(this);
    }

    public final InterfaceC43306v A0M() {
        return new C6123ai(this);
    }

    public final InterfaceC43306v A0N() {
        return new C6122ah(this);
    }

    public final InterfaceC43306v A0O() {
        return new C6118ad(this);
    }

    public final InterfaceC43306v A0P() {
        return new C6115aa(this);
    }

    public final InterfaceC43306v A0Q() {
        return new C6117ac(this);
    }

    public final InterfaceC43306v A0R() {
        return new C6120af(this);
    }

    public final InterfaceC43306v A0S() {
        return new C6121ag(this);
    }

    public final InterfaceC43306v A0T() {
        return new C6133as(this);
    }

    public final InterfaceC43306v A0U() {
        return new C6132ar(this);
    }

    public final InterfaceC43306v A0V() {
        return new C6130ap(this);
    }

    public final InterfaceC43306v A0W() {
        return new C6129ao(this);
    }

    public final InterfaceC43306v A0X() {
        return new C6128an(this);
    }

    public final InterfaceC43306v A0Y() {
        return new C6125ak(this);
    }
}
