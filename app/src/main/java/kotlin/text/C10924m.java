package kotlin.text;

import com.vungle.warren.downloader.DownloadRequest;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.text.m */
/* loaded from: classes3.dex */
public class C10924m extends C10923l {
    @SinceKotlin(version = "1.1")
    @Nullable
    /* renamed from: c */
    public static final Integer m400c(@NotNull String str) {
        boolean z;
        int i;
        int i2;
        C10909a.m407a(10);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            int m428h = C10843j.m428h(charAt, 48);
            int i4 = DownloadRequest.Priority.CRITICAL;
            if (m428h < 0) {
                i = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        i4 = Integer.MIN_VALUE;
                        z = true;
                    } else if (charAt == '+') {
                        z = false;
                    }
                }
            } else {
                z = false;
                i = 0;
            }
            int i5 = -59652323;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0 && ((i3 >= i5 || (i5 == -59652323 && i3 >= (i5 = i4 / 10))) && (i2 = i3 * 10) >= i4 + digit)) {
                    i3 = i2 - digit;
                    i++;
                }
            }
            if (z) {
                return Integer.valueOf(i3);
            }
            return Integer.valueOf(-i3);
        }
        return null;
    }
}
