package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzftc extends zzfrr {
    final /* synthetic */ zzftd zza;

    public zzftc(zzftd zzftdVar) {
        this.zza = zzftdVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzfoz.zza(i, i2, FirebaseAnalytics.Param.INDEX);
        zzftd zzftdVar = this.zza;
        objArr = zzftdVar.zzb;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzftdVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final boolean zzf() {
        return true;
    }
}
