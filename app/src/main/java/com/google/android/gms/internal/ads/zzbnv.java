package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes.dex */
public final class zzbnv extends zzbnx {
    private static final zzbpz zza = new zzbpz();

    @Override // com.google.android.gms.internal.ads.zzbny
    public final zzbob zzb(String str) throws RemoteException {
        zzboy zzboyVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbnv.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzboy((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzboy((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                zzbzt.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                zzbzt.zze("Reflection failed, retrying using direct instantiation");
                if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        zzboyVar = new zzboy(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                zzboyVar = new zzboy(new AdMobAdapter());
                return zzboyVar;
            }
        } catch (Throwable th) {
            zzbzt.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final zzbpv zzc(String str) throws RemoteException {
        return new zzbqh((RtbAdapter) Class.forName(str, false, zzbpz.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbnv.class.getClassLoader()));
        } catch (Throwable unused) {
            zzbzt.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final boolean zze(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbnv.class.getClassLoader()));
        } catch (Throwable unused) {
            zzbzt.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
