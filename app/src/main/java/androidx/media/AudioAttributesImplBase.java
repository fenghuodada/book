package androidx.media;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0235r;
import java.util.Arrays;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: a */
    public int f3514a = 0;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: b */
    public int f3515b = 0;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: c */
    public int f3516c = 0;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: d */
    public int f3517d = -1;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f3515b != audioAttributesImplBase.f3515b) {
            return false;
        }
        int i2 = this.f3516c;
        int i3 = audioAttributesImplBase.f3516c;
        int i4 = audioAttributesImplBase.f3517d;
        if (i4 != -1) {
            i = i4;
        } else {
            int i5 = audioAttributesImplBase.f3514a;
            int i6 = AudioAttributesCompat.f3510b;
            if ((i3 & 1) == 1) {
                i = 7;
            } else {
                i = 4;
                if ((i3 & 4) == 4) {
                    i = 6;
                } else {
                    switch (i5) {
                        case 2:
                            i = 0;
                            break;
                        case 3:
                            i = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i = 5;
                            break;
                        case 6:
                            i = 2;
                            break;
                        case 11:
                            i = 10;
                            break;
                        case 12:
                        default:
                            i = 3;
                            break;
                        case 13:
                            i = 1;
                            break;
                    }
                }
            }
        }
        if (i == 6) {
            i3 |= 4;
        } else if (i == 7) {
            i3 |= 1;
        }
        if (i2 != (i3 & 273) || this.f3514a != audioAttributesImplBase.f3514a || this.f3517d != i4) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3515b), Integer.valueOf(this.f3516c), Integer.valueOf(this.f3514a), Integer.valueOf(this.f3517d)});
    }

    @NonNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3517d != -1) {
            sb.append(" stream=");
            sb.append(this.f3517d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f3514a;
        int i2 = AudioAttributesCompat.f3510b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = C0235r.m12816a("unknown usage ", i);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f3515b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3516c).toUpperCase());
        return sb.toString();
    }
}
