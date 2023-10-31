package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzate {
    protected static final String zza = "zzate";
    private final zzarr zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzate(zzarr zzarrVar, String str, String str2, Class... clsArr) {
        this.zzb = zzarrVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzarrVar.zzk().submit(new zzatd(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzate zzateVar) {
        try {
            zzarr zzarrVar = zzateVar.zzb;
            Class<?> loadClass = zzarrVar.zzi().loadClass(zzateVar.zzc(zzarrVar.zzu(), zzateVar.zzc));
            if (loadClass != null) {
                zzateVar.zze = loadClass.getMethod(zzateVar.zzc(zzateVar.zzb.zzu(), zzateVar.zzd), zzateVar.zzf);
                Method method = zzateVar.zze;
            }
        } catch (zzaqv | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzateVar.zzg.countDown();
            throw th;
        }
        zzateVar.zzg.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzaqv, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
