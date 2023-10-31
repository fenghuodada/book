package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.C0482i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzdhn {
    public static final zzdhn zza = new zzdhn(new zzdhl());
    @Nullable
    private final zzbfr zzb;
    @Nullable
    private final zzbfo zzc;
    @Nullable
    private final zzbge zzd;
    @Nullable
    private final zzbgb zze;
    @Nullable
    private final zzbkz zzf;
    private final C0482i zzg;
    private final C0482i zzh;

    private zzdhn(zzdhl zzdhlVar) {
        this.zzb = zzdhlVar.zza;
        this.zzc = zzdhlVar.zzb;
        this.zzd = zzdhlVar.zzc;
        this.zzg = new C0482i(zzdhlVar.zzf);
        this.zzh = new C0482i(zzdhlVar.zzg);
        this.zze = zzdhlVar.zzd;
        this.zzf = zzdhlVar.zze;
    }

    @Nullable
    public final zzbfo zza() {
        return this.zzc;
    }

    @Nullable
    public final zzbfr zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzbfu zzc(String str) {
        return (zzbfu) this.zzh.getOrDefault(str, null);
    }

    @Nullable
    public final zzbfx zzd(String str) {
        return (zzbfx) this.zzg.getOrDefault(str, null);
    }

    @Nullable
    public final zzbgb zze() {
        return this.zze;
    }

    @Nullable
    public final zzbge zzf() {
        return this.zzd;
    }

    @Nullable
    public final zzbkz zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.f1531c);
        int i = 0;
        while (true) {
            C0482i c0482i = this.zzg;
            if (i < c0482i.f1531c) {
                arrayList.add((String) c0482i.m12398h(i));
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
