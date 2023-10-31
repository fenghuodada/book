package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.SB */
/* loaded from: assets/audience_network.dex */
public class C5598SB extends AbstractC41844Y {
    public static byte[] A0H;
    public static String[] A0I = {"vVts3290hN8iYOphvTtUHsw8p", "g", "QXZRYfiopoOIgyOb", "uRY3EBcOhcPzIFCW", "1yhQGC5wOot73mjsntHrCCOy6H7", "ngPHprqJPXgJBcmGEhNrmzVf2B4dA5Oh", "DCeBbFrEMIUsiq6", "addqTveDrmk"};
    @Nullable
    public InterfaceC5393Or A02;
    public C5521Qw A04;
    @Nullable
    public List<C5437Pa> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C6213cB A0C;
    public final AbstractC41924g A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC5397Ov A0F = new C5601SE(this);
    public InterfaceC5395Ot A03 = new C5600SD(this);
    public final InterfaceC5396Ou A0E = new C5599SC(this);

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0H = new byte[]{-26, -6, -7, -12, 4, -11, -15, -26, -2, 4, -22, -13, -26, -25, -15, -22, -23, 4, -11, -26, -9, -26, -14, 7, 17, 29, 4, 7, 16, 17, 18, 29, 20, 7, 2, 3, 13, 29, 14, -1, 16, -1, 11, -5, -12, -15, -6, -14, -22, 4, -15, -22, -5, -22, -15, 4, -11, -26, -9, -26, -14};
    }

    static {
        A08();
    }

    public C5598SB(C40512M c40512m, int i, @Nullable List<C5437Pa> list, @Nullable C5521Qw c5521Qw, @Nullable Bundle bundle) {
        this.A0C = c40512m.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = c5521Qw;
        this.A0D = new C6212cA(c40512m.getContext());
        this.A0B = c40512m.getContext();
        c40512m.A1j(this);
        A0D(bundle);
    }

    @Nullable
    private AbstractC5634Sl A03(int i, int i2) {
        return A04(i, i2, true);
    }

    @Nullable
    private AbstractC5634Sl A04(int i, int i2, boolean isCompletelyVisible) {
        AbstractC5634Sl abstractC5634Sl = null;
        while (i <= i2) {
            AbstractC5634Sl abstractC5634Sl2 = (AbstractC5634Sl) this.A0C.A1q(i);
            if (abstractC5634Sl2 == null || abstractC5634Sl2.A0h()) {
                return null;
            }
            boolean A0b = A0b(abstractC5634Sl2);
            if (A0I[2].length() != 16) {
                throw new RuntimeException();
            }
            A0I[0] = "";
            if (abstractC5634Sl == null && abstractC5634Sl2.A0i() && A0b && !this.A0G.contains(Integer.valueOf(i)) && (!isCompletelyVisible || A0I(abstractC5634Sl2, this.A0A))) {
                abstractC5634Sl = abstractC5634Sl2;
            }
            if (abstractC5634Sl2.A0i() && !A0b) {
                A0C(i, false);
            }
            i++;
        }
        return abstractC5634Sl;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int A28 = this.A0C.A28();
        int lastVisibleItem = this.A0C.A29();
        AbstractC5634Sl firstAutoplayableVideo = A03(A28, lastVisibleItem);
        if (firstAutoplayableVideo != null) {
            firstAutoplayableVideo.A0f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int A27 = this.A0C.A27();
        if (A27 != -1 && A27 < this.A05.size() - 1) {
            A0V(A27 + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i) {
        AbstractC5634Sl A04 = A04(i + 1, this.A0C.A29(), false);
        if (A04 != null) {
            A04.A0f();
            A0V(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i2) {
        while (i <= i2) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i2) {
        A0S(i);
        A0S(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i, boolean z) {
        if (z) {
            this.A0G.add(Integer.valueOf(i));
        } else {
            this.A0G.remove(Integer.valueOf(i));
        }
    }

    private void A0D(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 39), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 39), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 64), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return C5064JR.A21(this.A0B) || this.A0A == 1;
    }

    public static boolean A0I(AbstractC5381Of abstractC5381Of, int i) {
        int width;
        int width2;
        if (i != 2) {
            width = (int) (((abstractC5381Of.getWidth() + C5208Lr.A01.widthPixels) * 1.3f) / 2.0f);
        } else {
            int i2 = C5208Lr.A01.widthPixels;
            if (A0I[5].charAt(29) != '5') {
                throw new RuntimeException();
            }
            A0I[0] = "Sny8hSa0LYjBAej7q";
            width = i2 - 1;
        }
        if (i != 2) {
            width2 = (int) (((C5208Lr.A01.widthPixels - abstractC5381Of.getWidth()) * 0.7f) / 2.0f);
        } else {
            width2 = 1;
        }
        return ((int) (abstractC5381Of.getX() + ((float) abstractC5381Of.getWidth()))) <= width && abstractC5381Of.getX() >= ((float) width2);
    }

    private boolean A0J(AbstractC5634Sl abstractC5634Sl) {
        if (this.A08 && abstractC5634Sl.A0i()) {
            this.A08 = false;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41844Y
    public void A0L(C4804F9 c4804f9, int i) {
        super.A0L(c4804f9, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41844Y
    public void A0M(C4804F9 c4804f9, int i, int i2) {
        super.A0M(c4804f9, i, i2);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int A28 = this.A0C.A28();
        int A29 = this.A0C.A29();
        A0B(A28, A29);
        A0A(A28, A29);
        A0W(A28, A29, i);
    }

    public final InterfaceC5395Ot A0N() {
        return this.A03;
    }

    public final InterfaceC5396Ou A0O() {
        return this.A0E;
    }

    public final InterfaceC5397Ov A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int A29 = this.A0C.A29();
        for (int A28 = this.A0C.A28(); A28 <= A29 && A28 >= 0; A28++) {
            AbstractC5634Sl abstractC5634Sl = (AbstractC5634Sl) this.A0C.A1q(A28);
            if (abstractC5634Sl != null && abstractC5634Sl.A0h()) {
                this.A01 = A28;
                abstractC5634Sl.A0e();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC5634Sl abstractC5634Sl = (AbstractC5634Sl) this.A0C.A1q(this.A01);
        if (abstractC5634Sl != null && this.A01 >= 0) {
            abstractC5634Sl.A0f();
        }
    }

    public final void A0S(int i) {
        AbstractC5634Sl abstractC5634Sl = (AbstractC5634Sl) this.A0C.A1q(i);
        if (abstractC5634Sl == null || A0b(abstractC5634Sl)) {
            return;
        }
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[0] = "Vxamqv9qm4zlsVVB8";
        A0a(abstractC5634Sl, false);
    }

    public final void A0T(int i) {
        List<C5437Pa> list;
        AbstractC5634Sl abstractC5634Sl = (AbstractC5634Sl) this.A0C.A1q(i);
        if (abstractC5634Sl == null) {
            return;
        }
        if (A0b(abstractC5634Sl)) {
            A0a(abstractC5634Sl, true);
        }
        if (!A0J(abstractC5634Sl) || (list = this.A05) == null) {
            return;
        }
        this.A0F.setVolume(list.get(((Integer) abstractC5634Sl.getTag(-1593835536)).intValue()).A03().A0D().A09() ? 0.0f : 1.0f);
    }

    public final void A0U(int i) {
        A0A(i, i);
    }

    public final void A0V(int i) {
        this.A0D.A0A(i);
        this.A0C.A1L(this.A0D);
    }

    public final void A0W(int recomputeFrom, int i, int i2) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int A27 = this.A0C.A27();
        if (A27 == -1) {
            A27 = i2 < 0 ? recomputeFrom : i;
        }
        this.A02.AFK(A27);
    }

    public final void A0X(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 39), this.A00);
        bundle.putBoolean(A05(0, 23, 39), this.A07);
        bundle.putBoolean(A05(23, 20, 64), this.A08);
    }

    public void A0Y(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Z(InterfaceC5393Or interfaceC5393Or) {
        this.A02 = interfaceC5393Or;
    }

    public void A0a(AbstractC5634Sl abstractC5634Sl, boolean z) {
        if (A0H()) {
            A0Y(abstractC5634Sl, z);
        }
        if (z) {
            return;
        }
        boolean A0h = abstractC5634Sl.A0h();
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[2] = "slnyAJQBNPORwedJ";
        if (A0h) {
            abstractC5634Sl.A0e();
        }
    }

    public boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
