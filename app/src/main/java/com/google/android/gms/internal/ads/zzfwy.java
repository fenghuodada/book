package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class zzfwy {
    private final OutputStream zza;

    private zzfwy(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzfwy zzb(OutputStream outputStream) {
        return new zzfwy(outputStream);
    }

    public final void zza(zzgkh zzgkhVar) throws IOException {
        try {
            zzgkhVar.zzaw(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
