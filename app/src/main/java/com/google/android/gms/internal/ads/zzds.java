package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class zzds implements zzdr {
    protected zzdp zzb;
    protected zzdp zzc;
    private zzdp zzd;
    private zzdp zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzds() {
        ByteBuffer byteBuffer = zzdr.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzdp zzdpVar = zzdp.zza;
        this.zzd = zzdpVar;
        this.zze = zzdpVar;
        this.zzb = zzdpVar;
        this.zzc = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final zzdp zza(zzdp zzdpVar) throws zzdq {
        this.zzd = zzdpVar;
        this.zze = zzi(zzdpVar);
        return zzg() ? this.zze : zzdp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    @CallSuper
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzdr.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzc() {
        this.zzg = zzdr.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzf() {
        zzc();
        this.zzf = zzdr.zza;
        zzdp zzdpVar = zzdp.zza;
        this.zzd = zzdpVar;
        this.zze = zzdpVar;
        this.zzb = zzdpVar;
        this.zzc = zzdpVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public boolean zzg() {
        return this.zze != zzdp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    @CallSuper
    public boolean zzh() {
        return this.zzh && this.zzg == zzdr.zza;
    }

    public zzdp zzi(zzdp zzdpVar) throws zzdq {
        throw null;
    }

    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public void zzk() {
    }

    public void zzl() {
    }

    public void zzm() {
    }

    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
