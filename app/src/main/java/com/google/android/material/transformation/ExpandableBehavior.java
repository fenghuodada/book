package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.InterfaceC7715a;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0588c<View> {

    /* renamed from: a */
    public int f15659a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes3.dex */
    public class ViewTreeObserver$OnPreDrawListenerC7911a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f15660a;

        /* renamed from: b */
        public final /* synthetic */ int f15661b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC7715a f15662c;

        public ViewTreeObserver$OnPreDrawListenerC7911a(View view, int i, InterfaceC7715a interfaceC7715a) {
            this.f15660a = view;
            this.f15661b = i;
            this.f15662c = interfaceC7715a;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f15660a;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f15659a == this.f15661b) {
                InterfaceC7715a interfaceC7715a = this.f15662c;
                expandableBehavior.mo4296t((View) interfaceC7715a, view, interfaceC7715a.mo4568a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f15659a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15659a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: b */
    public abstract boolean mo2731b(View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    @CallSuper
    /* renamed from: d */
    public final boolean mo2730d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z;
        int i;
        InterfaceC7715a interfaceC7715a = (InterfaceC7715a) view2;
        int i2 = 2;
        if (!interfaceC7715a.mo4568a() ? this.f15659a != 1 : (i = this.f15659a) != 0 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (interfaceC7715a.mo4568a()) {
            i2 = 1;
        }
        this.f15659a = i2;
        mo4296t((View) interfaceC7715a, view, interfaceC7715a.mo4568a(), true);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    @CallSuper
    /* renamed from: h */
    public final boolean mo2724h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        InterfaceC7715a interfaceC7715a;
        boolean z;
        int i2;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (!ViewCompat.C0817g.m11729c(view)) {
            ArrayList m12125d = coordinatorLayout.m12125d(view);
            int size = m12125d.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    View view2 = (View) m12125d.get(i3);
                    if (mo2731b(view, view2)) {
                        interfaceC7715a = (InterfaceC7715a) view2;
                        break;
                    }
                    i3++;
                } else {
                    interfaceC7715a = null;
                    break;
                }
            }
            if (interfaceC7715a != null) {
                int i4 = 2;
                if (!interfaceC7715a.mo4568a() ? this.f15659a != 1 : (i2 = this.f15659a) != 0 && i2 != 2) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (interfaceC7715a.mo4568a()) {
                        i4 = 1;
                    }
                    this.f15659a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC7911a(view, i4, interfaceC7715a));
                }
            }
        }
        return false;
    }

    /* renamed from: t */
    public abstract void mo4296t(View view, View view2, boolean z, boolean z2);
}
