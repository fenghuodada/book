package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import p060j$.util.concurrent.ConcurrentHashMap;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbxy {
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    @Nullable
    private String zzd = null;
    @Nullable
    private String zze = null;
    @VisibleForTesting
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zzf = new AtomicInteger(-1);
    private final AtomicReference zzg = new AtomicReference(null);
    private final AtomicReference zzh = new AtomicReference(null);
    private final ConcurrentMap zzi = new ConcurrentHashMap(9);
    private final AtomicReference zzj = new AtomicReference(null);
    private final BlockingQueue zzk = new ArrayBlockingQueue(20);
    private final Object zzl = new Object();

    private final void zzA(Context context, String str, String str2) {
        if (zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            Method method = (Method) this.zzi.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.zzi.put(str2, method);
                } catch (Exception unused) {
                    zzC(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), str);
                com.google.android.gms.ads.internal.util.zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                zzC(str2, false);
            }
        }
    }

    private final void zzB(Context context, final String str, String str2, @Nullable Bundle bundle) {
        if (zzu(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                zzbzt.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzv(context)) {
                zzD("logEventInternal", new zzbxx() { // from class: com.google.android.gms.internal.ads.zzbxk
                    @Override // com.google.android.gms.internal.ads.zzbxx
                    public final void zza(zzcgs zzcgsVar) {
                        zzcgsVar.zzo("am", str, bundle2);
                    }
                });
            } else if (zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
                Method method = (Method) this.zzi.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzi.put("logEventInternal", method);
                    } catch (Exception unused) {
                        zzC("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzg.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzC("logEventInternal", true);
                }
            }
        }
    }

    private final void zzC(String str, boolean z) {
        if (this.zza.get()) {
            return;
        }
        zzbzt.zzj("Invoke Firebase method " + str + " error.");
        if (z) {
            zzbzt.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zza.set(true);
        }
    }

    private final void zzD(final String str, final zzbxx zzbxxVar) {
        synchronized (this.zzj) {
            FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxl
                @Override // java.lang.Runnable
                public final void run() {
                    zzbxy.this.zzj(zzbxxVar, str);
                }
            }, null);
            if (this.zzj.get() != null) {
                futureTask.run();
            } else {
                this.zzk.offer(futureTask);
            }
        }
    }

    private final boolean zzE(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                zzbxh.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                zzC("getInstance", z);
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    public static final boolean zzv(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzai)).booleanValue()) {
            if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaj)).intValue()) {
                return false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzak)).booleanValue()) {
                try {
                    context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    return false;
                } catch (ClassNotFoundException unused) {
                }
            }
            return true;
        }
        return false;
    }

    private final Object zzw(String str, @Nullable Object obj, zzbxw zzbxwVar) {
        synchronized (this.zzj) {
            if (((zzcgs) this.zzj.get()) != null) {
                try {
                    return zzbxwVar.zza((zzcgs) this.zzj.get());
                } catch (Exception unused) {
                    zzC(str, false);
                }
            }
            return obj;
        }
    }

    @Nullable
    private final Object zzx(String str, Context context) {
        if (zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            try {
                return zzy(context, str).invoke(this.zzg.get(), new Object[0]);
            } catch (Exception unused) {
                zzC(str, true);
                return null;
            }
        }
        return null;
    }

    @Nullable
    private final Method zzy(Context context, String str) {
        Method method = (Method) this.zzi.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzi.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzC(str, false);
            return null;
        }
    }

    private final ExecutorService zzz() {
        ExecutorService threadPoolExecutor;
        if (this.zzb.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzflu.zza().zzc(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzah)).intValue(), new zzbxv(this), 2);
            } else {
                zzbbc zzbbcVar = zzbbk.zzah;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbxv(this));
            }
            zzbxh.zza(this.zzb, null, threadPoolExecutor);
        }
        return (ExecutorService) this.zzb.get();
    }

    @Nullable
    public final String zza(Context context) {
        if (zzu(context)) {
            if (zzv(context)) {
                Long l = (Long) zzw("getAdEventId", null, new zzbxw() { // from class: com.google.android.gms.internal.ads.zzbxm
                    @Override // com.google.android.gms.internal.ads.zzbxw
                    public final Object zza(zzcgs zzcgsVar) {
                        return Long.valueOf(zzcgsVar.zzc());
                    }
                });
                if (l != null) {
                    return Long.toString(l.longValue());
                }
                return null;
            }
            Object zzx = zzx("generateEventId", context);
            if (zzx != null) {
                return zzx.toString();
            }
            return null;
        }
        return null;
    }

    @Nullable
    public final String zzb(Context context) {
        if (zzu(context)) {
            synchronized (this.zzc) {
                String str = this.zze;
                if (str != null) {
                    return str;
                }
                this.zze = zzv(context) ? (String) zzw("getAppIdOrigin", this.zze, new zzbxw() { // from class: com.google.android.gms.internal.ads.zzbxq
                    @Override // com.google.android.gms.internal.ads.zzbxw
                    public final Object zza(zzcgs zzcgsVar) {
                        return zzcgsVar.zze();
                    }
                }) : "fa";
                return this.zze;
            }
        }
        return null;
    }

    @Nullable
    public final String zzc(final Context context) {
        if (zzu(context)) {
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzag)).longValue();
            if (zzv(context)) {
                try {
                    return longValue < 0 ? (String) zzw("getAppInstanceId", null, zzbxr.zza) : (String) zzz().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbxs
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzbxy.this.zzf();
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    return "TIME_OUT";
                } catch (Exception unused2) {
                    return null;
                }
            } else if (longValue < 0) {
                return (String) zzx("getAppInstanceId", context);
            } else {
                try {
                    return (String) zzz().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbxt
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzbxy.this.zzg(context);
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused3) {
                    return "TIME_OUT";
                } catch (Exception unused4) {
                    return null;
                }
            }
        }
        return null;
    }

    public final String zzd(Context context) {
        if (zzu(context)) {
            if (zzv(context)) {
                return (String) zzw("getCurrentScreenNameOrScreenClass", "", new zzbxw() { // from class: com.google.android.gms.internal.ads.zzbxn
                    @Override // com.google.android.gms.internal.ads.zzbxw
                    public final Object zza(zzcgs zzcgsVar) {
                        String zzh = zzcgsVar.zzh();
                        return (zzh == null && (zzh = zzcgsVar.zzg()) == null) ? "" : zzh;
                    }
                });
            }
            if (zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
                try {
                    String str = (String) zzy(context, "getCurrentScreenName").invoke(this.zzg.get(), new Object[0]);
                    if (str == null) {
                        str = (String) zzy(context, "getCurrentScreenClass").invoke(this.zzg.get(), new Object[0]);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    zzC("getCurrentScreenName", false);
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    @Nullable
    public final String zze(Context context) {
        if (zzu(context)) {
            synchronized (this.zzc) {
                String str = this.zzd;
                if (str != null) {
                    return str;
                }
                this.zzd = zzv(context) ? (String) zzw("getGmpAppId", this.zzd, new zzbxw() { // from class: com.google.android.gms.internal.ads.zzbxj
                    @Override // com.google.android.gms.internal.ads.zzbxw
                    public final Object zza(zzcgs zzcgsVar) {
                        return zzcgsVar.zzi();
                    }
                }) : (String) zzx("getGmpAppId", context);
                return this.zzd;
            }
        }
        return null;
    }

    public final /* synthetic */ String zzf() throws Exception {
        return (String) zzw("getAppInstanceId", null, zzbxr.zza);
    }

    public final /* synthetic */ String zzg(Context context) throws Exception {
        return (String) zzx("getAppInstanceId", context);
    }

    public final void zzh(Context context, final String str) {
        if (zzu(context)) {
            if (zzv(context)) {
                zzD("beginAdUnitExposure", new zzbxx() { // from class: com.google.android.gms.internal.ads.zzbxi
                    @Override // com.google.android.gms.internal.ads.zzbxx
                    public final void zza(zzcgs zzcgsVar) {
                        zzcgsVar.zzl(str);
                    }
                });
            } else {
                zzA(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zzi(Context context, final String str) {
        if (zzu(context)) {
            if (zzv(context)) {
                zzD("endAdUnitExposure", new zzbxx() { // from class: com.google.android.gms.internal.ads.zzbxp
                    @Override // com.google.android.gms.internal.ads.zzbxx
                    public final void zza(zzcgs zzcgsVar) {
                        zzcgsVar.zzn(str);
                    }
                });
            } else {
                zzA(context, str, "endAdUnitExposure");
            }
        }
    }

    public final /* synthetic */ void zzj(zzbxx zzbxxVar, String str) {
        if (((zzcgs) this.zzj.get()) != null) {
            try {
                zzbxxVar.zza((zzcgs) this.zzj.get());
            } catch (Exception unused) {
                zzC(str, false);
            }
        }
    }

    public final void zzk(Context context, String str) {
        zzB(context, "_aa", str, null);
    }

    public final void zzl(Context context, String str) {
        zzB(context, "_aq", str, null);
    }

    public final void zzm(Context context, String str) {
        zzB(context, "_ac", str, null);
    }

    public final void zzn(Context context, String str) {
        zzB(context, "_ai", str, null);
    }

    public final void zzo(Context context, String str, String str2, String str3, int i) {
        if (zzu(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzB(context, "_ar", str, bundle);
            com.google.android.gms.ads.internal.util.zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void zzp(Context context, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzan)).booleanValue() && zzu(context) && zzv(context)) {
            synchronized (this.zzl) {
            }
        }
    }

    public final void zzq(Context context, com.google.android.gms.ads.internal.client.zzff zzffVar) {
        zzbxz.zzd(context).zzb().zzd(zzffVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzan)).booleanValue() && zzu(context) && zzv(context)) {
            synchronized (this.zzl) {
            }
        }
    }

    public final void zzr(final Bundle bundle) {
        zzD("setConsent", new zzbxx() { // from class: com.google.android.gms.internal.ads.zzbxu
            @Override // com.google.android.gms.internal.ads.zzbxx
            public final void zza(zzcgs zzcgsVar) {
                zzcgsVar.zzr(bundle);
            }
        });
    }

    @Deprecated
    public final void zzs(final Context context, final String str) {
        if (zzu(context) && (context instanceof Activity)) {
            if (zzv(context)) {
                zzD("setScreenName", new zzbxx() { // from class: com.google.android.gms.internal.ads.zzbxo
                    @Override // com.google.android.gms.internal.ads.zzbxx
                    public final void zza(zzcgs zzcgsVar) {
                        Context context2 = context;
                        zzcgsVar.zzs(ObjectWrapper.wrap(context2), str, context2.getPackageName());
                    }
                });
            } else if (zzE(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzh, false)) {
                Method method = (Method) this.zzi.get("setCurrentScreen");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.zzi.put("setCurrentScreen", method);
                    } catch (Exception unused) {
                        zzC("setCurrentScreen", false);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzh.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    zzC("setCurrentScreen", false);
                }
            }
        }
    }

    public final boolean zzt() {
        synchronized (this.zzl) {
        }
        return false;
    }

    public final boolean zzu(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzab)).booleanValue() && !this.zza.get()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzal)).booleanValue()) {
                return true;
            }
            if (this.zzf.get() == -1) {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (!zzbzm.zzs(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    if (zzbzm.zzt(context)) {
                        zzbzt.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzf.set(0);
                    }
                }
                this.zzf.set(1);
            }
            if (this.zzf.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
