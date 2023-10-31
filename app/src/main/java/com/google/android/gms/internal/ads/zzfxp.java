package com.google.android.gms.internal.ads;

import androidx.core.provider.C0758e;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfxp {
    private final zzgkh zza;
    private final List zzb;
    private final zzggx zzc;

    private zzfxp(zzgkh zzgkhVar, List list) {
        this.zza = zzgkhVar;
        this.zzb = list;
        this.zzc = zzggx.zza;
    }

    private zzfxp(zzgkh zzgkhVar, List list, zzggx zzggxVar) {
        this.zza = zzgkhVar;
        this.zzb = list;
        this.zzc = zzggxVar;
    }

    public static final zzfxp zza(zzgkh zzgkhVar) throws GeneralSecurityException {
        zzi(zzgkhVar);
        return new zzfxp(zzgkhVar, zzh(zzgkhVar));
    }

    public static final zzfxp zzb(zzgkh zzgkhVar, zzggx zzggxVar) throws GeneralSecurityException {
        zzi(zzgkhVar);
        return new zzfxp(zzgkhVar, zzh(zzgkhVar), zzggxVar);
    }

    public static final zzfxp zzc(zzfxh zzfxhVar) throws GeneralSecurityException {
        zzgdk zzgdkVar = new zzgdk(zzgem.zza(zzfxhVar.zza()));
        zzfxm zzfxmVar = new zzfxm();
        zzfxk zzfxkVar = new zzfxk(zzgdkVar, null);
        zzfxkVar.zzd();
        zzfxkVar.zze();
        zzfxmVar.zza(zzfxkVar);
        return zzfxmVar.zzb();
    }

    private static zzgel zzf(zzgkg zzgkgVar) {
        try {
            return zzgel.zza(zzgkgVar.zzc().zzg(), zzgkgVar.zzc().zzf(), zzgkgVar.zzc().zzc(), zzgkgVar.zzf(), zzgkgVar.zzf() == zzgla.RAW ? null : Integer.valueOf(zzgkgVar.zza()));
        } catch (GeneralSecurityException e) {
            throw new zzgev("Creating a protokey serialization failed", e);
        }
    }

    @Nullable
    private static Object zzg(zzgkg zzgkgVar, Class cls) throws GeneralSecurityException {
        try {
            zzgju zzc = zzgkgVar.zzc();
            int i = zzfyd.zza;
            return zzfyd.zzc(zzc.zzg(), zzc.zzf(), cls);
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    private static List zzh(zzgkh zzgkhVar) {
        zzfxg zzfxgVar;
        ArrayList arrayList = new ArrayList(zzgkhVar.zza());
        for (zzgkg zzgkgVar : zzgkhVar.zzh()) {
            int zza = zzgkgVar.zza();
            try {
                zzfxb zza2 = zzgds.zzb().zza(zzf(zzgkgVar), zzfye.zza());
                int zzk = zzgkgVar.zzk() - 2;
                if (zzk == 1) {
                    zzfxgVar = zzfxg.zza;
                } else if (zzk == 2) {
                    zzfxgVar = zzfxg.zzb;
                } else if (zzk != 3) {
                    throw new GeneralSecurityException("Unknown key status");
                    break;
                } else {
                    zzfxgVar = zzfxg.zzc;
                }
                arrayList.add(new zzfxo(zza2, zzfxgVar, zza, zza == zzgkhVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzi(zzgkh zzgkhVar) throws GeneralSecurityException {
        if (zzgkhVar == null || zzgkhVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    @Nullable
    private static final Object zzj(zzfxb zzfxbVar, Class cls) throws GeneralSecurityException {
        try {
            int i = zzfyd.zza;
            return zzgdr.zza().zzc(zzfxbVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        zzgkh zzgkhVar = this.zza;
        Charset charset = zzfyf.zza;
        zzgkj zza = zzgkm.zza();
        zza.zzb(zzgkhVar.zzc());
        for (zzgkg zzgkgVar : zzgkhVar.zzh()) {
            zzgkk zza2 = zzgkl.zza();
            zza2.zzc(zzgkgVar.zzc().zzg());
            zza2.zzd(zzgkgVar.zzk());
            zza2.zzb(zzgkgVar.zzf());
            zza2.zza(zzgkgVar.zza());
            zza.zza((zzgkl) zza2.zzal());
        }
        return ((zzgkm) zza.zzal()).toString();
    }

    public final zzgkh zzd() {
        return this.zza;
    }

    public final Object zze(Class cls) throws GeneralSecurityException {
        Object obj;
        boolean z;
        Class zzb = zzfyd.zzb(cls);
        if (zzb != null) {
            zzgkh zzgkhVar = this.zza;
            Charset charset = zzfyf.zza;
            int zzc = zzgkhVar.zzc();
            int i = 0;
            boolean z2 = false;
            boolean z3 = true;
            for (zzgkg zzgkgVar : zzgkhVar.zzh()) {
                if (zzgkgVar.zzk() == 3) {
                    if (zzgkgVar.zzj()) {
                        if (zzgkgVar.zzf() != zzgla.UNKNOWN_PREFIX) {
                            if (zzgkgVar.zzk() != 2) {
                                if (zzgkgVar.zza() == zzc) {
                                    if (!z2) {
                                        z2 = true;
                                    } else {
                                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                                    }
                                }
                                if (zzgkgVar.zzc().zzc() != zzgjt.ASYMMETRIC_PUBLIC) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                z3 &= z;
                                i++;
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgkgVar.zza())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgkgVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgkgVar.zza())));
                    }
                }
            }
            if (i != 0) {
                if (!z2 && !z3) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                zzfxv zzfxvVar = new zzfxv(zzb, null);
                zzfxvVar.zzc(this.zzc);
                for (int i2 = 0; i2 < this.zza.zza(); i2++) {
                    zzgkg zze = this.zza.zze(i2);
                    if (zze.zzk() == 3) {
                        Object zzg = zzg(zze, zzb);
                        if (this.zzb.get(i2) != null) {
                            obj = zzj(((zzfxo) this.zzb.get(i2)).zza(), zzb);
                        } else {
                            obj = null;
                        }
                        if (obj == null && zzg == null) {
                            throw new GeneralSecurityException(C0758e.m11827a("Unable to get primitive ", zzb.toString(), " for key of type ", zze.zzc().zzg()));
                        }
                        if (zze.zza() == this.zza.zzc()) {
                            zzfxvVar.zzb(obj, zzg, zze);
                        } else {
                            zzfxvVar.zza(obj, zzg, zze);
                        }
                    }
                }
                return zzgdr.zza().zzd(zzfxvVar.zzd(), cls);
            }
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }
}
