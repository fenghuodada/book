package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public final class zzahk implements zzaao {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzahj
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzahk()};
        }
    };
    private zzaar zzb;
    private zzahs zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zze(zzaap zzaapVar) throws IOException {
        zzahs zzahoVar;
        zzahm zzahmVar = new zzahm();
        if (zzahmVar.zzb(zzaapVar, true) && (zzahmVar.zza & 2) == 2) {
            int min = Math.min(zzahmVar.zze, 8);
            zzfd zzfdVar = new zzfd(min);
            ((zzaae) zzaapVar).zzm(zzfdVar.zzH(), 0, min, false);
            zzfdVar.zzF(0);
            if (zzfdVar.zza() >= 5 && zzfdVar.zzk() == 127 && zzfdVar.zzs() == 1179402563) {
                zzahoVar = new zzahi();
            } else {
                zzfdVar.zzF(0);
                try {
                    if (zzabx.zzd(1, zzfdVar, true)) {
                        zzahoVar = new zzahu();
                    }
                } catch (zzce unused) {
                }
                zzfdVar.zzF(0);
                if (zzaho.zzd(zzfdVar)) {
                    zzahoVar = new zzaho();
                }
            }
            this.zzc = zzahoVar;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final int zza(zzaap zzaapVar, zzabk zzabkVar) throws IOException {
        zzdy.zzb(this.zzb);
        if (this.zzc == null) {
            if (!zze(zzaapVar)) {
                throw zzce.zza("Failed to determine bitstream type", null);
            }
            zzaapVar.zzj();
        }
        if (!this.zzd) {
            zzabr zzv = this.zzb.zzv(0, 1);
            this.zzb.zzC();
            this.zzc.zzh(this.zzb, zzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzaapVar, zzabkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        zzahs zzahsVar = this.zzc;
        if (zzahsVar != null) {
            zzahsVar.zzj(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        try {
            return zze(zzaapVar);
        } catch (zzce unused) {
            return false;
        }
    }
}
