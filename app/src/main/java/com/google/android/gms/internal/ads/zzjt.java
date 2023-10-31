package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.adcolony.sdk.C2362x3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzjt extends zzm implements zzil {
    public static final /* synthetic */ int zzd = 0;
    private final zzlq zzA;
    private final zzlr zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzlh zzH;
    private zzcm zzI;
    private zzbw zzJ;
    private zzbw zzK;
    @Nullable
    private zzam zzL;
    @Nullable
    private zzam zzM;
    @Nullable
    private AudioTrack zzN;
    @Nullable
    private Object zzO;
    @Nullable
    private Surface zzP;
    private int zzQ;
    private zzff zzR;
    @Nullable
    private zzhs zzS;
    @Nullable
    private zzhs zzT;
    private int zzU;
    private zzk zzV;
    private float zzW;
    private boolean zzX;
    private zzdx zzY;
    private boolean zzZ;
    private boolean zzaa;
    private zzz zzab;
    private zzdn zzac;
    private zzbw zzad;
    private zzky zzae;
    private int zzaf;
    private long zzag;
    private final zzjg zzah;
    private zzvf zzai;
    final zzxe zzb;
    final zzcm zzc;
    private final zzeb zze;
    private final Context zzf;
    private final zzcq zzg;
    private final zzle[] zzh;
    private final zzxd zzi;
    private final zzei zzj;
    private final zzkd zzk;
    private final zzeo zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcu zzn;
    private final List zzo;
    private final boolean zzp;
    private final zztk zzq;
    private final zzls zzr;
    private final Looper zzs;
    private final zzxl zzt;
    private final zzdz zzu;
    private final zzjp zzv;
    private final zzjr zzw;
    private final zzhm zzx;
    private final zzhq zzy;
    private final zzlp zzz;

    static {
        zzbr.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzls, java.lang.Object, com.google.android.gms.internal.ads.zzxk] */
    @SuppressLint({"HandlerLeak"})
    public zzjt(zzik zzikVar, @Nullable zzcq zzcqVar) {
        Object obj;
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zze = zzebVar;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfn.zze;
            zzer.zzd("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.1] [" + str + "]");
            Context applicationContext = zzikVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzikVar.zzh.apply(zzikVar.zzb);
            this.zzr = apply;
            this.zzV = zzikVar.zzj;
            this.zzQ = zzikVar.zzk;
            this.zzX = false;
            this.zzC = zzikVar.zzo;
            zzjp zzjpVar = new zzjp(this, null);
            this.zzv = zzjpVar;
            zzjr zzjrVar = new zzjr(null);
            this.zzw = zzjrVar;
            Handler handler = new Handler(zzikVar.zzi);
            zzle[] zza = ((zzie) zzikVar.zzc).zza.zza(handler, zzjpVar, zzjpVar, zzjpVar, zzjpVar);
            this.zzh = zza;
            int length = zza.length;
            zzxd zzxdVar = (zzxd) zzikVar.zze.zza();
            this.zzi = zzxdVar;
            this.zzq = zzik.zza(((zzif) zzikVar.zzd).zza);
            zzxp zzg = zzxp.zzg(((zzii) zzikVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = zzikVar.zzl;
            this.zzH = zzikVar.zzm;
            Looper looper = zzikVar.zzi;
            this.zzs = looper;
            zzdz zzdzVar = zzikVar.zzb;
            this.zzu = zzdzVar;
            this.zzg = zzcqVar;
            zzeo zzeoVar = new zzeo(looper, zzdzVar, new zzem() { // from class: com.google.android.gms.internal.ads.zzjf
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj2, zzah zzahVar) {
                    zzcn zzcnVar = (zzcn) obj2;
                }
            });
            this.zzl = zzeoVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzai = new zzvf(0);
            int length2 = zza.length;
            zzxe zzxeVar = new zzxe(new zzlg[2], new zzwx[2], zzdi.zza, null);
            this.zzb = zzxeVar;
            this.zzn = new zzcu();
            zzck zzckVar = new zzck();
            zzckVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 32);
            zzxdVar.zzl();
            zzckVar.zzd(29, true);
            zzcm zze = zzckVar.zze();
            this.zzc = zze;
            zzck zzckVar2 = new zzck();
            zzckVar2.zzb(zze);
            zzckVar2.zza(4);
            zzckVar2.zza(10);
            this.zzI = zzckVar2.zze();
            this.zzj = zzdzVar.zzb(looper, null);
            zzjg zzjgVar = new zzjg(this);
            this.zzah = zzjgVar;
            this.zzae = zzky.zzi(zzxeVar);
            apply.zzS(zzcqVar, looper);
            int i = zzfn.zza;
            this.zzk = new zzkd(zza, zzxdVar, zzxeVar, (zzkg) zzikVar.zzf.zza(), zzg, 0, false, apply, this.zzH, zzikVar.zzr, zzikVar.zzn, false, looper, zzdzVar, zzjgVar, i < 31 ? new zzof() : zzji.zza(applicationContext, this, zzikVar.zzp), null);
            this.zzW = 1.0f;
            zzbw zzbwVar = zzbw.zza;
            this.zzJ = zzbwVar;
            this.zzK = zzbwVar;
            this.zzad = zzbwVar;
            this.zzaf = -1;
            if (i >= 21) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.zzU = audioManager == null ? -1 : audioManager.generateAudioSessionId();
                obj = null;
            } else {
                AudioTrack audioTrack = this.zzN;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzN.release();
                    obj = null;
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzU = this.zzN.getAudioSessionId();
            }
            this.zzY = zzdx.zza;
            this.zzZ = true;
            apply.getClass();
            zzeoVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzjpVar);
            this.zzx = new zzhm(zzikVar.zza, handler, zzjpVar);
            this.zzy = new zzhq(zzikVar.zza, handler, zzjpVar);
            zzfn.zzB(obj, obj);
            zzlp zzlpVar = new zzlp(zzikVar.zza, handler, zzjpVar);
            this.zzz = zzlpVar;
            int i2 = this.zzV.zzc;
            zzlpVar.zzf(3);
            this.zzA = new zzlq(zzikVar.zza);
            this.zzB = new zzlr(zzikVar.zza);
            this.zzab = zzah(zzlpVar);
            this.zzac = zzdn.zza;
            this.zzR = zzff.zza;
            zzxdVar.zzi(this.zzV);
            zzal(1, 10, Integer.valueOf(this.zzU));
            zzal(2, 10, Integer.valueOf(this.zzU));
            zzal(1, 3, this.zzV);
            zzal(2, 4, Integer.valueOf(this.zzQ));
            zzal(2, 5, 0);
            zzal(1, 9, Boolean.valueOf(this.zzX));
            zzal(2, 7, zzjrVar);
            zzal(6, 8, zzjrVar);
            zzebVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ zzz zzD(zzjt zzjtVar) {
        return zzjtVar.zzab;
    }

    public static /* bridge */ /* synthetic */ zzz zzE(zzlp zzlpVar) {
        return zzah(zzlpVar);
    }

    public static /* bridge */ /* synthetic */ zzeo zzF(zzjt zzjtVar) {
        return zzjtVar.zzl;
    }

    public static /* bridge */ /* synthetic */ zzlp zzH(zzjt zzjtVar) {
        return zzjtVar.zzz;
    }

    public static /* bridge */ /* synthetic */ void zzM(zzjt zzjtVar, zzz zzzVar) {
        zzjtVar.zzab = zzzVar;
    }

    public static /* bridge */ /* synthetic */ void zzT(zzjt zzjtVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjtVar.zzan(surface);
        zzjtVar.zzP = surface;
    }

    private final int zzab() {
        if (this.zzae.zza.zzo()) {
            return this.zzaf;
        }
        zzky zzkyVar = this.zzae;
        return zzkyVar.zza.zzn(zzkyVar.zzb.zza, this.zzn).zzd;
    }

    public static int zzac(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzad(zzky zzkyVar) {
        if (zzkyVar.zza.zzo()) {
            return zzfn.zzo(this.zzag);
        }
        long zza = zzkyVar.zzo ? zzkyVar.zza() : zzkyVar.zzr;
        if (zzkyVar.zzb.zzb()) {
            return zza;
        }
        zzaf(zzkyVar.zza, zzkyVar.zzb, zza);
        return zza;
    }

    private static long zzae(zzky zzkyVar) {
        zzcw zzcwVar = new zzcw();
        zzcu zzcuVar = new zzcu();
        zzkyVar.zza.zzn(zzkyVar.zzb.zza, zzcuVar);
        long j = zzkyVar.zzc;
        if (j == -9223372036854775807L) {
            long j2 = zzkyVar.zza.zze(zzcuVar.zzd, zzcwVar, 0L).zzm;
            return 0L;
        }
        return j;
    }

    private final long zzaf(zzcx zzcxVar, zztl zztlVar, long j) {
        zzcxVar.zzn(zztlVar.zza, this.zzn);
        return j;
    }

    @Nullable
    private final Pair zzag(zzcx zzcxVar, int i, long j) {
        if (zzcxVar.zzo()) {
            this.zzaf = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzag = j;
            return null;
        }
        if (i == -1 || i >= zzcxVar.zzc()) {
            i = zzcxVar.zzg(false);
            long j2 = zzcxVar.zze(i, this.zza, 0L).zzm;
            j = zzfn.zzq(0L);
        }
        return zzcxVar.zzl(this.zza, this.zzn, i, zzfn.zzo(j));
    }

    public static zzz zzah(zzlp zzlpVar) {
        zzx zzxVar = new zzx(0);
        zzxVar.zzd(zzlpVar.zzb());
        zzxVar.zzc(zzlpVar.zza());
        return zzxVar.zze();
    }

    private final zzky zzai(zzky zzkyVar, zzcx zzcxVar, @Nullable Pair pair) {
        int i;
        long j;
        zzky zzd2;
        zzdy.zzd(zzcxVar.zzo() || pair != null);
        zzcx zzcxVar2 = zzkyVar.zza;
        zzky zzh = zzkyVar.zzh(zzcxVar);
        if (zzcxVar.zzo()) {
            zztl zzj = zzky.zzj();
            long zzo = zzfn.zzo(this.zzag);
            zzky zzc = zzh.zzd(zzj, zzo, zzo, zzo, 0L, zzvk.zza, this.zzb, zzfrr.zzl()).zzc(zzj);
            zzc.zzp = zzc.zzr;
            return zzc;
        }
        Object obj = zzh.zzb.zza;
        int i2 = zzfn.zza;
        boolean z = !obj.equals(pair.first);
        zztl zztlVar = z ? new zztl(pair.first) : zzh.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzo2 = zzfn.zzo(zzj());
        if (!zzcxVar2.zzo()) {
            zzcxVar2.zzn(obj, this.zzn);
        }
        if (z || longValue < zzo2) {
            zzdy.zzf(!zztlVar.zzb());
            zzky zzc2 = zzh.zzd(zztlVar, longValue, longValue, longValue, 0L, z ? zzvk.zza : zzh.zzh, z ? this.zzb : zzh.zzi, z ? zzfrr.zzl() : zzh.zzj).zzc(zztlVar);
            zzc2.zzp = longValue;
            return zzc2;
        }
        if (i == 0) {
            int zza = zzcxVar.zza(zzh.zzk.zza);
            if (zza != -1 && zzcxVar.zzd(zza, this.zzn, false).zzd == zzcxVar.zzn(zztlVar.zza, this.zzn).zzd) {
                return zzh;
            }
            zzcxVar.zzn(zztlVar.zza, this.zzn);
            j = zztlVar.zzb() ? this.zzn.zzh(zztlVar.zzb, zztlVar.zzc) : this.zzn.zze;
            zzd2 = zzh.zzd(zztlVar, zzh.zzr, zzh.zzr, zzh.zzd, j - zzh.zzr, zzh.zzh, zzh.zzi, zzh.zzj).zzc(zztlVar);
        } else {
            zzdy.zzf(!zztlVar.zzb());
            long max = Math.max(0L, zzh.zzq - (longValue - zzo2));
            j = zzh.zzp;
            if (zzh.zzk.equals(zzh.zzb)) {
                j = longValue + max;
            }
            zzd2 = zzh.zzd(zztlVar, longValue, longValue, longValue, max, zzh.zzh, zzh.zzi, zzh.zzj);
        }
        zzd2.zzp = j;
        return zzd2;
    }

    private final zzlb zzaj(zzla zzlaVar) {
        int zzab = zzab();
        zzkd zzkdVar = this.zzk;
        zzcx zzcxVar = this.zzae.zza;
        if (zzab == -1) {
            zzab = 0;
        }
        return new zzlb(zzkdVar, zzlaVar, zzcxVar, zzab, this.zzu, zzkdVar.zzb());
    }

    public final void zzak(final int i, final int i2) {
        if (i == this.zzR.zzb() && i2 == this.zzR.zza()) {
            return;
        }
        this.zzR = new zzff(i, i2);
        zzeo zzeoVar = this.zzl;
        zzeoVar.zzd(24, new zzel() { // from class: com.google.android.gms.internal.ads.zzin
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                int i3 = i;
                int i4 = i2;
                int i5 = zzjt.zzd;
                ((zzcn) obj).zzr(i3, i4);
            }
        });
        zzeoVar.zzc();
        zzal(2, 14, new zzff(i, i2));
    }

    private final void zzal(int i, int i2, @Nullable Object obj) {
        zzle[] zzleVarArr = this.zzh;
        int length = zzleVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzle zzleVar = zzleVarArr[i3];
            if (zzleVar.zzb() == i) {
                zzlb zzaj = zzaj(zzleVar);
                zzaj.zzf(i2);
                zzaj.zze(obj);
                zzaj.zzd();
            }
        }
    }

    public final void zzam() {
        zzal(1, 2, Float.valueOf(this.zzW * this.zzy.zza()));
    }

    public final void zzan(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        zzle[] zzleVarArr = this.zzh;
        int length = zzleVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzle zzleVar = zzleVarArr[i];
            if (zzleVar.zzb() == 2) {
                zzlb zzaj = zzaj(zzleVar);
                zzaj.zzf(1);
                zzaj.zze(obj);
                zzaj.zzd();
                arrayList.add(zzaj);
            }
        }
        Object obj2 = this.zzO;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzlb) it.next()).zzi(this.zzC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (z) {
            zzao(zzia.zzd(new zzke(3), 1003));
        }
    }

    private final void zzao(@Nullable zzia zziaVar) {
        zzky zzkyVar = this.zzae;
        zzky zzc = zzkyVar.zzc(zzkyVar.zzb);
        zzc.zzp = zzc.zzr;
        zzc.zzq = 0L;
        zzky zzg = zzc.zzg(1);
        if (zziaVar != null) {
            zzg = zzg.zzf(zziaVar);
        }
        this.zzD++;
        this.zzk.zzo();
        zzaq(zzg, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final void zzap(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzky zzkyVar = this.zzae;
        if (zzkyVar.zzl == z2 && zzkyVar.zzm == i3) {
            return;
        }
        this.zzD++;
        if (zzkyVar.zzo) {
            zzkyVar = zzkyVar.zzb();
        }
        zzky zze = zzkyVar.zze(z2, i3);
        this.zzk.zzn(z2, i3);
        zzaq(zze, 0, i2, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x0212, code lost:
        if (r4 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:370:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x045c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0466 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0471 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x048e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x04f6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaq(final com.google.android.gms.internal.ads.zzky r43, final int r44, final int r45, boolean r46, boolean r47, final int r48, long r49, int r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjt.zzaq(com.google.android.gms.internal.ads.zzky, int, int, boolean, boolean, int, long, int, boolean):void");
    }

    public final void zzar() {
        int zzf = zzf();
        if (zzf == 2 || zzf == 3) {
            zzas();
            boolean z = this.zzae.zzo;
            zzv();
            zzv();
        }
    }

    private final void zzas() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzZ) {
                throw new IllegalStateException(format);
            }
            zzer.zzf("ExoPlayerImpl", format, this.zzaa ? null : new IllegalStateException());
            this.zzaa = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzA(zzlv zzlvVar) {
        zzas();
        this.zzr.zzR(zzlvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzB(zztn zztnVar) {
        zzas();
        List singletonList = Collections.singletonList(zztnVar);
        zzas();
        zzas();
        zzab();
        zzk();
        this.zzD++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzai = this.zzai.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzkv zzkvVar = new zzkv((zztn) singletonList.get(i2), this.zzp);
            arrayList.add(zzkvVar);
            this.zzo.add(i2, new zzjs(zzkvVar.zzb, zzkvVar.zza.zzB()));
        }
        this.zzai = this.zzai.zzg(0, arrayList.size());
        zzlc zzlcVar = new zzlc(this.zzo, this.zzai);
        if (!zzlcVar.zzo() && zzlcVar.zzc() < 0) {
            throw new zzaq(zzlcVar, -1, -9223372036854775807L);
        }
        int zzg = zzlcVar.zzg(false);
        zzky zzai = zzai(this.zzae, zzlcVar, zzag(zzlcVar, zzg, -9223372036854775807L));
        int i3 = zzai.zze;
        if (zzg != -1 && i3 != 1) {
            i3 = 4;
            if (!zzlcVar.zzo() && zzg < zzlcVar.zzc()) {
                i3 = 2;
            }
        }
        zzky zzg2 = zzai.zzg(i3);
        this.zzk.zzq(arrayList, zzg, zzfn.zzo(-9223372036854775807L), this.zzai);
        zzaq(zzg2, 0, 1, false, (this.zzae.zzb.zza.equals(zzg2.zzb.zza) || this.zzae.zza.zzo()) ? false : true, 4, zzad(zzg2), -1, false);
    }

    @Nullable
    public final zzia zzG() {
        zzas();
        return this.zzae.zzf;
    }

    public final /* synthetic */ void zzX(zzkb zzkbVar) {
        long j;
        boolean z;
        long j2;
        int i = this.zzD - zzkbVar.zzb;
        this.zzD = i;
        boolean z2 = true;
        if (zzkbVar.zzc) {
            this.zzE = zzkbVar.zzd;
            this.zzF = true;
        }
        if (zzkbVar.zze) {
            this.zzG = zzkbVar.zzf;
        }
        if (i == 0) {
            zzcx zzcxVar = zzkbVar.zza.zza;
            if (!this.zzae.zza.zzo() && zzcxVar.zzo()) {
                this.zzaf = -1;
                this.zzag = 0L;
            }
            if (!zzcxVar.zzo()) {
                List zzw = ((zzlc) zzcxVar).zzw();
                zzdy.zzf(zzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzjs) this.zzo.get(i2)).zzb = (zzcx) zzw.get(i2);
                }
            }
            if (this.zzF) {
                if (zzkbVar.zza.zzb.equals(this.zzae.zzb) && zzkbVar.zza.zzd == this.zzae.zzr) {
                    z2 = false;
                }
                if (z2) {
                    if (zzcxVar.zzo() || zzkbVar.zza.zzb.zzb()) {
                        j2 = zzkbVar.zza.zzd;
                    } else {
                        zzky zzkyVar = zzkbVar.zza;
                        zztl zztlVar = zzkyVar.zzb;
                        j2 = zzkyVar.zzd;
                        zzaf(zzcxVar, zztlVar, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzF = false;
            zzaq(zzkbVar.zza, 1, this.zzG, false, z, this.zzE, j, -1, false);
        }
    }

    public final /* synthetic */ void zzY(final zzkb zzkbVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjh
            @Override // java.lang.Runnable
            public final void run() {
                zzjt.this.zzX(zzkbVar);
            }
        });
    }

    public final /* synthetic */ void zzZ(zzcn zzcnVar) {
        zzcnVar.zza(this.zzI);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        zzas();
        zzdy.zzd(i >= 0);
        this.zzr.zzx();
        zzcx zzcxVar = this.zzae.zza;
        if (zzcxVar.zzo() || i < zzcxVar.zzc()) {
            this.zzD++;
            if (zzx()) {
                zzer.zze("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkb zzkbVar = new zzkb(this.zzae);
                zzkbVar.zza(1);
                this.zzah.zza.zzY(zzkbVar);
                return;
            }
            int i3 = zzf() != 1 ? 2 : 1;
            int zzd2 = zzd();
            zzky zzai = zzai(this.zzae.zzg(i3), zzcxVar, zzag(zzcxVar, i, j));
            this.zzk.zzl(zzcxVar, i, zzfn.zzo(j));
            zzaq(zzai, 0, 1, true, true, 1, zzad(zzai), zzd2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzb() {
        zzas();
        if (zzx()) {
            return this.zzae.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzc() {
        zzas();
        if (zzx()) {
            return this.zzae.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzd() {
        zzas();
        int zzab = zzab();
        if (zzab == -1) {
            return 0;
        }
        return zzab;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zze() {
        zzas();
        if (this.zzae.zza.zzo()) {
            return 0;
        }
        zzky zzkyVar = this.zzae;
        return zzkyVar.zza.zza(zzkyVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzf() {
        zzas();
        return this.zzae.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzg() {
        zzas();
        return this.zzae.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzh() {
        zzas();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final long zzi() {
        zzas();
        if (zzx()) {
            zzky zzkyVar = this.zzae;
            return zzkyVar.zzk.equals(zzkyVar.zzb) ? zzfn.zzq(this.zzae.zzp) : zzl();
        }
        zzas();
        if (this.zzae.zza.zzo()) {
            return this.zzag;
        }
        zzky zzkyVar2 = this.zzae;
        long j = 0;
        if (zzkyVar2.zzk.zzd != zzkyVar2.zzb.zzd) {
            return zzfn.zzq(zzkyVar2.zza.zze(zzd(), this.zza, 0L).zzn);
        }
        long j2 = zzkyVar2.zzp;
        if (this.zzae.zzk.zzb()) {
            zzky zzkyVar3 = this.zzae;
            zzkyVar3.zza.zzn(zzkyVar3.zzk.zza, this.zzn).zzi(this.zzae.zzk.zzb);
        } else {
            j = j2;
        }
        zzky zzkyVar4 = this.zzae;
        zzaf(zzkyVar4.zza, zzkyVar4.zzk, j);
        return zzfn.zzq(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final long zzj() {
        zzas();
        if (zzx()) {
            zzky zzkyVar = this.zzae;
            zzkyVar.zza.zzn(zzkyVar.zzb.zza, this.zzn);
            zzky zzkyVar2 = this.zzae;
            long j = zzkyVar2.zzc;
            if (j == -9223372036854775807L) {
                long j2 = zzkyVar2.zza.zze(zzd(), this.zza, 0L).zzm;
                return zzfn.zzq(0L);
            }
            return zzfn.zzq(j) + zzfn.zzq(0L);
        }
        return zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final long zzk() {
        zzas();
        return zzfn.zzq(zzad(this.zzae));
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final long zzl() {
        long zzh;
        zzas();
        if (zzx()) {
            zzky zzkyVar = this.zzae;
            zztl zztlVar = zzkyVar.zzb;
            zzkyVar.zza.zzn(zztlVar.zza, this.zzn);
            zzh = this.zzn.zzh(zztlVar.zzb, zztlVar.zzc);
        } else {
            zzcx zzn = zzn();
            if (zzn.zzo()) {
                return -9223372036854775807L;
            }
            zzh = zzn.zze(zzd(), this.zza, 0L).zzn;
        }
        return zzfn.zzq(zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final long zzm() {
        zzas();
        return zzfn.zzq(this.zzae.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcx zzn() {
        zzas();
        return this.zzae.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzdi zzo() {
        zzas();
        return this.zzae.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzp() {
        zzas();
        boolean zzv = zzv();
        int zzb = this.zzy.zzb(zzv, 2);
        zzap(zzv, zzb, zzac(zzv, zzb));
        zzky zzkyVar = this.zzae;
        if (zzkyVar.zze != 1) {
            return;
        }
        zzky zzf = zzkyVar.zzf(null);
        zzky zzg = zzf.zzg(true == zzf.zza.zzo() ? 4 : 2);
        this.zzD++;
        this.zzk.zzk();
        zzaq(zzg, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzq() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfn.zze;
        String zza = zzbr.zza();
        StringBuilder m9460b = C2362x3.m9460b("Release ", hexString, " [AndroidXMedia3/1.0.1] [", str, "] [");
        m9460b.append(zza);
        m9460b.append("]");
        zzer.zzd("ExoPlayerImpl", m9460b.toString());
        zzas();
        if (zzfn.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzeo zzeoVar = this.zzl;
            zzeoVar.zzd(10, new zzel() { // from class: com.google.android.gms.internal.ads.zzim
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj) {
                    ((zzcn) obj).zzl(zzia.zzd(new zzke(1), 1003));
                }
            });
            zzeoVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        zzky zzkyVar = this.zzae;
        if (zzkyVar.zzo) {
            this.zzae = zzkyVar.zzb();
        }
        zzky zzg = this.zzae.zzg(1);
        this.zzae = zzg;
        zzky zzc = zzg.zzc(zzg.zzb);
        this.zzae = zzc;
        zzc.zzp = zzc.zzr;
        this.zzae.zzq = 0L;
        this.zzr.zzQ();
        this.zzi.zzh();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzY = zzdx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzr(boolean z) {
        zzas();
        int zzb = this.zzy.zzb(z, zzf());
        zzap(z, zzb, zzac(z, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzs(@Nullable Surface surface) {
        zzas();
        zzan(surface);
        int i = surface == null ? 0 : -1;
        zzak(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzt(float f) {
        zzas();
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzW == max) {
            return;
        }
        this.zzW = max;
        zzam();
        zzeo zzeoVar = this.zzl;
        zzeoVar.zzd(22, new zzel() { // from class: com.google.android.gms.internal.ads.zzjd
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                float f2 = max;
                int i = zzjt.zzd;
                ((zzcn) obj).zzv(f2);
            }
        });
        zzeoVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzu() {
        zzas();
        this.zzy.zzb(zzv(), 1);
        zzao(null);
        this.zzY = new zzdx(zzfrr.zzl(), this.zzae.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final boolean zzv() {
        zzas();
        return this.zzae.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final boolean zzw() {
        zzas();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final boolean zzx() {
        zzas();
        return this.zzae.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final int zzy() {
        zzas();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzz(zzlv zzlvVar) {
        zzls zzlsVar = this.zzr;
        zzlvVar.getClass();
        zzlsVar.zzw(zzlvVar);
    }
}
