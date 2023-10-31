package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgkh extends zzgow implements zzgqh {
    private static final zzgkh zzb;
    private int zzd;
    private zzgpf zze = zzgow.zzaN();

    static {
        zzgkh zzgkhVar = new zzgkh();
        zzb = zzgkhVar;
        zzgow.zzaU(zzgkh.class, zzgkhVar);
    }

    private zzgkh() {
    }

    public static zzgke zzd() {
        return (zzgke) zzb.zzaA();
    }

    public static zzgkh zzg(InputStream inputStream, zzgoi zzgoiVar) throws IOException {
        return (zzgkh) zzgow.zzaH(zzb, inputStream, zzgoiVar);
    }

    public static /* synthetic */ void zzj(zzgkh zzgkhVar, zzgkg zzgkgVar) {
        zzgkgVar.getClass();
        zzgpf zzgpfVar = zzgkhVar.zze;
        if (!zzgpfVar.zzc()) {
            zzgkhVar.zze = zzgow.zzaO(zzgpfVar);
        }
        zzgkhVar.zze.add(zzgkgVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgke(null);
                }
                return new zzgkh();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgkg.class});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzgkg zze(int i) {
        return (zzgkg) this.zze.get(i);
    }

    public final List zzh() {
        return this.zze;
    }
}
