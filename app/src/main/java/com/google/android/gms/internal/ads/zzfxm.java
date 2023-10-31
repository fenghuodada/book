package com.google.android.gms.internal.ads;

import androidx.core.p003os.C0740h;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfxm {
    private final List zza = new ArrayList();
    private final zzggx zzb = zzggx.zza;
    private boolean zzc = false;

    public final void zzd() {
        for (zzfxk zzfxkVar : this.zza) {
            zzfxkVar.zza = false;
        }
    }

    public final zzfxm zza(zzfxk zzfxkVar) {
        zzfxm zzfxmVar;
        boolean z;
        zzfxmVar = zzfxkVar.zzf;
        if (zzfxmVar == null) {
            z = zzfxkVar.zza;
            if (z) {
                zzd();
            }
            zzfxkVar.zzf = this;
            this.zza.add(zzfxkVar);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzfxp zzb() throws GeneralSecurityException {
        zzfxl zzfxlVar;
        zzfxl zzfxlVar2;
        zzfxl zzfxlVar3;
        int i;
        zzfxt zzfxtVar;
        boolean z;
        zzfxl zzfxlVar4;
        zzfxl zzfxlVar5;
        zzfxl zzfxlVar6;
        zzfxl zzfxlVar7;
        zzfxg unused;
        zzfxl unused2;
        if (!this.zzc) {
            this.zzc = true;
            zzgke zzd = zzgkh.zzd();
            List list = this.zza;
            for (int i2 = 0; i2 < list.size() - 1; i2++) {
                zzfxlVar4 = ((zzfxk) list.get(i2)).zze;
                zzfxlVar5 = zzfxl.zza;
                if (zzfxlVar4 == zzfxlVar5) {
                    zzfxlVar6 = ((zzfxk) list.get(i2 + 1)).zze;
                    zzfxlVar7 = zzfxl.zza;
                    if (zzfxlVar6 != zzfxlVar7) {
                        throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    }
                }
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (zzfxk zzfxkVar : this.zza) {
                unused = zzfxkVar.zzb;
                zzfxlVar = zzfxkVar.zze;
                if (zzfxlVar != null) {
                    zzfxlVar2 = zzfxkVar.zze;
                    zzfxlVar3 = zzfxl.zza;
                    int i3 = 3;
                    if (zzfxlVar2 == zzfxlVar3) {
                        i = 0;
                        while (true) {
                            if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                                break;
                            }
                            SecureRandom secureRandom = new SecureRandom();
                            byte[] bArr = new byte[4];
                            int i4 = 0;
                            while (i4 == 0) {
                                secureRandom.nextBytes(bArr);
                                i4 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                            }
                            i = i4;
                        }
                    } else {
                        unused2 = zzfxkVar.zze;
                        i = 0;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzfxk.zza(zzfxkVar);
                        zzfxtVar = zzfxkVar.zzd;
                        zzfxg zzc = zzfxkVar.zzc();
                        if (!zzfxg.zza.equals(zzc)) {
                            if (zzfxg.zzb.equals(zzc)) {
                                i3 = 4;
                            } else if (zzfxg.zzc.equals(zzc)) {
                                i3 = 5;
                            } else {
                                throw new IllegalStateException("Unknown key status");
                            }
                        }
                        zzgem zza = ((zzgdk) zzfxtVar).zza();
                        zzgju zza2 = zzfyd.zza(zza.zzb());
                        zzgkf zzd2 = zzgkg.zzd();
                        zzd2.zzb(i);
                        zzd2.zzd(i3);
                        zzd2.zza(zza2);
                        zzd2.zzc(zza.zzb().zze());
                        zzd.zza((zzgkg) zzd2.zzal());
                        z = zzfxkVar.zza;
                        if (z) {
                            if (num == null) {
                                num = valueOf;
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                    } else {
                        throw new GeneralSecurityException(C0740h.m11849a("Id ", i, " is used twice in the keyset"));
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num != null) {
                zzd.zzb(num.intValue());
                return zzfxp.zzb((zzgkh) zzd.zzal(), this.zzb);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
