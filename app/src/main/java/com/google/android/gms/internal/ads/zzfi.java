package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzfi implements zzeh {
    @Nullable
    private Message zza;
    @Nullable
    private zzfj zzb;

    private zzfi() {
    }

    public /* synthetic */ zzfi(zzfh zzfhVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzfj.zzl(this);
    }

    @Override // com.google.android.gms.internal.ads.zzeh
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        zzd();
    }

    public final zzfi zzb(Message message, zzfj zzfjVar) {
        this.zza = message;
        this.zzb = zzfjVar;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
