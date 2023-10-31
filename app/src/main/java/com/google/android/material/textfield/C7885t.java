package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.view.menu.C0235r;
import androidx.appcompat.widget.C0383m0;
import androidx.appcompat.widget.C0430x1;
import androidx.core.view.C0922g2;
import androidx.core.view.C0963l;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0862c;
import androidx.core.view.accessibility.InterfaceC0863d;
import com.ambrose.overwall.R;
import com.google.android.material.internal.C7757k;
import com.google.android.material.internal.C7764q;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.C7774c;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.t */
/* loaded from: classes3.dex */
public final class C7885t extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f15536a;
    @NonNull

    /* renamed from: b */
    public final FrameLayout f15537b;
    @NonNull

    /* renamed from: c */
    public final CheckableImageButton f15538c;

    /* renamed from: d */
    public ColorStateList f15539d;

    /* renamed from: e */
    public PorterDuff.Mode f15540e;

    /* renamed from: f */
    public View.OnLongClickListener f15541f;
    @NonNull

    /* renamed from: g */
    public final CheckableImageButton f15542g;

    /* renamed from: h */
    public final C7889d f15543h;

    /* renamed from: i */
    public int f15544i;

    /* renamed from: j */
    public final LinkedHashSet<TextInputLayout.InterfaceC7857h> f15545j;

    /* renamed from: k */
    public ColorStateList f15546k;

    /* renamed from: l */
    public PorterDuff.Mode f15547l;

    /* renamed from: m */
    public int f15548m;
    @NonNull

    /* renamed from: n */
    public ImageView.ScaleType f15549n;

    /* renamed from: o */
    public View.OnLongClickListener f15550o;
    @Nullable

    /* renamed from: p */
    public CharSequence f15551p;
    @NonNull

    /* renamed from: q */
    public final C0383m0 f15552q;

    /* renamed from: r */
    public boolean f15553r;

    /* renamed from: s */
    public EditText f15554s;
    @Nullable

    /* renamed from: t */
    public final AccessibilityManager f15555t;
    @Nullable

    /* renamed from: u */
    public InterfaceC0863d f15556u;

    /* renamed from: v */
    public final C7886a f15557v;

    /* renamed from: com.google.android.material.textfield.t$a */
    /* loaded from: classes3.dex */
    public class C7886a extends C7757k {
        public C7886a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            C7885t.this.m4371b().mo4358a();
        }

        @Override // com.google.android.material.internal.C7757k, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7885t.this.m4371b().mo4357b();
        }
    }

    /* renamed from: com.google.android.material.textfield.t$b */
    /* loaded from: classes3.dex */
    public class C7887b implements TextInputLayout.InterfaceC7856g {
        public C7887b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC7856g
        /* renamed from: a */
        public final void mo4359a(@NonNull TextInputLayout textInputLayout) {
            C7885t c7885t = C7885t.this;
            if (c7885t.f15554s == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = c7885t.f15554s;
            C7886a c7886a = c7885t.f15557v;
            if (editText != null) {
                editText.removeTextChangedListener(c7886a);
                if (c7885t.f15554s.getOnFocusChangeListener() == c7885t.m4371b().mo4354e()) {
                    c7885t.f15554s.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            c7885t.f15554s = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c7886a);
            }
            c7885t.m4371b().mo4346m(c7885t.f15554s);
            c7885t.m4364i(c7885t.m4371b());
        }
    }

    /* renamed from: com.google.android.material.textfield.t$c */
    /* loaded from: classes3.dex */
    public class View$OnAttachStateChangeListenerC7888c implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC7888c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            C7885t c7885t = C7885t.this;
            if (c7885t.f15556u != null && (accessibilityManager = c7885t.f15555t) != null) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (ViewCompat.C0817g.m11730b(c7885t)) {
                    C0862c.m11574a(accessibilityManager, c7885t.f15556u);
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            C7885t c7885t = C7885t.this;
            InterfaceC0863d interfaceC0863d = c7885t.f15556u;
            if (interfaceC0863d != null && (accessibilityManager = c7885t.f15555t) != null) {
                C0862c.m11573b(accessibilityManager, interfaceC0863d);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.t$d */
    /* loaded from: classes3.dex */
    public static class C7889d {

        /* renamed from: a */
        public final SparseArray<AbstractC7890u> f15561a = new SparseArray<>();

        /* renamed from: b */
        public final C7885t f15562b;

        /* renamed from: c */
        public final int f15563c;

        /* renamed from: d */
        public final int f15564d;

        public C7889d(C7885t c7885t, C0430x1 c0430x1) {
            this.f15562b = c7885t;
            this.f15563c = c0430x1.m12469i(26, 0);
            this.f15564d = c0430x1.m12469i(50, 0);
        }
    }

    public C7885t(TextInputLayout textInputLayout, C0430x1 c0430x1) {
        super(textInputLayout.getContext());
        CharSequence m12467k;
        this.f15544i = 0;
        this.f15545j = new LinkedHashSet<>();
        this.f15557v = new C7886a();
        C7887b c7887b = new C7887b();
        this.f15555t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f15536a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f15537b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m4372a = m4372a(this, from, R.id.text_input_error_icon);
        this.f15538c = m4372a;
        CheckableImageButton m4372a2 = m4372a(frameLayout, from, R.id.text_input_end_icon);
        this.f15542g = m4372a2;
        this.f15543h = new C7889d(this, c0430x1);
        C0383m0 c0383m0 = new C0383m0(getContext(), null);
        this.f15552q = c0383m0;
        if (c0430x1.m12466l(36)) {
            this.f15539d = C7774c.m4494b(getContext(), c0430x1, 36);
        }
        if (c0430x1.m12466l(37)) {
            this.f15540e = C7764q.m4504b(c0430x1.m12470h(37, -1), null);
        }
        if (c0430x1.m12466l(35)) {
            m4365h(c0430x1.m12473e(35));
        }
        m4372a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11746s(m4372a, 2);
        m4372a.setClickable(false);
        m4372a.setPressable(false);
        m4372a.setFocusable(false);
        if (!c0430x1.m12466l(51)) {
            if (c0430x1.m12466l(30)) {
                this.f15546k = C7774c.m4494b(getContext(), c0430x1, 30);
            }
            if (c0430x1.m12466l(31)) {
                this.f15547l = C7764q.m4504b(c0430x1.m12470h(31, -1), null);
            }
        }
        if (c0430x1.m12466l(28)) {
            m4367f(c0430x1.m12470h(28, 0));
            if (c0430x1.m12466l(25) && m4372a2.getContentDescription() != (m12467k = c0430x1.m12467k(25))) {
                m4372a2.setContentDescription(m12467k);
            }
            m4372a2.setCheckable(c0430x1.m12477a(24, true));
        } else if (c0430x1.m12466l(51)) {
            if (c0430x1.m12466l(52)) {
                this.f15546k = C7774c.m4494b(getContext(), c0430x1, 52);
            }
            if (c0430x1.m12466l(53)) {
                this.f15547l = C7764q.m4504b(c0430x1.m12470h(53, -1), null);
            }
            m4367f(c0430x1.m12477a(51, false) ? 1 : 0);
            CharSequence m12467k2 = c0430x1.m12467k(49);
            if (m4372a2.getContentDescription() != m12467k2) {
                m4372a2.setContentDescription(m12467k2);
            }
        }
        int m12474d = c0430x1.m12474d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (m12474d >= 0) {
            if (m12474d != this.f15548m) {
                this.f15548m = m12474d;
                m4372a2.setMinimumWidth(m12474d);
                m4372a2.setMinimumHeight(m12474d);
                m4372a.setMinimumWidth(m12474d);
                m4372a.setMinimumHeight(m12474d);
            }
            if (c0430x1.m12466l(29)) {
                ImageView.ScaleType m4338b = C7891v.m4338b(c0430x1.m12470h(29, -1));
                this.f15549n = m4338b;
                m4372a2.setScaleType(m4338b);
                m4372a.setScaleType(m4338b);
            }
            c0383m0.setVisibility(8);
            c0383m0.setId(R.id.textinput_suffix_text);
            c0383m0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            ViewCompat.C0817g.m11726f(c0383m0, 1);
            c0383m0.setTextAppearance(c0430x1.m12469i(70, 0));
            if (c0430x1.m12466l(71)) {
                c0383m0.setTextColor(c0430x1.m12476b(71));
            }
            CharSequence m12467k3 = c0430x1.m12467k(69);
            this.f15551p = TextUtils.isEmpty(m12467k3) ? null : m12467k3;
            c0383m0.setText(m12467k3);
            m4360m();
            frameLayout.addView(m4372a2);
            addView(c0383m0);
            addView(frameLayout);
            addView(m4372a);
            textInputLayout.f15433f0.add(c7887b);
            if (textInputLayout.f15428d != null) {
                c7887b.mo4359a(textInputLayout);
            }
            addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC7888c());
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    /* renamed from: a */
    public final CheckableImageButton m4372a(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (C7774c.m4492d(getContext())) {
            C0963l.m11416h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public final AbstractC7890u m4371b() {
        AbstractC7890u c7872i;
        int i = this.f15544i;
        C7889d c7889d = this.f15543h;
        SparseArray<AbstractC7890u> sparseArray = c7889d.f15561a;
        AbstractC7890u abstractC7890u = sparseArray.get(i);
        if (abstractC7890u == null) {
            C7885t c7885t = c7889d.f15562b;
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c7872i = new C7884s(c7885t);
                            } else {
                                throw new IllegalArgumentException(C0235r.m12816a("Invalid end icon mode: ", i));
                            }
                        } else {
                            c7872i = new C7871h(c7885t);
                        }
                    } else {
                        abstractC7890u = new C7865c0(c7885t, c7889d.f15564d);
                        sparseArray.append(i, abstractC7890u);
                    }
                } else {
                    c7872i = new C7861a0(c7885t);
                }
            } else {
                c7872i = new C7872i(c7885t);
            }
            abstractC7890u = c7872i;
            sparseArray.append(i, abstractC7890u);
        }
        return abstractC7890u;
    }

    /* renamed from: c */
    public final boolean m4370c() {
        return this.f15537b.getVisibility() == 0 && this.f15542g.getVisibility() == 0;
    }

    /* renamed from: d */
    public final boolean m4369d() {
        return this.f15538c.getVisibility() == 0;
    }

    /* renamed from: e */
    public final void m4368e(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        AbstractC7890u m4371b = m4371b();
        boolean mo4348k = m4371b.mo4348k();
        CheckableImageButton checkableImageButton = this.f15542g;
        boolean z3 = true;
        if (mo4348k && (isChecked = checkableImageButton.isChecked()) != m4371b.mo4347l()) {
            checkableImageButton.setChecked(!isChecked);
            z2 = true;
        } else {
            z2 = false;
        }
        if ((m4371b instanceof C7884s) && (isActivated = checkableImageButton.isActivated()) != m4371b.mo4349j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z3 = z2;
        }
        if (z || z3) {
            C7891v.m4337c(this.f15536a, checkableImageButton, this.f15546k);
        }
    }

    /* renamed from: f */
    public final void m4367f(int i) {
        boolean z;
        Drawable drawable;
        if (this.f15544i == i) {
            return;
        }
        AbstractC7890u m4371b = m4371b();
        InterfaceC0863d interfaceC0863d = this.f15556u;
        AccessibilityManager accessibilityManager = this.f15555t;
        if (interfaceC0863d != null && accessibilityManager != null) {
            C0862c.m11573b(accessibilityManager, interfaceC0863d);
        }
        CharSequence charSequence = null;
        this.f15556u = null;
        m4371b.mo4340s();
        this.f15544i = i;
        Iterator<TextInputLayout.InterfaceC7857h> it = this.f15545j.iterator();
        while (it.hasNext()) {
            it.next().m4384a();
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        m4366g(z);
        AbstractC7890u m4371b2 = m4371b();
        int i2 = this.f15543h.f15563c;
        if (i2 == 0) {
            i2 = m4371b2.mo4355d();
        }
        if (i2 != 0) {
            drawable = C0158a.m12920a(getContext(), i2);
        } else {
            drawable = null;
        }
        CheckableImageButton checkableImageButton = this.f15542g;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.f15536a;
        if (drawable != null) {
            C7891v.m4339a(textInputLayout, checkableImageButton, this.f15546k, this.f15547l);
            C7891v.m4337c(textInputLayout, checkableImageButton, this.f15546k);
        }
        int mo4356c = m4371b2.mo4356c();
        if (mo4356c != 0) {
            charSequence = getResources().getText(mo4356c);
        }
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
        checkableImageButton.setCheckable(m4371b2.mo4348k());
        if (m4371b2.mo4350i(textInputLayout.getBoxBackgroundMode())) {
            m4371b2.mo4341r();
            InterfaceC0863d mo4351h = m4371b2.mo4351h();
            this.f15556u = mo4351h;
            if (mo4351h != null && accessibilityManager != null) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (ViewCompat.C0817g.m11730b(this)) {
                    C0862c.m11574a(accessibilityManager, this.f15556u);
                }
            }
            View.OnClickListener mo4353f = m4371b2.mo4353f();
            View.OnLongClickListener onLongClickListener = this.f15550o;
            checkableImageButton.setOnClickListener(mo4353f);
            C7891v.m4336d(checkableImageButton, onLongClickListener);
            EditText editText = this.f15554s;
            if (editText != null) {
                m4371b2.mo4346m(editText);
                m4364i(m4371b2);
            }
            C7891v.m4339a(textInputLayout, checkableImageButton, this.f15546k, this.f15547l);
            m4368e(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
    }

    /* renamed from: g */
    public final void m4366g(boolean z) {
        if (m4370c() != z) {
            this.f15542g.setVisibility(z ? 0 : 8);
            m4363j();
            m4361l();
            this.f15536a.m4393o();
        }
    }

    /* renamed from: h */
    public final void m4365h(@Nullable Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15538c;
        checkableImageButton.setImageDrawable(drawable);
        m4362k();
        C7891v.m4339a(this.f15536a, checkableImageButton, this.f15539d, this.f15540e);
    }

    /* renamed from: i */
    public final void m4364i(AbstractC7890u abstractC7890u) {
        if (this.f15554s == null) {
            return;
        }
        if (abstractC7890u.mo4354e() != null) {
            this.f15554s.setOnFocusChangeListener(abstractC7890u.mo4354e());
        }
        if (abstractC7890u.mo4352g() != null) {
            this.f15542g.setOnFocusChangeListener(abstractC7890u.mo4352g());
        }
    }

    /* renamed from: j */
    public final void m4363j() {
        this.f15537b.setVisibility((this.f15542g.getVisibility() != 0 || m4369d()) ? 8 : 0);
        setVisibility(m4370c() || m4369d() || !((this.f15551p == null || this.f15553r) ? true : false) ? 0 : 8);
    }

    /* renamed from: k */
    public final void m4362k() {
        boolean z;
        int i;
        CheckableImageButton checkableImageButton = this.f15538c;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z2 = true;
        TextInputLayout textInputLayout = this.f15536a;
        if (drawable != null && textInputLayout.f15440j.f15587q && textInputLayout.m4396l()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        m4363j();
        m4361l();
        if (this.f15544i == 0) {
            z2 = false;
        }
        if (!z2) {
            textInputLayout.m4393o();
        }
    }

    /* renamed from: l */
    public final void m4361l() {
        int i;
        TextInputLayout textInputLayout = this.f15536a;
        if (textInputLayout.f15428d == null) {
            return;
        }
        if (!m4370c() && !m4369d()) {
            EditText editText = textInputLayout.f15428d;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            i = ViewCompat.C0815e.m11741e(editText);
        } else {
            i = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f15428d.getPaddingTop();
        int paddingBottom = textInputLayout.f15428d.getPaddingBottom();
        WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
        ViewCompat.C0815e.m11735k(this.f15552q, dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    /* renamed from: m */
    public final void m4360m() {
        C0383m0 c0383m0 = this.f15552q;
        int visibility = c0383m0.getVisibility();
        int i = (this.f15551p == null || this.f15553r) ? 8 : 0;
        if (visibility != i) {
            m4371b().mo4343p(i == 0);
        }
        m4363j();
        c0383m0.setVisibility(i);
        this.f15536a.m4393o();
    }
}
