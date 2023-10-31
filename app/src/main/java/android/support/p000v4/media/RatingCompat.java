package android.support.p000v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.RatingCompat */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0009a();

    /* renamed from: a */
    public final int f14a;

    /* renamed from: b */
    public final float f15b;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: android.support.v4.media.RatingCompat$StarStyle */
    /* loaded from: classes.dex */
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: android.support.v4.media.RatingCompat$Style */
    /* loaded from: classes.dex */
    public @interface Style {
    }

    /* renamed from: android.support.v4.media.RatingCompat$a */
    /* loaded from: classes.dex */
    public class C0009a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f14a = i;
        this.f15b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f14a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f14a);
        sb.append(" rating=");
        float f = this.f15b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14a);
        parcel.writeFloat(this.f15b);
    }
}
