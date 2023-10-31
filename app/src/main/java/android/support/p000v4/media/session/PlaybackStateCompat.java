package android.support.p000v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0016a();

    /* renamed from: a */
    public final int f26a;

    /* renamed from: b */
    public final long f27b;

    /* renamed from: c */
    public final long f28c;

    /* renamed from: d */
    public final float f29d;

    /* renamed from: e */
    public final long f30e;

    /* renamed from: f */
    public final int f31f;

    /* renamed from: g */
    public final CharSequence f32g;

    /* renamed from: h */
    public final long f33h;

    /* renamed from: i */
    public final ArrayList f34i;

    /* renamed from: j */
    public final long f35j;

    /* renamed from: k */
    public final Bundle f36k;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$Actions */
    /* loaded from: classes.dex */
    public @interface Actions {
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0015a();

        /* renamed from: a */
        public final String f37a;

        /* renamed from: b */
        public final CharSequence f38b;

        /* renamed from: c */
        public final int f39c;

        /* renamed from: d */
        public final Bundle f40d;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        public class C0015a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f37a = parcel.readString();
            this.f38b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f39c = parcel.readInt();
            this.f40d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f38b) + ", mIcon=" + this.f39c + ", mExtras=" + this.f40d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f37a);
            TextUtils.writeToParcel(this.f38b, parcel, i);
            parcel.writeInt(this.f39c);
            parcel.writeBundle(this.f40d);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$MediaKeyAction */
    /* loaded from: classes.dex */
    public @interface MediaKeyAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$RepeatMode */
    /* loaded from: classes.dex */
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$ShuffleMode */
    /* loaded from: classes.dex */
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$State */
    /* loaded from: classes.dex */
    public @interface State {
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    public class C0016a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f26a = parcel.readInt();
        this.f27b = parcel.readLong();
        this.f29d = parcel.readFloat();
        this.f33h = parcel.readLong();
        this.f28c = parcel.readLong();
        this.f30e = parcel.readLong();
        this.f32g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f34i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f35j = parcel.readLong();
        this.f36k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f31f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f26a);
        sb.append(", position=");
        sb.append(this.f27b);
        sb.append(", buffered position=");
        sb.append(this.f28c);
        sb.append(", speed=");
        sb.append(this.f29d);
        sb.append(", updated=");
        sb.append(this.f33h);
        sb.append(", actions=");
        sb.append(this.f30e);
        sb.append(", error code=");
        sb.append(this.f31f);
        sb.append(", error message=");
        sb.append(this.f32g);
        sb.append(", custom actions=");
        sb.append(this.f34i);
        sb.append(", active item id=");
        return C0017a.m13071a(sb, this.f35j, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26a);
        parcel.writeLong(this.f27b);
        parcel.writeFloat(this.f29d);
        parcel.writeLong(this.f33h);
        parcel.writeLong(this.f28c);
        parcel.writeLong(this.f30e);
        TextUtils.writeToParcel(this.f32g, parcel, i);
        parcel.writeTypedList(this.f34i);
        parcel.writeLong(this.f35j);
        parcel.writeBundle(this.f36k);
        parcel.writeInt(this.f31f);
    }
}
