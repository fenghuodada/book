package android.support.p000v4.media.session;

import android.annotation.SuppressLint;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p000v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
/* loaded from: classes.dex */
public final class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0011a();

        /* renamed from: a */
        public final MediaDescriptionCompat f16a;

        /* renamed from: b */
        public final long f17b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        /* loaded from: classes.dex */
        public class C0011a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f16a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f17b = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.f16a);
            sb.append(", Id=");
            return C0017a.m13071a(sb, this.f17b, " }");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.f16a.writeToParcel(parcel, i);
            parcel.writeLong(this.f17b);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0012a();

        /* renamed from: a */
        public final ResultReceiver f18a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        /* loaded from: classes.dex */
        public class C0012a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f18a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.f18a.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0013a();

        /* renamed from: a */
        public final Object f19a = new Object();

        /* renamed from: b */
        public final Object f20b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        /* loaded from: classes.dex */
        public class C0013a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Parcelable parcelable) {
            this.f20b = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Token) {
                Object obj2 = this.f20b;
                Object obj3 = ((Token) obj).f20b;
                if (obj2 == null) {
                    return obj3 == null;
                } else if (obj3 == null) {
                    return false;
                } else {
                    return obj2.equals(obj3);
                }
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f20b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f20b, i);
        }
    }

    static {
        Build.VERSION.CODENAME.equals("S");
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: a */
    public static void m13073a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: b */
    public static Bundle m13072b(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m13073a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
}
