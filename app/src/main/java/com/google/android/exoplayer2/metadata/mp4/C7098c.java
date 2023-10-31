package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.metadata.mp4.c */
/* loaded from: classes.dex */
public final class C7098c implements C7042a.InterfaceC7044b {
    public static final Parcelable.Creator<C7098c> CREATOR = new C7099a();

    /* renamed from: a */
    public final List<C7100b> f12589a;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.c$a */
    /* loaded from: classes.dex */
    public class C7099a implements Parcelable.Creator<C7098c> {
        @Override // android.os.Parcelable.Creator
        public final C7098c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C7100b.class.getClassLoader());
            return new C7098c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final C7098c[] newArray(int i) {
            return new C7098c[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.c$b */
    /* loaded from: classes.dex */
    public static final class C7100b implements Parcelable {
        public static final Parcelable.Creator<C7100b> CREATOR = new C7101a();

        /* renamed from: a */
        public final long f12590a;

        /* renamed from: b */
        public final long f12591b;

        /* renamed from: c */
        public final int f12592c;

        /* renamed from: com.google.android.exoplayer2.metadata.mp4.c$b$a */
        /* loaded from: classes.dex */
        public class C7101a implements Parcelable.Creator<C7100b> {
            @Override // android.os.Parcelable.Creator
            public final C7100b createFromParcel(Parcel parcel) {
                return new C7100b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final C7100b[] newArray(int i) {
                return new C7100b[i];
            }
        }

        public C7100b(int i, long j, long j2) {
            C7394a.m5134a(j < j2);
            this.f12590a = j;
            this.f12591b = j2;
            this.f12592c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7100b.class != obj.getClass()) {
                return false;
            }
            C7100b c7100b = (C7100b) obj;
            return this.f12590a == c7100b.f12590a && this.f12591b == c7100b.f12591b && this.f12592c == c7100b.f12592c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f12590a), Long.valueOf(this.f12591b), Integer.valueOf(this.f12592c)});
        }

        public final String toString() {
            return C7408g0.m5096j("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f12590a), Long.valueOf(this.f12591b), Integer.valueOf(this.f12592c));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f12590a);
            parcel.writeLong(this.f12591b);
            parcel.writeInt(this.f12592c);
        }
    }

    public C7098c(ArrayList arrayList) {
        this.f12589a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C7100b) arrayList.get(0)).f12591b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((C7100b) arrayList.get(i)).f12590a < j) {
                    z = true;
                    break;
                } else {
                    j = ((C7100b) arrayList.get(i)).f12591b;
                    i++;
                }
            }
        }
        C7394a.m5134a(!z);
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: G */
    public final /* synthetic */ byte[] mo5510G() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: a */
    public final /* synthetic */ void mo5509a(MediaMetadata.C6623a c6623a) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7098c.class != obj.getClass()) {
            return false;
        }
        return this.f12589a.equals(((C7098c) obj).f12589a);
    }

    public final int hashCode() {
        return this.f12589a.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: o */
    public final /* synthetic */ C7003m0 mo5508o() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12589a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21);
        sb.append("SlowMotion: segments=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f12589a);
    }
}
