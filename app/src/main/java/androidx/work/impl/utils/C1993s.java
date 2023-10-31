package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.InterfaceC2015p;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.s */
/* loaded from: classes.dex */
public final class C1993s implements InterfaceC2015p {

    /* renamed from: c */
    public static final String f4842c = AbstractC2005l.m9732e("WorkProgressUpdater");

    /* renamed from: a */
    public final WorkDatabase f4843a;

    /* renamed from: b */
    public final InterfaceC1998a f4844b;

    public C1993s(@NonNull WorkDatabase workDatabase, @NonNull InterfaceC1998a interfaceC1998a) {
        this.f4843a = workDatabase;
        this.f4844b = interfaceC1998a;
    }
}
