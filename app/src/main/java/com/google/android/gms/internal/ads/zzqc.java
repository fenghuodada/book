package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class zzqc extends zzrt implements zzkh {
    private final Context zzb;
    private final zzos zzc;
    private final zzoz zzd;
    private int zze;
    private boolean zzf;
    @Nullable
    private zzam zzg;
    @Nullable
    private zzam zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    @Nullable
    private zzld zzm;

    public zzqc(Context context, zzrl zzrlVar, zzrv zzrvVar, boolean z, @Nullable Handler handler, @Nullable zzot zzotVar, zzoz zzozVar) {
        super(1, zzrlVar, zzrvVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzozVar;
        this.zzc = new zzos(handler, zzotVar);
        zzozVar.zzn(new zzqb(this, null));
    }

    private static List zzaA(zzrv zzrvVar, zzam zzamVar, boolean z, zzoz zzozVar) throws zzsc {
        zzrp zzd;
        String str = zzamVar.zzm;
        if (str == null) {
            return zzfrr.zzl();
        }
        if (!zzozVar.zzw(zzamVar) || (zzd = zzsi.zzd()) == null) {
            List zzf = zzsi.zzf(str, false, false);
            String zze = zzsi.zze(zzamVar);
            if (zze == null) {
                return zzfrr.zzj(zzf);
            }
            List zzf2 = zzsi.zzf(zze, false, false);
            zzfro zzfroVar = new zzfro();
            zzfroVar.zzh(zzf);
            zzfroVar.zzh(zzf2);
            return zzfroVar.zzi();
        }
        return zzfrr.zzm(zzd);
    }

    private final void zzaB() {
        long zzb = this.zzd.zzb(zzO());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzk) {
                zzb = Math.max(this.zzi, zzb);
            }
            this.zzi = zzb;
            this.zzk = false;
        }
    }

    private final int zzaz(zzrp zzrpVar, zzam zzamVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(zzrpVar.zza) || (i = zzfn.zza) >= 24 || (i == 23 && zzfn.zzD(this.zzb))) {
            return zzamVar.zzn;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzle, com.google.android.gms.internal.ads.zzlf
    public final String zzM() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzle
    public final boolean zzO() {
        return super.zzO() && this.zzd.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzle
    public final boolean zzP() {
        return this.zzd.zzu() || super.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final float zzR(float f, zzam zzamVar, zzam[] zzamVarArr) {
        int i = -1;
        for (zzam zzamVar2 : zzamVarArr) {
            int i2 = zzamVar2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final int zzS(zzrv zzrvVar, zzam zzamVar) throws zzsc {
        boolean z;
        if (zzcd.zzf(zzamVar.zzm)) {
            int i = zzfn.zza >= 21 ? 32 : 0;
            int i2 = zzamVar.zzF;
            boolean zzay = zzrt.zzay(zzamVar);
            if (zzay && this.zzd.zzw(zzamVar) && (i2 == 0 || zzsi.zzd() != null)) {
                return i | 140;
            }
            if ((!"audio/raw".equals(zzamVar.zzm) || this.zzd.zzw(zzamVar)) && this.zzd.zzw(zzfn.zzu(2, zzamVar.zzz, zzamVar.zzA))) {
                List zzaA = zzaA(zzrvVar, zzamVar, false, this.zzd);
                if (zzaA.isEmpty()) {
                    return 129;
                }
                if (zzay) {
                    zzrp zzrpVar = (zzrp) zzaA.get(0);
                    boolean zze = zzrpVar.zze(zzamVar);
                    if (!zze) {
                        for (int i3 = 1; i3 < zzaA.size(); i3++) {
                            zzrp zzrpVar2 = (zzrp) zzaA.get(i3);
                            if (zzrpVar2.zze(zzamVar)) {
                                z = false;
                                zze = true;
                                zzrpVar = zzrpVar2;
                                break;
                            }
                        }
                    }
                    z = true;
                    int i4 = true != zze ? 3 : 4;
                    int i5 = 8;
                    if (zze && zzrpVar.zzf(zzamVar)) {
                        i5 = 16;
                    }
                    return i4 | i5 | i | (true != zzrpVar.zzg ? 0 : 64) | (true != z ? 0 : 128);
                }
                return 130;
            }
            return 129;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final zzht zzT(zzrp zzrpVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzht zzb = zzrpVar.zzb(zzamVar, zzamVar2);
        int i3 = zzb.zze;
        if (zzaz(zzrpVar, zzamVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzrpVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzb.zzd;
        }
        return new zzht(str, zzamVar, zzamVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @Nullable
    public final zzht zzU(zzkf zzkfVar) throws zzia {
        zzam zzamVar = zzkfVar.zza;
        zzamVar.getClass();
        this.zzg = zzamVar;
        zzht zzU = super.zzU(zzkfVar);
        this.zzc.zzg(this.zzg, zzU);
        return zzU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzrt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzrk zzX(com.google.android.gms.internal.ads.zzrp r8, com.google.android.gms.internal.ads.zzam r9, @androidx.annotation.Nullable android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqc.zzX(com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzrk");
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final List zzY(zzrv zzrvVar, zzam zzamVar, boolean z) throws zzsc {
        return zzsi.zzg(zzaA(zzrvVar, zzamVar, false, this.zzd), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzZ(Exception exc) {
        zzer.zzc("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final long zza() {
        if (zzbc() == 2) {
            zzaB();
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzaa(String str, zzrk zzrkVar, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzab(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzac(zzam zzamVar, @Nullable MediaFormat mediaFormat) throws zzia {
        int i;
        zzam zzamVar2 = this.zzh;
        int[] iArr = null;
        if (zzamVar2 != null) {
            zzamVar = zzamVar2;
        } else if (zzal() != null) {
            int zzj = "audio/raw".equals(zzamVar.zzm) ? zzamVar.zzB : (zzfn.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzfn.zzj(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/raw");
            zzakVar.zzN(zzj);
            zzakVar.zzC(zzamVar.zzC);
            zzakVar.zzD(zzamVar.zzD);
            zzakVar.zzw(mediaFormat.getInteger("channel-count"));
            zzakVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzam zzY = zzakVar.zzY();
            if (this.zzf && zzY.zzz == 6 && (i = zzamVar.zzz) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < zzamVar.zzz; i2++) {
                    iArr[i2] = i2;
                }
            }
            zzamVar = zzY;
        }
        try {
            this.zzd.zzd(zzamVar, 0, iArr);
        } catch (zzou e) {
            throw zzbe(e, e.zza, false, 5001);
        }
    }

    @CallSuper
    public final void zzad() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzae() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzaf(zzhi zzhiVar) {
        if (!this.zzj || zzhiVar.zzf()) {
            return;
        }
        if (Math.abs(zzhiVar.zzd - this.zzi) > 500000) {
            this.zzi = zzhiVar.zzd;
        }
        this.zzj = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final void zzag() throws zzia {
        try {
            this.zzd.zzi();
        } catch (zzoy e) {
            throw zzbe(e, e.zzc, e.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final boolean zzah(long j, long j2, @Nullable zzrm zzrmVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zzia {
        byteBuffer.getClass();
        if (this.zzh != null && (i2 & 2) != 0) {
            zzrmVar.getClass();
            zzrmVar.zzn(i, false);
            return true;
        } else if (z) {
            if (zzrmVar != null) {
                zzrmVar.zzn(i, false);
            }
            ((zzrt) this).zza.zzf += i3;
            this.zzd.zzf();
            return true;
        } else {
            try {
                if (this.zzd.zzt(byteBuffer, j3, i3)) {
                    if (zzrmVar != null) {
                        zzrmVar.zzn(i, false);
                    }
                    ((zzrt) this).zza.zze += i3;
                    return true;
                }
                return false;
            } catch (zzov e) {
                throw zzbe(e, this.zzg, e.zzb, 5001);
            } catch (zzoy e2) {
                throw zzbe(e2, zzamVar, e2.zzb, 5002);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final boolean zzai(zzam zzamVar) {
        return this.zzd.zzw(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final zzci zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void zzg(zzci zzciVar) {
        this.zzd.zzo(zzciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzle
    @Nullable
    public final zzkh zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzla
    public final void zzq(int i, @Nullable Object obj) throws zzia {
        if (i == 2) {
            this.zzd.zzs(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzd.zzk((zzk) obj);
        } else if (i == 6) {
            this.zzd.zzm((zzl) obj);
        } else {
            switch (i) {
                case 9:
                    this.zzd.zzr(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.zzd.zzl(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzm = (zzld) obj;
                    return;
                case 12:
                    if (zzfn.zza >= 23) {
                        zzpz.zza(this.zzd, obj);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzhr
    public final void zzt() {
        this.zzl = true;
        this.zzg = null;
        try {
            this.zzd.zze();
            try {
                super.zzt();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzt();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzhr
    public final void zzu(boolean z, boolean z2) throws zzia {
        super.zzu(z, z2);
        this.zzc.zzf(((zzrt) this).zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzhr
    public final void zzv(long j, boolean z) throws zzia {
        super.zzv(j, z);
        this.zzd.zze();
        this.zzi = j;
        this.zzj = true;
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzrt, com.google.android.gms.internal.ads.zzhr
    public final void zzw() {
        try {
            super.zzw();
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzx() {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzy() {
        zzaB();
        this.zzd.zzg();
    }
}
