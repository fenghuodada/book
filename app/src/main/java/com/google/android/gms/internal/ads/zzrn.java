package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class zzrn extends zzhg {
    @Nullable
    public final zzrp zza;
    @Nullable
    public final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrn(Throwable th, @Nullable zzrp zzrpVar) {
        super("Decoder failed: ".concat(String.valueOf(zzrpVar == null ? null : zzrpVar.zza)), th);
        String str = null;
        this.zza = zzrpVar;
        if (zzfn.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}
