package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasy extends zzatf {
    public zzasy(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "lmWiEsyvybM0j+41L12yTdEmhqJ1mxl8TMt/J058O+jb1bYarXjRgBdNW2ZFy83f", "wmJ4yDzysGY/F4MtACYt1Wuo4utI1izySyPuZQUSJhk=", zzanoVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzarm zzarmVar = new zzarm((String) this.zzf.invoke(null, new Object[0]));
            this.zze.zzp(zzarmVar.zza.longValue());
            this.zze.zzq(zzarmVar.zzb.longValue());
        }
    }
}
