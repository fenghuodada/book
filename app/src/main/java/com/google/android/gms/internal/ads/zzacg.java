package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzacg implements zzaca {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzacg(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
    }

    public static zzacg zzb(zzfd zzfdVar) {
        int zzg = zzfdVar.zzg();
        zzfdVar.zzG(12);
        int zzg2 = zzfdVar.zzg();
        int zzg3 = zzfdVar.zzg();
        int zzg4 = zzfdVar.zzg();
        zzfdVar.zzG(4);
        int zzg5 = zzfdVar.zzg();
        int zzg6 = zzfdVar.zzg();
        zzfdVar.zzG(8);
        return new zzacg(zzg, zzg2, zzg3, zzg4, zzg5, zzg6);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final int zza() {
        return 1752331379;
    }
}
