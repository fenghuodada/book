package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import java.util.Set;
import java.util.concurrent.Callable;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final class zzens implements zzeqq {
    private final zzfwc zza;
    @Nullable
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzens(zzfwc zzfwcVar, @Nullable ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzfwcVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzens.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzent zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfE)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzent(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfF)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0) {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new zzent(bool);
            }
        }
        return new zzent(null);
    }
}
