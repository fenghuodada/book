package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.C0851a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.recyclerview.widget.AbstractC1612a0;
import androidx.recyclerview.widget.C1647u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialDatePicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes3.dex */
public final class C7688j<S> extends AbstractC7670a0<S> {

    /* renamed from: o */
    public static final /* synthetic */ int f14858o = 0;
    @StyleRes

    /* renamed from: b */
    public int f14859b;
    @Nullable

    /* renamed from: c */
    public InterfaceC7675d<S> f14860c;
    @Nullable

    /* renamed from: d */
    public C7666a f14861d;
    @Nullable

    /* renamed from: e */
    public AbstractC7682g f14862e;
    @Nullable

    /* renamed from: f */
    public C7706v f14863f;

    /* renamed from: g */
    public int f14864g;

    /* renamed from: h */
    public C7673c f14865h;

    /* renamed from: i */
    public RecyclerView f14866i;

    /* renamed from: j */
    public RecyclerView f14867j;

    /* renamed from: k */
    public View f14868k;

    /* renamed from: l */
    public View f14869l;

    /* renamed from: m */
    public View f14870m;

    /* renamed from: n */
    public View f14871n;

    /* renamed from: com.google.android.material.datepicker.j$a */
    /* loaded from: classes3.dex */
    public class RunnableC7689a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f14872a;

        public RunnableC7689a(int i) {
            this.f14872a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7688j.this.f14867j.m10377c0(this.f14872a);
        }
    }

    /* renamed from: com.google.android.material.datepicker.j$b */
    /* loaded from: classes3.dex */
    public class C7690b extends C0851a {
        @Override // androidx.core.view.C0851a
        /* renamed from: d */
        public final void mo4308d(View view, @NonNull C0874o c0874o) {
            View.AccessibilityDelegate accessibilityDelegate = this.f2597a;
            AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.j$c */
    /* loaded from: classes3.dex */
    public class C7691c extends C7674c0 {

        /* renamed from: E */
        public final /* synthetic */ int f14874E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7691c(int i, int i2) {
            super(i);
            this.f14874E = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: D0 */
        public final void mo4584D0(@NonNull RecyclerView.C1594v c1594v, @NonNull int[] iArr) {
            int i = this.f14874E;
            C7688j c7688j = C7688j.this;
            if (i == 0) {
                iArr[0] = c7688j.f14867j.getWidth();
                iArr[1] = c7688j.f14867j.getWidth();
                return;
            }
            iArr[0] = c7688j.f14867j.getHeight();
            iArr[1] = c7688j.f14867j.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.j$d */
    /* loaded from: classes3.dex */
    public class C7692d implements InterfaceC7693e {
        public C7692d() {
        }
    }

    /* renamed from: com.google.android.material.datepicker.j$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC7693e {
    }

    @Override // com.google.android.material.datepicker.AbstractC7670a0
    /* renamed from: h */
    public final boolean mo4588h(@NonNull MaterialDatePicker.C7665d c7665d) {
        return super.mo4588h(c7665d);
    }

    /* renamed from: i */
    public final void m4587i(int i) {
        this.f14867j.post(new RunnableC7689a(i));
    }

    /* renamed from: j */
    public final void m4586j(C7706v c7706v) {
        boolean z;
        RecyclerView recyclerView;
        int i;
        C7706v c7706v2 = ((C7710y) this.f14867j.getAdapter()).f14912h.f14814a;
        Calendar calendar = c7706v2.f14895a;
        if (calendar instanceof GregorianCalendar) {
            int i2 = c7706v.f14897c;
            int i3 = c7706v2.f14897c;
            int i4 = c7706v.f14896b;
            int i5 = c7706v2.f14896b;
            int i6 = (i4 - i5) + ((i2 - i3) * 12);
            C7706v c7706v3 = this.f14863f;
            if (calendar instanceof GregorianCalendar) {
                int i7 = i6 - ((c7706v3.f14896b - i5) + ((c7706v3.f14897c - i3) * 12));
                boolean z2 = true;
                if (Math.abs(i7) > 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i7 <= 0) {
                    z2 = false;
                }
                this.f14863f = c7706v;
                if (z && z2) {
                    recyclerView = this.f14867j;
                    i = i6 - 3;
                } else {
                    if (z) {
                        recyclerView = this.f14867j;
                        i = i6 + 3;
                    }
                    m4587i(i6);
                    return;
                }
                recyclerView.m10380a0(i);
                m4587i(i6);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* renamed from: k */
    public final void m4585k(int i) {
        this.f14864g = i;
        if (i == 2) {
            this.f14866i.getLayoutManager().mo4688q0(this.f14863f.f14897c - ((C7685h0) this.f14866i.getAdapter()).f14854h.f14861d.f14814a.f14897c);
            this.f14870m.setVisibility(0);
            this.f14871n.setVisibility(8);
            this.f14868k.setVisibility(8);
            this.f14869l.setVisibility(8);
        } else if (i == 1) {
            this.f14870m.setVisibility(8);
            this.f14871n.setVisibility(0);
            this.f14868k.setVisibility(0);
            this.f14869l.setVisibility(0);
            m4586j(this.f14863f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f14859b = bundle.getInt("THEME_RES_ID_KEY");
        this.f14860c = (InterfaceC7675d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f14861d = (C7666a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f14862e = (AbstractC7682g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f14863f = (C7706v) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        int i2;
        C7684h c7684h;
        C1647u c1647u;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f14859b);
        this.f14865h = new C7673c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C7706v c7706v = this.f14861d.f14814a;
        if (MaterialDatePicker.m4613j(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C7708w.f14902g;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.m11771n(gridView, new C7690b());
        int i4 = this.f14861d.f14818e;
        if (i4 > 0) {
            c7684h = new C7684h(i4);
        } else {
            c7684h = new C7684h();
        }
        gridView.setAdapter((ListAdapter) c7684h);
        gridView.setNumColumns(c7706v.f14898d);
        gridView.setEnabled(false);
        this.f14867j = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.f14867j.setLayoutManager(new C7691c(i2, i2));
        this.f14867j.setTag("MONTHS_VIEW_GROUP_TAG");
        C7710y c7710y = new C7710y(contextThemeWrapper, this.f14860c, this.f14861d, this.f14862e, new C7692d());
        this.f14867j.setAdapter(c7710y);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f14866i = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f14866i.setLayoutManager(new GridLayoutManager(integer));
            this.f14866i.setAdapter(new C7685h0(this));
            this.f14866i.m10370g(new C7695l(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.m11771n(materialButton, new C7696m(this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f14868k = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f14869l = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f14870m = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f14871n = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            m4585k(1);
            materialButton.setText(this.f14863f.m4578d());
            this.f14867j.m10369h(new C7697n(this, c7710y, materialButton));
            materialButton.setOnClickListener(new View$OnClickListenerC7698o(this));
            this.f14869l.setOnClickListener(new View$OnClickListenerC7699p(this, c7710y));
            this.f14868k.setOnClickListener(new View$OnClickListenerC7687i(this, c7710y));
        }
        if (!MaterialDatePicker.m4613j(contextThemeWrapper) && (recyclerView2 = (c1647u = new C1647u()).f3867a) != (recyclerView = this.f14867j)) {
            AbstractC1612a0.C1613a c1613a = c1647u.f3868b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f3680m0;
                if (arrayList != null) {
                    arrayList.remove(c1613a);
                }
                c1647u.f3867a.setOnFlingListener(null);
            }
            c1647u.f3867a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    c1647u.f3867a.m10369h(c1613a);
                    c1647u.f3867a.setOnFlingListener(c1647u);
                    new Scroller(c1647u.f3867a.getContext(), new DecelerateInterpolator());
                    c1647u.m10169b();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        RecyclerView recyclerView4 = this.f14867j;
        C7706v c7706v2 = this.f14863f;
        C7706v c7706v3 = c7710y.f14912h.f14814a;
        if (c7706v3.f14895a instanceof GregorianCalendar) {
            recyclerView4.m10380a0((c7706v2.f14896b - c7706v3.f14896b) + ((c7706v2.f14897c - c7706v3.f14897c) * 12));
            ViewCompat.m11771n(this.f14867j, new C7694k());
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f14859b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f14860c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f14861d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f14862e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f14863f);
    }
}
