package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C7757k;
import com.google.android.material.internal.RunnableC7761n;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a */
    public final Chip f15616a;

    /* renamed from: b */
    public final EditText f15617b;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$a */
    /* loaded from: classes3.dex */
    public class C7900a extends C7757k {
        public C7900a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (isEmpty) {
                chipTextInputComboView.f15616a.setText(ChipTextInputComboView.m4315a(chipTextInputComboView, "00"));
                return;
            }
            String m4315a = ChipTextInputComboView.m4315a(chipTextInputComboView, editable);
            Chip chip = chipTextInputComboView.f15616a;
            if (TextUtils.isEmpty(m4315a)) {
                m4315a = ChipTextInputComboView.m4315a(chipTextInputComboView, "00");
            }
            chip.setText(m4315a);
        }
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LocaleList locales;
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f15616a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f15617b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new C7900a());
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            editText.setImeHintLocales(locales);
        }
        addView(chip);
        addView(textInputLayout);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        editText.setId(ViewCompat.C0815e.m11745a());
        ViewCompat.C0815e.m11738h((TextView) findViewById(R.id.material_label), editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* renamed from: a */
    public static String m4315a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f15616a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        LocaleList locales;
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f15617b.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        int i;
        Chip chip = this.f15616a;
        chip.setChecked(z);
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        EditText editText = this.f15617b;
        editText.setVisibility(i);
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new RunnableC7761n(editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f15616a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f15616a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f15616a.toggle();
    }
}
