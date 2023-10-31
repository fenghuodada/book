package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ambrose.overwall.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes3.dex */
public final class C7684h extends BaseAdapter {

    /* renamed from: d */
    public static final int f14850d;
    @NonNull

    /* renamed from: a */
    public final Calendar f14851a;

    /* renamed from: b */
    public final int f14852b;

    /* renamed from: c */
    public final int f14853c;

    static {
        f14850d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C7684h() {
        Calendar m4589e = C7681f0.m4589e(null);
        this.f14851a = m4589e;
        this.f14852b = m4589e.getMaximum(7);
        this.f14853c = m4589e.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f14852b;
    }

    @Override // android.widget.Adapter
    @Nullable
    public final Object getItem(int i) {
        int i2 = this.f14852b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f14853c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public final View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f14853c;
        int i3 = this.f14852b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f14851a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f14850d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C7684h(int i) {
        Calendar m4589e = C7681f0.m4589e(null);
        this.f14851a = m4589e;
        this.f14852b = m4589e.getMaximum(7);
        this.f14853c = i;
    }
}
