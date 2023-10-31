package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzfgj;
import com.google.android.gms.internal.ads.zzfvn;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzx implements zzfvn {
    final /* synthetic */ zzbsk zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    public zzx(zzaa zzaaVar, zzbsk zzbskVar, boolean z) {
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
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            z = this.zzc.zzt;
            if (z || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri2 = (Uri) it.next();
                    if (this.zzc.zzO(uri2)) {
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
