package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.material.circularreveal.d */
/* loaded from: classes3.dex */
public interface InterfaceC7656d {

    /* renamed from: com.google.android.material.circularreveal.d$a */
    /* loaded from: classes3.dex */
    public static class C7657a implements TypeEvaluator<C7660d> {

        /* renamed from: b */
        public static final C7657a f14774b = new C7657a();

        /* renamed from: a */
        public final C7660d f14775a = new C7660d();

        @Override // android.animation.TypeEvaluator
        @NonNull
        public final C7660d evaluate(float f, @NonNull C7660d c7660d, @NonNull C7660d c7660d2) {
            C7660d c7660d3 = c7660d;
            C7660d c7660d4 = c7660d2;
            float f2 = c7660d3.f14778a;
            float f3 = 1.0f - f;
            float f4 = (c7660d4.f14778a * f) + (f2 * f3);
            float f5 = c7660d3.f14779b;
            float f6 = c7660d4.f14779b * f;
            float f7 = c7660d3.f14780c;
            float f8 = f * c7660d4.f14780c;
            C7660d c7660d5 = this.f14775a;
            c7660d5.f14778a = f4;
            c7660d5.f14779b = f6 + (f5 * f3);
            c7660d5.f14780c = f8 + (f3 * f7);
            return c7660d5;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.d$b */
    /* loaded from: classes3.dex */
    public static class C7658b extends Property<InterfaceC7656d, C7660d> {

        /* renamed from: a */
        public static final C7658b f14776a = new C7658b();

        public C7658b() {
            super(C7660d.class, "circularReveal");
        }

        @Override // android.util.Property
        @Nullable
        public final C7660d get(@NonNull InterfaceC7656d interfaceC7656d) {
            return interfaceC7656d.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(@NonNull InterfaceC7656d interfaceC7656d, @Nullable C7660d c7660d) {
            interfaceC7656d.setRevealInfo(c7660d);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.d$c */
    /* loaded from: classes3.dex */
    public static class C7659c extends Property<InterfaceC7656d, Integer> {

        /* renamed from: a */
        public static final C7659c f14777a = new C7659c();

        public C7659c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        @NonNull
        public final Integer get(@NonNull InterfaceC7656d interfaceC7656d) {
            return Integer.valueOf(interfaceC7656d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(@NonNull InterfaceC7656d interfaceC7656d, @NonNull Integer num) {
            interfaceC7656d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.d$d */
    /* loaded from: classes3.dex */
    public static class C7660d {

        /* renamed from: a */
        public float f14778a;

        /* renamed from: b */
        public float f14779b;

        /* renamed from: c */
        public float f14780c;

        public C7660d() {
        }

        public C7660d(float f, float f2, float f3) {
            this.f14778a = f;
            this.f14779b = f2;
            this.f14780c = f3;
        }
    }

    /* renamed from: a */
    void mo4623a();

    /* renamed from: b */
    void mo4622b();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    C7660d getRevealInfo();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@ColorInt int i);

    void setRevealInfo(@Nullable C7660d c7660d);
}
