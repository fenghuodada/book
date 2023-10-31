package com.vungle.warren.p058ui.contract;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.p058ui.C10000c;
import com.vungle.warren.p058ui.contract.InterfaceC10002a;
import com.vungle.warren.p058ui.state.C10028a;
import com.vungle.warren.p058ui.state.InterfaceC10030b;

/* renamed from: com.vungle.warren.ui.contract.b */
/* loaded from: classes3.dex */
public interface InterfaceC10003b<T extends InterfaceC10002a> extends C10000c.InterfaceC10001a {

    /* renamed from: com.vungle.warren.ui.contract.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10004a {
    }

    /* renamed from: a */
    void mo1341a(@Nullable C10028a c10028a);

    /* renamed from: b */
    void mo1340b();

    /* renamed from: c */
    void mo1339c(@NonNull T t, @Nullable InterfaceC10030b interfaceC10030b);

    /* renamed from: e */
    void mo1337e(@AdContract$AdStopReason int i);

    /* renamed from: h */
    void mo1336h(@AdContract$AdStopReason int i);

    /* renamed from: i */
    void mo1335i(@Nullable InterfaceC10030b interfaceC10030b);

    /* renamed from: k */
    void mo1334k(@Nullable InterfaceC10004a interfaceC10004a);

    /* renamed from: n */
    boolean mo1331n();

    void start();
}
