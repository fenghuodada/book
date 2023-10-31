package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class zzfsp extends zzfst {
    final /* synthetic */ Comparator zza;

    public zzfsp(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfst
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
