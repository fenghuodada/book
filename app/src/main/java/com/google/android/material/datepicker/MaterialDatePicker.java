package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0157c;
import androidx.appcompat.content.res.C0158a;
import androidx.core.graphics.C0689a;
import androidx.core.view.C0851a;
import androidx.core.view.C0922g2;
import androidx.core.view.C0961k2;
import androidx.core.view.C0962k3;
import androidx.core.view.C0967l3;
import androidx.core.view.C0971m2;
import androidx.core.view.C0998r3;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.ambrose.overwall.R;
import com.google.android.material.color.C7661a;
import com.google.android.material.datepicker.C7666a;
import com.google.android.material.dialog.View$OnTouchListenerC7713a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.C7773b;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: A */
    public static final /* synthetic */ int f14783A = 0;

    /* renamed from: a */
    public final LinkedHashSet<InterfaceC7703t<? super S>> f14784a = new LinkedHashSet<>();

    /* renamed from: b */
    public final LinkedHashSet<View.OnClickListener> f14785b = new LinkedHashSet<>();

    /* renamed from: c */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f14786c = new LinkedHashSet<>();

    /* renamed from: d */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f14787d = new LinkedHashSet<>();
    @StyleRes

    /* renamed from: e */
    public int f14788e;
    @Nullable

    /* renamed from: f */
    public InterfaceC7675d<S> f14789f;

    /* renamed from: g */
    public AbstractC7670a0<S> f14790g;
    @Nullable

    /* renamed from: h */
    public C7666a f14791h;
    @Nullable

    /* renamed from: i */
    public AbstractC7682g f14792i;

    /* renamed from: j */
    public C7688j<S> f14793j;
    @StringRes

    /* renamed from: k */
    public int f14794k;

    /* renamed from: l */
    public CharSequence f14795l;

    /* renamed from: m */
    public boolean f14796m;

    /* renamed from: n */
    public int f14797n;
    @StringRes

    /* renamed from: o */
    public int f14798o;

    /* renamed from: p */
    public CharSequence f14799p;
    @StringRes

    /* renamed from: q */
    public int f14800q;

    /* renamed from: r */
    public CharSequence f14801r;

    /* renamed from: s */
    public TextView f14802s;

    /* renamed from: t */
    public TextView f14803t;

    /* renamed from: u */
    public CheckableImageButton f14804u;
    @Nullable

    /* renamed from: v */
    public MaterialShapeDrawable f14805v;

    /* renamed from: w */
    public Button f14806w;

    /* renamed from: x */
    public boolean f14807x;
    @Nullable

    /* renamed from: y */
    public CharSequence f14808y;
    @Nullable

    /* renamed from: z */
    public CharSequence f14809z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface InputMode {
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC7662a implements View.OnClickListener {
        public View$OnClickListenerC7662a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            Iterator<InterfaceC7703t<? super S>> it = materialDatePicker.f14784a.iterator();
            while (it.hasNext()) {
                materialDatePicker.m4615h().m4605A();
                it.next().m4581a();
            }
            materialDatePicker.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$b */
    /* loaded from: classes3.dex */
    public class C7663b extends C0851a {
        public C7663b() {
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: d */
        public final void mo4308d(@NonNull View view, @NonNull C0874o c0874o) {
            View.AccessibilityDelegate accessibilityDelegate = this.f2597a;
            AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            StringBuilder sb = new StringBuilder();
            int i = MaterialDatePicker.f14783A;
            sb.append(MaterialDatePicker.this.m4615h().getError());
            sb.append(", ");
            sb.append((Object) c0874o.m11553e());
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$c */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC7664c implements View.OnClickListener {
        public View$OnClickListenerC7664c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            Iterator<View.OnClickListener> it = materialDatePicker.f14785b.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            materialDatePicker.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$d */
    /* loaded from: classes3.dex */
    public class C7665d extends AbstractC7712z<S> {
        public C7665d() {
        }

        @Override // com.google.android.material.datepicker.AbstractC7712z
        /* renamed from: a */
        public final void mo4573a(S s) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            InterfaceC7675d<S> m4615h = materialDatePicker.m4615h();
            materialDatePicker.getContext();
            String m4602k = m4615h.m4602k();
            TextView textView = materialDatePicker.f14803t;
            InterfaceC7675d<S> m4615h2 = materialDatePicker.m4615h();
            materialDatePicker.requireContext();
            textView.setContentDescription(m4615h2.m4598w());
            materialDatePicker.f14803t.setText(m4602k);
            materialDatePicker.f14806w.setEnabled(materialDatePicker.m4615h().m4599v());
        }
    }

    /* renamed from: i */
    public static int m4614i(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar m4590d = C7681f0.m4590d();
        m4590d.set(5, 1);
        Calendar m4591c = C7681f0.m4591c(m4590d);
        m4591c.get(2);
        m4591c.get(1);
        int maximum = m4591c.getMaximum(7);
        m4591c.getActualMaximum(5);
        m4591c.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: j */
    public static boolean m4613j(@NonNull Context context) {
        return m4612k(context, 16843277);
    }

    /* renamed from: k */
    public static boolean m4612k(@NonNull Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C7773b.m4496c(context, R.attr.materialCalendarStyle, C7688j.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: h */
    public final InterfaceC7675d<S> m4615h() {
        if (this.f14789f == null) {
            this.f14789f = (InterfaceC7675d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f14789f;
    }

    /* renamed from: l */
    public final void m4611l() {
        AbstractC7670a0<S> abstractC7670a0;
        CharSequence charSequence;
        boolean z;
        requireContext();
        int i = this.f14788e;
        if (i == 0) {
            i = m4615h().m4600s();
        }
        InterfaceC7675d<S> m4615h = m4615h();
        C7666a c7666a = this.f14791h;
        AbstractC7682g abstractC7682g = this.f14792i;
        C7688j<S> c7688j = new C7688j<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", m4615h);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c7666a);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", abstractC7682g);
        bundle.putParcelable("CURRENT_MONTH_KEY", c7666a.f14817d);
        c7688j.setArguments(bundle);
        this.f14793j = c7688j;
        boolean isChecked = this.f14804u.isChecked();
        if (isChecked) {
            InterfaceC7675d<S> m4615h2 = m4615h();
            C7666a c7666a2 = this.f14791h;
            abstractC7670a0 = new C7704u<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", m4615h2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c7666a2);
            abstractC7670a0.setArguments(bundle2);
        } else {
            abstractC7670a0 = this.f14793j;
        }
        this.f14790g = abstractC7670a0;
        TextView textView = this.f14802s;
        if (isChecked) {
            if (getResources().getConfiguration().orientation == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                charSequence = this.f14809z;
                textView.setText(charSequence);
                InterfaceC7675d<S> m4615h3 = m4615h();
                getContext();
                String m4602k = m4615h3.m4602k();
                TextView textView2 = this.f14803t;
                InterfaceC7675d<S> m4615h4 = m4615h();
                requireContext();
                textView2.setContentDescription(m4615h4.m4598w());
                this.f14803t.setText(m4602k);
                FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                beginTransaction.replace(R.id.mtrl_calendar_frame, this.f14790g);
                beginTransaction.commitNow();
                this.f14790g.mo4588h(new C7665d());
            }
        }
        charSequence = this.f14808y;
        textView.setText(charSequence);
        InterfaceC7675d<S> m4615h32 = m4615h();
        getContext();
        String m4602k2 = m4615h32.m4602k();
        TextView textView22 = this.f14803t;
        InterfaceC7675d<S> m4615h42 = m4615h();
        requireContext();
        textView22.setContentDescription(m4615h42.m4598w());
        this.f14803t.setText(m4602k2);
        FragmentTransaction beginTransaction2 = getChildFragmentManager().beginTransaction();
        beginTransaction2.replace(R.id.mtrl_calendar_frame, this.f14790g);
        beginTransaction2.commitNow();
        this.f14790g.mo4588h(new C7665d());
    }

    /* renamed from: m */
    public final void m4610m(@NonNull CheckableImageButton checkableImageButton) {
        this.f14804u.setContentDescription(checkableImageButton.getContext().getString(this.f14804u.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f14786c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f14788e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f14789f = (InterfaceC7675d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f14791h = (C7666a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f14792i = (AbstractC7682g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f14794k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f14795l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f14797n = bundle.getInt("INPUT_MODE_KEY");
        this.f14798o = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f14799p = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f14800q = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f14801r = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f14795l;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f14794k);
        }
        this.f14808y = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f14809z = charSequence;
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i = this.f14788e;
        if (i == 0) {
            i = m4615h().m4600s();
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.f14796m = m4613j(context);
        int i2 = C7773b.m4496c(context, R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName()).data;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialCalendarStyle, 2132018331);
        this.f14805v = materialShapeDrawable;
        materialShapeDrawable.m4469i(context);
        this.f14805v.m4467k(ColorStateList.valueOf(i2));
        MaterialShapeDrawable materialShapeDrawable2 = this.f14805v;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        materialShapeDrawable2.m4468j(ViewCompat.C0819i.m11713i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        boolean z;
        if (this.f14796m) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        AbstractC7682g abstractC7682g = this.f14792i;
        if (abstractC7682g != null) {
            abstractC7682g.getClass();
        }
        if (this.f14796m) {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(m4614i(context), -2);
        } else {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(m4614i(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f14803t = textView;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0817g.m11726f(textView, 1);
        this.f14804u = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f14802s = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f14804u.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f14804u;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C0158a.m12920a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0158a.m12920a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f14804u;
        if (this.f14797n != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton2.setChecked(z);
        ViewCompat.m11771n(this.f14804u, null);
        m4610m(this.f14804u);
        this.f14804u.setOnClickListener(new View$OnClickListenerC7702s(this));
        this.f14806w = (Button) inflate.findViewById(R.id.confirm_button);
        if (m4615h().m4599v()) {
            this.f14806w.setEnabled(true);
        } else {
            this.f14806w.setEnabled(false);
        }
        this.f14806w.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f14799p;
        if (charSequence != null) {
            this.f14806w.setText(charSequence);
        } else {
            int i2 = this.f14798o;
            if (i2 != 0) {
                this.f14806w.setText(i2);
            }
        }
        this.f14806w.setOnClickListener(new View$OnClickListenerC7662a());
        ViewCompat.m11771n(this.f14806w, new C7663b());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.f14801r;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i3 = this.f14800q;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new View$OnClickListenerC7664c());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f14787d.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        C7706v c7706v;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f14788e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f14789f);
        C7666a.C7668b c7668b = new C7666a.C7668b(this.f14791h);
        C7688j<S> c7688j = this.f14793j;
        C7706v c7706v2 = null;
        if (c7688j == null) {
            c7706v = null;
        } else {
            c7706v = c7688j.f14863f;
        }
        if (c7706v != null) {
            c7668b.f14825c = Long.valueOf(c7706v.f14900f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c7668b.f14827e);
        C7706v m4579c = C7706v.m4579c(c7668b.f14823a);
        C7706v m4579c2 = C7706v.m4579c(c7668b.f14824b);
        C7666a.InterfaceC7669c interfaceC7669c = (C7666a.InterfaceC7669c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c7668b.f14825c;
        if (l != null) {
            c7706v2 = C7706v.m4579c(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C7666a(m4579c, m4579c2, interfaceC7669c, c7706v2, c7668b.f14826d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f14792i);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f14794k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f14795l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f14798o);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f14799p);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f14800q);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f14801r);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Integer num;
        boolean z;
        int i;
        boolean z2;
        C0157c c0962k3;
        C0157c c0157c;
        C0157c c0962k32;
        C0157c c0157c2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f14796m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f14805v);
            if (!this.f14807x) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i2 = Build.VERSION.SDK_INT;
                boolean z3 = false;
                if (num != null && num.intValue() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                int m4620b = C7661a.m4620b(window.getContext(), 16842801, -16777216);
                if (z) {
                    num = Integer.valueOf(m4620b);
                }
                Integer valueOf = Integer.valueOf(m4620b);
                if (i2 >= 30) {
                    C0971m2.m11410a(window, false);
                } else {
                    C0961k2.m11424a(window, false);
                }
                window.getContext();
                Context context = window.getContext();
                if (i2 < 27) {
                    i = C0689a.m11970c(C7661a.m4620b(context, 16843858, -16777216), 128);
                } else {
                    i = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i);
                boolean m4619c = C7661a.m4619c(num.intValue());
                if (!C7661a.m4619c(0) && !m4619c) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                View decorView = window.getDecorView();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    c0157c = new C0998r3(window);
                } else {
                    if (i3 >= 26) {
                        c0962k3 = new C0967l3(window, decorView);
                    } else {
                        c0962k3 = new C0962k3(window, decorView);
                    }
                    c0157c = c0962k3;
                }
                c0157c.mo11372d(z2);
                boolean m4619c2 = C7661a.m4619c(valueOf.intValue());
                if (C7661a.m4619c(i) || (i == 0 && m4619c2)) {
                    z3 = true;
                }
                View decorView2 = window.getDecorView();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    c0157c2 = new C0998r3(window);
                } else {
                    if (i4 >= 26) {
                        c0962k32 = new C0967l3(window, decorView2);
                    } else {
                        c0962k32 = new C0962k3(window, decorView2);
                    }
                    c0157c2 = c0962k32;
                }
                c0157c2.mo11373c(z3);
                C7701r c7701r = new C7701r(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0819i.m11701u(findViewById, c7701r);
                this.f14807x = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f14805v, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new View$OnTouchListenerC7713a(requireDialog(), rect));
        }
        m4611l();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f14790g.f14828a.clear();
        super.onStop();
    }
}
