package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzarl implements zzfks {
    private final zzfiv zza;
    private final zzfjm zzb;
    private final zzary zzc;
    private final zzark zzd;
    private final zzaqu zze;
    private final zzasa zzf;
    private final zzars zzg;
    private final zzarj zzh;

    public zzarl(@NonNull zzfiv zzfivVar, @NonNull zzfjm zzfjmVar, @NonNull zzary zzaryVar, @NonNull zzark zzarkVar, @Nullable zzaqu zzaquVar, @Nullable zzasa zzasaVar, @Nullable zzars zzarsVar, @Nullable zzarj zzarjVar) {
        this.zza = zzfivVar;
        this.zzb = zzfjmVar;
        this.zzc = zzaryVar;
        this.zzd = zzarkVar;
        this.zze = zzaquVar;
        this.zzf = zzasaVar;
        this.zzg = zzarsVar;
        this.zzh = zzarjVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzaol zzb = this.zzb.zzb();
        hashMap.put("v", this.zza.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzars zzarsVar = this.zzg;
        if (zzarsVar != null) {
            hashMap.put("tcq", Long.valueOf(zzarsVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfks
    public final Map zza() {
        Map zze = zze();
        zze.put("lts", Long.valueOf(this.zzc.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfks
    public final Map zzb() {
        Map zze = zze();
        zzaol zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze.put("did", zza.zzg());
        zze.put("dst", Integer.valueOf(zza.zzal() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzai()));
        zzaqu zzaquVar = this.zze;
        if (zzaquVar != null) {
            zze.put("nt", Long.valueOf(zzaquVar.zza()));
        }
        zzasa zzasaVar = this.zzf;
        if (zzasaVar != null) {
            zze.put("vs", Long.valueOf(zzasaVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfks
    public final Map zzc() {
        Map zze = zze();
        zzarj zzarjVar = this.zzh;
        if (zzarjVar != null) {
            zze.put("vst", zzarjVar.zza());
        }
        return zze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
