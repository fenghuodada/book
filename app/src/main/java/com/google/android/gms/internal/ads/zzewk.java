package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzewk {
    public static void zza(AtomicReference atomicReference, zzewj zzewjVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzewjVar.zza(obj);
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzbzt.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
