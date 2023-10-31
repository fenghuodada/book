package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeol implements zzeqq {
    private final zzfwc zza;
    private final zzfaa zzb;
    @Nullable
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeol(zzfwc zzfwcVar, zzfaa zzfaaVar, @Nullable PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfwcVar;
        this.zzb = zzfaaVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzeom zzc(final zzeol zzeolVar) {
        final ArrayList arrayList = zzeolVar.zzb.zzg;
        return arrayList == null ? new zzeom() { // from class: com.google.android.gms.internal.ads.zzeoh
            @Override // com.google.android.gms.internal.ads.zzeqp
            public final void zzh(Object obj) {
                Bundle bundle = (Bundle) obj;
            }
        } : arrayList.isEmpty() ? new zzeom() { // from class: com.google.android.gms.internal.ads.zzeoi
            @Override // com.google.android.gms.internal.ads.zzeqp
            public final void zzh(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzeom() { // from class: com.google.android.gms.internal.ads.zzeoj
            @Override // com.google.android.gms.internal.ads.zzeqp
            public final void zzh(Object obj) {
                zzeol.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeol.zzc(zzeol.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
        if (r9 == 3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeol.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
