package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C6964f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zabc extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabe zabeVar, Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                C6964f.m5792c(31, "Unknown message id: ", i, "GoogleApiClientImpl");
                return;
            } else {
                zabe.zai(this.zaa);
                return;
            }
        }
        zabe.zaj(this.zaa);
    }
}
