package com.facebook.ads.redexgen.p036X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4P */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC41754P {
    public static byte[] A06;
    public static String[] A07 = {"wCFFy4v0UHolBGzubHhtaTK0KlaK5TU8", "WXL", "veTi", "n3", "rW28yUWMMTgiQlEcIz6smwE3e87Fn5Ax", "QU5acghFPGL2KQJts4swUt9W5A9MK8iM", "qIZlYUWuFA6tmX766BSANKSPkXlWbMWT", "RhPzJuizv3JTUr3AZhw4zLdz5ZpO"};
    public InterfaceC41734N A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{85, 84, 123, 84, 83, 87, 91, 78, 83, 85, 84, 73, 124, 83, 84, 83, 73, 82, 95, 94};
    }

    public abstract boolean A0E(@NonNull AbstractC41974l abstractC41974l, @Nullable C41744O c41744o, @NonNull C41744O c41744o2);

    public abstract boolean A0F(@NonNull AbstractC41974l abstractC41974l, @NonNull C41744O c41744o, @Nullable C41744O c41744o2);

    public abstract boolean A0G(@NonNull AbstractC41974l abstractC41974l, @NonNull C41744O c41744o, @NonNull C41744O c41744o2);

    public abstract boolean A0H(@NonNull AbstractC41974l abstractC41974l, @NonNull AbstractC41974l abstractC41974l2, @NonNull C41744O c41744o, @NonNull C41744O c41744o2);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(AbstractC41974l abstractC41974l);

    public abstract boolean A0L();

    static {
        A03();
    }

    public static int A00(AbstractC41974l abstractC41974l) {
        int i;
        i = abstractC41974l.A0C;
        int pos = i & 14;
        if (abstractC41974l.A0b()) {
            return 4;
        }
        if ((pos & 4) == 0) {
            int A0J = abstractC41974l.A0J();
            int A0G = abstractC41974l.A0G();
            String[] strArr = A07;
            String str = strArr[3];
            String str2 = strArr[1];
            int length = str.length();
            int oldPos = str2.length();
            if (length != oldPos) {
                A07[0] = "z6mPnscAmNwlAliMzxZ9cFQDVALsWjfG";
                if (A0J != -1 && A0G != -1 && A0J != A0G) {
                    return pos | 2048;
                }
                return pos;
            }
            throw new RuntimeException();
        }
        return pos;
    }

    private final C41744O A01() {
        return new C41744O();
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        return this.A01;
    }

    public final long A06() {
        return this.A02;
    }

    public final long A07() {
        return this.A03;
    }

    @NonNull
    public final C41744O A08(@NonNull C41944i c41944i, @NonNull AbstractC41974l abstractC41974l) {
        return A01().A01(abstractC41974l);
    }

    @NonNull
    public final C41744O A09(@NonNull C41944i c41944i, @NonNull AbstractC41974l abstractC41974l, int i, @NonNull List<Object> list) {
        return A01().A01(abstractC41974l);
    }

    public final void A0A() {
        int i = this.A05.size();
        if (0 < i) {
            this.A05.get(0);
            throw new NullPointerException(A02(0, 20, 16));
        } else {
            this.A05.clear();
        }
    }

    public final void A0B(InterfaceC41734N interfaceC41734N) {
        this.A04 = interfaceC41734N;
    }

    public final void A0C(AbstractC41974l abstractC41974l) {
        InterfaceC41734N interfaceC41734N = this.A04;
        if (interfaceC41734N != null) {
            interfaceC41734N.A9z(abstractC41974l);
        }
    }

    public boolean A0D(@NonNull AbstractC41974l abstractC41974l) {
        return true;
    }

    public boolean A0M(@NonNull AbstractC41974l abstractC41974l, @NonNull List<Object> list) {
        return A0D(abstractC41974l);
    }
}
