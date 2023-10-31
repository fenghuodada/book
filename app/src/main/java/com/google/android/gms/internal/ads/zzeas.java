package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeas extends zzebo {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzl zzb;
    private com.google.android.gms.ads.internal.util.zzbr zzc;
    private zzebc zzd;
    private zzdqc zze;
    private zzfen zzf;
    private String zzg;
    private String zzh;

    @Override // com.google.android.gms.internal.ads.zzebo
    public final zzebo zza(Activity activity) {
        if (activity != null) {
            this.zza = activity;
            return this;
        }
        throw new NullPointerException("Null activity");
    }

    @Override // com.google.android.gms.internal.ads.zzebo
    public final zzebo zzb(@Nullable com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzb = zzlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebo
    public final zzebo zzc(zzdqc zzdqcVar) {
        if (zzdqcVar != null) {
            this.zze = zzdqcVar;
            return this;
        }
        throw new NullPointerException("Null csiReporter");
    }

    @Override // com.google.android.gms.internal.ads.zzebo
    public final zzebo zzd(zzebc zzebcVar) {
        if (zzebcVar != null) {
            this.zzd = zzebcVar;
            return this;
        }
        throw new NullPointerException("Null databaseManager");
    }

    @Override // com.google.android.gms.internal.ads.zzebo
    public final zzebo zze(String str) {
        if (str != null) {
            this.zzg = str;
            return this;
        }
        throw new NullPointerException("Null gwsQueryId");
    }

    @Override // com.google.android.gms.internal.ads.zzebo
    public final zzebo zzf(zzfen zzfenVar) {
        if (zzfenVar != null) {
            this.zzf = zzfenVar;
            return this;
        }
        throw new NullPointerException("Null logger");
    }

    @Override // com.google.android.gms.internal.ads.zzebo
    public final zzebo zzg(String str) {
        if (str != null) {
            this.zzh = str;
            return this;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.google.android.gms.internal.ads.zzebo
    public final zzebo zzh(com.google.android.gms.ads.internal.util.zzbr zzbrVar) {
        if (zzbrVar != null) {
            this.zzc = zzbrVar;
            return this;
        }
        throw new NullPointerException("Null workManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzebo
    public final zzebp zzi() {
        com.google.android.gms.ads.internal.util.zzbr zzbrVar;
        zzebc zzebcVar;
        zzdqc zzdqcVar;
        zzfen zzfenVar;
        String str;
        String str2;
        Activity activity = this.zza;
        if (activity == null || (zzbrVar = this.zzc) == null || (zzebcVar = this.zzd) == null || (zzdqcVar = this.zze) == null || (zzfenVar = this.zzf) == null || (str = this.zzg) == null || (str2 = this.zzh) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.zza == null) {
                sb.append(" activity");
            }
            if (this.zzc == null) {
                sb.append(" workManagerUtil");
            }
            if (this.zzd == null) {
                sb.append(" databaseManager");
            }
            if (this.zze == null) {
                sb.append(" csiReporter");
            }
            if (this.zzf == null) {
                sb.append(" logger");
            }
            if (this.zzg == null) {
                sb.append(" gwsQueryId");
            }
            if (this.zzh == null) {
                sb.append(" uri");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zzeau(activity, this.zzb, zzbrVar, zzebcVar, zzdqcVar, zzfenVar, str, str2, null);
    }
}
