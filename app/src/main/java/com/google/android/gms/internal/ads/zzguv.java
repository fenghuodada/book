package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class zzguv implements zzamu {
    private static final zzgvg zza = zzgvg.zzb(zzguv.class);
    protected final String zzb;
    long zze;
    zzgva zzg;
    private zzamv zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    public zzguv(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzgvg zzgvgVar = zza;
            String str = this.zzb;
            zzgvgVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zzd(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final void zzb(zzgva zzgvaVar, ByteBuffer byteBuffer, long j, zzamr zzamrVar) throws IOException {
        this.zze = zzgvaVar.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzgvaVar;
        zzgvaVar.zze(zzgvaVar.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final void zzc(zzamv zzamvVar) {
        this.zzh = zzamvVar;
    }

    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzgvg zzgvgVar = zza;
        String str = this.zzb;
        zzgvgVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
