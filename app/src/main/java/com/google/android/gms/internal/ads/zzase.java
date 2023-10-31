package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzase extends zzatf {
    private static final zzatg zzi = new zzatg();
    private final Context zzj;

    public zzase(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, Context context) {
        super(zzarrVar, "PfXuYpXR8QASWK08ChzzefD8h4IQvIx6Xugf6O+BJbFGNBOs3F9abkomDjkEKIY/", "e8c4x8hx2nAUk6VVuY651BKZ4rbinGDtu4h/2o24aJo=", zzanoVar, i, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzn("E");
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zzf.invoke(null, this.zzj));
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzn(zzapb.zza(str.getBytes(), true));
        }
    }
}
