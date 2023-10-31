package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class zzguw extends zzguz implements zzamu {
    zzamv zza;
    protected final String zzb = "moov";

    public zzguw(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final void zzb(zzgva zzgvaVar, ByteBuffer byteBuffer, long j, zzamr zzamrVar) throws IOException {
        zzgvaVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzgvaVar;
        this.zzf = zzgvaVar.zzb();
        zzgvaVar.zze(zzgvaVar.zzb() + j);
        this.zzg = zzgvaVar.zzb();
        this.zzc = zzamrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final void zzc(zzamv zzamvVar) {
        this.zza = zzamvVar;
    }
}
