package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfph extends zzfpk {
    final /* synthetic */ zzfpi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfph(zzfpi zzfpiVar, zzfpm zzfpmVar, CharSequence charSequence) {
        super(zzfpmVar, charSequence);
        this.zza = zzfpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpk
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfpk
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < ((zzfpk) this).zzb.length()) {
            return i2;
        }
        return -1;
    }
}
