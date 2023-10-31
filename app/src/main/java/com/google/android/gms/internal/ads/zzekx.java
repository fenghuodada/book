package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class zzekx implements zzeqq {
    private final zzeqq zza;
    private final zzfaa zzb;
    private final Context zzc;
    private final zzbzc zzd;

    public zzekx(zzemn zzemnVar, zzfaa zzfaaVar, Context context, zzbzc zzbzcVar) {
        this.zza = zzemnVar;
        this.zzb = zzfaaVar;
        this.zzc = context;
        this.zzd = zzbzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zzl(this.zza.zzb(), new zzfon() { // from class: com.google.android.gms.internal.ads.zzekw
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                return zzekx.this.zzc((zzeqv) obj);
            }
        }, zzcag.zzf);
    }

    public final /* synthetic */ zzeky zzc(zzeqv zzeqvVar) {
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        int i3;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                boolean z4 = zzqVar2.zzi;
                if (!z4 && !z2) {
                    str = zzqVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzqVar.zza;
            z = zzqVar.zzi;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.zzd.zzh().zzm();
            i2 = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z5 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = zzqVar3.zze;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (zzqVar3.zzf / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzqVar3.zzb;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (zzqVar3.zzc / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzeky(zzqVar, str, z, sb.toString(), f, i2, i, str2, this.zzb.zzp);
    }
}
