package com.applovin.impl.mediation.debugger.p021ui.testmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.C2671a;
import com.applovin.impl.sdk.utils.C3293f;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.C3393R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton */
/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    private final Button f7320a;

    /* renamed from: b */
    private final C2671a f7321b;

    /* renamed from: c */
    private EnumC2971b f7322c;

    /* renamed from: d */
    private MaxAdFormat f7323d;

    /* renamed from: e */
    private InterfaceC2970a f7324e;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2970a {
        void onClick(AdControlButton adControlButton);
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$b */
    /* loaded from: classes.dex */
    public enum EnumC2971b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Button button = new Button(getContext());
        this.f7320a = button;
        C2671a c2671a = new C2671a(getContext(), 20, 16842873);
        this.f7321b = c2671a;
        EnumC2971b enumC2971b = EnumC2971b.LOAD;
        this.f7322c = enumC2971b;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setTextColor(-1);
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        c2671a.setColor(-1);
        addView(c2671a, new FrameLayout.LayoutParams(-1, -1, 17));
        m8216a(enumC2971b);
    }

    /* renamed from: a */
    private void m8216a(EnumC2971b enumC2971b) {
        if (EnumC2971b.LOADING == enumC2971b) {
            setEnabled(false);
            this.f7321b.m9180a();
        } else {
            setEnabled(true);
            this.f7321b.m9179b();
        }
        this.f7320a.setText(m8215b(enumC2971b));
        this.f7320a.setBackgroundColor(m8214c(enumC2971b));
    }

    /* renamed from: b */
    private String m8215b(EnumC2971b enumC2971b) {
        return EnumC2971b.LOAD == enumC2971b ? "Load" : EnumC2971b.LOADING == enumC2971b ? "" : "Show";
    }

    /* renamed from: c */
    private int m8214c(EnumC2971b enumC2971b) {
        return C3293f.m7029a((EnumC2971b.LOAD == enumC2971b || EnumC2971b.LOADING == enumC2971b) ? C3393R.C3394color.applovin_sdk_brand_color : C3393R.C3394color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    public EnumC2971b getControlState() {
        return this.f7322c;
    }

    public MaxAdFormat getFormat() {
        return this.f7323d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC2970a interfaceC2970a = this.f7324e;
        if (interfaceC2970a != null) {
            interfaceC2970a.onClick(this);
        }
    }

    public void setControlState(EnumC2971b enumC2971b) {
        if (this.f7322c != enumC2971b) {
            m8216a(enumC2971b);
        }
        this.f7322c = enumC2971b;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f7323d = maxAdFormat;
    }

    public void setOnClickListener(InterfaceC2970a interfaceC2970a) {
        this.f7324e = interfaceC2970a;
    }
}
