package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzccu extends zzcbi implements TextureView.SurfaceTextureListener, zzcbs {
    private final zzccc zzc;
    private final zzccd zzd;
    private final zzccb zze;
    private zzcbh zzf;
    private Surface zzg;
    private zzcbt zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcca zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzccu(Context context, zzccd zzccdVar, zzccc zzcccVar, boolean z, boolean z2, zzccb zzccbVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzcccVar;
        this.zzd = zzccdVar;
        this.zzn = z;
        this.zze = zzccbVar;
        setSurfaceTextureListener(this);
        zzccdVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + RemoteSettings.FORWARD_SLASH_STRING + canonicalName + ":" + message;
    }

    private final void zzU() {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            zzcbtVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccp
            @Override // java.lang.Runnable
            public final void run() {
                zzccu.this.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z, @Nullable Integer num) {
        String concat;
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null && !z) {
            zzcbtVar.zzP(num);
        } else if (this.zzi == null || this.zzg == null) {
        } else {
            if (z) {
                if (!zzad()) {
                    concat = "No valid ExoPlayerAdapter exists when switch source.";
                    zzbzt.zzj(concat);
                    return;
                }
                zzcbtVar.zzU();
                zzY();
            }
            if (this.zzi.startsWith("cache:")) {
                zzcdn zzp = this.zzc.zzp(this.zzi);
                if (!(zzp instanceof zzcdw)) {
                    if (zzp instanceof zzcdt) {
                        zzcdt zzcdtVar = (zzcdt) zzp;
                        String zzF = zzF();
                        ByteBuffer zzk = zzcdtVar.zzk();
                        boolean zzl = zzcdtVar.zzl();
                        String zzi = zzcdtVar.zzi();
                        if (zzi == null) {
                            concat = "Stream cache URL is null.";
                        } else {
                            zzcbt zzE = zzE(num);
                            this.zzh = zzE;
                            zzE.zzG(new Uri[]{Uri.parse(zzi)}, zzF, zzk, zzl);
                        }
                    } else {
                        concat = "Stream cache miss: ".concat(String.valueOf(this.zzi));
                    }
                    zzbzt.zzj(concat);
                    return;
                }
                zzcbt zza = ((zzcdw) zzp).zza();
                this.zzh = zza;
                zza.zzP(num);
                if (!this.zzh.zzV()) {
                    concat = "Precached video player has been released.";
                    zzbzt.zzj(concat);
                    return;
                }
            } else {
                this.zzh = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.zzh.zzF(uriArr, zzF2);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                int zzt = this.zzh.zzt();
                this.zzl = zzt;
                if (zzt == 3) {
                    zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            zzcbtVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcbt zzcbtVar = this.zzh;
            if (zzcbtVar != null) {
                zzcbtVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z) {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar == null) {
            zzbzt.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcbtVar.zzS(surface, z);
        } catch (IOException e) {
            zzbzt.zzk("", e);
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzs != f) {
            this.zzs = f;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcbt zzcbtVar = this.zzh;
        return (zzcbtVar == null || !zzcbtVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzs;
        if (f != 0.0f && this.zzm == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcca zzccaVar = this.zzm;
        if (zzccaVar != null) {
            zzccaVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzn) {
            zzcca zzccaVar = new zzcca(getContext());
            this.zzm = zzccaVar;
            zzccaVar.zzd(surfaceTexture, i, i2);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcco
            @Override // java.lang.Runnable
            public final void run() {
                zzccu.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcca zzccaVar = this.zzm;
        if (zzccaVar != null) {
            zzccaVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccs
            @Override // java.lang.Runnable
            public final void run() {
                zzccu.this.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcca zzccaVar = this.zzm;
        if (zzccaVar != null) {
            zzccaVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcci
            @Override // java.lang.Runnable
            public final void run() {
                zzccu.this.zzO(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccr
            @Override // java.lang.Runnable
            public final void run() {
                zzccu.this.zzQ(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzA(int i) {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            zzcbtVar.zzN(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzB(int i) {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            zzcbtVar.zzR(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzC(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        if (str == null) {
            return;
        }
        boolean z = true;
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        if (!this.zze.zzl || str2 == null || str.equals(str2) || this.zzl != 4) {
            z = false;
        }
        this.zzi = str;
        zzW(z, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzD(int i, int i2) {
        this.zzq = i;
        this.zzr = i2;
        zzaa();
    }

    public final zzcbt zzE(@Nullable Integer num) {
        zzceo zzceoVar = new zzceo(this.zzc.getContext(), this.zze, this.zzc, num);
        zzbzt.zzi("ExoPlayerAdapter initialized.");
        return zzceoVar;
    }

    public final String zzF() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzc.getContext(), this.zzc.zzn().zza);
    }

    public final /* synthetic */ void zzG(String str) {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    public final /* synthetic */ void zzK(String str) {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.zzi();
        }
    }

    public final /* synthetic */ void zzO(int i, int i2) {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.zzj(i, i2);
        }
    }

    public final /* synthetic */ void zzP() {
        float zza = this.zzb.zza();
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar == null) {
            zzbzt.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcbtVar.zzT(zza, false);
        } catch (IOException e) {
            zzbzt.zzk("", e);
        }
    }

    public final /* synthetic */ void zzQ(int i) {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.onWindowVisibilityChanged(i);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcbh zzcbhVar = this.zzf;
        if (zzcbhVar != null) {
            zzcbhVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final int zzb() {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            return zzcbtVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final long zzf() {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            return zzcbtVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final long zzg() {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            return zzcbtVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final long zzh() {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            return zzcbtVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzi(final boolean z, final long j) {
        if (this.zzc != null) {
            zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccq
                @Override // java.lang.Runnable
                public final void run() {
                    zzccu.this.zzJ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzk(String str, Exception exc) {
        final String zzT = zzT(str, exc);
        zzbzt.zzj("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcch
            @Override // java.lang.Runnable
            public final void run() {
                zzccu.this.zzG(zzT);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzl(String str, Exception exc) {
        final String zzT = zzT("onLoadException", exc);
        zzbzt.zzj("ExoPlayerAdapter exception: ".concat(zzT));
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcck
            @Override // java.lang.Runnable
            public final void run() {
                zzccu.this.zzK(zzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzm(int i) {
        if (this.zzl != i) {
            this.zzl = i;
            if (i == 3) {
                zzV();
            } else if (i != 4) {
            } else {
                if (this.zze.zza) {
                    zzX();
                }
                this.zzd.zze();
                this.zzb.zzc();
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzccu.this.zzH();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi, com.google.android.gms.internal.ads.zzccf
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccl
            @Override // java.lang.Runnable
            public final void run() {
                zzccu.this.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccm
                @Override // java.lang.Runnable
                public final void run() {
                    zzccu.this.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzh.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccj
            @Override // java.lang.Runnable
            public final void run() {
                zzccu.this.zzS();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzq(int i) {
        if (zzac()) {
            this.zzh.zzI(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzr(zzcbh zzcbhVar) {
        this.zzf = zzcbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzs(@Nullable String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzu(float f, float f2) {
        zzcca zzccaVar = this.zzm;
        if (zzccaVar != null) {
            zzccaVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcct
            @Override // java.lang.Runnable
            public final void run() {
                zzccu.this.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    @Nullable
    public final Integer zzw() {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            return zzcbtVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzx(int i) {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            zzcbtVar.zzJ(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzy(int i) {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            zzcbtVar.zzK(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzz(int i) {
        zzcbt zzcbtVar = this.zzh;
        if (zzcbtVar != null) {
            zzcbtVar.zzM(i);
        }
    }
}
