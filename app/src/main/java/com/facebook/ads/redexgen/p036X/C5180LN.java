package com.facebook.ads.redexgen.p036X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.LN */
/* loaded from: assets/audience_network.dex */
public final class C5180LN {
    public static byte[] A00;
    public static String[] A01 = {"R2O7PMYP6nkOeNui3I4WlXx4fu7rpRKA", "y", "n9RLgUbY6qPVyxnn4C2MCNq6tOX6tKMu", "KtI8XvYnNiAs4lVQz", "VIjGruAAxxfbDEfj8", "jnPluIPOifq7BY1vqnqKLiUetY3DHsfM", "J5aiTqmsNT2689NKU", "zCaDldCe0EtEl2h3W"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C5953Xy> A06;
    public static final AtomicReference<InterfaceC5187LW> A07;
    public static final AtomicReference<InterfaceC5189LY> A08;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-68, -49, -46, -36, -27, -19, -49, -46, -19, -35, -48, -40, -19, -41, -46, -19, -39, -45, -25, 102, 121, 124, -122, -113, -105, -121, -118, -127, Byte.MAX_VALUE, -127, -122, 121, -124, -105, 125, -112, -116, -118, 121, -117, -94, -75, -72, -62, -53, -45, -57, -75, -54, -71, -72, -45, -57, -56, -75, -56, -71, -45, -72, -75, -56, -75, -33, -19, 2, -15, -16, -84, -1, 0, -19, 0, -15, -84, -18, 1, -6, -16, -8, -15, -84, -11, -1, -84, -15, -7, -4, 0, 5, -83, -77, -75, -58, -79, -57, -58, -69, -66, -82, -69, -84, -80, -71, -74, -78, -69, -63, -84, -63, -68, -72, -78, -69};
    }

    static {
        A07();
        A02 = C5180LN.class.getPackage();
        A04 = A02 + A06(40, 22, 98);
        A03 = A02 + A06(0, 19, 124);
        A05 = A02 + A06(19, 21, 38);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static Intent A00(Intent cloneIntent) {
        Intent cloneFilter = cloneIntent.cloneFilter();
        cloneFilter.setFlags(cloneIntent.getFlags());
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(cloneIntent.getExtras());
        cloneFilter.putExtra(A05, obtain.marshall());
        obtain.recycle();
        return cloneFilter;
    }

    public static Intent A01(Intent startIntent, ClassLoader classLoader) {
        Intent cloneFilter = startIntent.cloneFilter();
        cloneFilter.setFlags(startIntent.getFlags());
        Bundle bundle = new Bundle();
        Parcel obtain = Parcel.obtain();
        byte[] byteArrayExtra = startIntent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            bundle = obtain.readBundle(classLoader);
            obtain.recycle();
        }
        cloneFilter.putExtras(bundle);
        return cloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(classLoader);
            obtain.recycle();
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "08vXapB5qdF8q1e2g";
            strArr2[3] = "bPV7EQI3jYdBWJzP2";
            return readBundle;
        }
        throw new IllegalStateException(A06(62, 28, 122));
    }

    @Nullable
    public static C5953Xy A03(Intent intent) {
        String adId = intent.getStringExtra(A03);
        if (adId != null) {
            for (C5953Xy c5953Xy : A06) {
                if (adId.equals(c5953Xy.A0D().getId())) {
                    return c5953Xy;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C5953Xy c5953Xy) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c5953Xy.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c5953Xy.A0D().getId());
        A06.add(c5953Xy);
        return adActivityIntent;
    }

    public static Class A05() {
        if (A01[1].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "4NnM5dRGBMW0KGxzs";
        strArr[3] = "N6FCbEqQMIqNBYuck";
        return AudienceNetworkActivity.class;
    }

    public static void A08(Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        bundle.putByteArray(A04, obtain.marshall());
        obtain.recycle();
    }

    public static void A09(C5953Xy c5953Xy, AdActivityIntent adActivityIntent) throws C5178LL {
        try {
            c5953Xy.getApplicationContext().startActivity(A00(adActivityIntent));
        } catch (ActivityNotFoundException e) {
            throw new C5178LL(e);
        }
    }

    public static boolean A0A(Intent intent, Set<String> set) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String prefix = data.toString();
        for (String url : set) {
            if (prefix.startsWith(url)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0B(C5953Xy c5953Xy, Intent intent) throws C5178LL {
        return A0D(c5953Xy, intent, A07.get());
    }

    public static boolean A0C(C5953Xy c5953Xy, Intent intent) throws C5178LL {
        InterfaceC5187LW interfaceC5187LW = A07.get();
        if (interfaceC5187LW == null || c5953Xy.A0C() == null) {
            return false;
        }
        String requestId = c5953Xy.A0A();
        try {
            Activity A0C = c5953Xy.A0C();
            if (requestId == null) {
                requestId = A06(0, 0, 81);
            }
            return interfaceC5187LW.startActivityForResult(intent, 0, A0C, requestId);
        } catch (ActivityNotFoundException e) {
            throw new C5178LL(e);
        } catch (Exception e2) {
            c5953Xy.A06().A8y(A06(90, 8, 64), C44458z.A07, new C444690(e2));
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0D(C5953Xy c5953Xy, Intent intent, @Nullable InterfaceC5187LW interfaceC5187LW) throws C5178LL {
        if (A0A(intent, C5064JR.A0W(c5953Xy))) {
            return false;
        }
        Activity activity = c5953Xy;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[1] = "W";
        Activity A0C = c5953Xy.A0C();
        if (A0C != null) {
            activity = A0C;
        } else {
            intent.addFlags(268435456);
        }
        if (interfaceC5187LW != null && !A0A(intent, C5064JR.A0Y(c5953Xy))) {
            String requestId = c5953Xy.A0A();
            if (requestId == null) {
                try {
                    requestId = A06(0, 0, 81);
                } catch (ActivityNotFoundException e) {
                    throw new C5178LL(e);
                } catch (Exception e2) {
                    c5953Xy.A06().A8y(A06(90, 8, 64), C44458z.A08, new C444690(e2));
                    return false;
                }
            }
            return interfaceC5187LW.startActivity(activity, intent, requestId);
        }
        try {
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e3) {
            throw new C5178LL(e3);
        }
    }

    public static boolean A0E(C5953Xy c5953Xy, Uri uri, String str) throws ActivityNotFoundException {
        return A0F(c5953Xy, uri, str, A08.get());
    }

    @VisibleForTesting
    public static boolean A0F(C5953Xy c5953Xy, Uri uri, String str, @Nullable InterfaceC5189LY interfaceC5189LY) throws ActivityNotFoundException {
        if (interfaceC5189LY == null || c5953Xy.A0C() == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString(A06(98, 15, 59), str);
        return interfaceC5189LY.handleUriForResult(c5953Xy, uri.toString(), bundle, null, 0, c5953Xy.A0C());
    }
}
