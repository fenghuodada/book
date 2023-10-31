package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzeb {
    private final zzdz zza;
    private boolean zzb;

    public zzeb() {
        throw null;
    }

    public zzeb(zzdz zzdzVar) {
        this.zza = zzdzVar;
    }

    public final synchronized void zza() throws InterruptedException {
        while (!this.zzb) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z = false;
        while (!this.zzb) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z;
        z = this.zzb;
        this.zzb = false;
        return z;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        if (this.zzb) {
            return false;
        }
        this.zzb = true;
        notifyAll();
        return true;
    }
}
