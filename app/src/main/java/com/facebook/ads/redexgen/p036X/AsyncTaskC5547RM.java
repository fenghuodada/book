package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.RM */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC5547RM extends AsyncTask<String, Void, C5548RN> {
    public static byte[] A05;
    public static String[] A06 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A07;
    public static final Set<String> A08;
    public C44148U A00;
    public InterfaceC5526R1 A01;
    public InterfaceC5546RL A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, 22, 22, 11, 22, 68, 11, 20, 1, 10, 13, 10, 3, 68, 17, 22, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    static {
        A04();
        A07 = AsyncTaskC5547RM.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 73));
        A08.add(A01(29, 4, 24));
    }

    public AsyncTaskC5547RM(C44148U c44148u) {
        this(c44148u, null, null);
    }

    public AsyncTaskC5547RM(C44148U c44148u, Map<String, String> map) {
        this(c44148u, map, null);
    }

    public AsyncTaskC5547RM(C44148U c44148u, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        this.A00 = c44148u;
        Map<String, String> postData = map != null ? new HashMap<>(map) : null;
        this.A03 = postData;
        Map<String, String> extraData = map2 != null ? new HashMap<>(map2) : null;
        this.A04 = extraData;
    }

    private final C5548RN A00(String... strArr) {
        if (C5158L0.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String A02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        String url = entry.getValue();
                        A02 = A03(A02, entry.getKey(), url);
                    }
                }
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A06(A02)) {
                        return new C5548RN(this.A01);
                    }
                    i = i2;
                }
            }
            return null;
        } catch (Throwable th) {
            if (A06[6].length() != 31) {
                A06[6] = "dO3qGWbyMuVAZQTwO1X30zVxIjEEo";
                C5158L0.A00(th, this);
                return null;
            }
            throw new RuntimeException();
        }
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), C5214Lx.A01(this.A00.A02().A5i()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 92);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 124);
        }
        return str + A01 + str2 + A01(2, 1, 100) + URLEncoder.encode(str3);
    }

    private final void A05(C5548RN c5548rn) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.ADO(c5548rn);
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A06(String str) {
        InterfaceC5526R1 ADA;
        InterfaceC5527R2 A00 = C5545RK.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                ADA = A00.ADA(str, new C5541RG());
            } else {
                C5541RG c5541rg = new C5541RG();
                c5541rg.A05(this.A04);
                ADA = A00.ADB(str, c5541rg.A08());
            }
            this.A01 = ADA;
        } catch (Exception e) {
            String str2 = A07;
            Log.e(str2, A01(4, 19, 62) + str, e);
        }
        InterfaceC5526R1 interfaceC5526R1 = this.A01;
        return interfaceC5526R1 != null && interfaceC5526R1.A7a() == 200;
    }

    public final void A07(InterfaceC5546RL interfaceC5546RL) {
        this.A02 = interfaceC5546RL;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C5548RN doInBackground(String[] strArr) {
        if (C5158L0.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        InterfaceC5546RL interfaceC5546RL = this.A02;
        if (interfaceC5546RL != null) {
            interfaceC5546RL.ADM();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C5548RN c5548rn) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A05(c5548rn);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            C5158L0.A00(th, this);
        }
    }
}
