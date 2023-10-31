package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7421n;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* renamed from: com.google.android.exoplayer2.source.j0 */
/* loaded from: classes.dex */
public final class C7175j0 implements Parcelable {
    public static final Parcelable.Creator<C7175j0> CREATOR = new C7176a();

    /* renamed from: a */
    public final int f12894a;

    /* renamed from: b */
    public final C7003m0[] f12895b;

    /* renamed from: c */
    public int f12896c;

    /* renamed from: com.google.android.exoplayer2.source.j0$a */
    /* loaded from: classes.dex */
    public class C7176a implements Parcelable.Creator<C7175j0> {
        @Override // android.os.Parcelable.Creator
        public final C7175j0 createFromParcel(Parcel parcel) {
            return new C7175j0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7175j0[] newArray(int i) {
            return new C7175j0[i];
        }
    }

    public C7175j0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f12894a = readInt;
        this.f12895b = new C7003m0[readInt];
        for (int i = 0; i < this.f12894a; i++) {
            this.f12895b[i] = (C7003m0) parcel.readParcelable(C7003m0.class.getClassLoader());
        }
    }

    public C7175j0(C7003m0... c7003m0Arr) {
        boolean z;
        String str;
        String str2;
        String str3;
        if (c7003m0Arr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        this.f12895b = c7003m0Arr;
        this.f12894a = c7003m0Arr.length;
        String str4 = c7003m0Arr[0].f12278c;
        str4 = (str4 == null || str4.equals("und")) ? "" : "";
        int i = c7003m0Arr[0].f12280e | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i2 = 1; i2 < c7003m0Arr.length; i2++) {
            String str5 = c7003m0Arr[i2].f12278c;
            if (!str4.equals((str5 == null || str5.equals("und")) ? "" : "")) {
                str = c7003m0Arr[0].f12278c;
                str2 = c7003m0Arr[i2].f12278c;
                str3 = "languages";
            } else if (i != (c7003m0Arr[i2].f12280e | Http2.INITIAL_MAX_FRAME_SIZE)) {
                str = Integer.toBinaryString(c7003m0Arr[0].f12280e);
                str2 = Integer.toBinaryString(c7003m0Arr[i2].f12280e);
                str3 = "role flags";
            }
            StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str2, C0552c.m12193a(str, str3.length() + 78)), "Different ", str3, " combined in one TrackGroup: '", str);
            m9043a.append("' (track 0) and '");
            m9043a.append(str2);
            m9043a.append("' (track ");
            m9043a.append(i2);
            m9043a.append(")");
            C7421n.m5056b("TrackGroup", "", new IllegalStateException(m9043a.toString()));
            return;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7175j0.class != obj.getClass()) {
            return false;
        }
        C7175j0 c7175j0 = (C7175j0) obj;
        return this.f12894a == c7175j0.f12894a && Arrays.equals(this.f12895b, c7175j0.f12895b);
    }

    public final int hashCode() {
        if (this.f12896c == 0) {
            this.f12896c = 527 + Arrays.hashCode(this.f12895b);
        }
        return this.f12896c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f12894a;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable(this.f12895b[i3], 0);
        }
    }
}
