package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ambrose.overwall.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: r */
    public static final /* synthetic */ int f15647r = 0;

    /* renamed from: q */
    public final Chip f15648q;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC7902a implements View.OnClickListener {
        public View$OnClickListenerC7902a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = TimePickerView.f15647r;
            TimePickerView.this.getClass();
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View$OnClickListenerC7902a view$OnClickListenerC7902a = new View$OnClickListenerC7902a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        ((MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle)).f14543c.add(new MaterialButtonToggleGroup.InterfaceC7618d() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC7618d
            /* renamed from: a */
            public final void mo4305a() {
                int i = TimePickerView.f15647r;
                TimePickerView.this.getClass();
            }
        });
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f15648q = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        View$OnTouchListenerC7910h view$OnTouchListenerC7910h = new View$OnTouchListenerC7910h(new GestureDetector(getContext(), new C7909g(this)));
        chip.setOnTouchListener(view$OnTouchListenerC7910h);
        chip2.setOnTouchListener(view$OnTouchListenerC7910h);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(view$OnClickListenerC7902a);
        chip2.setOnClickListener(view$OnClickListenerC7902a);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f15648q.sendAccessibilityEvent(8);
        }
    }
}
