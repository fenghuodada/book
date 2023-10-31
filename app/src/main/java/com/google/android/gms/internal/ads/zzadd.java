package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzadd implements zzaar {
    private final long zzb;
    private final zzaar zzc;

    public zzadd(long j, zzaar zzaarVar) {
        this.zzb = j;
        this.zzc = zzaarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void zzC() {
        this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void zzN(zzabn zzabnVar) {
        this.zzc.zzN(new zzadc(this, zzabnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final zzabr zzv(int i, int i2) {
        return this.zzc.zzv(i, i2);
    }
}
