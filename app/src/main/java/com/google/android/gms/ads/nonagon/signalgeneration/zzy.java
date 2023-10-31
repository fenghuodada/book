package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzfgj;
import com.google.android.gms.internal.ads.zzfvn;
import java.util.List;
import javax.annotation.Nonnull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzy implements zzfvn {
    final /* synthetic */ zzbsk zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    public zzy(zzaa zzaaVar, zzbsk zzbskVar, boolean z) {
        this.zzc = zzaaVar;
        this.zza = zzbskVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        try {
            zzbsk zzbskVar = this.zza;
            String message = th.getMessage();
            zzbskVar.zze("Internal error: " + message);
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri zzW;
        zzfgj zzfgjVar;
        String uri;
        List<Uri> list = (List) obj;
        try {
            zzaa.zzF(this.zzc, list);
            this.zza.zzf(list);
            z = this.zzc.zzu;
            if (z || this.zzb) {
                for (Uri uri2 : list) {
                    if (this.zzc.zzN(uri2)) {
                        str = this.zzc.zzC;
                        zzW = zzaa.zzW(uri2, str, "1");
                        zzfgjVar = this.zzc.zzs;
                        uri = zzW.toString();
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbbk.zzhi)).booleanValue()) {
                            zzfgjVar = this.zzc.zzs;
                            uri = uri2.toString();
                        }
                    }
                    zzfgjVar.zzc(uri, null);
                }
            }
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }
}
