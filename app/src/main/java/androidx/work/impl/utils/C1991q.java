package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.InterfaceC1840h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.InterfaceC1894a;
import androidx.work.impl.model.InterfaceC1942q;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.q */
/* loaded from: classes.dex */
public final class C1991q implements InterfaceC1840h {

    /* renamed from: a */
    public final InterfaceC1998a f4835a;

    /* renamed from: b */
    public final InterfaceC1894a f4836b;

    /* renamed from: c */
    public final InterfaceC1942q f4837c;

    static {
        AbstractC2005l.m9732e("WMFgUpdater");
    }

    public C1991q(@NonNull WorkDatabase workDatabase, @NonNull InterfaceC1894a interfaceC1894a, @NonNull InterfaceC1998a interfaceC1998a) {
        this.f4836b = interfaceC1894a;
        this.f4835a = interfaceC1998a;
        this.f4837c = workDatabase.mo9893n();
    }
}
