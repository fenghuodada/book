package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzbq {
    public final String zzc;
    @Nullable
    public final zzbi zzd;
    @Nullable
    @Deprecated
    public final zzbk zze;
    public final zzbg zzf;
    public final zzbw zzg;
    public final zzax zzh;
    @Deprecated
    public final zzaz zzi;
    public final zzbn zzj;
    public static final zzbq zza = new zzat().zzc();
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzar
    };

    public /* synthetic */ zzbq(String str, zzaz zzazVar, zzbk zzbkVar, zzbg zzbgVar, zzbw zzbwVar, zzbn zzbnVar, zzbp zzbpVar) {
        this.zzc = str;
        this.zzd = zzbkVar;
        this.zze = zzbkVar;
        this.zzf = zzbgVar;
        this.zzg = zzbwVar;
        this.zzh = zzazVar;
        this.zzi = zzazVar;
        this.zzj = zzbnVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbq) {
            zzbq zzbqVar = (zzbq) obj;
            return zzfn.zzB(this.zzc, zzbqVar.zzc) && this.zzh.equals(zzbqVar.zzh) && zzfn.zzB(this.zzd, zzbqVar.zzd) && zzfn.zzB(this.zzf, zzbqVar.zzf) && zzfn.zzB(this.zzg, zzbqVar.zzg) && zzfn.zzB(this.zzj, zzbqVar.zzj);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() * 31;
        zzbi zzbiVar = this.zzd;
        int hashCode2 = zzbiVar != null ? zzbiVar.hashCode() : 0;
        int hashCode3 = this.zzf.hashCode();
        return (this.zzg.hashCode() + ((this.zzh.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31;
    }
}
