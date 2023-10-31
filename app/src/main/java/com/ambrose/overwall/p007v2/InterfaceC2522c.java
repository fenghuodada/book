package com.ambrose.overwall.p007v2;

import android.app.Service;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ambrose.overwall.v2.c */
/* loaded from: classes.dex */
public interface InterfaceC2522c {
    @NotNull
    Service getService();

    void startService();

    void stopService();

    boolean vpnProtect(int i);
}
