package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
/* loaded from: classes.dex */
public final class zzyp extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzyn zzd;
    private boolean zze;

    public /* synthetic */ zzyp(zzyn zzynVar, SurfaceTexture surfaceTexture, boolean z, zzyo zzyoVar) {
        super(surfaceTexture);
        this.zzd = zzynVar;
        this.zza = z;
    }

    public static zzyp zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzdy.zzf(z2);
        return new zzyn().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        String eglQueryString;
        int i2;
        synchronized (zzyp.class) {
            if (!zzc) {
                int i3 = zzfn.zza;
                if (i3 >= 24 && ((i3 >= 26 || (!"samsung".equals(zzfn.zzc) && !"XT1650".equals(zzfn.zzd))) && ((i3 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i2 = 2;
                    if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i2 = 1;
                    }
                    zzb = i2;
                    zzc = true;
                }
                i2 = 0;
                zzb = i2;
                zzc = true;
            }
            i = zzb;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
