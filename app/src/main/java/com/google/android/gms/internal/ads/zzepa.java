package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzepa implements zzeqq {
    private final zzfwc zza;
    @Nullable
    private final Bundle zzb;

    public zzepa(zzfwc zzfwcVar, @Nullable Bundle bundle) {
        this.zza = zzfwcVar;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepa.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepb zzc() throws Exception {
        return new zzepb(this.zzb);
    }
}
