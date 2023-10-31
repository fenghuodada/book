package com.google.android.gms.internal.ads;

import com.adcolony.sdk.C2362x3;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p060j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfxf {
    private static final Logger zza = Logger.getLogger(zzfxf.class.getName());
    private final ConcurrentMap zzb;

    public zzfxf() {
        this.zzb = new ConcurrentHashMap();
    }

    public zzfxf(zzfxf zzfxfVar) {
        this.zzb = new ConcurrentHashMap(zzfxfVar.zzb);
    }

    private final synchronized zzfxe zze(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzfxe) this.zzb.get(str);
    }

    private final synchronized void zzf(zzfxe zzfxeVar, boolean z) throws GeneralSecurityException {
        String zzc = zzfxeVar.zza().zzc();
        zzfxe zzfxeVar2 = (zzfxe) this.zzb.get(zzc);
        if (zzfxeVar2 != null && !zzfxeVar2.zza.getClass().equals(zzfxeVar.zza.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzc));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzc, zzfxeVar2.zza.getClass().getName(), zzfxeVar.zza.getClass().getName()));
        }
        this.zzb.putIfAbsent(zzc, zzfxeVar);
    }

    public final zzfxc zza(String str, Class cls) throws GeneralSecurityException {
        zzfxe zze = zze(str);
        if (zze.zza.zzl().contains(cls)) {
            try {
                return new zzfxd(zze.zza, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zze.zza.getClass());
        Set<Class> zzl = zze.zza.zzl();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zzl) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder m9460b = C2362x3.m9460b("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
        m9460b.append(sb2);
        throw new GeneralSecurityException(m9460b.toString());
    }

    public final zzfxc zzb(String str) throws GeneralSecurityException {
        return zze(str).zza();
    }

    public final synchronized void zzc(zzgdh zzgdhVar) throws GeneralSecurityException {
        if (!zzgcv.zza(zzgdhVar.zzf())) {
            String valueOf = String.valueOf(zzgdhVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
        zzf(new zzfxe(zzgdhVar), false);
    }

    public final boolean zzd(String str) {
        return this.zzb.containsKey(str);
    }
}
