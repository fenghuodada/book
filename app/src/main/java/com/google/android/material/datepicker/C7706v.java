package com.google.android.material.datepicker;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.v */
/* loaded from: classes3.dex */
public final class C7706v implements Comparable<C7706v>, Parcelable {
    public static final Parcelable.Creator<C7706v> CREATOR = new C7707a();
    @NonNull

    /* renamed from: a */
    public final Calendar f14895a;

    /* renamed from: b */
    public final int f14896b;

    /* renamed from: c */
    public final int f14897c;

    /* renamed from: d */
    public final int f14898d;

    /* renamed from: e */
    public final int f14899e;

    /* renamed from: f */
    public final long f14900f;
    @Nullable

    /* renamed from: g */
    public String f14901g;

    /* renamed from: com.google.android.material.datepicker.v$a */
    /* loaded from: classes3.dex */
    public class C7707a implements Parcelable.Creator<C7706v> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C7706v createFromParcel(@NonNull Parcel parcel) {
            return C7706v.m4580b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C7706v[] newArray(int i) {
            return new C7706v[i];
        }
    }

    public C7706v(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar m4591c = C7681f0.m4591c(calendar);
        this.f14895a = m4591c;
        this.f14896b = m4591c.get(2);
        this.f14897c = m4591c.get(1);
        this.f14898d = m4591c.getMaximum(7);
        this.f14899e = m4591c.getActualMaximum(5);
        this.f14900f = m4591c.getTimeInMillis();
    }

    @NonNull
    /* renamed from: b */
    public static C7706v m4580b(int i, int i2) {
        Calendar m4589e = C7681f0.m4589e(null);
        m4589e.set(1, i);
        m4589e.set(2, i2);
        return new C7706v(m4589e);
    }

    @NonNull
    /* renamed from: c */
    public static C7706v m4579c(long j) {
        Calendar m4589e = C7681f0.m4589e(null);
        m4589e.setTimeInMillis(j);
        return new C7706v(m4589e);
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull C7706v c7706v) {
        return this.f14895a.compareTo(c7706v.f14895a);
    }

    @NonNull
    /* renamed from: d */
    public final String m4578d() {
        String formatDateTime;
        if (this.f14901g == null) {
            long timeInMillis = this.f14895a.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                formatDateTime = C7681f0.m4592b("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
            } else {
                formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.f14901g = formatDateTime;
        }
        return this.f14901g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7706v) {
            C7706v c7706v = (C7706v) obj;
            return this.f14896b == c7706v.f14896b && this.f14897c == c7706v.f14897c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14896b), Integer.valueOf(this.f14897c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.f14897c);
        parcel.writeInt(this.f14896b);
    }
}
