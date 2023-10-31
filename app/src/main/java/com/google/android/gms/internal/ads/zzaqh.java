package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaqh implements zzfko {
    final /* synthetic */ zzfio zza;

    public zzaqh(zzaqj zzaqjVar, zzfio zzfioVar) {
        this.zza = zzfioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
