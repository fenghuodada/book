package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.accessibility.C0874o;
import androidx.core.view.accessibility.InterfaceC0863d;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.u */
/* loaded from: classes3.dex */
public abstract class AbstractC7890u {

    /* renamed from: a */
    public final TextInputLayout f15565a;

    /* renamed from: b */
    public final C7885t f15566b;

    /* renamed from: c */
    public final Context f15567c;

    /* renamed from: d */
    public final CheckableImageButton f15568d;

    public AbstractC7890u(@NonNull C7885t c7885t) {
        this.f15565a = c7885t.f15536a;
        this.f15566b = c7885t;
        this.f15567c = c7885t.getContext();
        this.f15568d = c7885t.f15542g;
    }

    /* renamed from: a */
    public void mo4358a() {
    }

    /* renamed from: b */
    public void mo4357b() {
    }

    @StringRes
    /* renamed from: c */
    public int mo4356c() {
        return 0;
    }

    @DrawableRes
    /* renamed from: d */
    public int mo4355d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo4354e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo4353f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo4352g() {
        return null;
    }

    /* renamed from: h */
    public InterfaceC0863d mo4351h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo4350i(int i) {
        return true;
    }

    /* renamed from: j */
    public boolean mo4349j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo4348k() {
        return this instanceof C7884s;
    }

    /* renamed from: l */
    public boolean mo4347l() {
        return false;
    }

    /* renamed from: m */
    public void mo4346m(@Nullable EditText editText) {
    }

    /* renamed from: n */
    public void mo4345n(@NonNull C0874o c0874o) {
    }

    /* renamed from: o */
    public void mo4344o(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: p */
    public void mo4343p(boolean z) {
    }

    /* renamed from: q */
    public final void m4342q() {
        this.f15566b.m4368e(false);
    }

    /* renamed from: r */
    public void mo4341r() {
    }

    /* renamed from: s */
    public void mo4340s() {
    }
}
