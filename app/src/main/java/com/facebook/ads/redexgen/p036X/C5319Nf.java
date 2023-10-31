package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Nf */
/* loaded from: assets/audience_network.dex */
public final class C5319Nf extends LinearLayout {
    public static final int A03 = (int) (C5208Lr.A00 * 40.0f);
    public static final int A04 = (int) (C5208Lr.A00 * 20.0f);
    public static final int A05 = (int) (C5208Lr.A00 * 10.0f);
    public final C40462H A00;
    public final C5953Xy A01;
    public final InterfaceC5303NP A02;

    public C5319Nf(C5953Xy c5953Xy, C40462H c40462h, InterfaceC5303NP interfaceC5303NP, EnumC5253Ma enumC5253Ma) {
        this(c5953Xy, c40462h, interfaceC5303NP, null, enumC5253Ma);
    }

    public C5319Nf(C5953Xy c5953Xy, C40462H c40462h, InterfaceC5303NP interfaceC5303NP, @Nullable String str, EnumC5253Ma enumC5253Ma) {
        super(c5953Xy);
        this.A01 = c5953Xy;
        this.A00 = c40462h;
        this.A02 = interfaceC5303NP;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View A01 = A01(str);
            A01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            C5245MS.A0M(view, -10459280);
            addView(A01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(enumC5253Ma, this.A00.A03());
            int i = A05;
            A00.setPadding(0, i, 0, i);
            addView(A00, layoutParams);
        }
        ViewGroup A02 = A02();
        A02.setPadding(0, A05, 0, 0);
        addView(A02, layoutParams);
    }

    private View A00(EnumC5253Ma enumC5253Ma, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(C5254Mb.A01(enumC5253Ma));
        TextView textView = new TextView(getContext());
        C5245MS.A0X(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(C5254Mb.A01(EnumC5253Ma.BACK_ARROW));
        int i = A05;
        imageView.setPadding(0, i, i * 2, i);
        int i2 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        imageView.setOnClickListener(new View$OnClickListenerC5317Nd(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        C5245MS.A0X(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A03, 0);
        layoutParams2.gravity = 17;
        LinearLayout header = new LinearLayout(getContext());
        header.setOrientation(0);
        header.addView(imageView, layoutParams);
        header.addView(textView, layoutParams2);
        return header;
    }

    private ViewGroup A02() {
        C5325Nl c5325Nl = new C5325Nl(this.A01);
        for (C40462H c40462h : this.A00.A05()) {
            C5305NR c5305nr = new C5305NR(this.A01);
            c5305nr.setData(c40462h.A04(), null);
            c5305nr.setOnClickListener(new View$OnClickListenerC5318Ne(this, c5305nr, c40462h));
            c5325Nl.addView(c5305nr);
        }
        return c5325Nl;
    }
}
