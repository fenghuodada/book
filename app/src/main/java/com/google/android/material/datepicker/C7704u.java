package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.util.Iterator;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.datepicker.u */
/* loaded from: classes3.dex */
public final class C7704u<S> extends AbstractC7670a0<S> {
    @StyleRes

    /* renamed from: b */
    public int f14891b;
    @Nullable

    /* renamed from: c */
    public InterfaceC7675d<S> f14892c;
    @Nullable

    /* renamed from: d */
    public C7666a f14893d;

    /* renamed from: com.google.android.material.datepicker.u$a */
    /* loaded from: classes3.dex */
    public class C7705a extends AbstractC7712z<S> {
        public C7705a() {
        }

        @Override // com.google.android.material.datepicker.AbstractC7712z
        /* renamed from: a */
        public final void mo4573a(S s) {
            Iterator<AbstractC7712z<S>> it = C7704u.this.f14828a.iterator();
            while (it.hasNext()) {
                it.next().mo4573a(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f14891b = bundle.getInt("THEME_RES_ID_KEY");
        this.f14892c = (InterfaceC7675d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f14893d = (C7666a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f14891b));
        InterfaceC7675d<S> interfaceC7675d = this.f14892c;
        new C7705a();
        return interfaceC7675d.m4604F();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f14891b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f14892c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f14893d);
    }
}
