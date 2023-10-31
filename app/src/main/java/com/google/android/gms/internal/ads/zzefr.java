package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzefr {
    @Nullable
    private zzefk zza;

    public zzefr() {
    }

    private zzefr(zzefk zzefkVar) {
        this.zza = zzefkVar;
    }

    public static zzefr zzb(zzefk zzefkVar) {
        return new zzefr(zzefkVar);
    }

    public final zzefk zza(Clock clock, zzefl zzeflVar, zzeca zzecaVar, zzfgj zzfgjVar) {
        zzefk zzefkVar = this.zza;
        return zzefkVar != null ? zzefkVar : new zzefk(clock, zzeflVar, zzecaVar, zzfgjVar);
    }
}
