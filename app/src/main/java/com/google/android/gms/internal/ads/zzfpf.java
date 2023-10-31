package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
final class zzfpf extends zzfpk {
    final /* synthetic */ zzfpg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpf(zzfpg zzfpgVar, zzfpm zzfpmVar, CharSequence charSequence) {
        super(zzfpmVar, charSequence);
        this.zza = zzfpgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpk
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfpk
    public final int zzd(int i) {
        zzfok zzfokVar = this.zza.zza;
        CharSequence charSequence = ((zzfpk) this).zzb;
        int length = charSequence.length();
        zzfoz.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (zzfokVar.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
