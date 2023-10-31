package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzasj extends zzatf {
    public zzasj(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "IWc1kTmZyjEaYg+Bhy1Ic+NBj3x1Dc7qjnIeXSV6/dJrA8kzK2iK01R5H/P8KgRH", "tqyxGM79wOlAPNBhvtAr5QJDQ+dGmpZ4a1UkwVDI/lw=", zzanoVar, i, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzh = this.zzb.zzh();
        if (zzh == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzh.getInfo();
            String id = info.getId();
            int i = zzaru.zza;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID fromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.putLong(fromString.getMostSignificantBits());
                wrap.putLong(fromString.getLeastSignificantBits());
                id = zzapb.zza(bArr, true);
            }
            if (id != null) {
                synchronized (this.zze) {
                    this.zze.zzs(id);
                    this.zze.zzr(info.isLimitAdTrackingEnabled());
                    this.zze.zzab(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatf, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzb.zzq()) {
            zzc();
            return;
        }
        synchronized (this.zze) {
            this.zze.zzs((String) this.zzf.invoke(null, this.zzb.zzb()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final Void zzk() throws Exception {
        if (this.zzb.zzr()) {
            super.zzk();
            return null;
        }
        if (this.zzb.zzq()) {
            zzc();
        }
        return null;
    }
}
