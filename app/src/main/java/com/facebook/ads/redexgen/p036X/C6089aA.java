package com.facebook.ads.redexgen.p036X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.aA */
/* loaded from: assets/audience_network.dex */
public class C6089aA implements InterfaceC43306v {
    public final /* synthetic */ C6087a8 A00;

    public C6089aA(C6087a8 c6087a8) {
        this.A00 = c6087a8;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() throws Exception {
        BluetoothAdapter bluetoothAdapter;
        BluetoothAdapter bluetoothAdapter2;
        bluetoothAdapter = this.A00.A00;
        if (bluetoothAdapter != null) {
            bluetoothAdapter2 = this.A00.A00;
            ArrayList arrayList = new ArrayList();
            for (BluetoothDevice bluetoothDevice : bluetoothAdapter2.getBondedDevices()) {
                arrayList.add(new C6088a9(bluetoothDevice));
            }
            return this.A00.A0D(arrayList);
        }
        return this.A00.A07(EnumC434176.A06);
    }
}
