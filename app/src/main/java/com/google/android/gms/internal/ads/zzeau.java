package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.adcolony.sdk.C2362x3;

/* loaded from: classes.dex */
final class zzeau extends zzebp {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzl zzb;
    private final com.google.android.gms.ads.internal.util.zzbr zzc;
    private final zzebc zzd;
    private final zzdqc zze;
    private final zzfen zzf;
    private final String zzg;
    private final String zzh;

    public /* synthetic */ zzeau(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzebc zzebcVar, zzdqc zzdqcVar, zzfen zzfenVar, String str, String str2, zzeat zzeatVar) {
        this.zza = activity;
        this.zzb = zzlVar;
        this.zzc = zzbrVar;
        this.zzd = zzebcVar;
        this.zze = zzdqcVar;
        this.zzf = zzfenVar;
        this.zzg = str;
        this.zzh = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzebp) {
            zzebp zzebpVar = (zzebp) obj;
            if (this.zza.equals(zzebpVar.zza()) && ((zzlVar = this.zzb) != null ? zzlVar.equals(zzebpVar.zzb()) : zzebpVar.zzb() == null) && this.zzc.equals(zzebpVar.zzc()) && this.zzd.equals(zzebpVar.zze()) && this.zze.equals(zzebpVar.zzd()) && this.zzf.equals(zzebpVar.zzf()) && this.zzg.equals(zzebpVar.zzg()) && this.zzh.equals(zzebpVar.zzh())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzb;
        return (((((((((((((hashCode * 1000003) ^ (zzlVar == null ? 0 : zzlVar.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        String obj2 = this.zzc.toString();
        String obj3 = this.zzd.toString();
        String obj4 = this.zze.toString();
        String obj5 = this.zzf.toString();
        String str = this.zzg;
        String str2 = this.zzh;
        StringBuilder m9460b = C2362x3.m9460b("OfflineUtilsParamsBuilder{activity=", obj, ", adOverlay=", valueOf, ", workManagerUtil=");
        m9460b.append(obj2);
        m9460b.append(", databaseManager=");
        m9460b.append(obj3);
        m9460b.append(", csiReporter=");
        m9460b.append(obj4);
        m9460b.append(", logger=");
        m9460b.append(obj5);
        m9460b.append(", gwsQueryId=");
        m9460b.append(str);
        m9460b.append(", uri=");
        m9460b.append(str2);
        m9460b.append("}");
        return m9460b.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    @Nullable
    public final com.google.android.gms.ads.internal.overlay.zzl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final com.google.android.gms.ads.internal.util.zzbr zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final zzdqc zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final zzebc zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final zzfen zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final String zzg() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final String zzh() {
        return this.zzh;
    }
}
