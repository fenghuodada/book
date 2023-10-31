package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzawn extends zzcal {
    final /* synthetic */ zzawt zza;

    public zzawn(zzawt zzawtVar) {
        this.zza = zzawtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcal, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzawt.zze(this.zza);
        return super.cancel(z);
    }
}
