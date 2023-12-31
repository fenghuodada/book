package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.C0470b;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzic implements zzhk {
    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map zza = new C0470b();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    @Nullable
    public static zzic zza(Context context, String str, Runnable runnable) {
        zzic zzicVar;
        if (zzhb.zzb()) {
            throw null;
        }
        synchronized (zzic.class) {
            zzicVar = (zzic) zza.get(null);
            if (zzicVar == null) {
                StrictMode.allowThreadDiskReads();
                throw null;
            }
        }
        return zzicVar;
    }

    public static synchronized void zzc() {
        synchronized (zzic.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((zzic) it.next()).zzb;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    @Nullable
    public final Object zzb(String str) {
        throw null;
    }
}
