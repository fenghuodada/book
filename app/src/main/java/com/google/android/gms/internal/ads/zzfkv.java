package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class zzfkv {
    @VisibleForTesting
    final zzfky zza;
    @VisibleForTesting
    final boolean zzb;

    private zzfkv(zzfky zzfkyVar) {
        this.zza = zzfkyVar;
        this.zzb = zzfkyVar != null;
    }

    public static zzfkv zzb(Context context, String str, String str2) {
        zzfky zzfkwVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfkwVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfkwVar = queryLocalInterface instanceof zzfky ? (zzfky) queryLocalInterface : new zzfkw(instantiate);
                    }
                    zzfkwVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfkv(zzfkwVar);
                } catch (RemoteException | zzfjx | NullPointerException | SecurityException unused) {
                    Log.d("GASS", "Cannot dynamite load clearcut");
                    return new zzfkv(new zzfkz());
                }
            } catch (Exception e) {
                throw new zzfjx(e);
            }
        } catch (Exception e2) {
            throw new zzfjx(e2);
        }
    }

    public static zzfkv zzc() {
        zzfkz zzfkzVar = new zzfkz();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfkv(zzfkzVar);
    }

    public final zzfku zza(byte[] bArr) {
        return new zzfku(this, bArr, null);
    }
}
