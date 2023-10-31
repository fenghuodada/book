package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.AbstractC1802a;
import java.nio.charset.Charset;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC1802a abstractC1802a) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2392a = abstractC1802a.m9933j(iconCompat.f2392a, 1);
        byte[] bArr = iconCompat.f2394c;
        if (abstractC1802a.mo9924h(2)) {
            bArr = abstractC1802a.mo9926f();
        }
        iconCompat.f2394c = bArr;
        iconCompat.f2395d = abstractC1802a.m9932l(iconCompat.f2395d, 3);
        iconCompat.f2396e = abstractC1802a.m9933j(iconCompat.f2396e, 4);
        iconCompat.f2397f = abstractC1802a.m9933j(iconCompat.f2397f, 5);
        iconCompat.f2398g = (ColorStateList) abstractC1802a.m9932l(iconCompat.f2398g, 6);
        String str = iconCompat.f2400i;
        if (abstractC1802a.mo9924h(7)) {
            str = abstractC1802a.mo9921m();
        }
        iconCompat.f2400i = str;
        String str2 = iconCompat.f2401j;
        if (abstractC1802a.mo9924h(8)) {
            str2 = abstractC1802a.mo9921m();
        }
        iconCompat.f2401j = str2;
        iconCompat.f2399h = PorterDuff.Mode.valueOf(iconCompat.f2400i);
        switch (iconCompat.f2392a) {
            case -1:
                parcelable = iconCompat.f2395d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2393b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.f2395d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f2394c;
                    iconCompat.f2393b = bArr2;
                    iconCompat.f2392a = 3;
                    iconCompat.f2396e = 0;
                    iconCompat.f2397f = bArr2.length;
                    break;
                }
                iconCompat.f2393b = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f2394c, Charset.forName("UTF-16"));
                iconCompat.f2393b = str3;
                if (iconCompat.f2392a == 2 && iconCompat.f2401j == null) {
                    iconCompat.f2401j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f2393b = iconCompat.f2394c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1802a abstractC1802a) {
        abstractC1802a.getClass();
        iconCompat.f2400i = iconCompat.f2399h.name();
        switch (iconCompat.f2392a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f2395d = (Parcelable) iconCompat.f2393b;
                break;
            case 2:
                iconCompat.f2394c = ((String) iconCompat.f2393b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2394c = (byte[]) iconCompat.f2393b;
                break;
            case 4:
            case 6:
                iconCompat.f2394c = iconCompat.f2393b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f2392a;
        if (-1 != i) {
            abstractC1802a.m9930t(i, 1);
        }
        byte[] bArr = iconCompat.f2394c;
        if (bArr != null) {
            abstractC1802a.mo9920o(2);
            abstractC1802a.mo9918q(bArr);
        }
        Parcelable parcelable = iconCompat.f2395d;
        if (parcelable != null) {
            abstractC1802a.mo9920o(3);
            abstractC1802a.mo9915u(parcelable);
        }
        int i2 = iconCompat.f2396e;
        if (i2 != 0) {
            abstractC1802a.m9930t(i2, 4);
        }
        int i3 = iconCompat.f2397f;
        if (i3 != 0) {
            abstractC1802a.m9930t(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2398g;
        if (colorStateList != null) {
            abstractC1802a.mo9920o(6);
            abstractC1802a.mo9915u(colorStateList);
        }
        String str = iconCompat.f2400i;
        if (str != null) {
            abstractC1802a.mo9920o(7);
            abstractC1802a.mo9914v(str);
        }
        String str2 = iconCompat.f2401j;
        if (str2 != null) {
            abstractC1802a.mo9920o(8);
            abstractC1802a.mo9914v(str2);
        }
    }
}
