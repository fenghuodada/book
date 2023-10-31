package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzacf implements zzaca {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzacf(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzacf zzb(zzfd zzfdVar) {
        int zzg = zzfdVar.zzg();
        zzfdVar.zzG(8);
        int zzg2 = zzfdVar.zzg();
        int zzg3 = zzfdVar.zzg();
        zzfdVar.zzG(4);
        int zzg4 = zzfdVar.zzg();
        zzfdVar.zzG(12);
        return new zzacf(zzg, zzg2, zzg3, zzg4);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final int zza() {
        return 1751742049;
    }
}
