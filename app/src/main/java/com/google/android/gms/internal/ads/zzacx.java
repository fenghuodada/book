package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;

/* loaded from: classes.dex */
final class zzacx extends zzacw {
    private final zzfd zzb;
    private final zzfd zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzacx(zzabr zzabrVar) {
        super(zzabrVar);
        this.zzb = new zzfd(zzew.zza);
        this.zzc = new zzfd(4);
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final boolean zza(zzfd zzfdVar) throws zzacv {
        int zzk = zzfdVar.zzk();
        int i = zzk >> 4;
        int i2 = zzk & 15;
        if (i2 == 7) {
            this.zzg = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new zzacv(C0235r.m12816a("Video format not supported: ", i2));
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final boolean zzb(zzfd zzfdVar, long j) throws zzce {
        int zzk = zzfdVar.zzk();
        long zzf = zzfdVar.zzf();
        if (zzk == 0) {
            if (!this.zze) {
                zzfd zzfdVar2 = new zzfd(new byte[zzfdVar.zza()]);
                zzfdVar.zzB(zzfdVar2.zzH(), 0, zzfdVar.zza());
                zzzt zza = zzzt.zza(zzfdVar2);
                this.zzd = zza.zzb;
                zzak zzakVar = new zzak();
                zzakVar.zzS("video/avc");
                zzakVar.zzx(zza.zzi);
                zzakVar.zzX(zza.zzc);
                zzakVar.zzF(zza.zzd);
                zzakVar.zzP(zza.zzh);
                zzakVar.zzI(zza.zza);
                this.zza.zzk(zzakVar.zzY());
                this.zze = true;
                return false;
            }
        } else if (zzk == 1 && this.zze) {
            int i = this.zzg == 1 ? 1 : 0;
            if (this.zzf || i != 0) {
                byte[] zzH = this.zzc.zzH();
                zzH[0] = 0;
                zzH[1] = 0;
                zzH[2] = 0;
                int i2 = 4 - this.zzd;
                int i3 = 0;
                while (zzfdVar.zza() > 0) {
                    zzfdVar.zzB(this.zzc.zzH(), i2, this.zzd);
                    this.zzc.zzF(0);
                    int zzn = this.zzc.zzn();
                    this.zzb.zzF(0);
                    this.zza.zzq(this.zzb, 4);
                    this.zza.zzq(zzfdVar, zzn);
                    i3 = i3 + 4 + zzn;
                }
                this.zza.zzs((zzf * 1000) + j, i, i3, 0, null);
                this.zzf = true;
                return true;
            }
            return false;
        }
        return false;
    }
}
