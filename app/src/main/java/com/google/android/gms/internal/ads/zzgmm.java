package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgmm extends ThreadLocal {
    final /* synthetic */ zzgmn zza;

    public zzgmm(zzgmn zzgmnVar) {
        this.zza = zzgmnVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgma zzgmaVar = zzgma.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzgmaVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
