package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Vd */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5811Vd implements InterfaceC4831Fa {
    public InterfaceC5910XH A00;
    public AbstractC4569B1 A01;
    public Object A02;
    public final ArrayList<InterfaceC4830FZ> A04 = new ArrayList<>(1);
    public final C4842Fl A03 = new C4842Fl();

    public abstract void A02();

    public abstract void A03(InterfaceC5910XH interfaceC5910XH, boolean z);

    public final C4842Fl A00(@Nullable C4829FY c4829fy) {
        return this.A03.A02(0, c4829fy, 0L);
    }

    public final void A01(AbstractC4569B1 abstractC4569B1, @Nullable Object obj) {
        this.A01 = abstractC4569B1;
        this.A02 = obj;
        Iterator<InterfaceC4830FZ> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ACM(this, abstractC4569B1, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4831Fa
    public final void A3C(Handler handler, InterfaceC4845Fo interfaceC4845Fo) {
        this.A03.A07(handler, interfaceC4845Fo);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4831Fa
    public final void ADJ(InterfaceC5910XH interfaceC5910XH, boolean z, InterfaceC4830FZ interfaceC4830FZ) {
        InterfaceC5910XH interfaceC5910XH2 = this.A00;
        C4997IK.A03(interfaceC5910XH2 == null || interfaceC5910XH2 == interfaceC5910XH);
        this.A04.add(interfaceC4830FZ);
        if (this.A00 == null) {
            this.A00 = interfaceC5910XH;
            A03(interfaceC5910XH, z);
            return;
        }
        AbstractC4569B1 abstractC4569B1 = this.A01;
        if (abstractC4569B1 == null) {
            return;
        }
        interfaceC4830FZ.ACM(this, abstractC4569B1, this.A02);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4831Fa
    public final void ADt(InterfaceC4830FZ interfaceC4830FZ) {
        this.A04.remove(interfaceC4830FZ);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4831Fa
    public final void ADv(InterfaceC4845Fo interfaceC4845Fo) {
        this.A03.A0D(interfaceC4845Fo);
    }
}
