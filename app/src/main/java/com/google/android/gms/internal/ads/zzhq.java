package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhq {
    private final AudioManager zza;
    private final zzho zzb;
    @Nullable
    private zzhp zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzhq(Context context, Handler handler, zzhp zzhpVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zzhpVar;
        this.zzb = new zzho(this, handler);
        this.zzd = 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzhq zzhqVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzhqVar.zzg(3);
                return;
            }
            zzhqVar.zzf(0);
            zzhqVar.zzg(2);
        } else if (i == -1) {
            zzhqVar.zzf(-1);
            zzhqVar.zze();
        } else if (i == 1) {
            zzhqVar.zzg(1);
            zzhqVar.zzf(1);
        } else {
            zzer.zze("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzfn.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i) {
        int zzac;
        zzhp zzhpVar = this.zzc;
        if (zzhpVar != null) {
            zzjp zzjpVar = (zzjp) zzhpVar;
            boolean zzv = zzjpVar.zza.zzv();
            zzac = zzjt.zzac(zzv, i);
            zzjpVar.zza.zzap(zzv, i, zzac);
        }
    }

    private final void zzg(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.zze == f) {
            return;
        }
        this.zze = f;
        zzhp zzhpVar = this.zzc;
        if (zzhpVar != null) {
            ((zzjp) zzhpVar).zza.zzam();
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}
