package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.C0799c;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes3.dex */
public final class C7666a implements Parcelable {
    public static final Parcelable.Creator<C7666a> CREATOR = new C7667a();
    @NonNull

    /* renamed from: a */
    public final C7706v f14814a;
    @NonNull

    /* renamed from: b */
    public final C7706v f14815b;
    @NonNull

    /* renamed from: c */
    public final InterfaceC7669c f14816c;
    @Nullable

    /* renamed from: d */
    public final C7706v f14817d;

    /* renamed from: e */
    public final int f14818e;

    /* renamed from: f */
    public final int f14819f;

    /* renamed from: g */
    public final int f14820g;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes3.dex */
    public class C7667a implements Parcelable.Creator<C7666a> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C7666a createFromParcel(@NonNull Parcel parcel) {
            return new C7666a((C7706v) parcel.readParcelable(C7706v.class.getClassLoader()), (C7706v) parcel.readParcelable(C7706v.class.getClassLoader()), (InterfaceC7669c) parcel.readParcelable(InterfaceC7669c.class.getClassLoader()), (C7706v) parcel.readParcelable(C7706v.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C7666a[] newArray(int i) {
            return new C7666a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    /* loaded from: classes3.dex */
    public static final class C7668b {

        /* renamed from: f */
        public static final long f14821f = C7681f0.m4593a(C7706v.m4580b(1900, 0).f14900f);

        /* renamed from: g */
        public static final long f14822g = C7681f0.m4593a(C7706v.m4580b(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f14900f);

        /* renamed from: a */
        public final long f14823a;

        /* renamed from: b */
        public final long f14824b;

        /* renamed from: c */
        public Long f14825c;

        /* renamed from: d */
        public final int f14826d;

        /* renamed from: e */
        public final InterfaceC7669c f14827e;

        public C7668b(@NonNull C7666a c7666a) {
            this.f14823a = f14821f;
            this.f14824b = f14822g;
            this.f14827e = new C7679f(Long.MIN_VALUE);
            this.f14823a = c7666a.f14814a.f14900f;
            this.f14824b = c7666a.f14815b.f14900f;
            this.f14825c = Long.valueOf(c7666a.f14817d.f14900f);
            this.f14826d = c7666a.f14818e;
            this.f14827e = c7666a.f14816c;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC7669c extends Parcelable {
        /* renamed from: u */
        boolean mo4594u(long j);
    }

    public C7666a(C7706v c7706v, C7706v c7706v2, InterfaceC7669c interfaceC7669c, C7706v c7706v3, int i) {
        Objects.requireNonNull(c7706v, "start cannot be null");
        Objects.requireNonNull(c7706v2, "end cannot be null");
        Objects.requireNonNull(interfaceC7669c, "validator cannot be null");
        this.f14814a = c7706v;
        this.f14815b = c7706v2;
        this.f14817d = c7706v3;
        this.f14818e = i;
        this.f14816c = interfaceC7669c;
        Calendar calendar = c7706v.f14895a;
        if (c7706v3 != null && calendar.compareTo(c7706v3.f14895a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c7706v3 != null && c7706v3.f14895a.compareTo(c7706v2.f14895a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= C7681f0.m4589e(null).getMaximum(7)) {
            if (calendar instanceof GregorianCalendar) {
                int i2 = c7706v2.f14897c;
                int i3 = c7706v.f14897c;
                this.f14820g = (c7706v2.f14896b - c7706v.f14896b) + ((i2 - i3) * 12) + 1;
                this.f14819f = (i2 - i3) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7666a)) {
            return false;
        }
        C7666a c7666a = (C7666a) obj;
        if (this.f14814a.equals(c7666a.f14814a) && this.f14815b.equals(c7666a.f14815b) && C0799c.m11795a(this.f14817d, c7666a.f14817d) && this.f14818e == c7666a.f14818e && this.f14816c.equals(c7666a.f14816c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14814a, this.f14815b, this.f14817d, Integer.valueOf(this.f14818e), this.f14816c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f14814a, 0);
        parcel.writeParcelable(this.f14815b, 0);
        parcel.writeParcelable(this.f14817d, 0);
        parcel.writeParcelable(this.f14816c, 0);
        parcel.writeInt(this.f14818e);
    }
}
