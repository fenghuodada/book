package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfkg implements zzfiw {
    private final Object zza;
    private final zzfkh zzb;
    private final zzfks zzc;
    private final zzfit zzd;

    public zzfkg(@NonNull Object obj, @NonNull zzfkh zzfkhVar, @NonNull zzfks zzfksVar, @NonNull zzfit zzfitVar) {
        this.zza = obj;
        this.zzb = zzfkhVar;
        this.zzc = zzfksVar;
        this.zzd = zzfitVar;
    }

    @Nullable
    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaox zza = zzaoy.zza();
        zza.zzc(5);
        zza.zza(zzgno.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzaoy) zza.zzal()).zzax(), 11);
    }

    @Nullable
    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfiw
    @Nullable
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfiw
    @Nullable
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfiw
    @Nullable
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfiw
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfkq {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfkq(2005, e);
        }
    }

    public final synchronized int zze() throws zzfkq {
        try {
        } catch (Exception e) {
            throw new zzfkq((int) AdError.INTERNAL_ERROR_2006, e);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    public final zzfkh zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfkq {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(AdError.MEDIATION_ERROR_CODE, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfkq((int) AdError.INTERNAL_ERROR_2003, e);
        }
    }

    public final synchronized boolean zzh() throws zzfkq {
        try {
        } catch (Exception e) {
            throw new zzfkq((int) AdError.INTERNAL_ERROR_CODE, e);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
