package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzash extends zzatf {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzash(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "qp6rBGTCbwl3Du6FT/SAKGuw1FuFEkW7uLvnpWgAVmj4gvXya3866ptnORhDDu8C", "eQRTNlDku3oQgUviNcuPPX0vJqvEjzyxzBtk+QMugeI=", zzanoVar, i, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzo(zzi.longValue());
        }
    }
}
