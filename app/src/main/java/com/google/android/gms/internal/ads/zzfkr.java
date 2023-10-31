package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzfkr {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfks zzc;
    private final zzfit zzd;
    private final zzfio zze;
    @Nullable
    private zzfkg zzf;
    private final Object zzg = new Object();

    public zzfkr(@NonNull Context context, @NonNull zzfks zzfksVar, @NonNull zzfit zzfitVar, @NonNull zzfio zzfioVar) {
        this.zzb = context;
        this.zzc = zzfksVar;
        this.zzd = zzfitVar;
        this.zze = zzfioVar;
    }

    private final synchronized Class zzd(@NonNull zzfkh zzfkhVar) throws zzfkq {
        String zzk = zzfkhVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfkhVar.zzc())) {
                throw new zzfkq(2026, "VM did not pass signature verification");
            }
            try {
                File zzb = zzfkhVar.zzb();
                if (!zzb.exists()) {
                    zzb.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(zzfkhVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfkq((int) AdError.REMOTE_ADS_SERVICE_ERROR, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfkq(2026, e2);
        }
    }

    @Nullable
    public final zzfiw zza() {
        zzfkg zzfkgVar;
        synchronized (this.zzg) {
            zzfkgVar = this.zzf;
        }
        return zzfkgVar;
    }

    @Nullable
    public final zzfkh zzb() {
        synchronized (this.zzg) {
            zzfkg zzfkgVar = this.zzf;
            if (zzfkgVar != null) {
                return zzfkgVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(@NonNull zzfkh zzfkhVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfkg zzfkgVar = new zzfkg(zzd(zzfkhVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfkhVar.zze(), null, new Bundle(), 2), zzfkhVar, this.zzc, this.zzd);
                if (zzfkgVar.zzh()) {
                    int zze = zzfkgVar.zze();
                    if (zze != 0) {
                        throw new zzfkq(4001, "ci: " + zze);
                    }
                    synchronized (this.zzg) {
                        zzfkg zzfkgVar2 = this.zzf;
                        if (zzfkgVar2 != null) {
                            try {
                                zzfkgVar2.zzg();
                            } catch (zzfkq e) {
                                this.zzd.zzc(e.zza(), -1L, e);
                            }
                        }
                        this.zzf = zzfkgVar;
                    }
                    this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfkq(4000, "init failed");
            } catch (Exception e2) {
                throw new zzfkq((int) AdError.INTERNAL_ERROR_2004, e2);
            }
        } catch (zzfkq e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
