package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.appcompat.app.LayoutInflater$Factory2C0114h;
import androidx.appcompat.view.AbstractC0178a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class ActionBar {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface DisplayOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface NavigationMode {
    }

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    /* loaded from: classes.dex */
    public static class C0080a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f148a;

        public C0080a() {
            super(-2, -2);
            this.f148a = 8388627;
        }

        public C0080a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f148a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0157c.f411b);
            this.f148a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0080a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f148a = 0;
        }

        public C0080a(C0080a c0080a) {
            super((ViewGroup.MarginLayoutParams) c0080a);
            this.f148a = 0;
            this.f148a = c0080a.f148a;
        }
    }

    /* renamed from: androidx.appcompat.app.ActionBar$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0081b {
        /* renamed from: a */
        void m13042a();
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public boolean mo13031a() {
        return false;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public abstract boolean mo13023b();

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public abstract void mo13022c(boolean z);

    /* renamed from: d */
    public abstract int mo13021d();

    /* renamed from: e */
    public abstract Context mo13020e();

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public boolean mo13030f() {
        return false;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: g */
    public abstract void mo13019g();

    /* renamed from: h */
    public void mo13029h() {
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: i */
    public abstract boolean mo13018i(int i, KeyEvent keyEvent);

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public boolean mo13028j(KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public boolean mo13027k() {
        return false;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: l */
    public abstract void mo13017l(boolean z);

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: m */
    public abstract void mo13016m(boolean z);

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: n */
    public abstract void mo13015n(CharSequence charSequence);

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: o */
    public AbstractC0178a mo13014o(LayoutInflater$Factory2C0114h.C0119e c0119e) {
        return null;
    }
}
