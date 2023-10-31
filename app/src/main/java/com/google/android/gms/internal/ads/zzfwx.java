package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzfwx {
    private final InputStream zza;

    private zzfwx(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzfwx zzb(byte[] bArr) {
        return new zzfwx(new ByteArrayInputStream(bArr));
    }

    public final zzgkh zza() throws IOException {
        try {
            return zzgkh.zzg(this.zza, zzgoi.zza());
        } finally {
            this.zza.close();
        }
    }
}
