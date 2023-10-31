package com.facebook.ads.redexgen.p036X;

import android.bluetooth.BluetoothAdapter;

/* renamed from: com.facebook.ads.redexgen.X.aB */
/* loaded from: assets/audience_network.dex */
public class C6090aB implements InterfaceC43306v {
    public final /* synthetic */ C6087a8 A00;

    public C6090aB(C6087a8 c6087a8) {
        this.A00 = c6087a8;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        BluetoothAdapter bluetoothAdapter;
        BluetoothAdapter bluetoothAdapter2;
        bluetoothAdapter = this.A00.A00;
        if (bluetoothAdapter != null) {
            C6087a8 c6087a8 = this.A00;
            bluetoothAdapter2 = c6087a8.A00;
            return c6087a8.A08(bluetoothAdapter2.getName());
        }
        return this.A00.A07(EnumC434176.A06);
    }
}
