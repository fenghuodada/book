package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.CheckForNull;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzehx {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdnx zzb;

    public zzehx(zzdnx zzdnxVar) {
        this.zzb = zzdnxVar;
    }

    @CheckForNull
    public final zzbpv zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbpv) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            zzbzt.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
