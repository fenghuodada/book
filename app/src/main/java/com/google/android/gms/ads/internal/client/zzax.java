package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzax {
    @Nullable
    private static final zzce zza;

    static {
        zzce zzceVar = null;
        try {
            Object newInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzceVar = queryLocalInterface instanceof zzce ? (zzce) queryLocalInterface : new zzcc(iBinder);
                }
            } else {
                zzbzt.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            zzbzt.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzceVar;
    }

    @Nullable
    private final Object zze() {
        zzce zzceVar = zza;
        if (zzceVar == null) {
            zzbzt.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzb(zzceVar);
        } catch (RemoteException e) {
            zzbzt.zzk("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    @Nullable
    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e) {
            zzbzt.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    @NonNull
    public abstract Object zza();

    @Nullable
    public abstract Object zzb(zzce zzceVar) throws RemoteException;

    @Nullable
    public abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context, boolean z) {
        boolean z2;
        Object zze;
        if (!z) {
            zzay.zzb();
            if (!zzbzm.zzs(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzbzt.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
        zzbbk.zza(context);
        if (((Boolean) zzbcy.zza.zze()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) zzbcy.zzb.zze()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        if (z3) {
            zze = zze();
            if (zze == null && !z2) {
                zze = zzf();
            }
        } else {
            Object zzf = zzf();
            if (zzf == null) {
                if (zzay.zze().nextInt(((Long) zzbdm.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
                }
            }
            zze = zzf == null ? zze() : zzf;
        }
        return zze == null ? zza() : zze;
    }
}
