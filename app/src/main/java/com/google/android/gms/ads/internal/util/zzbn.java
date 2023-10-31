package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzale;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzamf;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzcal;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbn extends zzali {
    private final zzcal zza;
    private final zzbzs zzb;

    public zzbn(String str, Map map, zzcal zzcalVar) {
        super(0, str, new zzbm(zzcalVar));
        this.zza = zzcalVar;
        zzbzs zzbzsVar = new zzbzs(null);
        this.zzb = zzbzsVar;
        zzbzsVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final zzalo zzh(zzale zzaleVar) {
        return zzalo.zzb(zzaleVar, zzamf.zzb(zzaleVar));
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzale zzaleVar = (zzale) obj;
        this.zzb.zzf(zzaleVar.zzc, zzaleVar.zza);
        zzbzs zzbzsVar = this.zzb;
        byte[] bArr = zzaleVar.zzb;
        if (zzbzs.zzk() && bArr != null) {
            zzbzsVar.zzh(bArr);
        }
        this.zza.zzd(zzaleVar);
    }
}
