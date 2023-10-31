package com.kongzue.dialogx.dialogs;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.ambrose.overwall.R;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.InterfaceC8931c;
import com.kongzue.dialogx.interfaces.InterfaceC8938j;
import com.kongzue.dialogx.style.C8941a;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.kongzue.dialogx.dialogs.i */
/* loaded from: classes3.dex */
public class C8887i extends BaseDialog {

    /* renamed from: A */
    public View f16920A;

    /* renamed from: B */
    public final CharSequence f16921B;

    /* renamed from: C */
    public final CharSequence f16922C;

    /* renamed from: D */
    public final CharSequence f16923D;

    /* renamed from: G */
    public InterfaceC8938j f16926G;

    /* renamed from: H */
    public C8888a f16927H;

    /* renamed from: y */
    public int f16930y;

    /* renamed from: z */
    public C8894l f16931z;

    /* renamed from: w */
    public final boolean f16928w = true;

    /* renamed from: x */
    public final C8887i f16929x = this;

    /* renamed from: E */
    public final int f16924E = -1;

    /* renamed from: F */
    public final float f16925F = -1.0f;

    /* renamed from: com.kongzue.dialogx.dialogs.i$a */
    /* loaded from: classes3.dex */
    public class C8888a {

        /* renamed from: a */
        public final ArrayList f16932a;

        /* renamed from: b */
        public final DialogXBaseRelativeLayout f16933b;

        /* renamed from: c */
        public final MaxRelativeLayout f16934c;

        /* renamed from: d */
        public final TextView f16935d;

        /* renamed from: e */
        public final TextView f16936e;

        /* renamed from: f */
        public final RelativeLayout f16937f;

        /* renamed from: g */
        public final EditText f16938g;

        /* renamed from: h */
        public final LinearLayout f16939h;

        /* renamed from: i */
        public final TextView f16940i;

        /* renamed from: j */
        public final View f16941j;

        /* renamed from: k */
        public final View f16942k;

        /* renamed from: l */
        public final TextView f16943l;

        /* renamed from: m */
        public final TextView f16944m;

        /* renamed from: com.kongzue.dialogx.dialogs.i$a$a */
        /* loaded from: classes3.dex */
        public class C8889a extends ViewOutlineProvider {
            public C8889a() {
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C8887i.this.f16925F);
            }
        }

        /* renamed from: com.kongzue.dialogx.dialogs.i$a$b */
        /* loaded from: classes3.dex */
        public class View$OnClickListenerC8890b implements View.OnClickListener {
            public View$OnClickListenerC8890b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8888a c8888a = C8888a.this;
                C8887i.this.getClass();
                c8888a.m2910a(view);
            }
        }

        /* renamed from: com.kongzue.dialogx.dialogs.i$a$c */
        /* loaded from: classes3.dex */
        public class RunnableC8891c implements Runnable {
            public RunnableC8891c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8888a c8888a = C8888a.this;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8888a.f16933b;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                BaseDialog.m2878d(C8887i.this.f16920A);
            }
        }

        public C8888a(View view) {
            if (view == null) {
                return;
            }
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
            this.f16933b = dialogXBaseRelativeLayout;
            this.f16934c = (MaxRelativeLayout) view.findViewById(R.id.bkg);
            TextView textView = (TextView) view.findViewById(R.id.txt_dialog_title);
            this.f16935d = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.txt_dialog_tip);
            this.f16936e = textView2;
            this.f16937f = (RelativeLayout) view.findViewById(R.id.box_custom);
            this.f16938g = (EditText) view.findViewById(R.id.txt_input);
            this.f16939h = (LinearLayout) view.findViewById(R.id.box_button);
            TextView textView3 = (TextView) view.findViewById(R.id.btn_selectOther);
            this.f16940i = textView3;
            this.f16941j = view.findViewById(R.id.space_other_button);
            this.f16942k = view.findViewWithTag("split");
            TextView textView4 = (TextView) view.findViewById(R.id.btn_selectNegative);
            this.f16943l = textView4;
            TextView textView5 = (TextView) view.findViewById(R.id.btn_selectPositive);
            this.f16944m = textView5;
            this.f16932a = BaseDialog.m2876f(C8887i.this.f16920A);
            C8941a c8941a = C8877a.f16910a;
            if (C8887i.this.f17023l == -1) {
                C8887i.this.f17023l = -1;
            }
            textView.getPaint().setFakeBoldText(true);
            textView4.getPaint().setFakeBoldText(true);
            textView5.getPaint().setFakeBoldText(true);
            textView3.getPaint().setFakeBoldText(true);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            dialogXBaseRelativeLayout.m2839e(0.0f);
            C8887i c8887i = C8887i.this.f16929x;
            dialogXBaseRelativeLayout.f17061a = c8887i;
            if (c8887i != null && c8887i.f17015d != 1) {
                dialogXBaseRelativeLayout.setFitsSystemWindows(true);
                dialogXBaseRelativeLayout.m2840d(dialogXBaseRelativeLayout.getRootWindowInsets());
            }
            dialogXBaseRelativeLayout.f17065e = new C8881d(this);
            dialogXBaseRelativeLayout.f17066f = new C8883e(this);
            textView5.setOnClickListener(new View$OnClickListenerC8884f(this));
            textView4.setOnClickListener(new View$OnClickListenerC8885g(this));
            textView3.setOnClickListener(new View$OnClickListenerC8886h(this));
            C8887i.this.f16927H = this;
            m2908c();
        }

        /* renamed from: a */
        public final void m2910a(View view) {
            if (view != null) {
                view.setEnabled(false);
            }
            C8887i c8887i = C8887i.this;
            if (c8887i.m2871k() != null && !c8887i.f17027p) {
                c8887i.f17027p = true;
                if (c8887i.f16931z == null) {
                    c8887i.f16931z = new C8894l(this);
                }
                c8887i.f16931z.m2907a(c8887i);
                BaseDialog.m2885A(new RunnableC8891c(), m2909b(null));
            }
        }

        /* renamed from: b */
        public final long m2909b(@Nullable Animation animation) {
            long j;
            if (animation == null) {
                MaxRelativeLayout maxRelativeLayout = this.f16934c;
                if (maxRelativeLayout.getAnimation() != null) {
                    animation = maxRelativeLayout.getAnimation();
                }
            }
            if (animation != null && animation.getDuration() != 0) {
                j = animation.getDuration();
            } else {
                j = 300;
            }
            long j2 = C8887i.this.f17025n;
            if (j2 != -1) {
                return j2;
            }
            return j;
        }

        /* renamed from: c */
        public final void m2908c() {
            View$OnClickListenerC8890b view$OnClickListenerC8890b;
            char c;
            int i;
            int i2;
            int i3;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f16933b;
            if (dialogXBaseRelativeLayout != null) {
                C8887i c8887i = C8887i.this;
                if (c8887i.m2871k() != null) {
                    int[] iArr = c8887i.f17026o;
                    boolean z = false;
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    int i6 = 2;
                    int i7 = iArr[2];
                    int i8 = iArr[3];
                    int[] iArr2 = dialogXBaseRelativeLayout.f17075o;
                    iArr2[0] = i4;
                    iArr2[1] = i5;
                    iArr2[2] = i7;
                    iArr2[3] = i8;
                    int i9 = c8887i.f17023l;
                    ArrayList arrayList = this.f16932a;
                    C8941a c8941a = c8887i.f17020i;
                    TextView textView = this.f16944m;
                    TextView textView2 = this.f16943l;
                    TextView textView3 = this.f16940i;
                    MaxRelativeLayout maxRelativeLayout = this.f16934c;
                    if (i9 != -1) {
                        if (maxRelativeLayout != null) {
                            maxRelativeLayout.setBackgroundTintList(ColorStateList.valueOf(i9));
                        }
                        if (c8941a instanceof C8941a) {
                            int i10 = c8887i.f17023l;
                            if (textView3 != null) {
                                textView3.setBackgroundTintList(ColorStateList.valueOf(i10));
                            }
                            int i11 = c8887i.f17023l;
                            if (textView2 != null) {
                                textView2.setBackgroundTintList(ColorStateList.valueOf(i11));
                            }
                            int i12 = c8887i.f17023l;
                            if (textView != null) {
                                textView.setBackgroundTintList(ColorStateList.valueOf(i12));
                            }
                        }
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC8931c) ((View) it.next())).m2855a();
                            }
                        }
                    }
                    C8941a c8941a2 = C8877a.f16910a;
                    maxRelativeLayout.getClass();
                    maxRelativeLayout.setMinimumWidth(0);
                    maxRelativeLayout.setMinimumHeight(0);
                    View findViewWithTag = dialogXBaseRelativeLayout.findViewWithTag("dialogx_editbox");
                    int i13 = 8;
                    if (findViewWithTag != null) {
                        findViewWithTag.setVisibility(8);
                    }
                    EditText editText = this.f16938g;
                    editText.setVisibility(8);
                    dialogXBaseRelativeLayout.setClickable(true);
                    int i14 = c8887i.f16924E;
                    if (i14 != -1) {
                        dialogXBaseRelativeLayout.setBackgroundColor(i14);
                    }
                    if (c8887i.f16925F > -1.0f) {
                        maxRelativeLayout.setOutlineProvider(new C8889a());
                        maxRelativeLayout.setClipToOutline(true);
                        if (arrayList != null) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC8931c) ((View) it2.next())).m2854b();
                            }
                        }
                    }
                    BaseDialog.m2882D(this.f16935d, c8887i.f16921B);
                    BaseDialog.m2882D(this.f16936e, c8887i.f16922C);
                    CharSequence charSequence = c8887i.f16923D;
                    BaseDialog.m2882D(textView, charSequence);
                    BaseDialog.m2882D(textView2, null);
                    BaseDialog.m2882D(textView3, null);
                    editText.setText((CharSequence) null);
                    editText.setHint((CharSequence) null);
                    View view = this.f16941j;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    BaseDialog.m2861u(charSequence);
                    BaseDialog.m2861u(null);
                    BaseDialog.m2861u(null);
                    View view2 = this.f16942k;
                    if (view2 != null) {
                        c8887i.mo2862t();
                        c8941a.getClass();
                        view2.setBackgroundColor(c8887i.m2875g(0));
                    }
                    LinearLayout linearLayout = this.f16939h;
                    linearLayout.setOrientation(0);
                    c8941a.m2850a();
                    c8941a.m2850a();
                    linearLayout.removeAllViews();
                    int[] m2850a = c8941a.m2850a();
                    int i15 = 0;
                    while (i15 < 4) {
                        int i16 = m2850a[i15];
                        if (i16 != 1) {
                            if (i16 != i6) {
                                if (i16 != 3) {
                                    if (i16 != 4) {
                                        if (i16 == 5 && linearLayout.getChildCount() >= 1 && linearLayout.getChildAt(linearLayout.getChildCount() - 1).getVisibility() != i13) {
                                            View view3 = new View(c8887i.m2871k());
                                            Resources m2869m = c8887i.m2869m();
                                            c8887i.mo2862t();
                                            c8941a.getClass();
                                            view3.setBackgroundColor(m2869m.getColor(0));
                                            c8941a.getClass();
                                            linearLayout.addView(view3, new LinearLayout.LayoutParams(1, -1));
                                        }
                                    } else if (linearLayout.getChildCount() >= 1 && linearLayout.getChildAt(linearLayout.getChildCount() - 1).getVisibility() != i13) {
                                        Space space = new Space(c8887i.m2871k());
                                        c = 65535;
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams.weight = 1.0f;
                                        linearLayout.addView(space, layoutParams);
                                    }
                                    c = 65535;
                                } else {
                                    c = 65535;
                                    linearLayout.addView(textView3);
                                    c8941a.getClass();
                                    c8941a.getClass();
                                    if (c8887i.mo2862t()) {
                                        i3 = R.drawable.button_dialogx_material_light;
                                    } else {
                                        i3 = R.drawable.button_dialogx_material_night;
                                    }
                                    textView3.setBackgroundResource(i3);
                                }
                            } else {
                                c = 65535;
                                linearLayout.addView(textView2);
                                c8941a.getClass();
                                c8941a.getClass();
                                if (c8887i.mo2862t()) {
                                    i2 = R.drawable.button_dialogx_material_light;
                                } else {
                                    i2 = R.drawable.button_dialogx_material_night;
                                }
                                textView2.setBackgroundResource(i2);
                            }
                        } else {
                            c = 65535;
                            linearLayout.addView(textView);
                            c8941a.getClass();
                            c8941a.getClass();
                            if (c8887i.mo2862t()) {
                                i = R.drawable.button_dialogx_material_light;
                            } else {
                                i = R.drawable.button_dialogx_material_night;
                            }
                            textView.setBackgroundResource(i);
                        }
                        i15++;
                        i6 = 2;
                        i13 = 8;
                    }
                    if (c8887i.f16928w) {
                        int i17 = c8887i.f16930y;
                        if (i17 != 0) {
                            if (i17 == 1) {
                                z = true;
                            }
                        } else {
                            z = c8887i.f17018g;
                        }
                        if (z) {
                            view$OnClickListenerC8890b = new View$OnClickListenerC8890b();
                        } else {
                            view$OnClickListenerC8890b = null;
                        }
                        dialogXBaseRelativeLayout.setOnClickListener(view$OnClickListenerC8890b);
                    } else {
                        dialogXBaseRelativeLayout.setClickable(false);
                    }
                    this.f16937f.setVisibility(8);
                }
            }
        }
    }

    public C8887i() {
    }

    public C8887i(String str, String str2, String str3) {
        this.f16921B = str;
        this.f16922C = str2;
        this.f16923D = str3;
    }

    /* renamed from: E */
    public final void m2911E() {
        m2881a();
        if (m2873i() == null) {
            boolean mo2862t = mo2862t();
            this.f17020i.getClass();
            int i = R.layout.layout_dialogx_material;
            int i2 = mo2862t ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
            if (i2 != 0) {
                i = i2;
            } else if (!mo2862t()) {
                i = R.layout.layout_dialogx_material_dark;
            }
            View m2880b = BaseDialog.m2880b(i);
            this.f16920A = m2880b;
            this.f16927H = new C8888a(m2880b);
            View view = this.f16920A;
            if (view != null) {
                view.setTag(this.f16929x);
            }
        }
        BaseDialog.m2883C(this.f16920A);
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    /* renamed from: c */
    public final String mo2879c() {
        return C8887i.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
}
