package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzfpo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzej {
    private static zzej zza;
    private zzco zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();
    @Nullable
    private OnAdInspectorClosedListener zzh = null;
    @NonNull
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzej() {
    }

    private final void zzA(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzco) new zzaq(zzay.zza(), context).zzd(context, false);
        }
    }

    private final void zzB(@NonNull RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            zzbzt.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (zza == null) {
                zza = new zzej();
            }
            zzejVar = zza;
        }
        return zzejVar;
    }

    public static InitializationStatus zzy(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbke zzbkeVar = (zzbke) it.next();
            hashMap.put(zzbkeVar.zza, new zzbkm(zzbkeVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbkeVar.zzd, zzbkeVar.zzc));
        }
        return new zzbkn(hashMap);
    }

    private final void zzz(Context context, @Nullable String str) {
        try {
            zzbnr.zza().zzb(context, null);
            this.zzg.zzk();
            this.zzg.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzbzt.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            float f = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                f = zzcoVar.zze();
            } catch (RemoteException e) {
                zzbzt.zzh("Unable to get app volume.", e);
            }
            return f;
        }
    }

    @NonNull
    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        InitializationStatus zzy;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                zzy = zzy(this.zzg.zzg());
            } catch (RemoteException unused) {
                zzbzt.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        zzej zzejVar = zzej.this;
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzee(zzejVar));
                        return hashMap;
                    }
                };
            }
        }
        return zzy;
    }

    public final String zzh() {
        String zzc;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc = zzfpo.zzc(this.zzg.zzf());
            } catch (RemoteException e) {
                zzbzt.zzh("Unable to get internal version.", e);
                return "";
            }
        }
        return zzc;
    }

    public final void zzl(Context context) {
        synchronized (this.zzf) {
            zzA(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                zzbzt.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.zzg.zzj(z);
            } catch (RemoteException e) {
                String str = z ? "enable" : "disable";
                zzbzt.zzh("Unable to " + str + " Same App Key.", e);
                if (e.getMessage() != null && e.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    public final void zzn(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzb) {
            if (this.zzd) {
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
            } else if (this.zze) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
            } else {
                this.zzd = true;
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.zzf) {
                    try {
                        zzA(context);
                        this.zzg.zzs(new zzei(this, null));
                        this.zzg.zzo(new zzbnv());
                        if (this.zzi.getTagForChildDirectedTreatment() != -1 || this.zzi.getTagForUnderAgeOfConsent() != -1) {
                            zzB(this.zzi);
                        }
                    } catch (RemoteException e) {
                        zzbzt.zzk("MobileAdsSettingManager initialization failed", e);
                    }
                    zzbbk.zza(context);
                    if (((Boolean) zzbdb.zza.zze()).booleanValue()) {
                        if (((Boolean) zzba.zzc().zzb(zzbbk.zzjF)).booleanValue()) {
                            zzbzt.zze("Initializing on bg thread");
                            zzbzi.zza.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzec
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzej.this.zzo(this.zzb, null);
                                }
                            });
                        }
                    }
                    if (((Boolean) zzbdb.zzb.zze()).booleanValue()) {
                        if (((Boolean) zzba.zzc().zzb(zzbbk.zzjF)).booleanValue()) {
                            zzbzi.zzb.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzed
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzej.this.zzp(this.zzb, null);
                                }
                            });
                        }
                    }
                    zzbzt.zze("Initializing on calling thread");
                    zzz(context, null);
                }
            }
        }
    }

    public final /* synthetic */ void zzo(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final /* synthetic */ void zzp(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final void zzq(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzA(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzm(new zzeg(null));
            } catch (RemoteException unused) {
                zzbzt.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzr(Context context, String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzbzt.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzs(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzbzt.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzt(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzp(z);
            } catch (RemoteException e) {
                zzbzt.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzu(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzq(f);
            } catch (RemoteException e) {
                zzbzt.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzv(String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzg.zzt(str);
            } catch (RemoteException e) {
                zzbzt.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzw(@NonNull RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            RequestConfiguration requestConfiguration2 = this.zzi;
            this.zzi = requestConfiguration;
            if (this.zzg == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzB(requestConfiguration);
            }
        }
    }

    public final boolean zzx() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            boolean z = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                z = zzcoVar.zzv();
            } catch (RemoteException e) {
                zzbzt.zzh("Unable to get app mute state.", e);
            }
            return z;
        }
    }
}
