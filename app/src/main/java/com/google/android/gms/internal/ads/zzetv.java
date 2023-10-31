package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzetv implements zzgvo {
    public static zzeqt zza(Context context, zzbyq zzbyqVar, zzbyr zzbyrVar, Object obj, zzerl zzerlVar, zzetb zzetbVar, zzgvi zzgviVar, zzgvi zzgviVar2, zzgvi zzgviVar3, zzgvi zzgviVar4, zzgvi zzgviVar5, zzgvi zzgviVar6, zzgvi zzgviVar7, zzgvi zzgviVar8, zzgvi zzgviVar9, Executor executor, zzffq zzffqVar, zzdqc zzdqcVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzesu) obj);
        hashSet.add(zzerlVar);
        hashSet.add(zzetbVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfv)).booleanValue()) {
            hashSet.add((zzeqq) zzgviVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfw)).booleanValue()) {
            hashSet.add((zzeqq) zzgviVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfx)).booleanValue()) {
            hashSet.add((zzeqq) zzgviVar3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfy)).booleanValue()) {
            hashSet.add((zzeqq) zzgviVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfC)).booleanValue()) {
            hashSet.add((zzeqq) zzgviVar6.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfD)).booleanValue()) {
            hashSet.add((zzeqq) zzgviVar7.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcA)).booleanValue()) {
            hashSet.add((zzeqq) zzgviVar9.zzb());
        }
        return new zzeqt(context, executor, hashSet, zzffqVar, zzdqcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
