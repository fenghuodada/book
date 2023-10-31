package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.browser.customtabs.C0462d;
import androidx.core.app.C0627k;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzgwc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzn implements zzbcj {
    final /* synthetic */ zzbcl zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    public zzn(zzs zzsVar, zzbcl zzbclVar, Context context, Uri uri) {
        this.zza = zzbclVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zza() {
        C0462d zza = this.zza.zza();
        Intent intent = new Intent("android.intent.action.VIEW");
        if (zza != null) {
            intent.setPackage(zza.f1464c.getPackageName());
            IBinder asBinder = zza.f1463b.asBinder();
            Bundle bundle = new Bundle();
            C0627k.m12066b(bundle, "android.support.customtabs.extra.SESSION", asBinder);
            PendingIntent pendingIntent = zza.f1465d;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle2 = new Bundle();
            C0627k.m12066b(bundle2, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent.setPackage(zzgwc.zza(this.zzb));
        Context context = this.zzb;
        intent.setData(this.zzc);
        Object obj = ContextCompat.f2323a;
        ContextCompat.C0649a.m12037b(context, intent, null);
        this.zza.zzf((Activity) this.zzb);
    }
}
