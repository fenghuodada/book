package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C6964f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zabh extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ zabi zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabh(zabi zabiVar, Looper looper) {
        super(looper);
        this.zaa = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                C6964f.m5792c(31, "Unknown message id: ", i, "GACStateManager");
                return;
            }
            throw ((RuntimeException) message.obj);
        }
        ((zabg) message.obj).zab(this.zaa);
    }
}
