package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.9Y */
/* loaded from: assets/audience_network.dex */
public final class C44799Y {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"Qr1EFu0kx1tI01867m6ODqfSZ9SwtWDI", "3TYgkAWbIjP9kMvunjr7VwfmqgOZ7ZQ4", "kyx9q1x7DLL5BxK3faNs604Sw4dxbCMr", "cJW9lkVABx2P1Kp63XktrUnlRFV2zQAL", "nhxLXaLaMxGTsXNVJcvnwyCHZZV2RS3H", "y9xLyKazRl3zNBUnfIZmAOMjGK0AXhl4", "DTEqb4TbXnNBCaxA5atVnYK0pSb9DMUi", "fZvghiN"};
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{76, 55, 42, 46, 45, 34, 67, 45, 25, 8, 5, 9, 2, 15, 9, 34, 9, 24, 27, 3, 30, 7, 42, 3, 30, 45, 2, 8, 30, 3, 5, 8, 87, 42, 46, Utf8.REPLACEMENT_BYTE, 34, 67, 71, 87, 42, 46, 45, 58, 67, 81, 44, 40, 40, 60, 69, 101, 24, 28, 18, 29, 113, 30, 99, 103, 118, 115, 10, 32, 36, 39, 36, 73, 16, 20, 0, 5, 121, 94, 71, 81, 64, 91, 66, 66, 20, 47, 42, 47, 46, 54, 47, 1, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 21, 15, 30, 9, 21, 26, 23, 85, 14, 26, 53, 55, 60, 55, 32, 59, 49, 49, 45, 45, 41, 119, 56, 62, 60, 55, 45, 38, 32, 54, 33, 12, 50, 52, 54, 61, 39, 60, 58, 44, 59, 22, 40, 46, 44, 39, 61, 22, 37, 40, 58, 61, 22, 59, 44, 47, 59, 44, 58, 33, 48, 34, 37, 24, 49, 46, 34, 48};
    }

    static {
        A08();
        A00 = A00(80, 7, 82);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    @TargetApi(17)
    @VisibleForTesting
    public static String A01(C44148U c44148u) {
        return WebSettings.getDefaultUserAgent(c44148u);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A02(final C44148U c44148u) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.9X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00 */
            public final String call() {
                AtomicReference atomicReference;
                AtomicReference atomicReference2;
                atomicReference = C44799Y.A04;
                String str = (String) atomicReference.get();
                if (str != null) {
                    return str;
                }
                WebView webView = new WebView(C44148U.this.getApplicationContext());
                webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.ads.redexgen.X.9W
                    @Override // android.webkit.WebViewClient
                    @RequiresApi(api = 26)
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        AbstractC5346O6.A02(C44458z.A2g);
                        return true;
                    }
                });
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    atomicReference2 = C44799Y.A04;
                    atomicReference2.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i = 0; i < 3; i++) {
            ExecutorC5239MM.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th) {
                A09(c44148u, th);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C44148U c44148u, C445599 c445599) {
        String A07 = c445599.A07();
        if (TextUtils.isEmpty(A07)) {
            boolean andSet = A03.getAndSet(true);
            String[] strArr = A02;
            if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "SlGltdwaGCQXXY2U2bjZ1NfeES9SOW6r";
            strArr2[0] = "AnJMWH4pc3dV3Xqon1tLsffrk7nZCcYt";
            if (!andSet) {
                c44148u.A06().A8y(A00(116, 7, 65), C44458z.A1Z, new C444690(A00(73, 7, 29)));
            }
        }
        return A07;
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A04(C44148U c44148u, boolean z) {
        if (c44148u == null) {
            return A00;
        }
        if (z) {
            return System.getProperty(A00(123, 10, 74));
        }
        String str = A04.get();
        if (str != null) {
            return str;
        }
        long A012 = C5063JQ.A01(c44148u);
        String A002 = A00(143, 23, 90);
        String A003 = A00(133, 10, 64);
        String A004 = A00(88, 28, 104);
        if (A012 > 0) {
            SharedPreferences sharedPreferences = c44148u.getSharedPreferences(ProcessUtils.getProcessSpecificName(A004, c44148u), 0);
            String string = sharedPreferences.getString(A003, null);
            long j = sharedPreferences.getLong(A002, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - j < A012) {
                A04.set(string);
                return string;
            }
        }
        String str2 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                str2 = A01(c44148u);
                A04.set(str2);
            } catch (Throwable th) {
                A09(c44148u, th);
            }
        }
        if (str2 == null) {
            str2 = A02(c44148u);
        }
        if (str2 == null) {
            String userAgentString = A00;
            return userAgentString;
        }
        int i = (A012 > 0L ? 1 : (A012 == 0L ? 0 : -1));
        String[] strArr = A02;
        if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
            throw new RuntimeException();
        }
        A02[7] = "Kvz6zSF";
        if (i > 0) {
            String userAgentString2 = ProcessUtils.getProcessSpecificName(A004, c44148u);
            SharedPreferences sharedPreferences2 = c44148u.getSharedPreferences(userAgentString2, 0);
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            String userAgentString3 = A04.get();
            edit.putString(A003, userAgentString3).apply();
            sharedPreferences2.edit().putLong(A002, System.currentTimeMillis()).apply();
        }
        return str2;
    }

    public static String A05(C445599 c445599, C44148U c44148u) {
        if (C5063JQ.A04(c44148u)) {
            return A00(63, 5, 117) + A03(c44148u, c445599) + A00(39, 6, 127) + c445599.A06() + A00(45, 6, 121) + c445599.A04() + A00(38, 1, 111);
        }
        return A00(0, 0, 40);
    }

    public static String A06(C445599 c445599, C44148U c44148u, boolean z) {
        return A04(c44148u, z) + A00(0, 38, 127) + c44148u.A03().A7m() + A00(57, 6, 54) + C445599.A03 + A00(38, 1, 111) + A05(c445599, c44148u) + A00(68, 5, 69) + c44148u.A03().A7n() + A00(51, 6, 77) + Locale.getDefault().toString() + A00(87, 1, 79);
    }

    public static void A09(C44148U c44148u, Throwable th) {
        c44148u.A06().A8y(A00(166, 8, 84), C44458z.A2f, new C444690(th));
    }
}
