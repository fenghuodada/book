package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzfyd {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzfyd.class.getName());
    private static final AtomicReference zzc = new AtomicReference(new zzfxf());
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzfyd() {
    }

    public static synchronized zzgju zza(zzgjz zzgjzVar) throws GeneralSecurityException {
        zzgju zza2;
        synchronized (zzfyd.class) {
            zzfxc zzb2 = ((zzfxf) zzc.get()).zzb(zzgjzVar.zzg());
            if (!((Boolean) zze.get(zzgjzVar.zzg())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgjzVar.zzg())));
            }
            zza2 = zzb2.zza(zzgjzVar.zzf());
        }
        return zza2;
    }

    @Nullable
    public static Class zzb(Class cls) {
        try {
            return zzgdr.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzc(String str, zzgno zzgnoVar, Class cls) throws GeneralSecurityException {
        return ((zzfxf) zzc.get()).zza(str, cls).zzb(zzgnoVar);
    }

    public static synchronized Map zzd() {
        Map unmodifiableMap;
        synchronized (zzfyd.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zzgqg] */
    public static synchronized void zze(zzgdh zzgdhVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfyd.class) {
            AtomicReference atomicReference = zzc;
            zzfxf zzfxfVar = new zzfxf((zzfxf) atomicReference.get());
            zzfxfVar.zzc(zzgdhVar);
            Map zzc2 = zzgdhVar.zza().zzc();
            String zzd2 = zzgdhVar.zzd();
            zzg(zzd2, zzc2, true);
            if (!((zzfxf) atomicReference.get()).zzd(zzd2)) {
                zzd.put(zzd2, new zzfyc(zzgdhVar));
                for (Map.Entry entry : zzgdhVar.zza().zzc().entrySet()) {
                    zzg.put((String) entry.getKey(), zzfxh.zzb(zzd2, ((zzgdf) entry.getValue()).zza.zzax(), ((zzgdf) entry.getValue()).zzb));
                }
            }
            zze.put(zzd2, Boolean.TRUE);
            zzc.set(zzfxfVar);
        }
    }

    public static synchronized void zzf(zzfyb zzfybVar) throws GeneralSecurityException {
        synchronized (zzfyd.class) {
            zzgdr.zza().zzf(zzfybVar);
        }
    }

    private static synchronized void zzg(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzfyd.class) {
            ConcurrentMap concurrentMap = zze;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((zzfxf) zzc.get()).zzd(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!zzg.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (zzg.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                    }
                }
            }
        }
    }
}
