package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zzgew {
    public static final Charset zza = Charset.forName("UTF-8");

    public static final zzgmu zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new zzgev("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return zzgmu.zzb(bArr);
    }
}
