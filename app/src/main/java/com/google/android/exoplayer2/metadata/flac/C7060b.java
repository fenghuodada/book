package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.metadata.flac.b */
/* loaded from: classes.dex */
public final class C7060b implements C7042a.InterfaceC7044b {
    public static final Parcelable.Creator<C7060b> CREATOR = new C7061a();

    /* renamed from: a */
    public final String f12523a;

    /* renamed from: b */
    public final String f12524b;

    /* renamed from: com.google.android.exoplayer2.metadata.flac.b$a */
    /* loaded from: classes.dex */
    public class C7061a implements Parcelable.Creator<C7060b> {
        @Override // android.os.Parcelable.Creator
        public final C7060b createFromParcel(Parcel parcel) {
            return new C7060b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7060b[] newArray(int i) {
            return new C7060b[i];
        }
    }

    public C7060b(Parcel parcel) {
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12523a = readString;
        this.f12524b = parcel.readString();
    }

    public C7060b(String str, String str2) {
        this.f12523a = str;
        this.f12524b = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: G */
    public final /* synthetic */ byte[] mo5510G() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: a */
    public final void mo5509a(MediaMetadata.C6623a c6623a) {
        char c;
        String str = this.f12523a;
        str.getClass();
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = this.f12524b;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4) {
                            c6623a.f10513b = str2;
                            return;
                        }
                        return;
                    }
                    c6623a.f10515d = str2;
                    return;
                }
                c6623a.f10518g = str2;
                return;
            }
            c6623a.f10512a = str2;
            return;
        }
        c6623a.f10514c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7060b.class != obj.getClass()) {
            return false;
        }
        C7060b c7060b = (C7060b) obj;
        return this.f12523a.equals(c7060b.f12523a) && this.f12524b.equals(c7060b.f12524b);
    }

    public final int hashCode() {
        return this.f12524b.hashCode() + C0406q1.m12537a(this.f12523a, 527, 31);
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: o */
    public final /* synthetic */ C7003m0 mo5508o() {
        return null;
    }

    public final String toString() {
        String str = this.f12523a;
        int m12193a = C0552c.m12193a(str, 5);
        String str2 = this.f12524b;
        StringBuilder sb = new StringBuilder(C0552c.m12193a(str2, m12193a));
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12523a);
        parcel.writeString(this.f12524b);
    }
}
