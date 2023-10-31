package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzfat {
    @GuardedBy("LiteSdkInfoRetriever.class")
    private static zzfat zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    @VisibleForTesting
    public zzfat(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    @VisibleForTesting
    public static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zzbzt.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfat zzd(Context context) {
        synchronized (zzfat.class) {
            zzfat zzfatVar = zza;
            if (zzfatVar != null) {
                return zzfatVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbdg.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVar = null;
            if (longValue > 0 && longValue <= 231710100) {
                zzclVar = zza(applicationContext);
            }
            zzfat zzfatVar2 = new zzfat(applicationContext, zzclVar);
            zza = zzfatVar2;
            return zzfatVar2;
        }
    }

    public final zzbny zzb() {
        return (zzbny) this.zzd.get();
    }

    public final zzbzz zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        zzbzz zzbzzVar = new zzbzz(231700000, i2, true, zzA);
        if (((Boolean) zzbdg.zzc.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
            com.google.android.gms.ads.internal.client.zzen zzenVar = null;
            if (zzclVar != null) {
                try {
                    zzenVar = zzclVar.getLiteSdkVersion();
                } catch (RemoteException unused) {
                }
            }
            return zzenVar == null ? zzbzzVar : new zzbzz(231700000, zzenVar.zza(), true, zzA);
        }
        return zzbzzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.internal.ads.zzbny r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbcp r0 = com.google.android.gms.internal.ads.zzbdg.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.client.zzcl r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.google.android.gms.internal.ads.zzbny r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L1e
            r4 = r0
        L1e:
            com.google.android.gms.internal.ads.zzfas.zza(r2, r1, r4)
            return
        L22:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfas.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfat.zze(com.google.android.gms.internal.ads.zzbny):void");
    }
}
