package com.vungle.warren;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.vungle.warren.b */
/* loaded from: classes3.dex */
public final class C9755b extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ AbstractActivityC9743a f19417a;

    public C9755b(AbstractActivityC9743a abstractActivityC9743a) {
        this.f19417a = abstractActivityC9743a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("command");
        stringExtra.getClass();
        if (stringExtra.equals("stopAll")) {
            this.f19417a.finish();
        } else {
            VungleLogger.m1599g(AbstractActivityC9743a.class.getSimpleName().concat("#connectBroadcastReceiver"), String.format("Receiving Invalid Broadcast: %1$s", stringExtra));
        }
    }
}
