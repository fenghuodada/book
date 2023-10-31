package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfrp extends zzfpr {
    private final zzfrr zza;

    public zzfrp(zzfrr zzfrrVar, int i) {
        super(zzfrrVar.size(), i);
        this.zza = zzfrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
