package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgpy implements zzgra {
    private static final zzgqe zza = new zzgpw();
    private final zzgqe zzb;

    public zzgpy() {
        zzgqe zzgqeVar;
        zzgqe[] zzgqeVarArr = new zzgqe[2];
        zzgqeVarArr[0] = zzgor.zza();
        try {
            zzgqeVar = (zzgqe) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzgqeVar = zza;
        }
        zzgqeVarArr[1] = zzgqeVar;
        zzgpx zzgpxVar = new zzgpx(zzgqeVarArr);
        byte[] bArr = zzgpg.zzd;
        this.zzb = zzgpxVar;
    }

    private static boolean zzb(zzgqd zzgqdVar) {
        return zzgqdVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgra
    public final zzgqz zza(Class cls) {
        zzgql zza2;
        zzgpu zzd;
        zzgrq zzy;
        zzgoj zza3;
        zzgqb zza4;
        zzgrq zzy2;
        zzgoj zza5;
        zzgrb.zzD(cls);
        zzgqd zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzgow.class.isAssignableFrom(cls)) {
                zzy2 = zzgrb.zzz();
                zza5 = zzgol.zzb();
            } else {
                zzy2 = zzgrb.zzy();
                zza5 = zzgol.zza();
            }
            return zzgqk.zzc(zzy2, zza5, zzb.zza());
        }
        if (zzgow.class.isAssignableFrom(cls)) {
            boolean zzb2 = zzb(zzb);
            zza2 = zzgqm.zzb();
            zzd = zzgpu.zze();
            zzy = zzgrb.zzz();
            zza3 = zzb2 ? zzgol.zzb() : null;
            zza4 = zzgqc.zzb();
        } else {
            boolean zzb3 = zzb(zzb);
            zza2 = zzgqm.zza();
            zzd = zzgpu.zzd();
            zzy = zzgrb.zzy();
            zza3 = zzb3 ? zzgol.zza() : null;
            zza4 = zzgqc.zza();
        }
        return zzgqj.zzl(cls, zzb, zza2, zzd, zzy, zza3, zza4);
    }
}
