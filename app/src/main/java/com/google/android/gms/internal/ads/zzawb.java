package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzawb implements Runnable {
    final /* synthetic */ zzawf zza;

    public zzawb(zzawf zzawfVar) {
        this.zza = zzawfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzawf.zzh(this.zza);
    }
}
