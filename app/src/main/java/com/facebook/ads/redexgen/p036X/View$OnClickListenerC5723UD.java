package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.UD */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5723UD implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, InterfaceC44128S {
    public static byte[] A02;
    public final C5953Xy A00;
    public final /* synthetic */ C5721UB A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, 14, 74, 9, 11, 4, 4, 5, 30, 74, 8, 15, 74, 9, 6, 3, 9, 1, 15, 14, 74, 8, 15, 12, 5, 24, 15, 74, 3, 30, 74, 3, 25, 74, 28, 3, 15, 29, 15, 14, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, 20, 16, 19, 39, 54, 59, 55, 60, 49, 55, 28, 55, 38, 37, 61, 32, 57, 56, 25, 86, 2, 25, 3, 21, 30, 86, 18, 23, 2, 23, 86, 4, 19, 21, 25, 4, 18, 19, 18, 90, 86, 6, 26, 19, 23, 5, 19, 86, 19, 24, 5, 3, 4, 19, 86, 2, 25, 3, 21, 30, 86, 19, 0, 19, 24, 2, 5, 86, 4, 19, 23, 21, 30, 86, 2, 30, 19, 86, 23, 18, 86, 32, 31, 19, 1, 86, 20, 15, 86, 4, 19, 2, 3, 4, 24, 31, 24, 17, 86, 16, 23, 26, 5, 19, 86, 31, 16, 86, 15, 25, 3, 86, 31, 24, 2, 19, 4, 21, 19, 6, 2, 86, 2, 30, 19, 86, 19, 0, 19, 24, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    public View$OnClickListenerC5723UD(C5721UB c5721ub, C5953Xy c5953Xy) {
        this.A01 = c5721ub;
        this.A00 = c5953Xy;
    }

    public /* synthetic */ View$OnClickListenerC5723UD(C5721UB c5721ub, C5953Xy c5953Xy, C5732UM c5732um) {
        this(c5721ub, c5953Xy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        C5521Qw c5521Qw;
        C5237MK c5237mk;
        EnumC5107K8 enumC5107K8;
        boolean z;
        boolean z2;
        EnumC5107K8 enumC5107K82;
        C5356OG c5356og = new C5356OG();
        c5521Qw = this.A01.A0R;
        C5356OG A03 = c5356og.A03(c5521Qw);
        c5237mk = this.A01.A0f;
        Map<String, String> A05 = A03.A02(c5237mk).A05();
        enumC5107K8 = this.A01.A0I;
        if (enumC5107K8 != null) {
            enumC5107K82 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(enumC5107K82.A04()));
        }
        z = this.A01.A0W;
        if (z) {
            z2 = this.A01.A0W;
            A05.put(A00(198, 3, 116), String.valueOf(z2));
        }
        return A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> map) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(map);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44128S
    public final C5953Xy A5b() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5237MK c5237mk;
        C5953Xy c5953Xy;
        C5237MK c5237mk2;
        C5953Xy c5953Xy2;
        C5953Xy c5953Xy3;
        C5237MK c5237mk3;
        C5237MK c5237mk4;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            c5237mk = this.A01.A0f;
            boolean A08 = c5237mk.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            c5953Xy = this.A01.A0c;
            int A0E = C5064JR.A0E(c5953Xy);
            if (A0E >= 0) {
                c5237mk3 = this.A01.A0f;
                if (c5237mk3.A03() < A0E) {
                    c5237mk4 = this.A01.A0f;
                    if (!c5237mk4.A07()) {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    }
                }
            }
            c5237mk2 = this.A01.A0f;
            c5953Xy2 = this.A01.A0c;
            if (!c5237mk2.A09(c5953Xy2)) {
                c5953Xy3 = this.A01.A0c;
                if (C5064JR.A14(c5953Xy3)) {
                    if (this.A01.A0a != null) {
                        this.A01.A0a.A0Q(A01());
                    }
                    C5207Lq.A00(new DialogInterface$OnClickListenerC5100K1(this), new DialogInterface$OnClickListenerC5101K2(this), ActivityUtils.A00());
                    return;
                }
                A05(A01());
            } else if (this.A01.A0a != null) {
                this.A01.A0a.A0N(A01());
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        C5354OE c5354oe;
        C5354OE c5354oe2;
        View view3;
        View view4;
        C5354OE c5354oe3;
        C5354OE c5354oe4;
        view2 = this.A01.A04;
        if (view2 != null) {
            c5354oe = this.A01.A0L;
            if (c5354oe != null) {
                c5354oe2 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                c5354oe2.setBounds(0, 0, width, view4.getHeight());
                c5354oe3 = this.A01.A0L;
                c5354oe4 = this.A01.A0L;
                c5354oe3.A0D(!c5354oe4.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C5237MK c5237mk;
        C5953Xy c5953Xy;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        c5237mk = this.A01.A0f;
        c5953Xy = this.A01.A0c;
        view2 = this.A01.A04;
        c5237mk.A06(c5953Xy, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
