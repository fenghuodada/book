package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.util.C0800d;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.internal.C7764q;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final Calendar f14781a;

    /* renamed from: b */
    public final boolean f14782b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f14781a = C7681f0.m4589e(null);
        if (MaterialDatePicker.m4613j(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f14782b = MaterialDatePicker.m4612k(getContext(), R.attr.nestedScrollable);
        ViewCompat.m11771n(this, new C7700q());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* renamed from: a */
    public final C7708w getAdapter2() {
        return (C7708w) super.getAdapter();
    }

    /* renamed from: b */
    public final View m4616b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        C7708w c7708w;
        Iterator<C0800d<Long, Long>> it;
        int i;
        int i2;
        boolean z;
        int m4577a;
        int width;
        int m4577a2;
        int width2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int left;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C7708w adapter2 = getAdapter2();
        InterfaceC7675d<?> interfaceC7675d = adapter2.f14905b;
        C7673c c7673c = adapter2.f14907d;
        int max = Math.max(adapter2.m4577a(), getFirstVisiblePosition());
        int m4577a3 = adapter2.m4577a();
        C7706v c7706v = adapter2.f14904a;
        int min = Math.min((m4577a3 + c7706v.f14899e) - 1, getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<C0800d<Long, Long>> it2 = interfaceC7675d.m4601m().iterator();
        while (it2.hasNext()) {
            C0800d<Long, Long> next = it2.next();
            Long l = next.f2500a;
            if (l != null) {
                Long l2 = next.f2501b;
                if (l2 != null) {
                    long longValue = l.longValue();
                    long longValue2 = l2.longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    if (item != null && item2 != null && valueOf != null && valueOf2 != null && valueOf.longValue() <= item2.longValue() && valueOf2.longValue() >= item.longValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        boolean m4505a = C7764q.m4505a(this);
                        int i7 = (longValue > item.longValue() ? 1 : (longValue == item.longValue() ? 0 : -1));
                        Calendar calendar = materialCalendarGridView.f14781a;
                        if (i7 < 0) {
                            if (max % c7706v.f14898d == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                left = 0;
                            } else {
                                View m4616b = materialCalendarGridView.m4616b(max - 1);
                                if (!m4505a) {
                                    left = m4616b.getRight();
                                } else {
                                    left = m4616b.getLeft();
                                }
                            }
                            width = left;
                            m4577a = max;
                        } else {
                            calendar.setTimeInMillis(longValue);
                            m4577a = adapter2.m4577a() + (calendar.get(5) - 1);
                            View m4616b2 = materialCalendarGridView.m4616b(m4577a);
                            width = (m4616b2.getWidth() / 2) + m4616b2.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            if ((min + 1) % c7706v.f14898d == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                width2 = getWidth();
                            } else {
                                View m4616b3 = materialCalendarGridView.m4616b(min);
                                if (!m4505a) {
                                    width2 = m4616b3.getRight();
                                } else {
                                    width2 = m4616b3.getLeft();
                                }
                            }
                            m4577a2 = min;
                        } else {
                            calendar.setTimeInMillis(longValue2);
                            m4577a2 = adapter2.m4577a() + (calendar.get(5) - 1);
                            View m4616b4 = materialCalendarGridView.m4616b(m4577a2);
                            width2 = (m4616b4.getWidth() / 2) + m4616b4.getLeft();
                        }
                        int itemId = (int) adapter2.getItemId(m4577a);
                        i = max;
                        i2 = min;
                        int itemId2 = (int) adapter2.getItemId(m4577a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            C7708w c7708w2 = adapter2;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View m4616b5 = materialCalendarGridView.m4616b(numColumns);
                            int top = m4616b5.getTop() + c7673c.f14835a.f14829a.top;
                            Iterator<C0800d<Long, Long>> it3 = it2;
                            int bottom = m4616b5.getBottom() - c7673c.f14835a.f14829a.bottom;
                            if (!m4505a) {
                                if (numColumns > m4577a) {
                                    i5 = 0;
                                } else {
                                    i5 = width;
                                }
                                if (m4577a2 > numColumns2) {
                                    i6 = getWidth();
                                } else {
                                    i6 = width2;
                                }
                            } else {
                                if (m4577a2 > numColumns2) {
                                    i3 = 0;
                                } else {
                                    i3 = width2;
                                }
                                if (numColumns > m4577a) {
                                    i4 = getWidth();
                                } else {
                                    i4 = width;
                                }
                                int i8 = i4;
                                i5 = i3;
                                i6 = i8;
                            }
                            canvas.drawRect(i5, top, i6, bottom, c7673c.f14842h);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter2 = c7708w2;
                            it2 = it3;
                        }
                        c7708w = adapter2;
                        it = it2;
                    }
                }
            } else {
                c7708w = adapter2;
                it = it2;
                i = max;
                i2 = min;
            }
            materialCalendarGridView = this;
            max = i;
            min = i2;
            adapter2 = c7708w;
            it2 = it;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int m4577a;
        if (z) {
            if (i == 33) {
                C7708w adapter2 = getAdapter2();
                m4577a = (adapter2.m4577a() + adapter2.f14904a.f14899e) - 1;
            } else if (i == 130) {
                m4577a = getAdapter2().m4577a();
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
            setSelection(m4577a);
            return;
        }
        super.onFocusChanged(false, i, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m4577a()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().m4577a());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f14782b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C7708w)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C7708w.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter2().m4577a()) {
            i = getAdapter2().m4577a();
        }
        super.setSelection(i);
    }
}
