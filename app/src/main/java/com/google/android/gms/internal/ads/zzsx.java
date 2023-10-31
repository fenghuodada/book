package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class zzsx {
    private final zzaav zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzfw zze;

    public zzsx(zzaav zzaavVar) {
        this.zza = zzaavVar;
    }

    public final void zza(zzfw zzfwVar) {
        if (zzfwVar != this.zze) {
            this.zze = zzfwVar;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
