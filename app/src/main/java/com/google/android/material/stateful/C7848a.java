package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C0482i;
import androidx.customview.view.AbstractC1068a;

/* renamed from: com.google.android.material.stateful.a */
/* loaded from: classes3.dex */
public final class C7848a extends AbstractC1068a {
    public static final Parcelable.Creator<C7848a> CREATOR = new C7849a();
    @NonNull

    /* renamed from: c */
    public final C0482i<String, Bundle> f15397c;

    /* renamed from: com.google.android.material.stateful.a$a */
    /* loaded from: classes3.dex */
    public class C7849a implements Parcelable.ClassLoaderCreator<C7848a> {
        @Override // android.os.Parcelable.Creator
        @Nullable
        public final Object createFromParcel(@NonNull Parcel parcel) {
            return new C7848a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Object[] newArray(int i) {
            return new C7848a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public final C7848a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new C7848a(parcel, classLoader);
        }
    }

    public C7848a() {
        throw null;
    }

    public C7848a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f15397c = new C0482i<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f15397c.put(strArr[i], bundleArr[i]);
        }
    }

    @NonNull
    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f15397c + "}";
    }

    @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.f2747a, i);
        C0482i<String, Bundle> c0482i = this.f15397c;
        int i2 = c0482i.f1531c;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = c0482i.m12398h(i3);
            bundleArr[i3] = c0482i.m12397l(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
