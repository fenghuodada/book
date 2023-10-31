package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.metadata.id3.l */
/* loaded from: classes.dex */
public final class C7090l extends AbstractC7083h {
    public static final Parcelable.Creator<C7090l> CREATOR = new C7091a();
    @Nullable

    /* renamed from: b */
    public final String f12576b;

    /* renamed from: c */
    public final String f12577c;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.l$a */
    /* loaded from: classes.dex */
    public class C7091a implements Parcelable.Creator<C7090l> {
        @Override // android.os.Parcelable.Creator
        public final C7090l createFromParcel(Parcel parcel) {
            return new C7090l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7090l[] newArray(int i) {
            return new C7090l[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7090l(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f12576b = r0
            java.lang.String r3 = r3.readString()
            r2.f12577c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.C7090l.<init>(android.os.Parcel):void");
    }

    public C7090l(String str, @Nullable String str2, String str3) {
        super(str);
        this.f12576b = str2;
        this.f12577c = str3;
    }

    /* renamed from: b */
    public static ArrayList m5511b(String str) {
        String substring;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                substring = str.substring(8, 10);
            } else if (str.length() < 7) {
                if (str.length() >= 4) {
                    substring = str.substring(0, 4);
                }
                return arrayList;
            } else {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                substring = str.substring(5, 7);
            }
            arrayList.add(Integer.valueOf(Integer.parseInt(substring)));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h, com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: a */
    public final void mo5509a(MediaMetadata.C6623a c6623a) {
        char c;
        Integer num;
        String str = this.f12565a;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = this.f12577c;
        try {
            switch (c) {
                case 0:
                case '\n':
                    c6623a.f10514c = str2;
                    return;
                case 1:
                case 11:
                    c6623a.f10534w = str2;
                    return;
                case 2:
                case '\f':
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    c6623a.f10528q = Integer.valueOf(parseInt);
                    c6623a.f10529r = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 17:
                    c6623a.f10513b = str2;
                    return;
                case 4:
                case 18:
                    c6623a.f10515d = str2;
                    return;
                case 5:
                case 19:
                    c6623a.f10535x = str2;
                    return;
                case 6:
                case 20:
                    int i = C7408g0.f13905a;
                    String[] split = str2.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    c6623a.f10523l = Integer.valueOf(parseInt3);
                    c6623a.f10524m = num;
                    return;
                case 7:
                case 16:
                    c6623a.f10512a = str2;
                    return;
                case '\b':
                case 15:
                    c6623a.f10533v = str2;
                    return;
                case '\t':
                case 21:
                    c6623a.f10527p = Integer.valueOf(Integer.parseInt(str2));
                    return;
                case '\r':
                    ArrayList m5511b = m5511b(str2);
                    int size = m5511b.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c6623a.f10529r = (Integer) m5511b.get(2);
                            } else {
                                return;
                            }
                        }
                        c6623a.f10528q = (Integer) m5511b.get(1);
                    }
                    c6623a.f10527p = (Integer) m5511b.get(0);
                    return;
                case 14:
                    ArrayList m5511b2 = m5511b(str2);
                    int size2 = m5511b2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c6623a.f10532u = (Integer) m5511b2.get(2);
                            } else {
                                return;
                            }
                        }
                        c6623a.f10531t = (Integer) m5511b2.get(1);
                    }
                    c6623a.f10530s = (Integer) m5511b2.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7090l.class != obj.getClass()) {
            return false;
        }
        C7090l c7090l = (C7090l) obj;
        return C7408g0.m5105a(this.f12565a, c7090l.f12565a) && C7408g0.m5105a(this.f12576b, c7090l.f12576b) && C7408g0.m5105a(this.f12577c, c7090l.f12577c);
    }

    public final int hashCode() {
        int i;
        int m12537a = C0406q1.m12537a(this.f12565a, 527, 31);
        int i2 = 0;
        String str = this.f12576b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (m12537a + i) * 31;
        String str2 = this.f12577c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h
    public final String toString() {
        String str = this.f12565a;
        int m12193a = C0552c.m12193a(str, 22);
        String str2 = this.f12576b;
        int m12193a2 = C0552c.m12193a(str2, m12193a);
        String str3 = this.f12577c;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str3, m12193a2), str, ": description=", str2, ": value=");
        m9043a.append(str3);
        return m9043a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12565a);
        parcel.writeString(this.f12576b);
        parcel.writeString(this.f12577c);
    }
}
