package com.vungle.warren;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.AbstractActivityC9743a;
import com.vungle.warren.p058ui.state.InterfaceC10030b;
import com.vungle.warren.p058ui.view.C10055l;
import com.vungle.warren.p058ui.view.FullAdWidget;

/* renamed from: com.vungle.warren.h0 */
/* loaded from: classes3.dex */
public interface InterfaceC9800h0 {

    /* renamed from: com.vungle.warren.h0$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9801a {
    }

    /* renamed from: com.vungle.warren.h0$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9802b {
    }

    /* renamed from: a */
    void mo1507a(@NonNull Context context, @NonNull AdRequest adRequest, @NonNull FullAdWidget fullAdWidget, @Nullable InterfaceC10030b interfaceC10030b, @NonNull AbstractActivityC9743a.C9744a c9744a, @NonNull AbstractActivityC9743a.C9745b c9745b, @Nullable Bundle bundle, @NonNull AbstractActivityC9743a.C9746c c9746c);

    /* renamed from: b */
    void mo1506b(Context context, @NonNull AdRequest adRequest, @Nullable AdConfig adConfig, @NonNull C10055l.C10058c c10058c);

    /* renamed from: c */
    void mo1505c(Bundle bundle);

    void destroy();
}
