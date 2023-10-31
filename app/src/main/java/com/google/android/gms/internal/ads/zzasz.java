package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasz extends zzatf {
    private final zzary zzi;
    private long zzj;

    public zzasz(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, zzary zzaryVar) {
        super(zzarrVar, "q+aDudU1oKRGiIp85Yex9xQTLhLt7Zb/ajE2OuEM3cyk16vcxQY/UGOPmqieA16k", "wkdkWHeqh0k+zNwmTrd5/YaupE9zOer3F4zT7d5lKl4=", zzanoVar, i, 53);
        this.zzi = zzaryVar;
        if (zzaryVar != null) {
            this.zzj = zzaryVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
