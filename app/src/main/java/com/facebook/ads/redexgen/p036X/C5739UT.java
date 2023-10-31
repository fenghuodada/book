package com.facebook.ads.redexgen.p036X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.UT */
/* loaded from: assets/audience_network.dex */
public class C5739UT implements InterfaceC5465Q2 {
    public static String[] A01 = {"T9VzL8fHxpfySiwwlXedeY7mX", "guyVlBlOMcVDAIfN1wPFopCO0r0Zk0gq", "ttKJ4peW2WPtu1OROjgTykJGR", "A5J8ePX4fIk14ZpUSfaCkLGHXqqMAYt6", "kQp8myZeu", "7L0NbJj9RoUIRUZ", "UhNplE17b8XX", "zMftdbZDucx4tcPG97oOAYZ8vQU5TBbw"};
    public final /* synthetic */ C5733UN A00;

    public C5739UT(C5733UN c5733un) {
        this.A00 = c5733un;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5465Q2
    public final void ACk() {
        AtomicBoolean atomicBoolean;
        InterfaceC5097Jy interfaceC5097Jy;
        InterfaceC5097Jy interfaceC5097Jy2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        interfaceC5097Jy = this.A00.A02;
        if (interfaceC5097Jy != null) {
            interfaceC5097Jy2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            boolean z = atomicBoolean2.get();
            if (A01[1].charAt(3) == 'h') {
                throw new RuntimeException();
            }
            A01[3] = "0cRb1Hjpfivo5OpVdykyl3dtou8RqpBl";
            interfaceC5097Jy2.ABk(z);
        }
    }
}
