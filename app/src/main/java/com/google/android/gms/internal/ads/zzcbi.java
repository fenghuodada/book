package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class zzcbi extends TextureView implements zzccf {
    protected final zzcbw zza;
    protected final zzccg zzb;

    public zzcbi(Context context) {
        super(context);
        this.zza = new zzcbw();
        this.zzb = new zzccg(context, this);
    }

    public void zzA(int i) {
    }

    public void zzB(int i) {
    }

    public void zzC(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        zzs(str);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int i);

    public abstract void zzr(zzcbh zzcbhVar);

    public abstract void zzs(@Nullable String str);

    public abstract void zzt();

    public abstract void zzu(float f, float f2);

    @Nullable
    public Integer zzw() {
        return null;
    }

    public void zzx(int i) {
    }

    public void zzy(int i) {
    }

    public void zzz(int i) {
    }
}
