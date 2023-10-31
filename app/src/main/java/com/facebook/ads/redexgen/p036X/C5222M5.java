package com.facebook.ads.redexgen.p036X;

import android.os.Parcel;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.M5 */
/* loaded from: assets/audience_network.dex */
public final class C5222M5 {
    @Nullable
    public static Serializable A00(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Serializable result = obtain.readSerializable();
        obtain.recycle();
        return result;
    }

    @Nullable
    public static byte[] A01(@Nullable Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.writeSerializable(serializable);
        byte[] result = obtain.marshall();
        obtain.recycle();
        return result;
    }
}
