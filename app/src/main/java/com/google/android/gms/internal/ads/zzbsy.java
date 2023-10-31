package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.concurrent.futures.C0485b;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.vungle.warren.VungleApiClient;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbsy implements zzbta {
    @VisibleForTesting
    static zzbta zza;
    @VisibleForTesting
    static zzbta zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzbzz zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    public zzbsy(Context context, zzbzz zzbzzVar) {
        zzflu.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzbzzVar;
    }

    public static zzbta zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbdm.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzho)).booleanValue()) {
                        zza = new zzbsy(context, zzbzz.zza());
                    }
                }
                zza = new zzbsz();
            }
        }
        return zza;
    }

    public static zzbta zzb(Context context, zzbzz zzbzzVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbdm.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzho)).booleanValue()) {
                        zzbsy zzbsyVar = new zzbsy(context, zzbzzVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbsyVar.zzd) {
                                zzbsyVar.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbsx(zzbsyVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbsw(zzbsyVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbsyVar;
                    }
                }
                zzb = new zzbsz();
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzfpo.zzc(zzbzm.zzf(zzc(th)));
    }

    public final void zze(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzbzm.zzo(stackTraceElement.getClassName());
                    z2 |= zzbsy.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            zzg(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final void zzg(Throwable th, String str, float f) {
        Throwable th2;
        Throwable th3;
        String str2;
        int i;
        String str3;
        String str4;
        Handler handler = zzbzm.zza;
        boolean z = false;
        if (((Boolean) zzbdm.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                linkedList.push(th4);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th5 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th5.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzbzm.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                        }
                        arrayList.add(stackTraceElement);
                    }
                }
                if (z2) {
                    if (th2 == null) {
                        th3 = new Throwable(th5.getMessage());
                    } else {
                        th3 = new Throwable(th5.getMessage(), th2);
                    }
                    th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    th2 = th3;
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String zzc2 = zzc(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzim)).booleanValue()) {
            str2 = zzd(th);
        } else {
            str2 = "";
        }
        double d = f;
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        double random = Math.random();
        if (i2 > 0) {
            i = (int) (1.0f / f);
        } else {
            i = 1;
        }
        if (random < d) {
            ArrayList arrayList2 = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th6) {
                zzbzt.zzh("Error fetching instant app info", th6);
            }
            try {
                str3 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzbzt.zzj("Cannot obtain package name, proceeding.");
                str3 = VungleApiClient.ConnectionTypeDetail.UNKNOWN;
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(FacebookAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str5 = Build.MANUFACTURER;
            String str6 = Build.MODEL;
            if (!str6.startsWith(str5)) {
                str6 = C0485b.m12391a(str5, " ", str6);
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzh.zza).appendQueryParameter(VungleMediationAdapter.KEY_APP_ID, str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzc2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "533571732").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbdm.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze)));
            if (true != this.zzh.zze) {
                str4 = "0";
            } else {
                str4 = "1";
            }
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("lite", str4);
            if (!TextUtils.isEmpty(str2)) {
                appendQueryParameter3.appendQueryParameter("hash", str2);
            }
            arrayList2.add(appendQueryParameter3.toString());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                final String str7 = (String) it.next();
                final zzbzy zzbzyVar = new zzbzy(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbzy.this.zza(str7);
                    }
                });
            }
        }
    }
}
