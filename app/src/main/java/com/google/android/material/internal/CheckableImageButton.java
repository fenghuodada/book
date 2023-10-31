package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0398o;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbstractC1068a;
import com.ambrose.overwall.R;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class CheckableImageButton extends C0398o implements Checkable {

    /* renamed from: g */
    public static final int[] f15007g = {16842912};

    /* renamed from: d */
    public boolean f15008d;

    /* renamed from: e */
    public boolean f15009e;

    /* renamed from: f */
    public boolean f15010f;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes3.dex */
    public static class C7739a extends AbstractC1068a {
        public static final Parcelable.Creator<C7739a> CREATOR = new C7740a();

        /* renamed from: c */
        public boolean f15011c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a */
        /* loaded from: classes3.dex */
        public class C7740a implements Parcelable.ClassLoaderCreator<C7739a> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new C7739a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new C7739a[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final C7739a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new C7739a(parcel, classLoader);
            }
        }

        public C7739a(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15011c = parcel.readInt() == 1;
        }

        public C7739a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeInt(this.f15011c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f15009e = true;
        this.f15010f = true;
        ViewCompat.m11771n(this, new C7742a(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f15008d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f15008d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f15007g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7739a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7739a c7739a = (C7739a) parcelable;
        super.onRestoreInstanceState(c7739a.f2747a);
        setChecked(c7739a.f15011c);
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        C7739a c7739a = new C7739a(super.onSaveInstanceState());
        c7739a.f15011c = this.f15008d;
        return c7739a;
    }

    public void setCheckable(boolean z) {
        if (this.f15009e != z) {
            this.f15009e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f15009e || this.f15008d == z) {
            return;
        }
        this.f15008d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f15010f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f15010f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f15008d);
    }
}
