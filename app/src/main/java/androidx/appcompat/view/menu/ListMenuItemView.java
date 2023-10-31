package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.appcompat.view.menu.InterfaceC0228n;
import androidx.appcompat.widget.C0430x1;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0228n.InterfaceC0229a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    public C0214i f622a;

    /* renamed from: b */
    public ImageView f623b;

    /* renamed from: c */
    public RadioButton f624c;

    /* renamed from: d */
    public TextView f625d;

    /* renamed from: e */
    public CheckBox f626e;

    /* renamed from: f */
    public TextView f627f;

    /* renamed from: g */
    public ImageView f628g;

    /* renamed from: h */
    public ImageView f629h;

    /* renamed from: i */
    public LinearLayout f630i;

    /* renamed from: j */
    public final Drawable f631j;

    /* renamed from: k */
    public final int f632k;

    /* renamed from: l */
    public final Context f633l;

    /* renamed from: m */
    public boolean f634m;

    /* renamed from: n */
    public final Drawable f635n;

    /* renamed from: o */
    public final boolean f636o;

    /* renamed from: p */
    public LayoutInflater f637p;

    /* renamed from: q */
    public boolean f638q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0430x1 m12465m = C0430x1.m12465m(getContext(), attributeSet, C0157c.f427r, R.attr.listMenuViewStyle);
        this.f631j = m12465m.m12473e(5);
        this.f632k = m12465m.m12469i(1, -1);
        this.f634m = m12465m.m12477a(7, false);
        this.f633l = context;
        this.f635n = m12465m.m12473e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f636o = obtainStyledAttributes.hasValue(0);
        m12465m.m12464n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f637p == null) {
            this.f637p = LayoutInflater.from(getContext());
        }
        return this.f637p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f628g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f629h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f629h.getLayoutParams();
        rect.top = this.f629h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228n.InterfaceC0229a
    public C0214i getItemData() {
        return this.f622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    @Override // androidx.appcompat.view.menu.InterfaceC0228n.InterfaceC0229a
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4533j(androidx.appcompat.view.menu.C0214i r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo4533j(androidx.appcompat.view.menu.i):void");
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11748q(this, this.f631j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f625d = textView;
        int i = this.f632k;
        if (i != -1) {
            textView.setTextAppearance(this.f633l, i);
        }
        this.f627f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f628g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f635n);
        }
        this.f629h = (ImageView) findViewById(R.id.group_divider);
        this.f630i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f623b != null && this.f634m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f623b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        View view;
        if (!z && this.f624c == null && this.f626e == null) {
            return;
        }
        if ((this.f622a.f738x & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.f624c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f624c = radioButton;
                LinearLayout linearLayout = this.f630i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f624c;
            view = this.f626e;
        } else {
            if (this.f626e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f626e = checkBox;
                LinearLayout linearLayout2 = this.f630i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f626e;
            view = this.f624c;
        }
        if (z) {
            compoundButton.setChecked(this.f622a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f626e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f624c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        if ((this.f622a.f738x & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.f624c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f624c = radioButton;
                LinearLayout linearLayout = this.f630i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f624c;
        } else {
            if (this.f626e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f626e = checkBox;
                LinearLayout linearLayout2 = this.f630i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f626e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f638q = z;
        this.f634m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f629h;
        if (imageView != null) {
            imageView.setVisibility((this.f636o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f622a.f728n.getClass();
        boolean z = this.f638q;
        if (!z && !this.f634m) {
            return;
        }
        ImageView imageView = this.f623b;
        if (imageView == null && drawable == null && !this.f634m) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f623b = imageView2;
            LinearLayout linearLayout = this.f630i;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f634m) {
            this.f623b.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f623b;
        if (!z) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f623b.getVisibility() != 0) {
            this.f623b.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f625d.setText(charSequence);
            if (this.f625d.getVisibility() == 0) {
                return;
            }
            textView = this.f625d;
            i = 0;
        } else {
            i = 8;
            if (this.f625d.getVisibility() == 8) {
                return;
            }
            textView = this.f625d;
        }
        textView.setVisibility(i);
    }
}
