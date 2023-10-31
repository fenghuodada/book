package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbyc implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbyd zza;
    private final String zzb;

    public zzbyc(zzbyd zzbydVar, String str) {
        this.zza = zzbydVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbyb> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzbyb zzbybVar : list) {
                zzbybVar.zza.zzb(zzbybVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
