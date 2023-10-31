package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzfhx {
    private final zzfhf zza;
    private final ArrayList zzb;

    public zzfhx(zzfhf zzfhfVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfhfVar;
        arrayList.add(str);
    }

    public final zzfhf zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
