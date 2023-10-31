package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;
import java.util.Collections;

/* loaded from: classes.dex */
final class zzacr extends zzacw {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzacr(zzabr zzabrVar) {
        super(zzabrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final boolean zza(zzfd zzfdVar) throws zzacv {
        String str;
        zzam zzY;
        if (!this.zzc) {
            int zzk = zzfdVar.zzk();
            int i = zzk >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzk >> 2) & 3];
                zzak zzakVar = new zzak();
                zzakVar.zzS("audio/mpeg");
                zzakVar.zzw(1);
                zzakVar.zzT(i2);
                zzY = zzakVar.zzY();
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new zzacv(C0235r.m12816a("Audio format not supported: ", i));
                }
                this.zzc = true;
            } else {
                zzak zzakVar2 = new zzak();
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                zzakVar2.zzS(str);
                zzakVar2.zzw(1);
                zzakVar2.zzT(8000);
                zzY = zzakVar2.zzY();
            }
            this.zza.zzk(zzY);
            this.zzd = true;
            this.zzc = true;
        } else {
            zzfdVar.zzG(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final boolean zzb(zzfd zzfdVar, long j) throws zzce {
        if (this.zze == 2) {
            int zza = zzfdVar.zza();
            this.zza.zzq(zzfdVar, zza);
            this.zza.zzs(j, 1, zza, 0, null);
            return true;
        }
        int zzk = zzfdVar.zzk();
        if (zzk != 0 || this.zzd) {
            if (this.zze != 10 || zzk == 1) {
                int zza2 = zzfdVar.zza();
                this.zza.zzq(zzfdVar, zza2);
                this.zza.zzs(j, 1, zza2, 0, null);
                return true;
            }
            return false;
        }
        int zza3 = zzfdVar.zza();
        byte[] bArr = new byte[zza3];
        zzfdVar.zzB(bArr, 0, zza3);
        zzzl zza4 = zzzm.zza(bArr);
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/mp4a-latm");
        zzakVar.zzx(zza4.zzc);
        zzakVar.zzw(zza4.zzb);
        zzakVar.zzT(zza4.zza);
        zzakVar.zzI(Collections.singletonList(bArr));
        this.zza.zzk(zzakVar.zzY());
        this.zzd = true;
        return false;
    }
}
