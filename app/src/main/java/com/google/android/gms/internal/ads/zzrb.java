package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzrb extends Handler {
    final /* synthetic */ zzrd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrb(zzrd zzrdVar, Looper looper) {
        super(looper);
        this.zza = zzrdVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzrd.zza(this.zza, message);
    }
}
