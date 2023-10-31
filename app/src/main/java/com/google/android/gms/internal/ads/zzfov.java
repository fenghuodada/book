package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class zzfov implements Serializable {
    public static zzfov zzc() {
        return zzfod.zza;
    }

    public static zzfov zzd(@CheckForNull Object obj) {
        return obj == null ? zzfod.zza : new zzfpe(obj);
    }

    public abstract zzfov zza(zzfon zzfonVar);

    public abstract Object zzb(Object obj);
}
