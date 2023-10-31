package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.support.customtabs.InterfaceC0003b;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.AbstractServiceConnectionC0460c;
import androidx.browser.customtabs.BinderC0458a;
import androidx.browser.customtabs.C0459b;
import androidx.browser.customtabs.C0462d;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbcl {
    @Nullable
    private C0462d zza;
    @Nullable
    private C0459b zzb;
    @Nullable
    private AbstractServiceConnectionC0460c zzc;
    @Nullable
    private zzbcj zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzgwc.zza(context));
                }
            }
        }
        return false;
    }

    @Nullable
    public final C0462d zza() {
        C0462d c0462d;
        C0459b c0459b = this.zzb;
        if (c0459b != null) {
            if (this.zza == null) {
                BinderC0458a binderC0458a = new BinderC0458a();
                InterfaceC0003b interfaceC0003b = c0459b.f1460a;
                if (interfaceC0003b.mo13076b(binderC0458a)) {
                    c0462d = new C0462d(interfaceC0003b, binderC0458a, c0459b.f1461b);
                    this.zza = c0462d;
                }
            }
            return this.zza;
        }
        c0462d = null;
        this.zza = c0462d;
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb != null || (zza = zzgwc.zza(activity)) == null) {
            return;
        }
        zzgwd zzgwdVar = new zzgwd(this);
        this.zzc = zzgwdVar;
        zzgwdVar.setApplicationContext(activity.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(zza)) {
            intent.setPackage(zza);
        }
        activity.bindService(intent, zzgwdVar, 33);
    }

    public final void zzc(C0459b c0459b) {
        this.zzb = c0459b;
        c0459b.getClass();
        try {
            c0459b.f1460a.mo13075c();
        } catch (RemoteException unused) {
        }
        zzbcj zzbcjVar = this.zzd;
        if (zzbcjVar != null) {
            zzbcjVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbcj zzbcjVar) {
        this.zzd = zzbcjVar;
    }

    public final void zzf(Activity activity) {
        AbstractServiceConnectionC0460c abstractServiceConnectionC0460c = this.zzc;
        if (abstractServiceConnectionC0460c == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC0460c);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
