package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfzf extends zzgdg {
    final /* synthetic */ zzfzg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzf(zzfzg zzfzgVar, Class cls) {
        super(cls);
        this.zza = zzfzgVar;
    }

    public static final zzghx zzf(zzgia zzgiaVar) throws GeneralSecurityException {
        zzghw zzc = zzghx.zzc();
        zzc.zzb(zzgiaVar.zzg());
        byte[] zza = zzgmq.zza(zzgiaVar.zza());
        zzc.zza(zzgno.zzv(zza, 0, zza.length));
        zzc.zzc(0);
        return (zzghx) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ zzgqg zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        return zzf((zzgia) zzgqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ zzgqg zzb(zzgno zzgnoVar) throws zzgpi {
        return zzgia.zzf(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    /* renamed from: zze */
    public final void zzd(zzgia zzgiaVar) throws GeneralSecurityException {
        zzgms.zza(zzgiaVar.zza());
        zzfzg zzfzgVar = this.zza;
        zzfzg.zzm(zzgiaVar.zzg());
    }
}
