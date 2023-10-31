package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbhw implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        try {
            zzflz.zzj(zzcfbVar.getContext()).zzk();
            zzfma.zzi(zzcfbVar.getContext()).zzj();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
