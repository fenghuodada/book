package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjp implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzzj, zzot, zzvn, zzsl, zzhp, zzhl, zzll, zzib {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjt zza;

    public /* synthetic */ zzjp(zzjt zzjtVar, zzjo zzjoVar) {
        this.zza = zzjtVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzjt.zzT(this.zza, surfaceTexture);
        zzjt.zzR(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzjt.zzU(this.zza, null);
        zzjt.zzR(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzjt.zzR(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        zzjt.zzR(this.zza, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzjt.zzR(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzib
    public final void zza(boolean z) {
        zzjt.zzW(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzb(Exception exc) {
        zzjt.zzI(this.zza).zzy(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzc(String str, long j, long j2) {
        zzjt.zzI(this.zza).zzz(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzd(String str) {
        zzjt.zzI(this.zza).zzA(str);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zze(zzhs zzhsVar) {
        zzjt.zzI(this.zza).zzB(zzhsVar);
        zzjt.zzL(this.zza, null);
        zzjt.zzK(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzf(zzhs zzhsVar) {
        zzjt.zzK(this.zza, zzhsVar);
        zzjt.zzI(this.zza).zzC(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzg(zzam zzamVar, @Nullable zzht zzhtVar) {
        zzjt.zzL(this.zza, zzamVar);
        zzjt.zzI(this.zza).zzD(zzamVar, zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzh(long j) {
        zzjt.zzI(this.zza).zzE(j);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzi(Exception exc) {
        zzjt.zzI(this.zza).zzF(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzj(int i, long j, long j2) {
        zzjt.zzI(this.zza).zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzk(int i, long j) {
        zzjt.zzI(this.zza).zzH(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzl(Object obj, long j) {
        zzjt.zzI(this.zza).zzI(obj, j);
        zzjt zzjtVar = this.zza;
        if (zzjt.zzJ(zzjtVar) == obj) {
            zzeo zzF = zzjt.zzF(zzjtVar);
            zzF.zzd(26, new zzel() { // from class: com.google.android.gms.internal.ads.zzjj
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj2) {
                    zzcn zzcnVar = (zzcn) obj2;
                }
            });
            zzF.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzm(final boolean z) {
        zzjt zzjtVar = this.zza;
        if (zzjt.zzaa(zzjtVar) == z) {
            return;
        }
        zzjt.zzN(zzjtVar, z);
        zzeo zzF = zzjt.zzF(this.zza);
        zzF.zzd(23, new zzel() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzcn) obj).zzq(z);
            }
        });
        zzF.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzn(Exception exc) {
        zzjt.zzI(this.zza).zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzo(String str, long j, long j2) {
        zzjt.zzI(this.zza).zzK(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzp(String str) {
        zzjt.zzI(this.zza).zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzq(zzhs zzhsVar) {
        zzjt.zzI(this.zza).zzM(zzhsVar);
        zzjt.zzP(this.zza, null);
        zzjt.zzO(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzr(zzhs zzhsVar) {
        zzjt.zzO(this.zza, zzhsVar);
        zzjt.zzI(this.zza).zzN(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzs(long j, int i) {
        zzjt.zzI(this.zza).zzO(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzt(zzam zzamVar, @Nullable zzht zzhtVar) {
        zzjt.zzP(this.zza, zzamVar);
        zzjt.zzI(this.zza).zzP(zzamVar, zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzu(final zzdn zzdnVar) {
        zzjt.zzQ(this.zza, zzdnVar);
        zzeo zzF = zzjt.zzF(this.zza);
        zzF.zzd(25, new zzel() { // from class: com.google.android.gms.internal.ads.zzjn
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzcn) obj).zzu(zzdn.this);
            }
        });
        zzF.zzc();
    }
}
