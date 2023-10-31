package com.google.android.material.datepicker;

import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.C0800d;
import java.util.Collection;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes3.dex */
public interface InterfaceC7675d<S> extends Parcelable {
    @Nullable
    /* renamed from: A */
    S m4605A();

    @NonNull
    /* renamed from: F */
    View m4604F();

    @Nullable
    String getError();

    /* renamed from: j */
    void m4603j();

    @NonNull
    /* renamed from: k */
    String m4602k();

    @NonNull
    /* renamed from: m */
    Collection<C0800d<Long, Long>> m4601m();

    @StyleRes
    /* renamed from: s */
    int m4600s();

    /* renamed from: v */
    boolean m4599v();

    @NonNull
    /* renamed from: w */
    String m4598w();

    @NonNull
    /* renamed from: y */
    Collection<Long> m4597y();
}
