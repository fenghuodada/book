package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzasv extends zzatf {
    private List zzi;
    private final Context zzj;

    public zzasv(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, Context context) {
        super(zzarrVar, "giiWqjx/aw0vfIeusCr0d5j05N3KWpgqLVDV7vWRzJE/pZfKVhVFd0wNllaUtOAl", "cxQLOgxIjd5GqHFd887UzcTVGYJaF4w3kSTCXM9zwKU=", zzanoVar, i, 31);
        this.zzi = null;
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzW(-1L);
        this.zze.zzS(-1L);
        Context context = this.zzj;
        if (context == null) {
            context = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, context);
        }
        List list = this.zzi;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zze) {
            this.zze.zzW(((Long) this.zzi.get(0)).longValue());
            this.zze.zzS(((Long) this.zzi.get(1)).longValue());
        }
    }
}
